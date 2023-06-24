package com.afklm.cargo.cgoml.rest.controller.messaging.base;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afklm.cargo.cgoml.api.interfaces.messaging.InboundMessageService;
import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.InboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.InboundMessageFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBaseController {

/*
 * services injected by spring
 */
@Inject
protected InboundMessageService inboundMessageService;

/**
 * load object list
 */
@RequestMapping(value = {InboundMessageService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<InboundMessageBasicView> loadList() {
return inboundMessageService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {InboundMessageService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<InboundMessageBasicView> scroll(@RequestBody ScrollForm<InboundMessageFilter, InboundMessageSorting> form) {
return inboundMessageService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {InboundMessageService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody InboundMessageFullView load(@PathVariable("id") Long id) {
return inboundMessageService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {InboundMessageService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody InboundMessageFullView find(@RequestParam("uuid") String uuid) {
return inboundMessageService.find(uuid);
}

/**
 * create object
 */
@RequestMapping(value = {InboundMessageService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody InboundMessageFullView create() {
return inboundMessageService.create();
}

/**
 * save object
 */
@RequestMapping(value = {InboundMessageService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Long save(@Valid @RequestBody InboundMessageForm form) {
return inboundMessageService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {InboundMessageService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Long id, @Valid @RequestBody InboundMessageForm form) {
inboundMessageService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {InboundMessageService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Long id) {
inboundMessageService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {InboundMessageService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Long> idList) {
inboundMessageService.deleteList(idList);
}

}
