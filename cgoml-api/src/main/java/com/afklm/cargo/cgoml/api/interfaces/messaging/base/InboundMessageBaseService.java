package com.afklm.cargo.cgoml.api.interfaces.messaging.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.InboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.InboundMessageFullView;

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
 * create object
 */
InboundMessageFullView create();
public static final String GET_NEW_URL = "/inbound-message/new";

/**
 * save object
 */
Long save(InboundMessageForm inboundMessageForm);
public static final String SAVE_URL = "/inbound-message";

/**
 * update object
 */
void update(Long id, InboundMessageForm inboundMessageForm);
public static final String UPDATE_URL = "/inbound-message/{id}";

/**
 * delete object
 */
void delete(Long id);
public static final String DELETE_URL = "/inbound-message/{id}";

/**
 * delete object list
 */
void deleteList(List<Long> idList);
public static final String DELETE_LIST_URL = "/inbound-message/delete";

}
