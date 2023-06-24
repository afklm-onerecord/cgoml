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

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.AmountType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;


/**
 * <p>Classe Java pour MasterConsignmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MasterConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="FreightForwarderAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedReferenceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="NilCarriageValueIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValueForCarriageAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="NilCustomsValueIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValueForCustomsAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="NilInsuranceValueIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceValueAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalChargePrepaidIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="TotalDisbursementPrepaidIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="IncludedTareGrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DensityGroupCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="ProductID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ConsignorParty" type="{iata:datamodel:3}ConsignorPartyType"/&gt;
 *         &lt;element name="ConsigneeParty" type="{iata:datamodel:3}ConsigneePartyType"/&gt;
 *         &lt;element name="FreightForwarderParty" type="{iata:datamodel:3}FreightForwarderPartyType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedParty" type="{iata:datamodel:3}AssociatedPartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginLocation" type="{iata:datamodel:3}OriginLocationType"/&gt;
 *         &lt;element name="FinalDestinationLocation" type="{iata:datamodel:3}FinalDestinationLocationType"/&gt;
 *         &lt;element name="SpecifiedLogisticsTransportMovement" type="{iata:datamodel:3}LogisticsTransportMovementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UtilizedLogisticsTransportEquipment" type="{iata:datamodel:3}LogisticsTransportEquipmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandlingSPHInstructions" type="{iata:datamodel:3}SPHInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandlingSSRInstructions" type="{iata:datamodel:3}SSRInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandlingOSIInstructions" type="{iata:datamodel:3}OSIInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedAccountingNote" type="{iata:datamodel:3}AccountingNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedCustomsNote" type="{iata:datamodel:3}CustomsNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedReferenceDocument" type="{iata:datamodel:3}ReferenceDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedConsignmentCustomsProcedure" type="{iata:datamodel:3}ConsignmentCustomsProcedureType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableOriginCurrencyExchange" type="{iata:datamodel:3}OriginCurrencyExchangeType"/&gt;
 *         &lt;element name="ApplicableDestinationCurrencyExchange" type="{iata:datamodel:3}DestinationCurrencyExchangeType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableLogisticsServiceCharge" type="{iata:datamodel:3}LogisticsServiceChargeType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableLogisticsAllowanceCharge" type="{iata:datamodel:3}LogisticsAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableRating" type="{iata:datamodel:3}RatingType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ApplicableTotalRating" type="{iata:datamodel:3}TotalRatingType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterConsignmentType", propOrder = {
    "id",
    "additionalID",
    "freightForwarderAssignedID",
    "associatedReferenceID",
    "nilCarriageValueIndicator",
    "declaredValueForCarriageAmount",
    "nilCustomsValueIndicator",
    "declaredValueForCustomsAmount",
    "nilInsuranceValueIndicator",
    "insuranceValueAmount",
    "totalChargePrepaidIndicator",
    "totalDisbursementPrepaidIndicator",
    "includedTareGrossWeightMeasure",
    "grossVolumeMeasure",
    "densityGroupCode",
    "packageQuantity",
    "totalPieceQuantity",
    "productID",
    "consignorParty",
    "consigneeParty",
    "freightForwarderParty",
    "associatedParty",
    "originLocation",
    "finalDestinationLocation",
    "specifiedLogisticsTransportMovement",
    "utilizedLogisticsTransportEquipment",
    "handlingSPHInstructions",
    "handlingSSRInstructions",
    "handlingOSIInstructions",
    "includedAccountingNote",
    "includedCustomsNote",
    "associatedReferenceDocument",
    "associatedConsignmentCustomsProcedure",
    "applicableOriginCurrencyExchange",
    "applicableDestinationCurrencyExchange",
    "applicableLogisticsServiceCharge",
    "applicableLogisticsAllowanceCharge",
    "applicableRating",
    "applicableTotalRating"
})
public class MasterConsignmentType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "AdditionalID")
    protected IDType additionalID;
    @XmlElement(name = "FreightForwarderAssignedID")
    protected IDType freightForwarderAssignedID;
    @XmlElement(name = "AssociatedReferenceID")
    protected IDType associatedReferenceID;
    @XmlElement(name = "NilCarriageValueIndicator")
    protected Boolean nilCarriageValueIndicator;
    @XmlElement(name = "DeclaredValueForCarriageAmount")
    protected AmountType declaredValueForCarriageAmount;
    @XmlElement(name = "NilCustomsValueIndicator")
    protected Boolean nilCustomsValueIndicator;
    @XmlElement(name = "DeclaredValueForCustomsAmount")
    protected AmountType declaredValueForCustomsAmount;
    @XmlElement(name = "NilInsuranceValueIndicator")
    protected Boolean nilInsuranceValueIndicator;
    @XmlElement(name = "InsuranceValueAmount")
    protected AmountType insuranceValueAmount;
    @XmlElement(name = "TotalChargePrepaidIndicator")
    protected boolean totalChargePrepaidIndicator;
    @XmlElement(name = "TotalDisbursementPrepaidIndicator")
    protected boolean totalDisbursementPrepaidIndicator;
    @XmlElement(name = "IncludedTareGrossWeightMeasure", required = true)
    protected MeasureType includedTareGrossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "DensityGroupCode")
    protected CodeType densityGroupCode;
    @XmlElement(name = "PackageQuantity")
    protected QuantityType packageQuantity;
    @XmlElement(name = "TotalPieceQuantity", required = true)
    protected QuantityType totalPieceQuantity;
    @XmlElement(name = "ProductID")
    protected IDType productID;
    @XmlElement(name = "ConsignorParty", required = true)
    protected ConsignorPartyType consignorParty;
    @XmlElement(name = "ConsigneeParty", required = true)
    protected ConsigneePartyType consigneeParty;
    @XmlElement(name = "FreightForwarderParty")
    protected FreightForwarderPartyType freightForwarderParty;
    @XmlElement(name = "AssociatedParty")
    protected List<AssociatedPartyType> associatedParty;
    @XmlElement(name = "OriginLocation", required = true)
    protected OriginLocationType originLocation;
    @XmlElement(name = "FinalDestinationLocation", required = true)
    protected FinalDestinationLocationType finalDestinationLocation;
    @XmlElement(name = "SpecifiedLogisticsTransportMovement")
    protected List<LogisticsTransportMovementType> specifiedLogisticsTransportMovement;
    @XmlElement(name = "UtilizedLogisticsTransportEquipment")
    protected List<LogisticsTransportEquipmentType> utilizedLogisticsTransportEquipment;
    @XmlElement(name = "HandlingSPHInstructions")
    protected List<SPHInstructionsType> handlingSPHInstructions;
    @XmlElement(name = "HandlingSSRInstructions")
    protected List<SSRInstructionsType> handlingSSRInstructions;
    @XmlElement(name = "HandlingOSIInstructions")
    protected List<OSIInstructionsType> handlingOSIInstructions;
    @XmlElement(name = "IncludedAccountingNote")
    protected List<AccountingNoteType> includedAccountingNote;
    @XmlElement(name = "IncludedCustomsNote")
    protected List<CustomsNoteType> includedCustomsNote;
    @XmlElement(name = "AssociatedReferenceDocument")
    protected List<ReferenceDocumentType> associatedReferenceDocument;
    @XmlElement(name = "AssociatedConsignmentCustomsProcedure")
    protected ConsignmentCustomsProcedureType associatedConsignmentCustomsProcedure;
    @XmlElement(name = "ApplicableOriginCurrencyExchange", required = true)
    protected OriginCurrencyExchangeType applicableOriginCurrencyExchange;
    @XmlElement(name = "ApplicableDestinationCurrencyExchange")
    protected DestinationCurrencyExchangeType applicableDestinationCurrencyExchange;
    @XmlElement(name = "ApplicableLogisticsServiceCharge")
    protected LogisticsServiceChargeType applicableLogisticsServiceCharge;
    @XmlElement(name = "ApplicableLogisticsAllowanceCharge")
    protected List<LogisticsAllowanceChargeType> applicableLogisticsAllowanceCharge;
    @XmlElement(name = "ApplicableRating", required = true)
    protected List<RatingType> applicableRating;
    @XmlElement(name = "ApplicableTotalRating", required = true)
    protected List<TotalRatingType> applicableTotalRating;

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
     * Obtient la valeur de la propriété freightForwarderAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getFreightForwarderAssignedID() {
        return freightForwarderAssignedID;
    }

    /**
     * Définit la valeur de la propriété freightForwarderAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setFreightForwarderAssignedID(IDType value) {
        this.freightForwarderAssignedID = value;
    }

    /**
     * Obtient la valeur de la propriété associatedReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAssociatedReferenceID() {
        return associatedReferenceID;
    }

    /**
     * Définit la valeur de la propriété associatedReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAssociatedReferenceID(IDType value) {
        this.associatedReferenceID = value;
    }

    /**
     * Obtient la valeur de la propriété nilCarriageValueIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNilCarriageValueIndicator() {
        return nilCarriageValueIndicator;
    }

    /**
     * Définit la valeur de la propriété nilCarriageValueIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNilCarriageValueIndicator(Boolean value) {
        this.nilCarriageValueIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété declaredValueForCarriageAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeclaredValueForCarriageAmount() {
        return declaredValueForCarriageAmount;
    }

    /**
     * Définit la valeur de la propriété declaredValueForCarriageAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeclaredValueForCarriageAmount(AmountType value) {
        this.declaredValueForCarriageAmount = value;
    }

    /**
     * Obtient la valeur de la propriété nilCustomsValueIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNilCustomsValueIndicator() {
        return nilCustomsValueIndicator;
    }

    /**
     * Définit la valeur de la propriété nilCustomsValueIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNilCustomsValueIndicator(Boolean value) {
        this.nilCustomsValueIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété declaredValueForCustomsAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeclaredValueForCustomsAmount() {
        return declaredValueForCustomsAmount;
    }

    /**
     * Définit la valeur de la propriété declaredValueForCustomsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeclaredValueForCustomsAmount(AmountType value) {
        this.declaredValueForCustomsAmount = value;
    }

    /**
     * Obtient la valeur de la propriété nilInsuranceValueIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNilInsuranceValueIndicator() {
        return nilInsuranceValueIndicator;
    }

    /**
     * Définit la valeur de la propriété nilInsuranceValueIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNilInsuranceValueIndicator(Boolean value) {
        this.nilInsuranceValueIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété insuranceValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Définit la valeur de la propriété insuranceValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceValueAmount(AmountType value) {
        this.insuranceValueAmount = value;
    }

    /**
     * Obtient la valeur de la propriété totalChargePrepaidIndicator.
     * 
     */
    public boolean isTotalChargePrepaidIndicator() {
        return totalChargePrepaidIndicator;
    }

    /**
     * Définit la valeur de la propriété totalChargePrepaidIndicator.
     * 
     */
    public void setTotalChargePrepaidIndicator(boolean value) {
        this.totalChargePrepaidIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété totalDisbursementPrepaidIndicator.
     * 
     */
    public boolean isTotalDisbursementPrepaidIndicator() {
        return totalDisbursementPrepaidIndicator;
    }

    /**
     * Définit la valeur de la propriété totalDisbursementPrepaidIndicator.
     * 
     */
    public void setTotalDisbursementPrepaidIndicator(boolean value) {
        this.totalDisbursementPrepaidIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété includedTareGrossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getIncludedTareGrossWeightMeasure() {
        return includedTareGrossWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété includedTareGrossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setIncludedTareGrossWeightMeasure(MeasureType value) {
        this.includedTareGrossWeightMeasure = value;
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
     * Obtient la valeur de la propriété densityGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDensityGroupCode() {
        return densityGroupCode;
    }

    /**
     * Définit la valeur de la propriété densityGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDensityGroupCode(CodeType value) {
        this.densityGroupCode = value;
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
     * Obtient la valeur de la propriété totalPieceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTotalPieceQuantity() {
        return totalPieceQuantity;
    }

    /**
     * Définit la valeur de la propriété totalPieceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTotalPieceQuantity(QuantityType value) {
        this.totalPieceQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété productID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getProductID() {
        return productID;
    }

    /**
     * Définit la valeur de la propriété productID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setProductID(IDType value) {
        this.productID = value;
    }

    /**
     * Obtient la valeur de la propriété consignorParty.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorPartyType }
     *     
     */
    public ConsignorPartyType getConsignorParty() {
        return consignorParty;
    }

    /**
     * Définit la valeur de la propriété consignorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorPartyType }
     *     
     */
    public void setConsignorParty(ConsignorPartyType value) {
        this.consignorParty = value;
    }

    /**
     * Obtient la valeur de la propriété consigneeParty.
     * 
     * @return
     *     possible object is
     *     {@link ConsigneePartyType }
     *     
     */
    public ConsigneePartyType getConsigneeParty() {
        return consigneeParty;
    }

    /**
     * Définit la valeur de la propriété consigneeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneePartyType }
     *     
     */
    public void setConsigneeParty(ConsigneePartyType value) {
        this.consigneeParty = value;
    }

    /**
     * Obtient la valeur de la propriété freightForwarderParty.
     * 
     * @return
     *     possible object is
     *     {@link FreightForwarderPartyType }
     *     
     */
    public FreightForwarderPartyType getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Définit la valeur de la propriété freightForwarderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightForwarderPartyType }
     *     
     */
    public void setFreightForwarderParty(FreightForwarderPartyType value) {
        this.freightForwarderParty = value;
    }

    /**
     * Gets the value of the associatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPartyType }
     * 
     * 
     */
    public List<AssociatedPartyType> getAssociatedParty() {
        if (associatedParty == null) {
            associatedParty = new ArrayList<AssociatedPartyType>();
        }
        return this.associatedParty;
    }

    /**
     * Obtient la valeur de la propriété originLocation.
     * 
     * @return
     *     possible object is
     *     {@link OriginLocationType }
     *     
     */
    public OriginLocationType getOriginLocation() {
        return originLocation;
    }

    /**
     * Définit la valeur de la propriété originLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginLocationType }
     *     
     */
    public void setOriginLocation(OriginLocationType value) {
        this.originLocation = value;
    }

    /**
     * Obtient la valeur de la propriété finalDestinationLocation.
     * 
     * @return
     *     possible object is
     *     {@link FinalDestinationLocationType }
     *     
     */
    public FinalDestinationLocationType getFinalDestinationLocation() {
        return finalDestinationLocation;
    }

    /**
     * Définit la valeur de la propriété finalDestinationLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalDestinationLocationType }
     *     
     */
    public void setFinalDestinationLocation(FinalDestinationLocationType value) {
        this.finalDestinationLocation = value;
    }

    /**
     * Gets the value of the specifiedLogisticsTransportMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedLogisticsTransportMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedLogisticsTransportMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogisticsTransportMovementType }
     * 
     * 
     */
    public List<LogisticsTransportMovementType> getSpecifiedLogisticsTransportMovement() {
        if (specifiedLogisticsTransportMovement == null) {
            specifiedLogisticsTransportMovement = new ArrayList<LogisticsTransportMovementType>();
        }
        return this.specifiedLogisticsTransportMovement;
    }

    /**
     * Gets the value of the utilizedLogisticsTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilizedLogisticsTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilizedLogisticsTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogisticsTransportEquipmentType }
     * 
     * 
     */
    public List<LogisticsTransportEquipmentType> getUtilizedLogisticsTransportEquipment() {
        if (utilizedLogisticsTransportEquipment == null) {
            utilizedLogisticsTransportEquipment = new ArrayList<LogisticsTransportEquipmentType>();
        }
        return this.utilizedLogisticsTransportEquipment;
    }

    /**
     * Gets the value of the handlingSPHInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingSPHInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingSPHInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPHInstructionsType }
     * 
     * 
     */
    public List<SPHInstructionsType> getHandlingSPHInstructions() {
        if (handlingSPHInstructions == null) {
            handlingSPHInstructions = new ArrayList<SPHInstructionsType>();
        }
        return this.handlingSPHInstructions;
    }

    /**
     * Gets the value of the handlingSSRInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingSSRInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingSSRInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRInstructionsType }
     * 
     * 
     */
    public List<SSRInstructionsType> getHandlingSSRInstructions() {
        if (handlingSSRInstructions == null) {
            handlingSSRInstructions = new ArrayList<SSRInstructionsType>();
        }
        return this.handlingSSRInstructions;
    }

    /**
     * Gets the value of the handlingOSIInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingOSIInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingOSIInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSIInstructionsType }
     * 
     * 
     */
    public List<OSIInstructionsType> getHandlingOSIInstructions() {
        if (handlingOSIInstructions == null) {
            handlingOSIInstructions = new ArrayList<OSIInstructionsType>();
        }
        return this.handlingOSIInstructions;
    }

    /**
     * Gets the value of the includedAccountingNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAccountingNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAccountingNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingNoteType }
     * 
     * 
     */
    public List<AccountingNoteType> getIncludedAccountingNote() {
        if (includedAccountingNote == null) {
            includedAccountingNote = new ArrayList<AccountingNoteType>();
        }
        return this.includedAccountingNote;
    }

    /**
     * Gets the value of the includedCustomsNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedCustomsNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedCustomsNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsNoteType }
     * 
     * 
     */
    public List<CustomsNoteType> getIncludedCustomsNote() {
        if (includedCustomsNote == null) {
            includedCustomsNote = new ArrayList<CustomsNoteType>();
        }
        return this.includedCustomsNote;
    }

    /**
     * Gets the value of the associatedReferenceDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedReferenceDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedReferenceDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceDocumentType }
     * 
     * 
     */
    public List<ReferenceDocumentType> getAssociatedReferenceDocument() {
        if (associatedReferenceDocument == null) {
            associatedReferenceDocument = new ArrayList<ReferenceDocumentType>();
        }
        return this.associatedReferenceDocument;
    }

    /**
     * Obtient la valeur de la propriété associatedConsignmentCustomsProcedure.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentCustomsProcedureType }
     *     
     */
    public ConsignmentCustomsProcedureType getAssociatedConsignmentCustomsProcedure() {
        return associatedConsignmentCustomsProcedure;
    }

    /**
     * Définit la valeur de la propriété associatedConsignmentCustomsProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentCustomsProcedureType }
     *     
     */
    public void setAssociatedConsignmentCustomsProcedure(ConsignmentCustomsProcedureType value) {
        this.associatedConsignmentCustomsProcedure = value;
    }

    /**
     * Obtient la valeur de la propriété applicableOriginCurrencyExchange.
     * 
     * @return
     *     possible object is
     *     {@link OriginCurrencyExchangeType }
     *     
     */
    public OriginCurrencyExchangeType getApplicableOriginCurrencyExchange() {
        return applicableOriginCurrencyExchange;
    }

    /**
     * Définit la valeur de la propriété applicableOriginCurrencyExchange.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginCurrencyExchangeType }
     *     
     */
    public void setApplicableOriginCurrencyExchange(OriginCurrencyExchangeType value) {
        this.applicableOriginCurrencyExchange = value;
    }

    /**
     * Obtient la valeur de la propriété applicableDestinationCurrencyExchange.
     * 
     * @return
     *     possible object is
     *     {@link DestinationCurrencyExchangeType }
     *     
     */
    public DestinationCurrencyExchangeType getApplicableDestinationCurrencyExchange() {
        return applicableDestinationCurrencyExchange;
    }

    /**
     * Définit la valeur de la propriété applicableDestinationCurrencyExchange.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationCurrencyExchangeType }
     *     
     */
    public void setApplicableDestinationCurrencyExchange(DestinationCurrencyExchangeType value) {
        this.applicableDestinationCurrencyExchange = value;
    }

    /**
     * Obtient la valeur de la propriété applicableLogisticsServiceCharge.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsServiceChargeType }
     *     
     */
    public LogisticsServiceChargeType getApplicableLogisticsServiceCharge() {
        return applicableLogisticsServiceCharge;
    }

    /**
     * Définit la valeur de la propriété applicableLogisticsServiceCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsServiceChargeType }
     *     
     */
    public void setApplicableLogisticsServiceCharge(LogisticsServiceChargeType value) {
        this.applicableLogisticsServiceCharge = value;
    }

    /**
     * Gets the value of the applicableLogisticsAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableLogisticsAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableLogisticsAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogisticsAllowanceChargeType }
     * 
     * 
     */
    public List<LogisticsAllowanceChargeType> getApplicableLogisticsAllowanceCharge() {
        if (applicableLogisticsAllowanceCharge == null) {
            applicableLogisticsAllowanceCharge = new ArrayList<LogisticsAllowanceChargeType>();
        }
        return this.applicableLogisticsAllowanceCharge;
    }

    /**
     * Gets the value of the applicableRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingType }
     * 
     * 
     */
    public List<RatingType> getApplicableRating() {
        if (applicableRating == null) {
            applicableRating = new ArrayList<RatingType>();
        }
        return this.applicableRating;
    }

    /**
     * Gets the value of the applicableTotalRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTotalRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTotalRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalRatingType }
     * 
     * 
     */
    public List<TotalRatingType> getApplicableTotalRating() {
        if (applicableTotalRating == null) {
            applicableTotalRating = new ArrayList<TotalRatingType>();
        }
        return this.applicableTotalRating;
    }

}
