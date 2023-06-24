//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:55 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfsu.v3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour LogisticsTransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsTransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="UsedLogisticsTransportMeans" type="{iata:datamodel:3}LogisticsTransportMeansType" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledArrivalEvent" type="{iata:datamodel:3}ScheduledArrivalEventType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalEvent" type="{iata:datamodel:3}ArrivalEventType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureEvent" type="{iata:datamodel:3}DepartureEventType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierParty" type="{iata:datamodel:3}CarrierPartyType" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedLocation" type="{iata:datamodel:3}SpecifiedLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedEvent" type="{iata:datamodel:3}SpecifiedEventType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsTransportMovementType", propOrder = {
    "id",
    "usedLogisticsTransportMeans",
    "scheduledArrivalEvent",
    "arrivalEvent",
    "departureEvent",
    "carrierParty",
    "specifiedLocation",
    "specifiedEvent"
})
public class LogisticsTransportMovementType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "UsedLogisticsTransportMeans")
    protected LogisticsTransportMeansType usedLogisticsTransportMeans;
    @XmlElement(name = "ScheduledArrivalEvent")
    protected ScheduledArrivalEventType scheduledArrivalEvent;
    @XmlElement(name = "ArrivalEvent")
    protected ArrivalEventType arrivalEvent;
    @XmlElement(name = "DepartureEvent")
    protected DepartureEventType departureEvent;
    @XmlElement(name = "CarrierParty")
    protected CarrierPartyType carrierParty;
    @XmlElement(name = "SpecifiedLocation")
    protected List<SpecifiedLocationType> specifiedLocation;
    @XmlElement(name = "SpecifiedEvent")
    protected SpecifiedEventType specifiedEvent;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété usedLogisticsTransportMeans.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsTransportMeansType }
     *     
     */
    public LogisticsTransportMeansType getUsedLogisticsTransportMeans() {
        return usedLogisticsTransportMeans;
    }

    /**
     * Définit la valeur de la propriété usedLogisticsTransportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsTransportMeansType }
     *     
     */
    public void setUsedLogisticsTransportMeans(LogisticsTransportMeansType value) {
        this.usedLogisticsTransportMeans = value;
    }

    /**
     * Obtient la valeur de la propriété scheduledArrivalEvent.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledArrivalEventType }
     *     
     */
    public ScheduledArrivalEventType getScheduledArrivalEvent() {
        return scheduledArrivalEvent;
    }

    /**
     * Définit la valeur de la propriété scheduledArrivalEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledArrivalEventType }
     *     
     */
    public void setScheduledArrivalEvent(ScheduledArrivalEventType value) {
        this.scheduledArrivalEvent = value;
    }

    /**
     * Obtient la valeur de la propriété arrivalEvent.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalEventType }
     *     
     */
    public ArrivalEventType getArrivalEvent() {
        return arrivalEvent;
    }

    /**
     * Définit la valeur de la propriété arrivalEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalEventType }
     *     
     */
    public void setArrivalEvent(ArrivalEventType value) {
        this.arrivalEvent = value;
    }

    /**
     * Obtient la valeur de la propriété departureEvent.
     * 
     * @return
     *     possible object is
     *     {@link DepartureEventType }
     *     
     */
    public DepartureEventType getDepartureEvent() {
        return departureEvent;
    }

    /**
     * Définit la valeur de la propriété departureEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureEventType }
     *     
     */
    public void setDepartureEvent(DepartureEventType value) {
        this.departureEvent = value;
    }

    /**
     * Obtient la valeur de la propriété carrierParty.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPartyType }
     *     
     */
    public CarrierPartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Définit la valeur de la propriété carrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPartyType }
     *     
     */
    public void setCarrierParty(CarrierPartyType value) {
        this.carrierParty = value;
    }

    /**
     * Gets the value of the specifiedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedLocationType }
     * 
     * 
     */
    public List<SpecifiedLocationType> getSpecifiedLocation() {
        if (specifiedLocation == null) {
            specifiedLocation = new ArrayList<SpecifiedLocationType>();
        }
        return this.specifiedLocation;
    }

    /**
     * Obtient la valeur de la propriété specifiedEvent.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedEventType }
     *     
     */
    public SpecifiedEventType getSpecifiedEvent() {
        return specifiedEvent;
    }

    /**
     * Définit la valeur de la propriété specifiedEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedEventType }
     *     
     */
    public void setSpecifiedEvent(SpecifiedEventType value) {
        this.specifiedEvent = value;
    }

}
