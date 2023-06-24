//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:13 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xffm.v2;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="ArrivalOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDateTimeTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDateTimeTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="OccurrenceArrivalLocation" type="{iata:datamodel:3}ArrivalLocationType"/&gt;
 *         &lt;element name="AssociatedTransportCargo" type="{iata:datamodel:3}TransportCargoType" maxOccurs="unbounded"/&gt;
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
    "arrivalDateTimeTypeCode",
    "departureOccurrenceDateTime",
    "departureDateTimeTypeCode",
    "occurrenceArrivalLocation",
    "associatedTransportCargo"
})
public class ArrivalEventType {

    @XmlElement(name = "ArrivalOccurrenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalOccurrenceDateTime;
    @XmlElement(name = "ArrivalDateTimeTypeCode")
    protected CodeType arrivalDateTimeTypeCode;
    @XmlElement(name = "DepartureOccurrenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureOccurrenceDateTime;
    @XmlElement(name = "DepartureDateTimeTypeCode")
    protected CodeType departureDateTimeTypeCode;
    @XmlElement(name = "OccurrenceArrivalLocation", required = true)
    protected ArrivalLocationType occurrenceArrivalLocation;
    @XmlElement(name = "AssociatedTransportCargo", required = true)
    protected List<TransportCargoType> associatedTransportCargo;

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

    /**
     * Obtient la valeur de la propriété occurrenceArrivalLocation.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalLocationType }
     *     
     */
    public ArrivalLocationType getOccurrenceArrivalLocation() {
        return occurrenceArrivalLocation;
    }

    /**
     * Définit la valeur de la propriété occurrenceArrivalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalLocationType }
     *     
     */
    public void setOccurrenceArrivalLocation(ArrivalLocationType value) {
        this.occurrenceArrivalLocation = value;
    }

    /**
     * Gets the value of the associatedTransportCargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedTransportCargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedTransportCargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportCargoType }
     * 
     * 
     */
    public List<TransportCargoType> getAssociatedTransportCargo() {
        if (associatedTransportCargo == null) {
            associatedTransportCargo = new ArrayList<TransportCargoType>();
        }
        return this.associatedTransportCargo;
    }

}
