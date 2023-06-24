package com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgoml.api.model.messaging.views.basic.OutboundMessageBasicView;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.OutboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.OutboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBasicViewBaseMapper extends BasicMapperImpl<OutboundMessageBasicView, OutboundMessage> {

public OutboundMessageBasicViewBaseMapper() {
super(OutboundMessageBasicView.class, OutboundMessage.class);
}

/*
 * properties
 */

@Inject
protected OutboundMessageRightsManager outboundMessageRightsManager;
@Inject
protected OutboundMessageStateManager outboundMessageStateManager;

/**
 * mapping view from object
 */
@Override
public OutboundMessageBasicView mapFrom(OutboundMessageBasicView outboundMessageBasicView, OutboundMessage outboundMessage) {
outboundMessageBasicView = super.mapFrom(outboundMessageBasicView, outboundMessage);
outboundMessageBasicView.setSelected(false);
outboundMessageBasicView.setCanDelete(outboundMessageRightsManager.canDelete(outboundMessage) && outboundMessageStateManager.canDelete(outboundMessage));
return outboundMessageBasicView;
}

/**
 * mapping view to object
 */
@Override
public OutboundMessage mapTo(OutboundMessageBasicView outboundMessageBasicView, OutboundMessage outboundMessage) {
outboundMessage = super.mapTo(outboundMessageBasicView, outboundMessage);
return outboundMessage;
}

}
