package com.afklm.cargo.cgoml.components.processor.messaging.base;

import javax.inject.Inject;

import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;
import com.afklm.cargo.cgoml.persistence.interfaces.messaging.OutboundMessageDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected OutboundMessageDao outboundMessageDao;

/**
 * process save
 */
public Long save(OutboundMessage outboundMessage) {
return outboundMessageDao.save(outboundMessage);
}

/**
 * process update
 */
public void update(OutboundMessage outboundMessage) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(OutboundMessage outboundMessage) {
outboundMessageDao.delete(outboundMessage);
}

}
