package com.afklm.cargo.cgoml.components.mapper.messaging.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgoml.api.model.messaging.forms.OutboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.OutboundMessageFullView;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.OutboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.OutboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class OutboundMessageFullViewBaseMapper extends FullViewMapper<OutboundMessageFullView, Long, OutboundMessageForm, OutboundMessage> {

@Inject
protected OutboundMessageRightsManager outboundMessageRightsManager;
@Inject
protected OutboundMessageStateManager outboundMessageStateManager;

public OutboundMessageFullViewBaseMapper() {
super(OutboundMessageFullView.class, OutboundMessage.class);
}

@Override
public OutboundMessageFullView mapFrom(OutboundMessageFullView outboundMessageFullView, OutboundMessage outboundMessage) {
outboundMessageFullView = super.mapFrom(outboundMessageFullView, outboundMessage);
outboundMessageFullView.setCanUpdate(outboundMessageRightsManager.canUpdate(outboundMessage) && outboundMessageStateManager.canUpdate(outboundMessage));
outboundMessageFullView.setCanDelete(outboundMessageRightsManager.canDelete(outboundMessage) && outboundMessageStateManager.canDelete(outboundMessage));
return outboundMessageFullView;
}

}
