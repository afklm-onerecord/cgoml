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
 * <p>Classe Java pour DepartureEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DepartureEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType"/&gt;
 *         &lt;element name="DepartureDateTimeTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureEventType", propOrder = {
    "departureOccurrenceDateTime",
    "departureDateTimeTypeCode"
})
public class DepartureEventType {

    @XmlElement(name = "DepartureOccurrenceDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureOccurrenceDateTime;
    @XmlElement(name = "DepartureDateTimeTypeCode", required = true)
    protected CodeType departureDateTimeTypeCode;

    /**
     * Obtient la valeur de la propriété departureOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureOccurrenceDateTime() {
        return departureOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété departureOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureOccurrenceDateTime(XMLGregorianCalendar value) {
        this.departureOccurrenceDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété departureDateTimeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDepartureDateTimeTypeCode() {
        return departureDateTimeTypeCode;
    }

    /**
     * Définit la valeur de la propriété departureDateTimeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDepartureDateTimeTypeCode(CodeType value) {
        this.departureDateTimeTypeCode = value;
    }

}
