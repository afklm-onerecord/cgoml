//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.MessageHeaderDocumentType;


/**
 * <p>Classe Java pour TransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeaderDocument" type="{iata:datamodel:3}MessageHeaderDocumentType"/&gt;
 *         &lt;element name="TransportMovementHeader" type="{iata:datamodel:3}TransportMovementHeaderType"/&gt;
 *         &lt;element name="TransportMovementEvent" type="{iata:datamodel:3}TransportMovementEventType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMovementType", namespace = "iata:transportmovement:1", propOrder = {
    "messageHeaderDocument",
    "transportMovementHeader",
    "transportMovementEvent"
})
public class TransportMovementType
{

    @XmlElement(name = "MessageHeaderDocument", required = true)
    protected MessageHeaderDocumentType messageHeaderDocument;
    @XmlElement(name = "TransportMovementHeader", required = true)
    protected TransportMovementHeaderType transportMovementHeader;
    @XmlElement(name = "TransportMovementEvent", required = true)
    protected List<TransportMovementEventType> transportMovementEvent;

    /**
     * Obtient la valeur de la propriété messageHeaderDocument.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderDocumentType }
     *     
     */
    public MessageHeaderDocumentType getMessageHeaderDocument() {
        return messageHeaderDocument;
    }

    /**
     * Définit la valeur de la propriété messageHeaderDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderDocumentType }
     *     
     */
    public void setMessageHeaderDocument(MessageHeaderDocumentType value) {
        this.messageHeaderDocument = value;
    }

    /**
     * Obtient la valeur de la propriété transportMovementHeader.
     * 
     * @return
     *     possible object is
     *     {@link TransportMovementHeaderType }
     *     
     */
    public TransportMovementHeaderType getTransportMovementHeader() {
        return transportMovementHeader;
    }

    /**
     * Définit la valeur de la propriété transportMovementHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMovementHeaderType }
     *     
     */
    public void setTransportMovementHeader(TransportMovementHeaderType value) {
        this.transportMovementHeader = value;
    }

    /**
     * Gets the value of the transportMovementEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportMovementEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMovementEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMovementEventType }
     * 
     * 
     */
    public List<TransportMovementEventType> getTransportMovementEvent() {
        if (transportMovementEvent == null) {
            transportMovementEvent = new ArrayList<TransportMovementEventType>();
        }
        return this.transportMovementEvent;
    }

}
