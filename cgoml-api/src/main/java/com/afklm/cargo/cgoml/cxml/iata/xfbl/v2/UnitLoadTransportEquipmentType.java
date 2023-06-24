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

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;


/**
 * <p>Classe Java pour UnitLoadTransportEquipmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnitLoadTransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="LoadedPackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="OperationalStatusCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="OperatingParty" type="{iata:datamodel:3}OperatingPartyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitLoadTransportEquipmentType", propOrder = {
    "id",
    "loadedPackageQuantity",
    "characteristicCode",
    "operationalStatusCode",
    "grossWeightMeasure",
    "operatingParty"
})
public class UnitLoadTransportEquipmentType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "LoadedPackageQuantity")
    protected QuantityType loadedPackageQuantity;
    @XmlElement(name = "CharacteristicCode", required = true)
    protected CodeType characteristicCode;
    @XmlElement(name = "OperationalStatusCode")
    protected CodeType operationalStatusCode;
    @XmlElement(name = "GrossWeightMeasure", required = true)
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "OperatingParty", required = true)
    protected OperatingPartyType operatingParty;

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
     * Obtient la valeur de la propriété loadedPackageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getLoadedPackageQuantity() {
        return loadedPackageQuantity;
    }

    /**
     * Définit la valeur de la propriété loadedPackageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setLoadedPackageQuantity(QuantityType value) {
        this.loadedPackageQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété characteristicCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Définit la valeur de la propriété characteristicCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCharacteristicCode(CodeType value) {
        this.characteristicCode = value;
    }

    /**
     * Obtient la valeur de la propriété operationalStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOperationalStatusCode() {
        return operationalStatusCode;
    }

    /**
     * Définit la valeur de la propriété operationalStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOperationalStatusCode(CodeType value) {
        this.operationalStatusCode = value;
    }

    /**
     * Obtient la valeur de la propriété grossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété grossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWeightMeasure(MeasureType value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété operatingParty.
     * 
     * @return
     *     possible object is
     *     {@link OperatingPartyType }
     *     
     */
    public OperatingPartyType getOperatingParty() {
        return operatingParty;
    }

    /**
     * Définit la valeur de la propriété operatingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingPartyType }
     *     
     */
    public void setOperatingParty(OperatingPartyType value) {
        this.operatingParty = value;
    }

}
