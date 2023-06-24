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
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour ConsigneePartyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConsigneePartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="AccountID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="PostalStructuredAddress" type="{iata:datamodel:3}StructuredAddressType"/&gt;
 *         &lt;element name="DefinedTradeContact" type="{iata:datamodel:3}TradeContactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsigneePartyType", propOrder = {
    "primaryID",
    "additionalID",
    "name",
    "accountID",
    "postalStructuredAddress",
    "definedTradeContact"
})
public class ConsigneePartyType {

    @XmlElement(name = "PrimaryID")
    protected IDType primaryID;
    @XmlElement(name = "AdditionalID")
    protected IDType additionalID;
    @XmlElement(name = "Name", required = true)
    protected TextType name;
    @XmlElement(name = "AccountID")
    protected IDType accountID;
    @XmlElement(name = "PostalStructuredAddress", required = true)
    protected StructuredAddressType postalStructuredAddress;
    @XmlElement(name = "DefinedTradeContact")
    protected List<TradeContactType> definedTradeContact;

    /**
     * Obtient la valeur de la propriété primaryID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPrimaryID() {
        return primaryID;
    }

    /**
     * Définit la valeur de la propriété primaryID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPrimaryID(IDType value) {
        this.primaryID = value;
    }

    /**
     * Obtient la valeur de la propriété additionalID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAdditionalID() {
        return additionalID;
    }

    /**
     * Définit la valeur de la propriété additionalID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAdditionalID(IDType value) {
        this.additionalID = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété accountID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAccountID() {
        return accountID;
    }

    /**
     * Définit la valeur de la propriété accountID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAccountID(IDType value) {
        this.accountID = value;
    }

    /**
     * Obtient la valeur de la propriété postalStructuredAddress.
     * 
     * @return
     *     possible object is
     *     {@link StructuredAddressType }
     *     
     */
    public StructuredAddressType getPostalStructuredAddress() {
        return postalStructuredAddress;
    }

    /**
     * Définit la valeur de la propriété postalStructuredAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredAddressType }
     *     
     */
    public void setPostalStructuredAddress(StructuredAddressType value) {
        this.postalStructuredAddress = value;
    }

    /**
     * Gets the value of the definedTradeContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definedTradeContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinedTradeContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeContactType }
     * 
     * 
     */
    public List<TradeContactType> getDefinedTradeContact() {
        if (definedTradeContact == null) {
            definedTradeContact = new ArrayList<TradeContactType>();
        }
        return this.definedTradeContact;
    }

}
