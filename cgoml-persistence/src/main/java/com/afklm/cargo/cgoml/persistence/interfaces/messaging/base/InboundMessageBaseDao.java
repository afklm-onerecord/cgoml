package com.afklm.cargo.cgoml.persistence.interfaces.messaging.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.filters.MessageValidationResultFilter;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.MessageValidationResultSorting;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;
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
 * load one to many component MessageValidationResult list
 */
List<MessageValidationResult> loadMessageValidationResultList(Long inboundMessageId);

/**
 * count one to many component MessageValidationResult
 */
Long countMessageValidationResult(Long inboundMessageId);

/**
 * count filtered one to many component MessageValidationResult
 */
Long countMessageValidationResult(Long inboundMessageId, MessageValidationResultFilter filter);

/**
 * scroll filtered one to many component MessageValidationResult
 */
List<MessageValidationResult> scrollMessageValidationResult(Long inboundMessageId, MessageValidationResultFilter filter, MessageValidationResultSorting sorting, Long firstResult, Long maxResults);

/**
 * load one to many component MessageValidationResult
 */
MessageValidationResult loadMessageValidationResult(Long id);

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

/**
 * save one to many component MessageValidationResult
 */
void saveMessageValidationResult(InboundMessage inboundMessage, MessageValidationResult messageValidationResult);

/**
 * delete one to many component MessageValidationResult
 */
void deleteMessageValidationResult(MessageValidationResult messageValidationResult);

}
