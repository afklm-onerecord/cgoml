package com.afklm.cargo.cgoml.components.statemanager.messaging.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgoml.model.messaging.InboundMessage;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBaseStateManager {

/**
 * can save
 */
public boolean canSave(InboundMessage inboundMessage) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(InboundMessage inboundMessage) {
if (!canSave(inboundMessage)) {
throw new InvalidStateException("InboundMessage.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(InboundMessage inboundMessage) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(InboundMessage inboundMessage) {
if (!canUpdate(inboundMessage)) {
throw new InvalidStateException("InboundMessage.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(InboundMessage inboundMessage) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(InboundMessage inboundMessage) {
if (!canDelete(inboundMessage)) {
throw new InvalidStateException("InboundMessage.delete.invalidState");
}
}

}
