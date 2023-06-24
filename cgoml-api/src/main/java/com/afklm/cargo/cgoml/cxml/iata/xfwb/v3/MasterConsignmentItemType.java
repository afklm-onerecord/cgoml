//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour MasterConsignmentItemType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MasterConsignmentItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}NumericType"/&gt;
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="PackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="VolumetricFactor" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="NatureIdentificationTransportCargo" type="{iata:datamodel:3}TransportCargoType" minOccurs="0"/&gt;
 *         &lt;element name="OriginCountry" type="{iata:datamodel:3}OriginCountryType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedUnitLoadTransportEquipment" type="{iata:datamodel:3}UnitLoadTransportEquipmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportLogisticsPackage" type="{iata:datamodel:3}LogisticsPackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableFreightRateServiceCharge" type="{iata:datamodel:3}FreightRateServiceChargeType" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedRateCombinationPointLocation" type="{iata:datamodel:3}RateCombinationPointLocationType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableUnitLoadDeviceRateClass" type="{iata:datamodel:3}UnitLoadDeviceRateClassType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterConsignmentItemType", propOrder = {
    "sequenceNumeric",
    "typeCode",
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "packageQuantity",
    "pieceQuantity",
    "volumetricFactor",
    "information",
    "natureIdentificationTransportCargo",
    "originCountry",
    "associatedUnitLoadTransportEquipment",
    "transportLogisticsPackage",
    "applicableFreightRateServiceCharge",
    "specifiedRateCombinationPointLocation",
    "applicableUnitLoadDeviceRateClass"
})
public class MasterConsignmentItemType {

    @XmlElement(name = "SequenceNumeric", required = true)
    protected BigDecimal sequenceNumeric;
    @XmlElement(name = "TypeCode")
    protected List<CodeType> typeCode;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "PackageQuantity")
    protected QuantityType packageQuantity;
    @XmlElement(name = "PieceQuantity")
    protected QuantityType pieceQuantity;
    @XmlElement(name = "VolumetricFactor")
    protected TextType volumetricFactor;
    @XmlElement(name = "Information")
    protected TextType information;
    @XmlElement(name = "NatureIdentificationTransportCargo")
    protected TransportCargoType natureIdentificationTransportCargo;
    @XmlElement(name = "OriginCountry")
    protected OriginCountryType originCountry;
    @XmlElement(name = "AssociatedUnitLoadTransportEquipment")
    protected List<UnitLoadTransportEquipmentType> associatedUnitLoadTransportEquipment;
    @XmlElement(name = "TransportLogisticsPackage")
    protected List<LogisticsPackageType> transportLogisticsPackage;
    @XmlElement(name = "ApplicableFreightRateServiceCharge")
    protected FreightRateServiceChargeType applicableFreightRateServiceCharge;
    @XmlElement(name = "SpecifiedRateCombinationPointLocation")
    protected RateCombinationPointLocationType specifiedRateCombinationPointLocation;
    @XmlElement(name = "ApplicableUnitLoadDeviceRateClass")
    protected UnitLoadDeviceRateClassType applicableUnitLoadDeviceRateClass;

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
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<CodeType>();
        }
        return this.typeCode;
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
     * Obtient la valeur de la propriété packageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Définit la valeur de la propriété packageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPackageQuantity(QuantityType value) {
        this.packageQuantity = value;
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
     * Obtient la valeur de la propriété volumetricFactor.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getVolumetricFactor() {
        return volumetricFactor;
    }

    /**
     * Définit la valeur de la propriété volumetricFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setVolumetricFactor(TextType value) {
        this.volumetricFactor = value;
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
     * Obtient la valeur de la propriété natureIdentificationTransportCargo.
     * 
     * @return
     *     possible object is
     *     {@link TransportCargoType }
     *     
     */
    public TransportCargoType getNatureIdentificationTransportCargo() {
        return natureIdentificationTransportCargo;
    }

    /**
     * Définit la valeur de la propriété natureIdentificationTransportCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportCargoType }
     *     
     */
    public void setNatureIdentificationTransportCargo(TransportCargoType value) {
        this.natureIdentificationTransportCargo = value;
    }

    /**
     * Obtient la valeur de la propriété originCountry.
     * 
     * @return
     *     possible object is
     *     {@link OriginCountryType }
     *     
     */
    public OriginCountryType getOriginCountry() {
        return originCountry;
    }

    /**
     * Définit la valeur de la propriété originCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginCountryType }
     *     
     */
    public void setOriginCountry(OriginCountryType value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the associatedUnitLoadTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedUnitLoadTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedUnitLoadTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitLoadTransportEquipmentType }
     * 
     * 
     */
    public List<UnitLoadTransportEquipmentType> getAssociatedUnitLoadTransportEquipment() {
        if (associatedUnitLoadTransportEquipment == null) {
            associatedUnitLoadTransportEquipment = new ArrayList<UnitLoadTransportEquipmentType>();
        }
        return this.associatedUnitLoadTransportEquipment;
    }

    /**
     * Gets the value of the transportLogisticsPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportLogisticsPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportLogisticsPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogisticsPackageType }
     * 
     * 
     */
    public List<LogisticsPackageType> getTransportLogisticsPackage() {
        if (transportLogisticsPackage == null) {
            transportLogisticsPackage = new ArrayList<LogisticsPackageType>();
        }
        return this.transportLogisticsPackage;
    }

    /**
     * Obtient la valeur de la propriété applicableFreightRateServiceCharge.
     * 
     * @return
     *     possible object is
     *     {@link FreightRateServiceChargeType }
     *     
     */
    public FreightRateServiceChargeType getApplicableFreightRateServiceCharge() {
        return applicableFreightRateServiceCharge;
    }

    /**
     * Définit la valeur de la propriété applicableFreightRateServiceCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightRateServiceChargeType }
     *     
     */
    public void setApplicableFreightRateServiceCharge(FreightRateServiceChargeType value) {
        this.applicableFreightRateServiceCharge = value;
    }

    /**
     * Obtient la valeur de la propriété specifiedRateCombinationPointLocation.
     * 
     * @return
     *     possible object is
     *     {@link RateCombinationPointLocationType }
     *     
     */
    public RateCombinationPointLocationType getSpecifiedRateCombinationPointLocation() {
        return specifiedRateCombinationPointLocation;
    }

    /**
     * Définit la valeur de la propriété specifiedRateCombinationPointLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCombinationPointLocationType }
     *     
     */
    public void setSpecifiedRateCombinationPointLocation(RateCombinationPointLocationType value) {
        this.specifiedRateCombinationPointLocation = value;
    }

    /**
     * Obtient la valeur de la propriété applicableUnitLoadDeviceRateClass.
     * 
     * @return
     *     possible object is
     *     {@link UnitLoadDeviceRateClassType }
     *     
     */
    public UnitLoadDeviceRateClassType getApplicableUnitLoadDeviceRateClass() {
        return applicableUnitLoadDeviceRateClass;
    }

    /**
     * Définit la valeur de la propriété applicableUnitLoadDeviceRateClass.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitLoadDeviceRateClassType }
     *     
     */
    public void setApplicableUnitLoadDeviceRateClass(UnitLoadDeviceRateClassType value) {
        this.applicableUnitLoadDeviceRateClass = value;
    }

}
