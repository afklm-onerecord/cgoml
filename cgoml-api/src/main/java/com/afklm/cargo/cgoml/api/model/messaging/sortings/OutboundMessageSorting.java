package com.afklm.cargo.cgoml.api.model.messaging.sortings;

import java.io.Serializable;

import org.sklsft.commons.api.model.OrderType;

/**
 * auto generated ordering class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageSorting implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private OrderType uuidOrderType;
private OrderType receptionDateOrderType;
private OrderType messageTypeOrderType;

/*
 * getters and setters
 */
public OrderType getUuidOrderType() {
return this.uuidOrderType;
}

public void setUuidOrderType(OrderType uuidOrderType) {
this.uuidOrderType = uuidOrderType;
}

public OrderType getReceptionDateOrderType() {
return this.receptionDateOrderType;
}

public void setReceptionDateOrderType(OrderType receptionDateOrderType) {
this.receptionDateOrderType = receptionDateOrderType;
}

public OrderType getMessageTypeOrderType() {
return this.messageTypeOrderType;
}

public void setMessageTypeOrderType(OrderType messageTypeOrderType) {
this.messageTypeOrderType = messageTypeOrderType;
}


/* Specific Code Start */
/* Specific Code End */
}
