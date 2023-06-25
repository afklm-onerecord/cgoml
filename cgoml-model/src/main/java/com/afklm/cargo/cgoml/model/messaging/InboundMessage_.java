package com.afklm.cargo.cgoml.model.messaging;

import java.util.Date;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(InboundMessage.class)
public abstract class InboundMessage_ {

public static volatile SingularAttribute<InboundMessage, Long> id;
public static volatile SingularAttribute<InboundMessage, String> uuid;
public static volatile SingularAttribute<InboundMessage, Date> receptionDate;
public static volatile SingularAttribute<InboundMessage, String> messageType;
public static volatile SingularAttribute<InboundMessage, String> content;
public static volatile SingularAttribute<InboundMessage, String> status;
public static volatile SetAttribute<InboundMessage, MessageValidationResult> messageValidationResultCollection;

public static final String ID = "id";
public static final String UUID = "uuid";
public static final String RECEPTION_DATE = "receptionDate";
public static final String MESSAGE_TYPE = "messageType";
public static final String CONTENT = "content";
public static final String STATUS = "status";
public static final String MESSAGE_VALIDATION_RESULT_COLLECTION = "messageValidationResultCollection";

/* Specific Code Start */
/* Specific Code End */
}