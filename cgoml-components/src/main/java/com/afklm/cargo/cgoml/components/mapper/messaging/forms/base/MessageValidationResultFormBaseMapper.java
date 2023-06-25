package com.afklm.cargo.cgoml.components.mapper.messaging.forms.base;

import com.afklm.cargo.cgoml.api.model.messaging.forms.MessageValidationResultForm;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;
import javax.inject.Inject;
import org.sklsft.commons.api.exception.repository.ObjectNotFoundException;
import org.sklsft.commons.mapper.impl.BasicMapperImpl;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MessageValidationResultFormBaseMapper extends BasicMapperImpl<MessageValidationResultForm, MessageValidationResult> {

public MessageValidationResultFormBaseMapper() {
super(MessageValidationResultForm.class, MessageValidationResult.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public MessageValidationResultForm mapFrom(MessageValidationResultForm messageValidationResultForm, MessageValidationResult messageValidationResult) {
messageValidationResultForm = super.mapFrom(messageValidationResultForm, messageValidationResult);
return messageValidationResultForm;
}

/**
 * mapping view to object
 */
@Override
public MessageValidationResult mapTo(MessageValidationResultForm messageValidationResultForm, MessageValidationResult messageValidationResult) {
messageValidationResult = super.mapTo(messageValidationResultForm, messageValidationResult);
return messageValidationResult;
}

}
