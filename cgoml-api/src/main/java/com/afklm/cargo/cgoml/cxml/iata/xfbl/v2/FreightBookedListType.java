//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:27 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfbl.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.MessageHeaderDocumentType;


/**
 * <p>Classe Java pour FreightBookedListType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FreightBookedListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeaderDocument" type="{iata:datamodel:3}MessageHeaderDocumentType"/&gt;
 *         &lt;element name="BusinessHeaderDocument" type="{iata:datamodel:3}BusinessHeaderDocumentType"/&gt;
 *         &lt;element name="LogisticsTransportMovement" type="{iata:datamodel:3}LogisticsTransportMovementType"/&gt;
 *         &lt;element name="ArrivalEvent" type="{iata:datamodel:3}ArrivalEventType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightBookedListType", namespace = "iata:freightbookedlist:1", propOrder = {
    "messageHeaderDocument",
    "businessHeaderDocument",
    "logisticsTransportMovement",
    "arrivalEvent"
})
public class FreightBookedListType
{

    @XmlElement(name = "MessageHeaderDocument", required = true)
    protected MessageHeaderDocumentType messageHeaderDocument;
    @XmlElement(name = "BusinessHeaderDocument", required = true)
    protected BusinessHeaderDocumentType businessHeaderDocument;
    @XmlElement(name = "LogisticsTransportMovement", required = true)
    protected LogisticsTransportMovementType logisticsTransportMovement;
    @XmlElement(name = "ArrivalEvent", required = true)
    protected List<ArrivalEventType> arrivalEvent;

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
     * Obtient la valeur de la propriété businessHeaderDocument.
     * 
     * @return
     *     possible object is
     *     {@link BusinessHeaderDocumentType }
     *     
     */
    public BusinessHeaderDocumentType getBusinessHeaderDocument() {
        return businessHeaderDocument;
    }

    /**
     * Définit la valeur de la propriété businessHeaderDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessHeaderDocumentType }
     *     
     */
    public void setBusinessHeaderDocument(BusinessHeaderDocumentType value) {
        this.businessHeaderDocument = value;
    }

    /**
     * Obtient la valeur de la propriété logisticsTransportMovement.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsTransportMovementType }
     *     
     */
    public LogisticsTransportMovementType getLogisticsTransportMovement() {
        return logisticsTransportMovement;
    }

    /**
     * Définit la valeur de la propriété logisticsTransportMovement.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsTransportMovementType }
     *     
     */
    public void setLogisticsTransportMovement(LogisticsTransportMovementType value) {
        this.logisticsTransportMovement = value;
    }

    /**
     * Gets the value of the arrivalEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrivalEventType }
     * 
     * 
     */
    public List<ArrivalEventType> getArrivalEvent() {
        if (arrivalEvent == null) {
            arrivalEvent = new ArrayList<ArrivalEventType>();
        }
        return this.arrivalEvent;
    }

}
