package com.afklm.cargo.cgoml.populator.command.messaging;

import com.afklm.cargo.cgoml.api.interfaces.messaging.InboundMessageService;
import com.afklm.cargo.cgoml.api.model.messaging.forms.MessageValidationResultForm;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.InboundMessageFullView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.MessageValidationResultFullView;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.sklsft.commons.mapper.impl.DbObjectToObjectConverter;
import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringToObjectConverter;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * auto generated view command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class MessageValidationResultCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(MessageValidationResultCommand.class);

@Inject
private InboundMessageService inboundMessageService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<MessageValidationResultForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<MessageValidationResultForm>(MessageValidationResultForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<MessageValidationResultForm>(MessageValidationResultForm.class);
}
for (Object[] args:arguments.getArguments()) {
String message = "execute inboundMessageService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
MessageValidationResultForm messageValidationResultForm = mapper.mapFrom(new MessageValidationResultForm(), Arrays.copyOfRange(args,1,args.length));

String arg0 = arguments.isArgumentsTyped()?(String)(DbObjectToObjectConverter.getObjectFromDbObject(args[0], String.class)):(String)(StringToObjectConverter.getObjectFromString((String)args[0], String.class));
InboundMessageFullView inboundMessageFullView = inboundMessageService.find(arg0);

this.inboundMessageService.saveMessageValidationResult(inboundMessageFullView.getId(), messageValidationResultForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
