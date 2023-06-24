package com.afklm.cargo.cgoml.api.interfaces.messaging.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgoml.api.model.messaging.filters.OutboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.OutboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.OutboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.OutboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.OutboundMessageFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface OutboundMessageBaseService {

/**
 * load object list
 */
List<OutboundMessageBasicView> loadList();
public static final String GET_LIST_URL = "/outbound-message/list";

/**
 * scroll object list
 */
ScrollView<OutboundMessageBasicView> scroll(ScrollForm<OutboundMessageFilter, OutboundMessageSorting> form);
public static final String SCROLL_URL = "/outbound-message/scroll";

/**
 * load object
 */
OutboundMessageFullView load(Long id);
public static final String GET_URL = "/outbound-message/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/outbound-message/find";
OutboundMessageFullView find(String uuid);

/**
 * create object
 */
OutboundMessageFullView create();
public static final String GET_NEW_URL = "/outbound-message/new";

/**
 * save object
 */
Long save(OutboundMessageForm outboundMessageForm);
public static final String SAVE_URL = "/outbound-message";

/**
 * update object
 */
void update(Long id, OutboundMessageForm outboundMessageForm);
public static final String UPDATE_URL = "/outbound-message/{id}";

/**
 * delete object
 */
void delete(Long id);
public static final String DELETE_URL = "/outbound-message/{id}";

/**
 * delete object list
 */
void deleteList(List<Long> idList);
public static final String DELETE_LIST_URL = "/outbound-message/delete";

}
