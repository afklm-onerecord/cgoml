package com.afklm.cargo.cgoml.api.model.messaging.forms;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String uuid;
@NotNull
private Date receptionDate;
private String messageType;
private String content;

/*
 * getters and setters
 */
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

/* Specific Code Start */
/* Specific Code End */
}
