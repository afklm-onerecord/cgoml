//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour LogisticsTransportMeansType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsTransportMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="OperatorParty" type="{iata:datamodel:3}OperatorPartyType" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationCountry" type="{iata:datamodel:3}RegistrationCountryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsTransportMeansType", propOrder = {
    "name",
    "operatorParty",
    "registrationCountry"
})
public class LogisticsTransportMeansType {

    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "OperatorParty")
    protected OperatorPartyType operatorParty;
    @XmlElement(name = "RegistrationCountry")
    protected RegistrationCountryType registrationCountry;

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
     * Obtient la valeur de la propriété operatorParty.
     * 
     * @return
     *     possible object is
     *     {@link OperatorPartyType }
     *     
     */
    public OperatorPartyType getOperatorParty() {
        return operatorParty;
    }

    /**
     * Définit la valeur de la propriété operatorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorPartyType }
     *     
     */
    public void setOperatorParty(OperatorPartyType value) {
        this.operatorParty = value;
    }

    /**
     * Obtient la valeur de la propriété registrationCountry.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationCountryType }
     *     
     */
    public RegistrationCountryType getRegistrationCountry() {
        return registrationCountry;
    }

    /**
     * Définit la valeur de la propriété registrationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationCountryType }
     *     
     */
    public void setRegistrationCountry(RegistrationCountryType value) {
        this.registrationCountry = value;
    }

}