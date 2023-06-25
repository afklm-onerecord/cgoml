package com.afklm.cargo.cgoml.api.model.messaging.sortings;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import org.sklsft.commons.api.model.OrderType;

/**
 * auto generated ordering class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class MessageValidationResultSorting implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private OrderType levelOrderType;
private OrderType mipCodeOrderType;
private OrderType descriptionOrderType;

/*
 * getters and setters
 */
public OrderType getLevelOrderType() {
return this.levelOrderType;
}

public void setLevelOrderType(OrderType levelOrderType) {
this.levelOrderType = levelOrderType;
}

public OrderType getMipCodeOrderType() {
return this.mipCodeOrderType;
}

public void setMipCodeOrderType(OrderType mipCodeOrderType) {
this.mipCodeOrderType = mipCodeOrderType;
}

public OrderType getDescriptionOrderType() {
return this.descriptionOrderType;
}

public void setDescriptionOrderType(OrderType descriptionOrderType) {
this.descriptionOrderType = descriptionOrderType;
}


/* Specific Code Start */
/* Specific Code End */
}
