package com.afklm.cargo.cgoml.services.messaging.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgoml.api.interfaces.messaging.base.InboundMessageBaseService;
import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.InboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.InboundMessageFullView;
import com.afklm.cargo.cgoml.components.mapper.messaging.forms.InboundMessageFormMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.InboundMessageBasicViewMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.full.InboundMessageFullViewMapper;
import com.afklm.cargo.cgoml.components.processor.messaging.InboundMessageProcessor;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.InboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.InboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
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
 * create object
 */
@Override
public InboundMessageFullView create() {
inboundMessageRightsManager.checkCanCreate();
return new InboundMessageFullView();
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

}
