//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:55 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfsu.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;


/**
 * <p>Classe Java pour ArrivalEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrivalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType"/&gt;
 *         &lt;element name="ArrivalDateTimeTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalEventType", propOrder = {
    "arrivalOccurrenceDateTime",
    "arrivalDateTimeTypeCode"
})
public class ArrivalEventType {

    @XmlElement(name = "ArrivalOccurrenceDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalOccurrenceDateTime;
    @XmlElement(name = "ArrivalDateTimeTypeCode", required = true)
    protected CodeType arrivalDateTimeTypeCode;

    /**
     * Obtient la valeur de la propriété arrivalOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalOccurrenceDateTime() {
        return arrivalOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété arrivalOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalOccurrenceDateTime(XMLGregorianCalendar value) {
        this.arrivalOccurrenceDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété arrivalDateTimeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getArrivalDateTimeTypeCode() {
        return arrivalDateTimeTypeCode;
    }

    /**
     * Définit la valeur de la propriété arrivalDateTimeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setArrivalDateTimeTypeCode(CodeType value) {
        this.arrivalDateTimeTypeCode = value;
    }

}
