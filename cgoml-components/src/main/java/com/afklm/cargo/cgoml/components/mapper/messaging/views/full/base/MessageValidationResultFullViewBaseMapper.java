package com.afklm.cargo.cgoml.components.mapper.messaging.views.full.base;

import com.afklm.cargo.cgoml.api.model.messaging.forms.MessageValidationResultForm;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.MessageValidationResultFullView;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.InboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.InboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;
import javax.inject.Inject;
import org.sklsft.commons.mapper.impl.FullViewMapper;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class MessageValidationResultFullViewBaseMapper extends FullViewMapper<MessageValidationResultFullView, Long, MessageValidationResultForm, MessageValidationResult> {

@Inject
protected InboundMessageRightsManager inboundMessageRightsManager;
@Inject
protected InboundMessageStateManager inboundMessageStateManager;

public MessageValidationResultFullViewBaseMapper() {
super(MessageValidationResultFullView.class, MessageValidationResult.class);
}

@Override
public MessageValidationResultFullView mapFrom(MessageValidationResultFullView messageValidationResultFullView, MessageValidationResult messageValidationResult) {
messageValidationResultFullView = super.mapFrom(messageValidationResultFullView, messageValidationResult);
messageValidationResultFullView.setCanUpdate(inboundMessageRightsManager.canUpdateMessageValidationResult(messageValidationResult) && inboundMessageStateManager.canUpdateMessageValidationResult(messageValidationResult));
messageValidationResultFullView.setCanDelete(inboundMessageRightsManager.canDeleteMessageValidationResult(messageValidationResult) && inboundMessageStateManager.canDeleteMessageValidationResult(messageValidationResult));
return messageValidationResultFullView;
}

}
