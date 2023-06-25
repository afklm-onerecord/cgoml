package com.afklm.cargo.cgoml.persistence.impl.messaging.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addBetweenRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.sklsft.commons.api.exception.repository.ObjectNotFoundException;
import org.sklsft.commons.api.model.OrderType;
import org.sklsft.commons.model.patterns.BaseDaoImpl;

import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.filters.MessageValidationResultFilter;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.MessageValidationResultSorting;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage_;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult;
import com.afklm.cargo.cgoml.model.messaging.MessageValidationResult_;
import com.afklm.cargo.cgoml.persistence.interfaces.messaging.base.InboundMessageBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class InboundMessageBaseDaoImpl extends BaseDaoImpl<InboundMessage, Long> implements InboundMessageBaseDao {

/**
 * constructor
 */
public InboundMessageBaseDaoImpl() {
super(InboundMessage.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<InboundMessage> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<InboundMessage> criteria = builder.createQuery(InboundMessage.class);

Root<InboundMessage> root = criteria.from(InboundMessage.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(InboundMessage_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(InboundMessageFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<InboundMessage> root = criteria.from(InboundMessage.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(InboundMessage_.uuid), filter.getUuid());
addBetweenRestriction(builder, predicates, root.get(InboundMessage_.receptionDate), filter.getReceptionDateMinValue(), filter.getReceptionDateMaxValue());
addStringStartsWithRestriction(builder, predicates, root.get(InboundMessage_.messageType), filter.getMessageType());
addStringStartsWithRestriction(builder, predicates, root.get(InboundMessage_.status), filter.getStatus());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<InboundMessage> scroll(InboundMessageFilter filter, InboundMessageSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<InboundMessage> criteria = builder.createQuery(InboundMessage.class);

Root<InboundMessage> root = criteria.from(InboundMessage.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(InboundMessage_.uuid), filter.getUuid());
addBetweenRestriction(builder, predicates, root.get(InboundMessage_.receptionDate), filter.getReceptionDateMinValue(), filter.getReceptionDateMaxValue());
addStringStartsWithRestriction(builder, predicates, root.get(InboundMessage_.messageType), filter.getMessageType());
addStringStartsWithRestriction(builder, predicates, root.get(InboundMessage_.status), filter.getStatus());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(InboundMessage_.uuid), sorting.getUuidOrderType());
addOrder(builder, orders, root.get(InboundMessage_.receptionDate), sorting.getReceptionDateOrderType());
addOrder(builder, orders, root.get(InboundMessage_.messageType), sorting.getMessageTypeOrderType());
addOrder(builder, orders, root.get(InboundMessage_.status), sorting.getStatusOrderType());
addOrder(builder, orders, root.get(InboundMessage_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<InboundMessage> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * load one to many component MessageValidationResult list
 */
@Override
public List<MessageValidationResult> loadMessageValidationResultList(Long inboundMessageId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<MessageValidationResult> criteria = builder.createQuery(MessageValidationResult.class);

Root<MessageValidationResult> root = criteria.from(MessageValidationResult.class);
Join<MessageValidationResult, InboundMessage> inboundMessage = root.join(MessageValidationResult_.inboundMessage, JoinType.LEFT);

if (inboundMessageId == null){
criteria.where(builder.isNull(inboundMessage.get(InboundMessage_.id)));
} else {
criteria.where(builder.equal(inboundMessage.get(InboundMessage_.id), inboundMessageId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(MessageValidationResult_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count one to many component MessageValidationResult
 */
@Override
public Long countMessageValidationResult(Long inboundMessageId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<MessageValidationResult> root = criteria.from(MessageValidationResult.class);
Join<MessageValidationResult, InboundMessage> inboundMessage = root.join(MessageValidationResult_.inboundMessage, JoinType.LEFT);

if (inboundMessageId == null){
criteria.where(builder.isNull(inboundMessage.get(InboundMessage_.id)));
} else {
criteria.where(builder.equal(inboundMessage.get(InboundMessage_.id), inboundMessageId));
}

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count filtered one to many component MessageValidationResult
 */
@Override
public Long countMessageValidationResult(Long inboundMessageId, MessageValidationResultFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<MessageValidationResult> root = criteria.from(MessageValidationResult.class);
Join<MessageValidationResult, InboundMessage> inboundMessage = root.join(MessageValidationResult_.inboundMessage, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(MessageValidationResult_.level), filter.getLevel());
addStringStartsWithRestriction(builder, predicates, root.get(MessageValidationResult_.mipCode), filter.getMipCode());
addStringStartsWithRestriction(builder, predicates, root.get(MessageValidationResult_.description), filter.getDescription());
if (inboundMessageId == null){
predicates.add(builder.isNull(inboundMessage.get(InboundMessage_.id)));
} else {
predicates.add(builder.equal(inboundMessage.get(InboundMessage_.id), inboundMessageId));
}
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered one to many component MessageValidationResult
 */
@Override
public List<MessageValidationResult> scrollMessageValidationResult(Long inboundMessageId, MessageValidationResultFilter filter, MessageValidationResultSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<MessageValidationResult> criteria = builder.createQuery(MessageValidationResult.class);

Root<MessageValidationResult> root = criteria.from(MessageValidationResult.class);
Join<MessageValidationResult, InboundMessage> inboundMessage = root.join(MessageValidationResult_.inboundMessage, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(MessageValidationResult_.level), filter.getLevel());
addStringStartsWithRestriction(builder, predicates, root.get(MessageValidationResult_.mipCode), filter.getMipCode());
addStringStartsWithRestriction(builder, predicates, root.get(MessageValidationResult_.description), filter.getDescription());
if (inboundMessageId == null){
predicates.add(builder.isNull(inboundMessage.get(InboundMessage_.id)));
} else {
predicates.add(builder.equal(inboundMessage.get(InboundMessage_.id), inboundMessageId));
}
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(MessageValidationResult_.level), sorting.getLevelOrderType());
addOrder(builder, orders, root.get(MessageValidationResult_.mipCode), sorting.getMipCodeOrderType());
addOrder(builder, orders, root.get(MessageValidationResult_.description), sorting.getDescriptionOrderType());
addOrder(builder, orders, root.get(MessageValidationResult_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<MessageValidationResult> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * load one to many component MessageValidationResult
 */
@Override
public MessageValidationResult loadMessageValidationResult(Long id) {
MessageValidationResult messageValidationResult = (MessageValidationResult)this.sessionFactory.getCurrentSession().get(MessageValidationResult.class,id);
if (messageValidationResult == null) {
throw new ObjectNotFoundException("MessageValidationResult.notFound");
} else {
return messageValidationResult;
}
}

/**
 * find object or null
 */
@Override
public InboundMessage findOrNull(String uuid) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<InboundMessage> criteria = builder.createQuery(InboundMessage.class);

Root<InboundMessage> root = criteria.from(InboundMessage.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(InboundMessage_.uuid), uuid);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public InboundMessage find(String uuid) {
if (uuid == null) {
return null;
}
InboundMessage inboundMessage = findOrNull(uuid);
if (inboundMessage == null) {
throw new ObjectNotFoundException("InboundMessage.notFound");
} else {
return inboundMessage;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String uuid) {
if (uuid == null) {
return false;
}
InboundMessage inboundMessage = findOrNull(uuid);
return inboundMessage != null;
}

/**
 * save one to many component MessageValidationResult
 */
@Override
public void saveMessageValidationResult(InboundMessage inboundMessage, MessageValidationResult messageValidationResult) {
messageValidationResult.setInboundMessage(inboundMessage);
this.sessionFactory.getCurrentSession().save(messageValidationResult);
}

/**
 * delete one to many component MessageValidationResult
 */
@Override
public void deleteMessageValidationResult(MessageValidationResult messageValidationResult) {
messageValidationResult.getInboundMessage().getMessageValidationResultCollection().remove(messageValidationResult);
this.sessionFactory.getCurrentSession().delete(messageValidationResult);
}

}