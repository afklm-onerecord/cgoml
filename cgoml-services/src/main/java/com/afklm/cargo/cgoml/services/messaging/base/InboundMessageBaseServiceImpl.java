package com.afklm.cargo.cgoml.services.messaging.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgoml.api.interfaces.messaging.base.InboundMessageBaseService;
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
import com.afklm.cargo.cgoml.components.mapper.messaging.forms.InboundMessageFormMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.forms.MessageValidationResultFormMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.InboundMessageBasicViewMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.MessageValidationResultBasicViewMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.full.InboundMessageFullViewMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.full.MessageValidationResultFullViewMapper;
import com.afklm.cargo.cgoml.components.processor.messaging.InboundMessageProcessor;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.InboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.InboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;
import com.afklm.cargo.cgoml.persistence.interfaces.messaging.InboundMessageDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBaseServiceImpl implements InboundMessageBaseService {

/*
 * properties injected by spring
 */
@Inject
protected InboundMessageDao inboundMessageDao;
@Inject
protected InboundMessageFullViewMapper inboundMessageFullViewMapper;
@Inject
protected InboundMessageBasicViewMapper inboundMessageBasicViewMapper;
@Inject
protected InboundMessageFormMapper inboundMessageFormMapper;
@Inject
protected MessageValidationResultFullViewMapper messageValidationResultFullViewMapper;
@Inject
protected MessageValidationResultBasicViewMapper messageValidationResultBasicViewMapper;
@Inject
protected MessageValidationResultFormMapper messageValidationResultFormMapper;
@Inject
protected InboundMessageStateManager inboundMessageStateManager;
@Inject
protected InboundMessageRightsManager inboundMessageRightsManager;
@Inject
protected InboundMessageProcessor inboundMessageProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<InboundMessageBasicView> loadList() {
inboundMessageRightsManager.checkCanAccess();
List<InboundMessage> inboundMessageList = inboundMessageDao.loadListEagerly();
List<InboundMessageBasicView> result = new ArrayList<>(inboundMessageList.size());
for (InboundMessage inboundMessage : inboundMessageList) {
result.add(this.inboundMessageBasicViewMapper.mapFrom(new InboundMessageBasicView(),inboundMessage));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<InboundMessageBasicView> scroll(ScrollForm<InboundMessageFilter, InboundMessageSorting> form) {
inboundMessageRightsManager.checkCanAccess();
ScrollView<InboundMessageBasicView> result = new ScrollView<>();
result.setSize(inboundMessageDao.count());
Long count = inboundMessageDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<InboundMessage> list = inboundMessageDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<InboundMessageBasicView> elements = new ArrayList<>(list.size());
for (InboundMessage inboundMessage : list) {
elements.add(this.inboundMessageBasicViewMapper.mapFrom(new InboundMessageBasicView(),inboundMessage));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public InboundMessageFullView load(Long id) {
InboundMessage inboundMessage = inboundMessageDao.load(id);
inboundMessageRightsManager.checkCanAccess(inboundMessage);
return this.inboundMessageFullViewMapper.mapFrom(new InboundMessageFullView(),inboundMessage);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public InboundMessageFullView find(String uuid) {
InboundMessage inboundMessage = inboundMessageDao.find(uuid);
inboundMessageRightsManager.checkCanAccess(inboundMessage);
return this.inboundMessageFullViewMapper.mapFrom(new InboundMessageFullView(), inboundMessage);
}

/**
 * load one to many component messageValidationResult list
 */
@Override
@Transactional(readOnly=true)
public List<MessageValidationResultBasicView> loadMessageValidationResultList(Long id) {
InboundMessage inboundMessage = inboundMessageDao.load(id);
inboundMessageRightsManager.checkCanAccessMessageValidationResult(inboundMessage);
List<MessageValidationResult> messageValidationResultList = inboundMessageDao.loadMessageValidationResultList(id);
List<MessageValidationResultBasicView> result = new ArrayList<>(messageValidationResultList.size());
for (MessageValidationResult messageValidationResult:messageValidationResultList){
result.add(this.messageValidationResultBasicViewMapper.mapFrom(new MessageValidationResultBasicView(),messageValidationResult));
}
return result;
}

/**
 * scroll one to many component messageValidationResult
 */
@Override
@Transactional(readOnly=true)
public ScrollView<MessageValidationResultBasicView> scrollMessageValidationResult (Long inboundMessageId, ScrollForm<MessageValidationResultFilter, MessageValidationResultSorting> form) {
InboundMessage inboundMessage = inboundMessageDao.load(inboundMessageId);
inboundMessageRightsManager.checkCanAccessMessageValidationResult(inboundMessage);
ScrollView<MessageValidationResultBasicView> result = new ScrollView<>();
result.setSize(inboundMessageDao.countMessageValidationResult(inboundMessageId));
Long count = inboundMessageDao.countMessageValidationResult(inboundMessageId, form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<MessageValidationResult> list = inboundMessageDao.scrollMessageValidationResult(inboundMessageId, form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<MessageValidationResultBasicView> elements = new ArrayList<>(list.size());
for (MessageValidationResult messageValidationResult : list) {
elements.add(this.messageValidationResultBasicViewMapper.mapFrom(new MessageValidationResultBasicView(),messageValidationResult));
}
result.setElements(elements);
return result;
}

/**
 * load one to many component messageValidationResult
 */
@Override
@Transactional(readOnly=true)
public MessageValidationResultFullView loadMessageValidationResult(Long id) {
MessageValidationResult messageValidationResult = inboundMessageDao.loadMessageValidationResult(id);
inboundMessageRightsManager.checkCanAccessMessageValidationResult(messageValidationResult.getInboundMessage());
return this.messageValidationResultFullViewMapper.mapFrom(messageValidationResult);
}

/**
 * create object
 */
@Override
public InboundMessageFullView create() {
inboundMessageRightsManager.checkCanCreate();
return new InboundMessageFullView();
}

/**
 * create one to many component messageValidationResult
 */
@Override
@Transactional(readOnly=true)
public MessageValidationResultFullView createMessageValidationResult(Long id) {
InboundMessage inboundMessage = inboundMessageDao.load(id);
inboundMessageRightsManager.checkCanCreateMessageValidationResult(inboundMessage);
return new MessageValidationResultFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Long save(InboundMessageForm inboundMessageForm) {
InboundMessage inboundMessage = this.inboundMessageFormMapper.mapTo(inboundMessageForm, new InboundMessage());
inboundMessageRightsManager.checkCanSave(inboundMessage);
inboundMessageStateManager.checkCanSave(inboundMessage);
return inboundMessageProcessor.save(inboundMessage);
}

/**
 * save one to many component messageValidationResult
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void saveMessageValidationResult(Long id, MessageValidationResultForm messageValidationResultForm) {
InboundMessage inboundMessage = this.inboundMessageDao.load(id);
MessageValidationResult messageValidationResult = this.messageValidationResultFormMapper.mapTo(messageValidationResultForm, new MessageValidationResult());
inboundMessageRightsManager.checkCanSaveMessageValidationResult(messageValidationResult,inboundMessage);
inboundMessageStateManager.checkCanSaveMessageValidationResult(messageValidationResult,inboundMessage);
inboundMessageProcessor.saveMessageValidationResult(messageValidationResult,inboundMessage);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Long id, InboundMessageForm inboundMessageForm) {
InboundMessage inboundMessage = this.inboundMessageDao.load(id);
inboundMessageRightsManager.checkCanUpdate(inboundMessage);
inboundMessageStateManager.checkCanUpdate(inboundMessage);
inboundMessage = this.inboundMessageFormMapper.mapTo(inboundMessageForm, inboundMessage);
inboundMessageProcessor.update(inboundMessage);
}

/**
 * update one to many component messageValidationResult
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void updateMessageValidationResult(Long id, MessageValidationResultForm messageValidationResultForm) {
MessageValidationResult messageValidationResult = this.inboundMessageDao.loadMessageValidationResult(id);
inboundMessageRightsManager.checkCanUpdateMessageValidationResult(messageValidationResult);
inboundMessageStateManager.checkCanUpdateMessageValidationResult(messageValidationResult);
messageValidationResult = this.messageValidationResultFormMapper.mapTo(messageValidationResultForm, messageValidationResult);
inboundMessageProcessor.updateMessageValidationResult(messageValidationResult);
}


/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Long id) {
InboundMessage inboundMessage = inboundMessageDao.load(id);
inboundMessageRightsManager.checkCanDelete(inboundMessage);
inboundMessageStateManager.checkCanDelete(inboundMessage);
inboundMessageProcessor.delete(inboundMessage);
}

/**
 * delete one to many component messageValidationResult
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteMessageValidationResult(Long id) {
MessageValidationResult messageValidationResult = inboundMessageDao.loadMessageValidationResult(id);
inboundMessageRightsManager.checkCanDeleteMessageValidationResult(messageValidationResult);
inboundMessageStateManager.checkCanDeleteMessageValidationResult(messageValidationResult);
this.inboundMessageProcessor.deleteMessageValidationResult(messageValidationResult);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Long> idList) {
InboundMessage inboundMessage;
if (idList != null){
for (Long id:idList){
inboundMessage = inboundMessageDao.load(id);
inboundMessageRightsManager.checkCanDelete(inboundMessage);
inboundMessageStateManager.checkCanDelete(inboundMessage);
inboundMessageProcessor.delete(inboundMessage);
}
}
}

/**
 * delete one to many component messageValidationResult list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteMessageValidationResultList(List<Long> idList) {
MessageValidationResult messageValidationResult;
if (idList != null){
for (Long i:idList){
messageValidationResult = inboundMessageDao.loadMessageValidationResult(i);
inboundMessageRightsManager.checkCanDeleteMessageValidationResult(messageValidationResult);
inboundMessageStateManager.checkCanDeleteMessageValidationResult(messageValidationResult);
this.inboundMessageProcessor.deleteMessageValidationResult(messageValidationResult);
}
}
}

}
