package com.afklm.cargo.cgoml.api.model.messaging.filters;

import java.io.Serializable;
import java.util.Date;

/**
 * auto generated filter class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageFilter implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private String uuid;
private Date receptionDateMinValue;
private Date receptionDateMaxValue;
private String messageType;

/*
 * getters and setters
 */
public String getUuid() {
return this.uuid;
}
public void setUuid(String uuid) {
this.uuid = uuid;
}
public Date getReceptionDateMinValue() {
return this.receptionDateMinValue;
}
public void setReceptionDateMinValue(Date receptionDateMinValue) {
this.receptionDateMinValue = receptionDateMinValue;
}
public Date getReceptionDateMaxValue() {
return this.receptionDateMaxValue;
}
public void setReceptionDateMaxValue(Date receptionDateMaxValue) {
this.receptionDateMaxValue = receptionDateMaxValue;
}
public String getMessageType() {
return this.messageType;
}
public void setMessageType(String messageType) {
this.messageType = messageType;
}

/* Specific Code Start */
/* Specific Code End */
}
