//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ScheduledOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="OccurrenceDepartureLocation" type="{iata:datamodel:3}DepartureLocationType" minOccurs="0"/&gt;
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
    "scheduledOccurrenceDateTime",
    "occurrenceDepartureLocation"
})
public class DepartureEventType {

    @XmlElement(name = "ScheduledOccurrenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledOccurrenceDateTime;
    @XmlElement(name = "OccurrenceDepartureLocation")
    protected DepartureLocationType occurrenceDepartureLocation;

    /**
     * Obtient la valeur de la propriété scheduledOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledOccurrenceDateTime() {
        return scheduledOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété scheduledOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledOccurrenceDateTime(XMLGregorianCalendar value) {
        this.scheduledOccurrenceDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété occurrenceDepartureLocation.
     * 
     * @return
     *     possible object is
     *     {@link DepartureLocationType }
     *     
     */
    public DepartureLocationType getOccurrenceDepartureLocation() {
        return occurrenceDepartureLocation;
    }

    /**
     * Définit la valeur de la propriété occurrenceDepartureLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureLocationType }
     *     
     */
    public void setOccurrenceDepartureLocation(DepartureLocationType value) {
        this.occurrenceDepartureLocation = value;
    }

}
