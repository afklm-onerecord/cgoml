//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:13 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xffm.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


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
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="BuildTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="UsedCapacityCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="OperationalStatusCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="LoadingRemark" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PositioningEvent" type="{iata:datamodel:3}PositioningEventType" minOccurs="0"/&gt;
 *         &lt;element name="OperatingParty" type="{iata:datamodel:3}OperatingPartyType"/&gt;
 *         &lt;element name="OnCarriageTransportMovement" type="{iata:datamodel:3}OnCarriageTransportMovementType" minOccurs="0"/&gt;
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
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "pieceQuantity",
    "buildTypeCode",
    "characteristicCode",
    "usedCapacityCode",
    "operationalStatusCode",
    "loadingRemark",
    "positioningEvent",
    "operatingParty",
    "onCarriageTransportMovement"
})
public class UnitLoadTransportEquipmentType {

    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "PieceQuantity")
    protected QuantityType pieceQuantity;
    @XmlElement(name = "BuildTypeCode")
    protected CodeType buildTypeCode;
    @XmlElement(name = "CharacteristicCode", required = true)
    protected CodeType characteristicCode;
    @XmlElement(name = "UsedCapacityCode")
    protected CodeType usedCapacityCode;
    @XmlElement(name = "OperationalStatusCode")
    protected CodeType operationalStatusCode;
    @XmlElement(name = "LoadingRemark")
    protected TextType loadingRemark;
    @XmlElement(name = "PositioningEvent")
    protected PositioningEventType positioningEvent;
    @XmlElement(name = "OperatingParty", required = true)
    protected OperatingPartyType operatingParty;
    @XmlElement(name = "OnCarriageTransportMovement")
    protected OnCarriageTransportMovementType onCarriageTransportMovement;

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
     * Obtient la valeur de la propriété grossVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Définit la valeur de la propriété grossVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossVolumeMeasure(MeasureType value) {
        this.grossVolumeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété pieceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPieceQuantity() {
        return pieceQuantity;
    }

    /**
     * Définit la valeur de la propriété pieceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPieceQuantity(QuantityType value) {
        this.pieceQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété buildTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBuildTypeCode() {
        return buildTypeCode;
    }

    /**
     * Définit la valeur de la propriété buildTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBuildTypeCode(CodeType value) {
        this.buildTypeCode = value;
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
     * Obtient la valeur de la propriété usedCapacityCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUsedCapacityCode() {
        return usedCapacityCode;
    }

    /**
     * Définit la valeur de la propriété usedCapacityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUsedCapacityCode(CodeType value) {
        this.usedCapacityCode = value;
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
     * Obtient la valeur de la propriété loadingRemark.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLoadingRemark() {
        return loadingRemark;
    }

    /**
     * Définit la valeur de la propriété loadingRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLoadingRemark(TextType value) {
        this.loadingRemark = value;
    }

    /**
     * Obtient la valeur de la propriété positioningEvent.
     * 
     * @return
     *     possible object is
     *     {@link PositioningEventType }
     *     
     */
    public PositioningEventType getPositioningEvent() {
        return positioningEvent;
    }

    /**
     * Définit la valeur de la propriété positioningEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link PositioningEventType }
     *     
     */
    public void setPositioningEvent(PositioningEventType value) {
        this.positioningEvent = value;
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

    /**
     * Obtient la valeur de la propriété onCarriageTransportMovement.
     * 
     * @return
     *     possible object is
     *     {@link OnCarriageTransportMovementType }
     *     
     */
    public OnCarriageTransportMovementType getOnCarriageTransportMovement() {
        return onCarriageTransportMovement;
    }

    /**
     * Définit la valeur de la propriété onCarriageTransportMovement.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCarriageTransportMovementType }
     *     
     */
    public void setOnCarriageTransportMovement(OnCarriageTransportMovementType value) {
        this.onCarriageTransportMovement = value;
    }

}
