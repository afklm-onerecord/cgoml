package com.afklm.cargo.cgoml.model.messaging;

import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(MessageValidationResult.class)
public abstract class MessageValidationResult_ {

public static volatile SingularAttribute<MessageValidationResult, Long> id;
public static volatile SingularAttribute<MessageValidationResult, InboundMessage> inboundMessage;
public static volatile SingularAttribute<MessageValidationResult, String> level;
public static volatile SingularAttribute<MessageValidationResult, String> mipCode;
public static volatile SingularAttribute<MessageValidationResult, String> description;

public static final String ID = "id";
public static final String INBOUND_MESSAGE = "inboundMessage";
public static final String LEVEL = "level";
public static final String MIP_CODE = "mipCode";
public static final String DESCRIPTION = "description";

/* Specific Code Start */
/* Specific Code End */
}