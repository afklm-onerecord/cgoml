package com.afklm.cargo.cgoml.api.interfaces.messaging.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.filters.MessageValidationResultFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.forms.MessageValidationResultForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.MessageValidationResultSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.InboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.MessageValidationResultBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.InboundMessageFullView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.MessageValidationResultFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface InboundMessageBaseService {

/**
 * load object list
 */
List<InboundMessageBasicView> loadList();
public static final String GET_LIST_URL = "/inbound-message/list";

/**
 * scroll object list
 */
ScrollView<InboundMessageBasicView> scroll(ScrollForm<InboundMessageFilter, InboundMessageSorting> form);
public static final String SCROLL_URL = "/inbound-message/scroll";

/**
 * load object
 */
InboundMessageFullView load(Long id);
public static final String GET_URL = "/inbound-message/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/inbound-message/find";
InboundMessageFullView find(String uuid);

/**
 * load one to many component messageValidationResult list
 */
List<MessageValidationResultBasicView> loadMessageValidationResultList(Long id);
public static final String GET_MESSAGE_VALIDATION_RESULT_LIST_URL = "/inbound-message/{id}/message-validation-result/list";

/**
 * scroll one to many component messageValidationResult
 */
ScrollView<MessageValidationResultBasicView> scrollMessageValidationResult (Long inboundMessageId, ScrollForm<MessageValidationResultFilter, MessageValidationResultSorting> form);
public static final String SCROLL_MESSAGE_VALIDATION_RESULT_URL = "/inbound-message/{id}/message-validation-result/scroll";

/**
 * load one to many component messageValidationResult
 */
MessageValidationResultFullView loadMessageValidationResult(Long id);
public static final String GET_MESSAGE_VALIDATION_RESULT_URL = "/message-validation-result/{id}";

/**
 * create object
 */
InboundMessageFullView create();
public static final String GET_NEW_URL = "/inbound-message/new";

/**
 * create one to many component messageValidationResult
 */
MessageValidationResultFullView createMessageValidationResult(Long id);
public static final String GET_NEW_MESSAGE_VALIDATION_RESULT_URL = "/inbound-message/{id}/message-validation-result/new";

/**
 * save object
 */
Long save(InboundMessageForm inboundMessageForm);
public static final String SAVE_URL = "/inbound-message";

/**
 * save one to many component messageValidationResult
 */
void saveMessageValidationResult(Long id, MessageValidationResultForm messageValidationResultForm);
public static final String SAVE_MESSAGE_VALIDATION_RESULT_URL = "/inbound-message/{id}/message-validation-result";

/**
 * update object
 */
void update(Long id, InboundMessageForm inboundMessageForm);
public static final String UPDATE_URL = "/inbound-message/{id}";

/**
 * update one to many component messageValidationResult
 */
void updateMessageValidationResult(Long id, MessageValidationResultForm messageValidationResultForm);
public static final String UPDATE_MESSAGE_VALIDATION_RESULT_URL = "/message-validation-result/{id}";

/**
 * delete object
 */
void delete(Long id);
public static final String DELETE_URL = "/inbound-message/{id}";

/**
 * delete one to many component messageValidationResult
 */
void deleteMessageValidationResult(Long id);
public static final String DELETE_MESSAGE_VALIDATION_RESULT_URL = "/message-validation-result/{id}";

/**
 * delete object list
 */
void deleteList(List<Long> idList);
public static final String DELETE_LIST_URL = "/inbound-message/delete";

/**
 * delete one to many component messageValidationResult list
 */
void deleteMessageValidationResultList(List<Long> idList);
public static final String DELETE_MESSAGE_VALIDATION_RESULT_LIST_URL = "/message-validation-result/delete";

}
