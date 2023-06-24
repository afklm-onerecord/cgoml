//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour ApprovalEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ApprovalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedByName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalEventType", propOrder = {
    "approvedByName",
    "approvalOccurrenceDateTime"
})
public class ApprovalEventType {

    @XmlElement(name = "ApprovedByName")
    protected TextType approvedByName;
    @XmlElement(name = "ApprovalOccurrenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalOccurrenceDateTime;

    /**
     * Obtient la valeur de la propriété approvedByName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getApprovedByName() {
        return approvedByName;
    }

    /**
     * Définit la valeur de la propriété approvedByName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setApprovedByName(TextType value) {
        this.approvedByName = value;
    }

    /**
     * Obtient la valeur de la propriété approvalOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalOccurrenceDateTime() {
        return approvalOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété approvalOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalOccurrenceDateTime(XMLGregorianCalendar value) {
        this.approvalOccurrenceDateTime = value;
    }

}
