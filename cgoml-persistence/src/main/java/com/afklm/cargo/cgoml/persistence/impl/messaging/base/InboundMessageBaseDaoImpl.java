package com.afklm.cargo.cgoml.persistence.impl.messaging.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addBetweenRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.sklsft.commons.api.exception.repository.ObjectNotFoundException;
import org.sklsft.commons.api.model.OrderType;
import org.sklsft.commons.model.patterns.BaseDaoImpl;

import com.afklm.cargo.cgoml.api.model.messaging.filters.InboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.InboundMessageSorting;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import com.afklm.cargo.cgoml.model.messaging.InboundMessage_;
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

}