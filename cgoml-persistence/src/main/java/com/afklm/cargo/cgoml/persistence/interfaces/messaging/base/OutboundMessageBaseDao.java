package com.afklm.cargo.cgoml.persistence.interfaces.messaging.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgoml.api.model.messaging.filters.OutboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.OutboundMessageSorting;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface OutboundMessageBaseDao extends BaseDao<OutboundMessage, Long> {

/**
 * count filtered object list
 */
Long count(OutboundMessageFilter filter);

/**
 * scroll filtered object list
 */
List<OutboundMessage> scroll(OutboundMessageFilter filter, OutboundMessageSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String uuid);

/**
 * find object or null
 */
OutboundMessage findOrNull(String uuid);

/**
 * find object
 */
OutboundMessage find(String uuid);

}
