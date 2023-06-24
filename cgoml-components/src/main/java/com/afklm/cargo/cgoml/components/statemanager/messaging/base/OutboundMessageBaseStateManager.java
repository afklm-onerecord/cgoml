package com.afklm.cargo.cgoml.components.statemanager.messaging.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBaseStateManager {

/**
 * can save
 */
public boolean canSave(OutboundMessage outboundMessage) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(OutboundMessage outboundMessage) {
if (!canSave(outboundMessage)) {
throw new InvalidStateException("OutboundMessage.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(OutboundMessage outboundMessage) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(OutboundMessage outboundMessage) {
if (!canUpdate(outboundMessage)) {
throw new InvalidStateException("OutboundMessage.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(OutboundMessage outboundMessage) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(OutboundMessage outboundMessage) {
if (!canDelete(outboundMessage)) {
throw new InvalidStateException("OutboundMessage.delete.invalidState");
}
}

}
