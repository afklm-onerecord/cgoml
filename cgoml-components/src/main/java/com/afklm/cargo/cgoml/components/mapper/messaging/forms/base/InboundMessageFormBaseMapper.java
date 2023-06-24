package com.afklm.cargo.cgoml.components.mapper.messaging.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageFormBaseMapper extends BasicMapperImpl<InboundMessageForm, InboundMessage> {

public InboundMessageFormBaseMapper() {
super(InboundMessageForm.class, InboundMessage.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public InboundMessageForm mapFrom(InboundMessageForm inboundMessageForm, InboundMessage inboundMessage) {
inboundMessageForm = super.mapFrom(inboundMessageForm, inboundMessage);
return inboundMessageForm;
}

/**
 * mapping view to object
 */
@Override
public InboundMessage mapTo(InboundMessageForm inboundMessageForm, InboundMessage inboundMessage) {
inboundMessage = super.mapTo(inboundMessageForm, inboundMessage);
return inboundMessage;
}

}
