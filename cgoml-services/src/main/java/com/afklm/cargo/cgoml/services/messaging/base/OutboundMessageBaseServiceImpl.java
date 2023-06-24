package com.afklm.cargo.cgoml.services.messaging.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgoml.api.interfaces.messaging.base.OutboundMessageBaseService;
import com.afklm.cargo.cgoml.api.model.messaging.filters.OutboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.forms.OutboundMessageForm;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.OutboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.views.basic.OutboundMessageBasicView;
import com.afklm.cargo.cgoml.api.model.messaging.views.full.OutboundMessageFullView;
import com.afklm.cargo.cgoml.components.mapper.messaging.forms.OutboundMessageFormMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.basic.OutboundMessageBasicViewMapper;
import com.afklm.cargo.cgoml.components.mapper.messaging.views.full.OutboundMessageFullViewMapper;
import com.afklm.cargo.cgoml.components.processor.messaging.OutboundMessageProcessor;
import com.afklm.cargo.cgoml.components.rightsmanager.messaging.OutboundMessageRightsManager;
import com.afklm.cargo.cgoml.components.statemanager.messaging.OutboundMessageStateManager;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;
import com.afklm.cargo.cgoml.persistence.interfaces.messaging.OutboundMessageDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBaseServiceImpl implements OutboundMessageBaseService {

/*
 * properties injected by spring
 */
@Inject
protected OutboundMessageDao outboundMessageDao;
@Inject
protected OutboundMessageFullViewMapper outboundMessageFullViewMapper;
@Inject
protected OutboundMessageBasicViewMapper outboundMessageBasicViewMapper;
@Inject
protected OutboundMessageFormMapper outboundMessageFormMapper;
@Inject
protected OutboundMessageStateManager outboundMessageStateManager;
@Inject
protected OutboundMessageRightsManager outboundMessageRightsManager;
@Inject
protected OutboundMessageProcessor outboundMessageProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<OutboundMessageBasicView> loadList() {
outboundMessageRightsManager.checkCanAccess();
List<OutboundMessage> outboundMessageList = outboundMessageDao.loadListEagerly();
List<OutboundMessageBasicView> result = new ArrayList<>(outboundMessageList.size());
for (OutboundMessage outboundMessage : outboundMessageList) {
result.add(this.outboundMessageBasicViewMapper.mapFrom(new OutboundMessageBasicView(),outboundMessage));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<OutboundMessageBasicView> scroll(ScrollForm<OutboundMessageFilter, OutboundMessageSorting> form) {
outboundMessageRightsManager.checkCanAccess();
ScrollView<OutboundMessageBasicView> result = new ScrollView<>();
result.setSize(outboundMessageDao.count());
Long count = outboundMessageDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<OutboundMessage> list = outboundMessageDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<OutboundMessageBasicView> elements = new ArrayList<>(list.size());
for (OutboundMessage outboundMessage : list) {
elements.add(this.outboundMessageBasicViewMapper.mapFrom(new OutboundMessageBasicView(),outboundMessage));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public OutboundMessageFullView load(Long id) {
OutboundMessage outboundMessage = outboundMessageDao.load(id);
outboundMessageRightsManager.checkCanAccess(outboundMessage);
return this.outboundMessageFullViewMapper.mapFrom(new OutboundMessageFullView(),outboundMessage);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public OutboundMessageFullView find(String uuid) {
OutboundMessage outboundMessage = outboundMessageDao.find(uuid);
outboundMessageRightsManager.checkCanAccess(outboundMessage);
return this.outboundMessageFullViewMapper.mapFrom(new OutboundMessageFullView(), outboundMessage);
}

/**
 * create object
 */
@Override
public OutboundMessageFullView create() {
outboundMessageRightsManager.checkCanCreate();
return new OutboundMessageFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Long save(OutboundMessageForm outboundMessageForm) {
OutboundMessage outboundMessage = this.outboundMessageFormMapper.mapTo(outboundMessageForm, new OutboundMessage());
outboundMessageRightsManager.checkCanSave(outboundMessage);
outboundMessageStateManager.checkCanSave(outboundMessage);
return outboundMessageProcessor.save(outboundMessage);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Long id, OutboundMessageForm outboundMessageForm) {
OutboundMessage outboundMessage = this.outboundMessageDao.load(id);
outboundMessageRightsManager.checkCanUpdate(outboundMessage);
outboundMessageStateManager.checkCanUpdate(outboundMessage);
outboundMessage = this.outboundMessageFormMapper.mapTo(outboundMessageForm, outboundMessage);
outboundMessageProcessor.update(outboundMessage);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Long id) {
OutboundMessage outboundMessage = outboundMessageDao.load(id);
outboundMessageRightsManager.checkCanDelete(outboundMessage);
outboundMessageStateManager.checkCanDelete(outboundMessage);
outboundMessageProcessor.delete(outboundMessage);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Long> idList) {
OutboundMessage outboundMessage;
if (idList != null){
for (Long id:idList){
outboundMessage = outboundMessageDao.load(id);
outboundMessageRightsManager.checkCanDelete(outboundMessage);
outboundMessageStateManager.checkCanDelete(outboundMessage);
outboundMessageProcessor.delete(outboundMessage);
}
}
}

}
