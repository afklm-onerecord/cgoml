//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:20 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfum.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="SequenceNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}NumericType"/&gt;
 *         &lt;element name="MainIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="CharacteristicCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="OperatingParty" type="{iata:datamodel:3}OperatingPartyType"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="LoadedPackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="AvailableVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="LoadIncludedIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="ContourCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="LoadingPositionCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="LoadingRemark" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="LoadingEvent" type="{iata:datamodel:3}LoadingEventType" minOccurs="0"/&gt;
 *         &lt;element name="UnloadingEvent" type="{iata:datamodel:3}UnloadingEventType" minOccurs="0"/&gt;
 *         &lt;element name="MainCarriageLogisticsTransportMovement" type="{iata:datamodel:3}LogisticsTransportMovementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverhangIndentTransportEquipment" type="{iata:datamodel:3}OverhangIndentTransportEquipmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectingTransportEquipment" type="{iata:datamodel:3}ConnectingTransportEquipmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContainedMasterConsignment" type="{iata:datamodel:3}MasterConsignmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "sequenceNumeric",
    "mainIndicator",
    "characteristicCode",
    "id",
    "operatingParty",
    "pieceQuantity",
    "loadedPackageQuantity",
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "availableVolumeMeasure",
    "information",
    "loadIncludedIndicator",
    "contourCode",
    "loadingPositionCode",
    "loadingRemark",
    "loadingEvent",
    "unloadingEvent",
    "mainCarriageLogisticsTransportMovement",
    "overhangIndentTransportEquipment",
    "connectingTransportEquipment",
    "containedMasterConsignment"
})
public class UnitLoadTransportEquipmentType {

    @XmlElement(name = "SequenceNumeric", required = true)
    protected BigDecimal sequenceNumeric;
    @XmlElement(name = "MainIndicator")
    protected boolean mainIndicator;
    @XmlElement(name = "CharacteristicCode", required = true)
    protected CodeType characteristicCode;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "OperatingParty", required = true)
    protected OperatingPartyType operatingParty;
    @XmlElement(name = "PieceQuantity")
    protected QuantityType pieceQuantity;
    @XmlElement(name = "LoadedPackageQuantity")
    protected QuantityType loadedPackageQuantity;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "AvailableVolumeMeasure")
    protected MeasureType availableVolumeMeasure;
    @XmlElement(name = "Information")
    protected TextType information;
    @XmlElement(name = "LoadIncludedIndicator")
    protected boolean loadIncludedIndicator;
    @XmlElement(name = "ContourCode")
    protected CodeType contourCode;
    @XmlElement(name = "LoadingPositionCode")
    protected CodeType loadingPositionCode;
    @XmlElement(name = "LoadingRemark")
    protected TextType loadingRemark;
    @XmlElement(name = "LoadingEvent")
    protected LoadingEventType loadingEvent;
    @XmlElement(name = "UnloadingEvent")
    protected UnloadingEventType unloadingEvent;
    @XmlElement(name = "MainCarriageLogisticsTransportMovement")
    protected List<LogisticsTransportMovementType> mainCarriageLogisticsTransportMovement;
    @XmlElement(name = "OverhangIndentTransportEquipment")
    protected List<OverhangIndentTransportEquipmentType> overhangIndentTransportEquipment;
    @XmlElement(name = "ConnectingTransportEquipment")
    protected List<ConnectingTransportEquipmentType> connectingTransportEquipment;
    @XmlElement(name = "ContainedMasterConsignment")
    protected List<MasterConsignmentType> containedMasterConsignment;

    /**
     * Obtient la valeur de la propriété sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Définit la valeur de la propriété sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequenceNumeric(BigDecimal value) {
        this.sequenceNumeric = value;
    }

    /**
     * Obtient la valeur de la propriété mainIndicator.
     * 
     */
    public boolean isMainIndicator() {
        return mainIndicator;
    }

    /**
     * Définit la valeur de la propriété mainIndicator.
     * 
     */
    public void setMainIndicator(boolean value) {
        this.mainIndicator = value;
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
     * Obtient la valeur de la propriété availableVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAvailableVolumeMeasure() {
        return availableVolumeMeasure;
    }

    /**
     * Définit la valeur de la propriété availableVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAvailableVolumeMeasure(MeasureType value) {
        this.availableVolumeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété information.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInformation() {
        return information;
    }

    /**
     * Définit la valeur de la propriété information.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInformation(TextType value) {
        this.information = value;
    }

    /**
     * Obtient la valeur de la propriété loadIncludedIndicator.
     * 
     */
    public boolean isLoadIncludedIndicator() {
        return loadIncludedIndicator;
    }

    /**
     * Définit la valeur de la propriété loadIncludedIndicator.
     * 
     */
    public void setLoadIncludedIndicator(boolean value) {
        this.loadIncludedIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété contourCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContourCode() {
        return contourCode;
    }

    /**
     * Définit la valeur de la propriété contourCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContourCode(CodeType value) {
        this.contourCode = value;
    }

    /**
     * Obtient la valeur de la propriété loadingPositionCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLoadingPositionCode() {
        return loadingPositionCode;
    }

    /**
     * Définit la valeur de la propriété loadingPositionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLoadingPositionCode(CodeType value) {
        this.loadingPositionCode = value;
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
     * Obtient la valeur de la propriété loadingEvent.
     * 
     * @return
     *     possible object is
     *     {@link LoadingEventType }
     *     
     */
    public LoadingEventType getLoadingEvent() {
        return loadingEvent;
    }

    /**
     * Définit la valeur de la propriété loadingEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingEventType }
     *     
     */
    public void setLoadingEvent(LoadingEventType value) {
        this.loadingEvent = value;
    }

    /**
     * Obtient la valeur de la propriété unloadingEvent.
     * 
     * @return
     *     possible object is
     *     {@link UnloadingEventType }
     *     
     */
    public UnloadingEventType getUnloadingEvent() {
        return unloadingEvent;
    }

    /**
     * Définit la valeur de la propriété unloadingEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link UnloadingEventType }
     *     
     */
    public void setUnloadingEvent(UnloadingEventType value) {
        this.unloadingEvent = value;
    }

    /**
     * Gets the value of the mainCarriageLogisticsTransportMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainCarriageLogisticsTransportMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainCarriageLogisticsTransportMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogisticsTransportMovementType }
     * 
     * 
     */
    public List<LogisticsTransportMovementType> getMainCarriageLogisticsTransportMovement() {
        if (mainCarriageLogisticsTransportMovement == null) {
            mainCarriageLogisticsTransportMovement = new ArrayList<LogisticsTransportMovementType>();
        }
        return this.mainCarriageLogisticsTransportMovement;
    }

    /**
     * Gets the value of the overhangIndentTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overhangIndentTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverhangIndentTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverhangIndentTransportEquipmentType }
     * 
     * 
     */
    public List<OverhangIndentTransportEquipmentType> getOverhangIndentTransportEquipment() {
        if (overhangIndentTransportEquipment == null) {
            overhangIndentTransportEquipment = new ArrayList<OverhangIndentTransportEquipmentType>();
        }
        return this.overhangIndentTransportEquipment;
    }

    /**
     * Gets the value of the connectingTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectingTransportEquipmentType }
     * 
     * 
     */
    public List<ConnectingTransportEquipmentType> getConnectingTransportEquipment() {
        if (connectingTransportEquipment == null) {
            connectingTransportEquipment = new ArrayList<ConnectingTransportEquipmentType>();
        }
        return this.connectingTransportEquipment;
    }

    /**
     * Gets the value of the containedMasterConsignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedMasterConsignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedMasterConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterConsignmentType }
     * 
     * 
     */
    public List<MasterConsignmentType> getContainedMasterConsignment() {
        if (containedMasterConsignment == null) {
            containedMasterConsignment = new ArrayList<MasterConsignmentType>();
        }
        return this.containedMasterConsignment;
    }

}
