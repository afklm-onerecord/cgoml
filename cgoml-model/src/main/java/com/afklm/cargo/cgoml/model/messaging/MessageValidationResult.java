package com.afklm.cargo.cgoml.model.messaging;

import com.afklm.cargo.cgoml.model.messaging.InboundMessage;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="MESSAGE_VALIDATION_RESULT"
, uniqueConstraints = {
}
, indexes = {
@Index(name = "IDX_MESSAGE_VALIDATION_RESULT_C0", columnList = "INBOUND_MESSAGE_ID")
})
public class MessageValidationResult implements org.sklsft.commons.model.interfaces.Entity<Long> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public MessageValidationResult(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "messageValidationResultIdGenerator", sequenceName = "MESSAGE_VALIDATION_RESULT_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messageValidationResultIdGenerator")
private Long id;

@ManyToOne(fetch = FetchType.LAZY)
@Fetch(FetchMode.JOIN)
@JoinColumn(name = "INBOUND_MESSAGE_ID", nullable = false)
private InboundMessage inboundMessage;

@Column(name = "LEVEL")
private String level;

@Column(name = "MIP_CODE")
private String mipCode;

@Column(name = "DESCRIPTION")
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

public InboundMessage getInboundMessage() {
return this.inboundMessage;
}

public void setInboundMessage(InboundMessage inboundMessage) {
this.inboundMessage = inboundMessage;
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