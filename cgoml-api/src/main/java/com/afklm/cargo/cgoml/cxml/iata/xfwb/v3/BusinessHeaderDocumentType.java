//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour BusinessHeaderDocumentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessHeaderDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="SenderAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="IncludedHeaderNote" type="{iata:datamodel:3}HeaderNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SignatoryConsignorAuthentication" type="{iata:datamodel:3}ConsignorAuthenticationType" minOccurs="0"/&gt;
 *         &lt;element name="SignatoryCarrierAuthentication" type="{iata:datamodel:3}CarrierAuthenticationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessHeaderDocumentType", propOrder = {
    "id",
    "senderAssignedID",
    "includedHeaderNote",
    "signatoryConsignorAuthentication",
    "signatoryCarrierAuthentication"
})
public class BusinessHeaderDocumentType
{

    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "SenderAssignedID")
    protected IDType senderAssignedID;
    @XmlElement(name = "IncludedHeaderNote")
    protected List<HeaderNoteType> includedHeaderNote;
    @XmlElement(name = "SignatoryConsignorAuthentication")
    protected ConsignorAuthenticationType signatoryConsignorAuthentication;
    @XmlElement(name = "SignatoryCarrierAuthentication", required = true)
    protected CarrierAuthenticationType signatoryCarrierAuthentication;

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
     * Obtient la valeur de la propriété senderAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSenderAssignedID() {
        return senderAssignedID;
    }

    /**
     * Définit la valeur de la propriété senderAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSenderAssignedID(IDType value) {
        this.senderAssignedID = value;
    }

    /**
     * Gets the value of the includedHeaderNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedHeaderNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedHeaderNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderNoteType }
     * 
     * 
     */
    public List<HeaderNoteType> getIncludedHeaderNote() {
        if (includedHeaderNote == null) {
            includedHeaderNote = new ArrayList<HeaderNoteType>();
        }
        return this.includedHeaderNote;
    }

    /**
     * Obtient la valeur de la propriété signatoryConsignorAuthentication.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorAuthenticationType }
     *     
     */
    public ConsignorAuthenticationType getSignatoryConsignorAuthentication() {
        return signatoryConsignorAuthentication;
    }

    /**
     * Définit la valeur de la propriété signatoryConsignorAuthentication.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorAuthenticationType }
     *     
     */
    public void setSignatoryConsignorAuthentication(ConsignorAuthenticationType value) {
        this.signatoryConsignorAuthentication = value;
    }

    /**
     * Obtient la valeur de la propriété signatoryCarrierAuthentication.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAuthenticationType }
     *     
     */
    public CarrierAuthenticationType getSignatoryCarrierAuthentication() {
        return signatoryCarrierAuthentication;
    }

    /**
     * Définit la valeur de la propriété signatoryCarrierAuthentication.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAuthenticationType }
     *     
     */
    public void setSignatoryCarrierAuthentication(CarrierAuthenticationType value) {
        this.signatoryCarrierAuthentication = value;
    }

}
