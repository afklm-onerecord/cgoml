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
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.MessageHeaderDocumentType;


/**
 * <p>Classe Java pour StatusMessageType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StatusMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeaderDocument" type="{iata:datamodel:3}MessageHeaderDocumentType"/&gt;
 *         &lt;element name="BusinessHeaderDocument" type="{iata:datamodel:3}BusinessHeaderDocumentType"/&gt;
 *         &lt;element name="MasterConsignment" type="{iata:datamodel:3}MasterConsignmentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMessageType", namespace = "iata:statusmessage:1", propOrder = {
    "messageHeaderDocument",
    "businessHeaderDocument",
    "masterConsignment"
})
public class StatusMessageType
{

    @XmlElement(name = "MessageHeaderDocument", required = true)
    protected MessageHeaderDocumentType messageHeaderDocument;
    @XmlElement(name = "BusinessHeaderDocument", required = true)
    protected BusinessHeaderDocumentType businessHeaderDocument;
    @XmlElement(name = "MasterConsignment")
    protected MasterConsignmentType masterConsignment;

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
     * Obtient la valeur de la propriété masterConsignment.
     * 
     * @return
     *     possible object is
     *     {@link MasterConsignmentType }
     *     
     */
    public MasterConsignmentType getMasterConsignment() {
        return masterConsignment;
    }

    /**
     * Définit la valeur de la propriété masterConsignment.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConsignmentType }
     *     
     */
    public void setMasterConsignment(MasterConsignmentType value) {
        this.masterConsignment = value;
    }

}
