package com.afklm.cargo.cgoml.components.mapper.messaging.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgoml.api.model.messaging.forms.OutboundMessageForm;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageFormBaseMapper extends BasicMapperImpl<OutboundMessageForm, OutboundMessage> {

public OutboundMessageFormBaseMapper() {
super(OutboundMessageForm.class, OutboundMessage.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public OutboundMessageForm mapFrom(OutboundMessageForm outboundMessageForm, OutboundMessage outboundMessage) {
outboundMessageForm = super.mapFrom(outboundMessageForm, outboundMessage);
return outboundMessageForm;
}

/**
 * mapping view to object
 */
@Override
public OutboundMessage mapTo(OutboundMessageForm outboundMessageForm, OutboundMessage outboundMessage) {
outboundMessage = super.mapTo(outboundMessageForm, outboundMessage);
return outboundMessage;
}

}
