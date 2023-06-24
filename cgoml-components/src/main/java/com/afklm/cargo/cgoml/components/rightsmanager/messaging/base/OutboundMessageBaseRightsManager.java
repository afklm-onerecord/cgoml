package com.afklm.cargo.cgoml.components.rightsmanager.messaging.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBaseRightsManager {

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
throw new AccessDeniedException("OutboundMessage.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(OutboundMessage outboundMessage) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(OutboundMessage outboundMessage) {
if (!canAccess(outboundMessage)) {
throw new AccessDeniedException("OutboundMessage.accessDenied");
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
throw new AccessDeniedException("OutboundMessage.create.operationDenied");
}
}

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
throw new AccessDeniedException("OutboundMessage.save.operationDenied");
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
throw new AccessDeniedException("OutboundMessage.update.operationDenied");
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
throw new AccessDeniedException("OutboundMessage.delete.operationDenied");
}
}

}
