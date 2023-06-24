package com.afklm.cargo.cgoml.model.messaging;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="INBOUND_MESSAGE"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_INBOUND_MESSAGE", columnNames = {"UUID"})
}
, indexes = {
@Index(name = "IDX_INBOUND_MESSAGE_UC", columnList = "UUID")
})
public class InboundMessage implements org.sklsft.commons.model.interfaces.Entity<Long> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public InboundMessage(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "inboundMessageIdGenerator", sequenceName = "INBOUND_MESSAGE_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inboundMessageIdGenerator")
private Long id;

@Column(name = "UUID", nullable = false)
private String uuid;

@Temporal(TemporalType.TIMESTAMP)
@Column(name = "RECEPTION_DATE", nullable = false)
private Date receptionDate;

@Column(name = "MESSAGE_TYPE")
private String messageType;

@Lob
@Type(type="org.hibernate.type.TextType")
@Column(name = "CONTENT")
private String content;

@Column(name = "STATUS")
private String status;


/*
 * getters and setters
 */
public Long getId() {
return this.id;
}

public void setId(Long id) {
this.id = id;
}

public String getUuid() {
return this.uuid;
}

public void setUuid(String uuid) {
this.uuid = uuid;
}

public Date getReceptionDate() {
return this.receptionDate;
}

public void setReceptionDate(Date receptionDate) {
this.receptionDate = receptionDate;
}

public String getMessageType() {
return this.messageType;
}

public void setMessageType(String messageType) {
this.messageType = messageType;
}

public String getContent() {
return this.content;
}

public void setContent(String content) {
this.content = content;
}

public String getStatus() {
return this.status;
}

public void setStatus(String status) {
this.status = status;
}


/* Specific Code Start */
/* Specific Code End */
}