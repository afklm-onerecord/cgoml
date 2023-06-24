package com.afklm.cargo.cgoml.api.model.messaging.views.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class OutboundMessageBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Long id;
private boolean selected;
private boolean canDelete;
private String uuid;
private Date receptionDate;
private String messageType;

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


/* Specific Code Start */
/* Specific Code End */
}
