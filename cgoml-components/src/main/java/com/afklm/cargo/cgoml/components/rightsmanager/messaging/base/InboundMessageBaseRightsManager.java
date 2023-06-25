package com.afklm.cargo.cgoml.components.rightsmanager.messaging.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;

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
 * can access one to many component MessageValidationResult
 */
public boolean canAccessMessageValidationResult(InboundMessage inboundMessage) {
return canAccess(inboundMessage);
}

/**
 * check can access one to many component MessageValidationResult
 */
public void checkCanAccessMessageValidationResult(InboundMessage inboundMessage) {
if (!canAccessMessageValidationResult(inboundMessage)) {
throw new AccessDeniedException("MessageValidationResult.accessDenied");
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
 * can create one to many component MessageValidationResult
 */
public boolean canCreateMessageValidationResult(InboundMessage inboundMessage) {
return canUpdate(inboundMessage);
}

/**
 * check can create one to many component MessageValidationResult
 */
public void checkCanCreateMessageValidationResult(InboundMessage inboundMessage) {
if (!canCreateMessageValidationResult(inboundMessage)) {
throw new AccessDeniedException("MessageValidationResult.create.operationDenied");
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
 * can save one to many component MessageValidationResult
 */
public boolean canSaveMessageValidationResult(MessageValidationResult messageValidationResult,InboundMessage inboundMessage) {
return canUpdate(inboundMessage);
}

/**
 * check can save one to many component MessageValidationResult
 */
public void checkCanSaveMessageValidationResult(MessageValidationResult messageValidationResult,InboundMessage inboundMessage) {
if (!canSaveMessageValidationResult(messageValidationResult, inboundMessage)) {
throw new AccessDeniedException("MessageValidationResult.save.operationDenied");
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
 * can update one to many component MessageValidationResult
 */
public boolean canUpdateMessageValidationResult(MessageValidationResult messageValidationResult) {
return canUpdate(messageValidationResult.getInboundMessage());
}

/**
 * check can update one to many component MessageValidationResult
 */
public void checkCanUpdateMessageValidationResult(MessageValidationResult messageValidationResult) {
if (!canUpdateMessageValidationResult(messageValidationResult)) {
throw new AccessDeniedException("MessageValidationResult.update.operationDenied");
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

/**
 * can delete one to many component MessageValidationResult
 */
public boolean canDeleteMessageValidationResult(MessageValidationResult messageValidationResult) {
return canUpdate(messageValidationResult.getInboundMessage());
}

/**
 * check can delete one to many component MessageValidationResult
 */
public void checkCanDeleteMessageValidationResult(MessageValidationResult messageValidationResult) {
if (!canDeleteMessageValidationResult(messageValidationResult)) {
throw new AccessDeniedException("MessageValidationResult.delete.operationDenied");
}
}

}
