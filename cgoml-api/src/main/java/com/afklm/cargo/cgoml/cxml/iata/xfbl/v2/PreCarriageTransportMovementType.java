//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:27 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfbl.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour PreCarriageTransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PreCarriageTransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="PreCarriageEvent" type="{iata:datamodel:3}PreCarriageEventType"/&gt;
 *         &lt;element name="LoadingEvent" type="{iata:datamodel:3}LoadingEventType" minOccurs="0"/&gt;
 *         &lt;element name="ForwardingAgentParty" type="{iata:datamodel:3}ForwardingAgentPartyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreCarriageTransportMovementType", propOrder = {
    "id",
    "preCarriageEvent",
    "loadingEvent",
    "forwardingAgentParty"
})
public class PreCarriageTransportMovementType {

    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "PreCarriageEvent", required = true)
    protected PreCarriageEventType preCarriageEvent;
    @XmlElement(name = "LoadingEvent")
    protected LoadingEventType loadingEvent;
    @XmlElement(name = "ForwardingAgentParty")
    protected ForwardingAgentPartyType forwardingAgentParty;

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
     * Obtient la valeur de la propriété preCarriageEvent.
     * 
     * @return
     *     possible object is
     *     {@link PreCarriageEventType }
     *     
     */
    public PreCarriageEventType getPreCarriageEvent() {
        return preCarriageEvent;
    }

    /**
     * Définit la valeur de la propriété preCarriageEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCarriageEventType }
     *     
     */
    public void setPreCarriageEvent(PreCarriageEventType value) {
        this.preCarriageEvent = value;
    }

    /**
     * Obtient la valeur de la propriété loadingEvent.
     * 
     * @return
     *     possible object is
     *     {@link LoadingEventType }
     *     
     */
    public LoadingEventType getLoadingEvent() {
        return loadingEvent;
    }

    /**
     * Définit la valeur de la propriété loadingEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingEventType }
     *     
     */
    public void setLoadingEvent(LoadingEventType value) {
        this.loadingEvent = value;
    }

    /**
     * Obtient la valeur de la propriété forwardingAgentParty.
     * 
     * @return
     *     possible object is
     *     {@link ForwardingAgentPartyType }
     *     
     */
    public ForwardingAgentPartyType getForwardingAgentParty() {
        return forwardingAgentParty;
    }

    /**
     * Définit la valeur de la propriété forwardingAgentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardingAgentPartyType }
     *     
     */
    public void setForwardingAgentParty(ForwardingAgentPartyType value) {
        this.forwardingAgentParty = value;
    }

}
