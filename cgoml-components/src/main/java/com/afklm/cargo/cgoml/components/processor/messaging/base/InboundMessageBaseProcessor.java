package com.afklm.cargo.cgoml.components.processor.messaging.base;

import javax.inject.Inject;

import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import com.afklm.cargo.cgoml.persistence.interfaces.messaging.InboundMessageDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected InboundMessageDao inboundMessageDao;

/**
 * process save
 */
public Long save(InboundMessage inboundMessage) {
return inboundMessageDao.save(inboundMessage);
}

/**
 * process update
 */
public void update(InboundMessage inboundMessage) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(InboundMessage inboundMessage) {
inboundMessageDao.delete(inboundMessage);
}

}
