package com.afklm.cargo.cgoml.api.model.messaging.views.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class MessageValidationResultBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Long id;
private boolean selected;
private boolean canDelete;
private String level;
private String mipCode;
private String description;

/*
 * getters and setters
 */
public Long getId() {
return this.id;
}

public void setId(Long id) {
this.id = id;
}

public boolean getSelected() {
return this.selected;
}

public void setSelected(boolean selected) {
this.selected = selected;
}

public boolean getCanDelete() {
return this.canDelete;
}

public void setCanDelete(boolean canDelete) {
this.canDelete = canDelete;
}

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
