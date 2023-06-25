package com.afklm.cargo.cgoml.api.model.messaging.forms;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class MessageValidationResultForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private String level;
private String mipCode;
private String description;

/*
 * getters and setters
 */
public String getLevel() {
return this.level;
}
public void setLevel(String level) {
this.level = level;
}
public String getMipCode() {
return this.mipCode;
}
public void setMipCode(String mipCode) {
this.mipCode = mipCode;
}
public String getDescription() {
return this.description;
}
public void setDescription(String description) {
this.description = description;
}

/* Specific Code Start */
/* Specific Code End */
}
