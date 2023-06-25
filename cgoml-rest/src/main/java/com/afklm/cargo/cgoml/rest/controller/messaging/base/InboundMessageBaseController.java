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
 * load one to many component messageValidationResult list
 */
@RequestMapping(value = {InboundMessageService.GET_MESSAGE_VALIDATION_RESULT_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<MessageValidationResultBasicView> loadMessageValidationResultList(@PathVariable("id") Long id) {
return inboundMessageService.loadMessageValidationResultList(id);
}

/**
 * scroll one to many component messageValidationResult
 */
@RequestMapping(value = {InboundMessageService.SCROLL_MESSAGE_VALIDATION_RESULT_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<MessageValidationResultBasicView> scrollMessageValidationResult (@PathVariable("id") Long id, @RequestBody ScrollForm<MessageValidationResultFilter, MessageValidationResultSorting> form) {
return inboundMessageService.scrollMessageValidationResult(id, form);
}

/**
 * load one to many component messageValidationResult
 */
@RequestMapping(value = {InboundMessageService.GET_MESSAGE_VALIDATION_RESULT_URL}, method = RequestMethod.GET)
public @ResponseBody MessageValidationResultFullView loadMessageValidationResult(@PathVariable("id") Long id) {
return inboundMessageService.loadMessageValidationResult(id);
}

/**
 * create object
 */
@RequestMapping(value = {InboundMessageService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody InboundMessageFullView create() {
return inboundMessageService.create();
}

/**
 * create one to many component messageValidationResult
 */
@RequestMapping(value = {InboundMessageService.GET_NEW_MESSAGE_VALIDATION_RESULT_URL}, method = RequestMethod.GET)
public @ResponseBody MessageValidationResultFullView createMessageValidationResult(@PathVariable("id") Long id) {
return inboundMessageService.createMessageValidationResult(id);
}

/**
 * save object
 */
@RequestMapping(value = {InboundMessageService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Long save(@Valid @RequestBody InboundMessageForm form) {
return inboundMessageService.save(form);
}

/**
 * save one to many component messageValidationResult
 */
@RequestMapping(value = {InboundMessageService.SAVE_MESSAGE_VALIDATION_RESULT_URL}, method = RequestMethod.POST)
public @ResponseBody void saveMessageValidationResult(@PathVariable("id") Long id, @Valid @RequestBody MessageValidationResultForm form) {
inboundMessageService.saveMessageValidationResult(id, form);
}

/**
 * update object
 */
@RequestMapping(value = {InboundMessageService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Long id, @Valid @RequestBody InboundMessageForm form) {
inboundMessageService.update(id, form);
}

/**
 * update one to many component messageValidationResult
 */
@RequestMapping(value = {InboundMessageService.UPDATE_MESSAGE_VALIDATION_RESULT_URL}, method = RequestMethod.PUT)
public @ResponseBody void updateMessageValidationResult(@PathVariable("id") Long id, @Valid @RequestBody MessageValidationResultForm form) {
inboundMessageService.updateMessageValidationResult(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {InboundMessageService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Long id) {
inboundMessageService.delete(id);
}

/**
 * delete one to many component messageValidationResult
 */
@RequestMapping(value = {InboundMessageService.DELETE_MESSAGE_VALIDATION_RESULT_URL}, method = RequestMethod.DELETE)
public @ResponseBody void deleteMessageValidationResult(@PathVariable("id")Long id) {
inboundMessageService.deleteMessageValidationResult(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {InboundMessageService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Long> idList) {
inboundMessageService.deleteList(idList);
}

/**
 * delete one to many component messageValidationResult list
 */
@RequestMapping(value = {InboundMessageService.DELETE_MESSAGE_VALIDATION_RESULT_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteMessageValidationResultList(@RequestBody List<Long> idList) {
inboundMessageService.deleteMessageValidationResultList(idList);
}

}
