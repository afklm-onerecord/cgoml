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

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.CountryIDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour StructuredAddressType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StructuredAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostcodeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="CountryID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CountryIDType"/&gt;
 *         &lt;element name="CountryName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubDivisionName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PostOfficeBox" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CityID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubDivisionID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedAddressLocation" type="{iata:datamodel:3}AddressLocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAddressType", propOrder = {
    "postcodeCode",
    "streetName",
    "cityName",
    "countryID",
    "countryName",
    "countrySubDivisionName",
    "postOfficeBox",
    "cityID",
    "countrySubDivisionID",
    "specifiedAddressLocation"
})
public class StructuredAddressType {

    @XmlElement(name = "PostcodeCode")
    protected CodeType postcodeCode;
    @XmlElement(name = "StreetName")
    protected TextType streetName;
    @XmlElement(name = "CityName", required = true)
    protected TextType cityName;
    @XmlElement(name = "CountryID", required = true)
    protected CountryIDType countryID;
    @XmlElement(name = "CountryName")
    protected TextType countryName;
    @XmlElement(name = "CountrySubDivisionName")
    protected TextType countrySubDivisionName;
    @XmlElement(name = "PostOfficeBox")
    protected TextType postOfficeBox;
    @XmlElement(name = "CityID")
    protected IDType cityID;
    @XmlElement(name = "CountrySubDivisionID")
    protected IDType countrySubDivisionID;
    @XmlElement(name = "SpecifiedAddressLocation")
    protected AddressLocationType specifiedAddressLocation;

    /**
     * Obtient la valeur de la propriété postcodeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPostcodeCode() {
        return postcodeCode;
    }

    /**
     * Définit la valeur de la propriété postcodeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPostcodeCode(CodeType value) {
        this.postcodeCode = value;
    }

    /**
     * Obtient la valeur de la propriété streetName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetName() {
        return streetName;
    }

    /**
     * Définit la valeur de la propriété streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetName(TextType value) {
        this.streetName = value;
    }

    /**
     * Obtient la valeur de la propriété cityName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCityName() {
        return cityName;
    }

    /**
     * Définit la valeur de la propriété cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCityName(TextType value) {
        this.cityName = value;
    }

    /**
     * Obtient la valeur de la propriété countryID.
     * 
     * @return
     *     possible object is
     *     {@link CountryIDType }
     *     
     */
    public CountryIDType getCountryID() {
        return countryID;
    }

    /**
     * Définit la valeur de la propriété countryID.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryIDType }
     *     
     */
    public void setCountryID(CountryIDType value) {
        this.countryID = value;
    }

    /**
     * Obtient la valeur de la propriété countryName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountryName() {
        return countryName;
    }

    /**
     * Définit la valeur de la propriété countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountryName(TextType value) {
        this.countryName = value;
    }

    /**
     * Obtient la valeur de la propriété countrySubDivisionName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountrySubDivisionName() {
        return countrySubDivisionName;
    }

    /**
     * Définit la valeur de la propriété countrySubDivisionName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountrySubDivisionName(TextType value) {
        this.countrySubDivisionName = value;
    }

    /**
     * Obtient la valeur de la propriété postOfficeBox.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Définit la valeur de la propriété postOfficeBox.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPostOfficeBox(TextType value) {
        this.postOfficeBox = value;
    }

    /**
     * Obtient la valeur de la propriété cityID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCityID() {
        return cityID;
    }

    /**
     * Définit la valeur de la propriété cityID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCityID(IDType value) {
        this.cityID = value;
    }

    /**
     * Obtient la valeur de la propriété countrySubDivisionID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCountrySubDivisionID() {
        return countrySubDivisionID;
    }

    /**
     * Définit la valeur de la propriété countrySubDivisionID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCountrySubDivisionID(IDType value) {
        this.countrySubDivisionID = value;
    }

    /**
     * Obtient la valeur de la propriété specifiedAddressLocation.
     * 
     * @return
     *     possible object is
     *     {@link AddressLocationType }
     *     
     */
    public AddressLocationType getSpecifiedAddressLocation() {
        return specifiedAddressLocation;
    }

    /**
     * Définit la valeur de la propriété specifiedAddressLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLocationType }
     *     
     */
    public void setSpecifiedAddressLocation(AddressLocationType value) {
        this.specifiedAddressLocation = value;
    }

}
