package com.afklm.cargo.cgoml.model.messaging;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(OutboundMessage.class)
public abstract class OutboundMessage_ {

public static volatile SingularAttribute<OutboundMessage, Long> id;
public static volatile SingularAttribute<OutboundMessage, String> uuid;
public static volatile SingularAttribute<OutboundMessage, Date> receptionDate;
public static volatile SingularAttribute<OutboundMessage, String> messageType;
public static volatile SingularAttribute<OutboundMessage, String> content;

public static final String ID = "id";
public static final String UUID = "uuid";
public static final String RECEPTION_DATE = "receptionDate";
public static final String MESSAGE_TYPE = "messageType";
public static final String CONTENT = "content";

/* Specific Code Start */
/* Specific Code End */
}