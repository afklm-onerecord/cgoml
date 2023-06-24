package com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgoml.api.model.messaging.views.basic.InboundMessageBasicView;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.InboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.InboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBasicViewBaseMapper extends BasicMapperImpl<InboundMessageBasicView, InboundMessage> {

public InboundMessageBasicViewBaseMapper() {
super(InboundMessageBasicView.class, InboundMessage.class);
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
public InboundMessageBasicView mapFrom(InboundMessageBasicView inboundMessageBasicView, InboundMessage inboundMessage) {
inboundMessageBasicView = super.mapFrom(inboundMessageBasicView, inboundMessage);
inboundMessageBasicView.setSelected(false);
inboundMessageBasicView.setCanDelete(inboundMessageRightsManager.canDelete(inboundMessage) && inboundMessageStateManager.canDelete(inboundMessage));
return inboundMessageBasicView;
}

/**
 * mapping view to object
 */
@Override
public InboundMessage mapTo(InboundMessageBasicView inboundMessageBasicView, InboundMessage inboundMessage) {
inboundMessage = super.mapTo(inboundMessageBasicView, inboundMessage);
return inboundMessage;
}

}
