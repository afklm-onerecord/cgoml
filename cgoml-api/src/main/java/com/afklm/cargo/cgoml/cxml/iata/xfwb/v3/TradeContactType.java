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
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour TradeContactType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TradeContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DirectTelephoneCommunication" type="{iata:datamodel:3}TelephoneCommunicationType" minOccurs="0"/&gt;
 *         &lt;element name="FaxCommunication" type="{iata:datamodel:3}FaxCommunicationType" minOccurs="0"/&gt;
 *         &lt;element name="URIEmailCommunication" type="{iata:datamodel:3}EmailCommunicationType" minOccurs="0"/&gt;
 *         &lt;element name="TelexCommunication" type="{iata:datamodel:3}TelexCommunicationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeContactType", propOrder = {
    "personName",
    "departmentName",
    "directTelephoneCommunication",
    "faxCommunication",
    "uriEmailCommunication",
    "telexCommunication"
})
public class TradeContactType {

    @XmlElement(name = "PersonName")
    protected TextType personName;
    @XmlElement(name = "DepartmentName")
    protected TextType departmentName;
    @XmlElement(name = "DirectTelephoneCommunication")
    protected TelephoneCommunicationType directTelephoneCommunication;
    @XmlElement(name = "FaxCommunication")
    protected FaxCommunicationType faxCommunication;
    @XmlElement(name = "URIEmailCommunication")
    protected EmailCommunicationType uriEmailCommunication;
    @XmlElement(name = "TelexCommunication")
    protected TelexCommunicationType telexCommunication;

    /**
     * Obtient la valeur de la propriété personName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPersonName() {
        return personName;
    }

    /**
     * Définit la valeur de la propriété personName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPersonName(TextType value) {
        this.personName = value;
    }

    /**
     * Obtient la valeur de la propriété departmentName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDepartmentName() {
        return departmentName;
    }

    /**
     * Définit la valeur de la propriété departmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDepartmentName(TextType value) {
        this.departmentName = value;
    }

    /**
     * Obtient la valeur de la propriété directTelephoneCommunication.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneCommunicationType }
     *     
     */
    public TelephoneCommunicationType getDirectTelephoneCommunication() {
        return directTelephoneCommunication;
    }

    /**
     * Définit la valeur de la propriété directTelephoneCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneCommunicationType }
     *     
     */
    public void setDirectTelephoneCommunication(TelephoneCommunicationType value) {
        this.directTelephoneCommunication = value;
    }

    /**
     * Obtient la valeur de la propriété faxCommunication.
     * 
     * @return
     *     possible object is
     *     {@link FaxCommunicationType }
     *     
     */
    public FaxCommunicationType getFaxCommunication() {
        return faxCommunication;
    }

    /**
     * Définit la valeur de la propriété faxCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxCommunicationType }
     *     
     */
    public void setFaxCommunication(FaxCommunicationType value) {
        this.faxCommunication = value;
    }

    /**
     * Obtient la valeur de la propriété uriEmailCommunication.
     * 
     * @return
     *     possible object is
     *     {@link EmailCommunicationType }
     *     
     */
    public EmailCommunicationType getURIEmailCommunication() {
        return uriEmailCommunication;
    }

    /**
     * Définit la valeur de la propriété uriEmailCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailCommunicationType }
     *     
     */
    public void setURIEmailCommunication(EmailCommunicationType value) {
        this.uriEmailCommunication = value;
    }

    /**
     * Obtient la valeur de la propriété telexCommunication.
     * 
     * @return
     *     possible object is
     *     {@link TelexCommunicationType }
     *     
     */
    public TelexCommunicationType getTelexCommunication() {
        return telexCommunication;
    }

    /**
     * Définit la valeur de la propriété telexCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link TelexCommunicationType }
     *     
     */
    public void setTelexCommunication(TelexCommunicationType value) {
        this.telexCommunication = value;
    }

}
