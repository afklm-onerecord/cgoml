package com.afklm.cargo.cgoml.components.mapper.messaging.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.InboundMessageFullView;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.InboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.InboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class InboundMessageFullViewBaseMapper extends FullViewMapper<InboundMessageFullView, Long, InboundMessageForm, InboundMessage> {

@Inject
protected InboundMessageRightsManager inboundMessageRightsManager;
@Inject
protected InboundMessageStateManager inboundMessageStateManager;

public InboundMessageFullViewBaseMapper() {
super(InboundMessageFullView.class, InboundMessage.class);
}

@Override
public InboundMessageFullView mapFrom(InboundMessageFullView inboundMessageFullView, InboundMessage inboundMessage) {
inboundMessageFullView = super.mapFrom(inboundMessageFullView, inboundMessage);
inboundMessageFullView.setCanUpdate(inboundMessageRightsManager.canUpdate(inboundMessage) && inboundMessageStateManager.canUpdate(inboundMessage));
inboundMessageFullView.setCanDelete(inboundMessageRightsManager.canDelete(inboundMessage) && inboundMessageStateManager.canDelete(inboundMessage));
return inboundMessageFullView;
}

}
