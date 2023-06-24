package com.afklm.cargo.cgoml.components.rightsmanager.messaging.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgoml.model.messaging.InboundMessage;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBaseRightsManager {

/**
 * can access all
 */
public boolean canAccess() {
return true;
}

/**
 * check can access all
 */
public void checkCanAccess() {
if (!canAccess()) {
throw new AccessDeniedException("InboundMessage.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(InboundMessage inboundMessage) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(InboundMessage inboundMessage) {
if (!canAccess(inboundMessage)) {
throw new AccessDeniedException("InboundMessage.accessDenied");
}
}

/**
 * can create
 */
public boolean canCreate() {
return true;
}

/**
 * check can create
 */
public void checkCanCreate() {
if (!canCreate()) {
throw new AccessDeniedException("InboundMessage.create.operationDenied");
}
}

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
throw new AccessDeniedException("InboundMessage.save.operationDenied");
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
throw new AccessDeniedException("InboundMessage.update.operationDenied");
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
throw new AccessDeniedException("InboundMessage.delete.operationDenied");
}
}

}
