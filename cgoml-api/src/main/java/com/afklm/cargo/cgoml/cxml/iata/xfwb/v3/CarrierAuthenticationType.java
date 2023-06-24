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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour CarrierAuthenticationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CarrierAuthenticationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType"/&gt;
 *         &lt;element name="Signatory" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="IssueAuthenticationLocation" type="{iata:datamodel:3}AuthenticationLocationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierAuthenticationType", propOrder = {
    "actualDateTime",
    "signatory",
    "issueAuthenticationLocation"
})
public class CarrierAuthenticationType {

    @XmlElement(name = "ActualDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDateTime;
    @XmlElement(name = "Signatory", required = true)
    protected TextType signatory;
    @XmlElement(name = "IssueAuthenticationLocation", required = true)
    protected AuthenticationLocationType issueAuthenticationLocation;

    /**
     * Obtient la valeur de la propriété actualDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDateTime() {
        return actualDateTime;
    }

    /**
     * Définit la valeur de la propriété actualDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDateTime(XMLGregorianCalendar value) {
        this.actualDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété signatory.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSignatory() {
        return signatory;
    }

    /**
     * Définit la valeur de la propriété signatory.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSignatory(TextType value) {
        this.signatory = value;
    }

    /**
     * Obtient la valeur de la propriété issueAuthenticationLocation.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationLocationType }
     *     
     */
    public AuthenticationLocationType getIssueAuthenticationLocation() {
        return issueAuthenticationLocation;
    }

    /**
     * Définit la valeur de la propriété issueAuthenticationLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationLocationType }
     *     
     */
    public void setIssueAuthenticationLocation(AuthenticationLocationType value) {
        this.issueAuthenticationLocation = value;
    }

}
