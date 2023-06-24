package com.afklm.cargo.cgoml.persistence.interfaces.messaging.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface InboundMessageBaseDao extends BaseDao<InboundMessage, Long> {

/**
 * count filtered object list
 */
Long count(InboundMessageFilter filter);

/**
 * scroll filtered object list
 */
List<InboundMessage> scroll(InboundMessageFilter filter, InboundMessageSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String uuid);

/**
 * find object or null
 */
InboundMessage findOrNull(String uuid);

/**
 * find object
 */
InboundMessage find(String uuid);

}
