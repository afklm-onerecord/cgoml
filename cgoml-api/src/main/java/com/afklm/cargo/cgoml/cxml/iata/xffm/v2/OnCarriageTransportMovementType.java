//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:13 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xffm.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour OnCarriageTransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OnCarriageTransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierParty" type="{iata:datamodel:3}CarrierPartyType" minOccurs="0"/&gt;
 *         &lt;element name="OnCarriageEvent" type="{iata:datamodel:3}OnCarriageEventType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDestinationEvent" type="{iata:datamodel:3}DestinationEventType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnCarriageTransportMovementType", propOrder = {
    "id",
    "carrierParty",
    "onCarriageEvent",
    "arrivalDestinationEvent"
})
public class OnCarriageTransportMovementType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "CarrierParty")
    protected CarrierPartyType carrierParty;
    @XmlElement(name = "OnCarriageEvent")
    protected OnCarriageEventType onCarriageEvent;
    @XmlElement(name = "ArrivalDestinationEvent")
    protected DestinationEventType arrivalDestinationEvent;

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
     * Obtient la valeur de la propriété onCarriageEvent.
     * 
     * @return
     *     possible object is
     *     {@link OnCarriageEventType }
     *     
     */
    public OnCarriageEventType getOnCarriageEvent() {
        return onCarriageEvent;
    }

    /**
     * Définit la valeur de la propriété onCarriageEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCarriageEventType }
     *     
     */
    public void setOnCarriageEvent(OnCarriageEventType value) {
        this.onCarriageEvent = value;
    }

    /**
     * Obtient la valeur de la propriété arrivalDestinationEvent.
     * 
     * @return
     *     possible object is
     *     {@link DestinationEventType }
     *     
     */
    public DestinationEventType getArrivalDestinationEvent() {
        return arrivalDestinationEvent;
    }

    /**
     * Définit la valeur de la propriété arrivalDestinationEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationEventType }
     *     
     */
    public void setArrivalDestinationEvent(DestinationEventType value) {
        this.arrivalDestinationEvent = value;
    }

}
