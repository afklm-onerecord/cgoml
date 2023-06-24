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

import com.afklm.cargo.cgoml.api.interfaces.messaging.OutboundMessageService;
import com.afklm.cargo.cgoml.api.model.messaging.filters.OutboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.OutboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.OutboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.OutboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.OutboundMessageFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBaseController {

/*
 * services injected by spring
 */
@Inject
protected OutboundMessageService outboundMessageService;

/**
 * load object list
 */
@RequestMapping(value = {OutboundMessageService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<OutboundMessageBasicView> loadList() {
return outboundMessageService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {OutboundMessageService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<OutboundMessageBasicView> scroll(@RequestBody ScrollForm<OutboundMessageFilter, OutboundMessageSorting> form) {
return outboundMessageService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {OutboundMessageService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody OutboundMessageFullView load(@PathVariable("id") Long id) {
return outboundMessageService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {OutboundMessageService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody OutboundMessageFullView find(@RequestParam("uuid") String uuid) {
return outboundMessageService.find(uuid);
}

/**
 * create object
 */
@RequestMapping(value = {OutboundMessageService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody OutboundMessageFullView create() {
return outboundMessageService.create();
}

/**
 * save object
 */
@RequestMapping(value = {OutboundMessageService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Long save(@Valid @RequestBody OutboundMessageForm form) {
return outboundMessageService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {OutboundMessageService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Long id, @Valid @RequestBody OutboundMessageForm form) {
outboundMessageService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {OutboundMessageService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Long id) {
outboundMessageService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {OutboundMessageService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Long> idList) {
outboundMessageService.deleteList(idList);
}

}
