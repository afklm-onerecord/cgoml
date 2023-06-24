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

import com.afklm.cargo.cgoml.api.model.messaging.filters.OutboundMessageFilter;
import com.afklm.cargo.cgoml.api.model.messaging.sortings.OutboundMessageSorting;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage;
import com.afklm.cargo.cgoml.model.messaging.OutboundMessage_;
import com.afklm.cargo.cgoml.persistence.interfaces.messaging.base.OutboundMessageBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBaseDaoImpl extends BaseDaoImpl<OutboundMessage, Long> implements OutboundMessageBaseDao {

/**
 * constructor
 */
public OutboundMessageBaseDaoImpl() {
super(OutboundMessage.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<OutboundMessage> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<OutboundMessage> criteria = builder.createQuery(OutboundMessage.class);

Root<OutboundMessage> root = criteria.from(OutboundMessage.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(OutboundMessage_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(OutboundMessageFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<OutboundMessage> root = criteria.from(OutboundMessage.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(OutboundMessage_.uuid), filter.getUuid());
addBetweenRestriction(builder, predicates, root.get(OutboundMessage_.receptionDate), filter.getReceptionDateMinValue(), filter.getReceptionDateMaxValue());
addStringStartsWithRestriction(builder, predicates, root.get(OutboundMessage_.messageType), filter.getMessageType());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<OutboundMessage> scroll(OutboundMessageFilter filter, OutboundMessageSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<OutboundMessage> criteria = builder.createQuery(OutboundMessage.class);

Root<OutboundMessage> root = criteria.from(OutboundMessage.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(OutboundMessage_.uuid), filter.getUuid());
addBetweenRestriction(builder, predicates, root.get(OutboundMessage_.receptionDate), filter.getReceptionDateMinValue(), filter.getReceptionDateMaxValue());
addStringStartsWithRestriction(builder, predicates, root.get(OutboundMessage_.messageType), filter.getMessageType());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(OutboundMessage_.uuid), sorting.getUuidOrderType());
addOrder(builder, orders, root.get(OutboundMessage_.receptionDate), sorting.getReceptionDateOrderType());
addOrder(builder, orders, root.get(OutboundMessage_.messageType), sorting.getMessageTypeOrderType());
addOrder(builder, orders, root.get(OutboundMessage_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<OutboundMessage> query = session.createQuery(criteria);
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
public OutboundMessage findOrNull(String uuid) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<OutboundMessage> criteria = builder.createQuery(OutboundMessage.class);

Root<OutboundMessage> root = criteria.from(OutboundMessage.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(OutboundMessage_.uuid), uuid);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public OutboundMessage find(String uuid) {
if (uuid == null) {
return null;
}
OutboundMessage outboundMessage = findOrNull(uuid);
if (outboundMessage == null) {
throw new ObjectNotFoundException("OutboundMessage.notFound");
} else {
return outboundMessage;
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
OutboundMessage outboundMessage = findOrNull(uuid);
return outboundMessage != null;
}

}