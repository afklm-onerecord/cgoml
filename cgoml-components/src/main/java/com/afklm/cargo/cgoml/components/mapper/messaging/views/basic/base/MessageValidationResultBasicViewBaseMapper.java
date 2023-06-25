package com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.base;

import com.afklm.cargo.cgoml.api.model.messaging.views.basic.MessageValidationResultBasicView;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.InboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.InboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;
import javax.inject.Inject;
import org.sklsft.commons.api.exception.repository.ObjectNotFoundException;
import org.sklsft.commons.mapper.impl.BasicMapperImpl;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MessageValidationResultBasicViewBaseMapper extends BasicMapperImpl<MessageValidationResultBasicView, MessageValidationResult> {

public MessageValidationResultBasicViewBaseMapper() {
super(MessageValidationResultBasicView.class, MessageValidationResult.class);
}

/*
 * properties
 */

@Inject
protected InboundMessageRightsManager inboundMessageRightsManager;
@Inject
protected InboundMessageStateManager inboundMessageStateManager;

/**
 * mapping view from object
 */
@Override
public MessageValidationResultBasicView mapFrom(MessageValidationResultBasicView messageValidationResultBasicView, MessageValidationResult messageValidationResult) {
messageValidationResultBasicView = super.mapFrom(messageValidationResultBasicView, messageValidationResult);
messageValidationResultBasicView.setSelected(false);
messageValidationResultBasicView.setCanDelete(inboundMessageRightsManager.canDeleteMessageValidationResult(messageValidationResult) && inboundMessageStateManager.canDeleteMessageValidationResult(messageValidationResult));
return messageValidationResultBasicView;
}

/**
 * mapping view to object
 */
@Override
public MessageValidationResult mapTo(MessageValidationResultBasicView messageValidationResultBasicView, MessageValidationResult messageValidationResult) {
messageValidationResult = super.mapTo(messageValidationResultBasicView, messageValidationResult);
return messageValidationResult;
}

}
