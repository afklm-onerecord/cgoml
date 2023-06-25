package com.afklm.cargo.cgoml.messages.listeners.inbound;

import java.util.Date;
import java.util.UUID;

import javax.inject.Inject;
import javax.jms.Message;

import org.sklsft.commons.jms.reader.MessageReader;
import org.sklsft.commons.log.aspects.annotations.LoggingAspectPointcut;
import org.sklsft.commons.text.serialization.XmlSerializer;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationResult;
import com.afklm.cargo.cgoml.api.interfaces.messaging.InboundMessageService;
import com.afklm.cargo.cgoml.api.model.messaging.MessageStatuses;
import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.forms.MessageValidationResultForm;
import com.afklm.cargo.cgoml.messages.resolver.CxmlMessageTypeResolver;
import com.afklm.cargo.cgoml.messages.resolver.CxmlMessageTypes;
import com.afklm.cargo.cgoml.services.CxmlInboundMessageReceiver;

@Component
public class CxmlInboundMessageListener {

	private XmlSerializer xmlSerializer = new XmlSerializer();
	
	@Inject
	private ApplicationContext applicationContext;
	
	@Inject
	private InboundMessageService inboundMessageService;

	@LoggingAspectPointcut("L.EXT.CGOML.CXML.001.QAG")
	@JmsListener(destination = "${cgoml.inbound.queue}", containerFactory = "messageContainerFactory", concurrency = "1")
	public void onMessage(Message message) {
		
		String content = MessageReader.getMessageContent(message);		
		CxmlMessageTypes cxmlMessageType = CxmlMessageTypeResolver.getType(content);
		
		InboundMessageForm form = new InboundMessageForm();
		form.setReceptionDate(new Date());
		form.setContent(content);
		form.setUuid(UUID.randomUUID().toString());
		
		if (cxmlMessageType == null) {
			form.setMessageType(CxmlMessageTypes.UNKNOWN);
			form.setStatus(MessageStatuses.REJECTED.name());
			inboundMessageService.save(form);
			
		} else {
			form.setMessageType(cxmlMessageType.name());
			form.setStatus(MessageStatuses.PENDING.name());
			Long id = inboundMessageService.save(form);
			
			Object object = xmlSerializer.deserialize(content, cxmlMessageType.getObjectType());
			CxmlInboundMessageReceiver service = applicationContext.getBean(cxmlMessageType.getInboundServiceType().getSimpleName(), CxmlInboundMessageReceiver.class);
			
			try {
				ValidationReport report = service.receive(object);
				if (report.hasRejects()) {
					form.setStatus(MessageStatuses.REJECTED.name());
				} else {
					form.setStatus(MessageStatuses.PROCESSED.name());
				}
				for (ValidationResult validationResult:report.getResults()) {
					MessageValidationResultForm validationResultForm = new MessageValidationResultForm();
					validationResultForm.setMipCode(validationResult.getMipCode());
					validationResultForm.setLevel(validationResult.getLevel());
					validationResultForm.setDescription(validationResult.getDescription());
					inboundMessageService.saveMessageValidationResult(id, validationResultForm);
				}
			} catch (Exception e) {
				form.setStatus(MessageStatuses.REJECTED.name());
			}
			inboundMessageService.update(id, form);
		}
	}
}
