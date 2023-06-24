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
 * <p>Classe Java pour VerificationEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerificationEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VerifiedByName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="VerificationOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationEventType", propOrder = {
    "verifiedByName",
    "verificationOccurrenceDateTime"
})
public class VerificationEventType {

    @XmlElement(name = "VerifiedByName")
    protected TextType verifiedByName;
    @XmlElement(name = "VerificationOccurrenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verificationOccurrenceDateTime;

    /**
     * Obtient la valeur de la propriété verifiedByName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getVerifiedByName() {
        return verifiedByName;
    }

    /**
     * Définit la valeur de la propriété verifiedByName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setVerifiedByName(TextType value) {
        this.verifiedByName = value;
    }

    /**
     * Obtient la valeur de la propriété verificationOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerificationOccurrenceDateTime() {
        return verificationOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété verificationOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerificationOccurrenceDateTime(XMLGregorianCalendar value) {
        this.verificationOccurrenceDateTime = value;
    }

}
