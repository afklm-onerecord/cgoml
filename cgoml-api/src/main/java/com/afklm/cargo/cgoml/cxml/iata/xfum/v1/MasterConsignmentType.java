//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:20 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfum.v1;

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
 * <p>Classe Java pour MasterConsignmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MasterConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludedTareGrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DensityID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="DensityGroupCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="TotalPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="SummaryDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="TransportEquipmentSplitGoodsIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="LoadingPriorityCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="TransportContractDocument" type="{iata:datamodel:3}TransportContractDocumentType"/&gt;
 *         &lt;element name="OriginLocation" type="{iata:datamodel:3}OriginLocationType"/&gt;
 *         &lt;element name="FinalDestinationLocation" type="{iata:datamodel:3}FinalDestinationLocationType"/&gt;
 *         &lt;element name="SpecifiedLogisticsTransportMovement" type="{iata:datamodel:3}LogisticsTransportMovementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandlingSPHInstructions" type="{iata:datamodel:3}SPHInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandlingSSRInstructions" type="{iata:datamodel:3}SSRInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandlingOSIInstructions" type="{iata:datamodel:3}OSIInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedCustomsNote" type="{iata:datamodel:3}CustomsNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedConsignmentCustomsProcedure" type="{iata:datamodel:3}ConsignmentCustomsProcedureType" minOccurs="0"/&gt;
 *         &lt;element name="IncludedMasterConsignmentItem" type="{iata:datamodel:3}MasterConsignmentItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportMasterConsignmentPackage" type="{iata:datamodel:3}MasterConsignmentPackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedHouseConsignment" type="{iata:datamodel:3}HouseConsignmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "includedTareGrossWeightMeasure",
    "grossVolumeMeasure",
    "densityID",
    "densityGroupCode",
    "packageQuantity",
    "pieceQuantity",
    "totalPieceQuantity",
    "summaryDescription",
    "transportEquipmentSplitGoodsIndicator",
    "loadingPriorityCode",
    "transportContractDocument",
    "originLocation",
    "finalDestinationLocation",
    "specifiedLogisticsTransportMovement",
    "handlingSPHInstructions",
    "handlingSSRInstructions",
    "handlingOSIInstructions",
    "includedCustomsNote",
    "associatedConsignmentCustomsProcedure",
    "includedMasterConsignmentItem",
    "transportMasterConsignmentPackage",
    "includedHouseConsignment"
})
public class MasterConsignmentType {

    @XmlElement(name = "IncludedTareGrossWeightMeasure", required = true)
    protected MeasureType includedTareGrossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "DensityID")
    protected IDType densityID;
    @XmlElement(name = "DensityGroupCode")
    protected CodeType densityGroupCode;
    @XmlElement(name = "PackageQuantity")
    protected QuantityType packageQuantity;
    @XmlElement(name = "PieceQuantity", required = true)
    protected QuantityType pieceQuantity;
    @XmlElement(name = "TotalPieceQuantity")
    protected QuantityType totalPieceQuantity;
    @XmlElement(name = "SummaryDescription", required = true)
    protected TextType summaryDescription;
    @XmlElement(name = "TransportEquipmentSplitGoodsIndicator")
    protected boolean transportEquipmentSplitGoodsIndicator;
    @XmlElement(name = "LoadingPriorityCode")
    protected CodeType loadingPriorityCode;
    @XmlElement(name = "TransportContractDocument", required = true)
    protected TransportContractDocumentType transportContractDocument;
    @XmlElement(name = "OriginLocation", required = true)
    protected OriginLocationType originLocation;
    @XmlElement(name = "FinalDestinationLocation", required = true)
    protected FinalDestinationLocationType finalDestinationLocation;
    @XmlElement(name = "SpecifiedLogisticsTransportMovement")
    protected List<LogisticsTransportMovementType> specifiedLogisticsTransportMovement;
    @XmlElement(name = "HandlingSPHInstructions")
    protected List<SPHInstructionsType> handlingSPHInstructions;
    @XmlElement(name = "HandlingSSRInstructions")
    protected List<SSRInstructionsType> handlingSSRInstructions;
    @XmlElement(name = "HandlingOSIInstructions")
    protected List<OSIInstructionsType> handlingOSIInstructions;
    @XmlElement(name = "IncludedCustomsNote")
    protected List<CustomsNoteType> includedCustomsNote;
    @XmlElement(name = "AssociatedConsignmentCustomsProcedure")
    protected ConsignmentCustomsProcedureType associatedConsignmentCustomsProcedure;
    @XmlElement(name = "IncludedMasterConsignmentItem")
    protected List<MasterConsignmentItemType> includedMasterConsignmentItem;
    @XmlElement(name = "TransportMasterConsignmentPackage")
    protected List<MasterConsignmentPackageType> transportMasterConsignmentPackage;
    @XmlElement(name = "IncludedHouseConsignment")
    protected List<HouseConsignmentType> includedHouseConsignment;

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
     * Obtient la valeur de la propriété densityID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDensityID() {
        return densityID;
    }

    /**
     * Définit la valeur de la propriété densityID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDensityID(IDType value) {
        this.densityID = value;
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
     * Obtient la valeur de la propriété summaryDescription.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSummaryDescription() {
        return summaryDescription;
    }

    /**
     * Définit la valeur de la propriété summaryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSummaryDescription(TextType value) {
        this.summaryDescription = value;
    }

    /**
     * Obtient la valeur de la propriété transportEquipmentSplitGoodsIndicator.
     * 
     */
    public boolean isTransportEquipmentSplitGoodsIndicator() {
        return transportEquipmentSplitGoodsIndicator;
    }

    /**
     * Définit la valeur de la propriété transportEquipmentSplitGoodsIndicator.
     * 
     */
    public void setTransportEquipmentSplitGoodsIndicator(boolean value) {
        this.transportEquipmentSplitGoodsIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété loadingPriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLoadingPriorityCode() {
        return loadingPriorityCode;
    }

    /**
     * Définit la valeur de la propriété loadingPriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLoadingPriorityCode(CodeType value) {
        this.loadingPriorityCode = value;
    }

    /**
     * Obtient la valeur de la propriété transportContractDocument.
     * 
     * @return
     *     possible object is
     *     {@link TransportContractDocumentType }
     *     
     */
    public TransportContractDocumentType getTransportContractDocument() {
        return transportContractDocument;
    }

    /**
     * Définit la valeur de la propriété transportContractDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportContractDocumentType }
     *     
     */
    public void setTransportContractDocument(TransportContractDocumentType value) {
        this.transportContractDocument = value;
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
     * Gets the value of the includedMasterConsignmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedMasterConsignmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedMasterConsignmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterConsignmentItemType }
     * 
     * 
     */
    public List<MasterConsignmentItemType> getIncludedMasterConsignmentItem() {
        if (includedMasterConsignmentItem == null) {
            includedMasterConsignmentItem = new ArrayList<MasterConsignmentItemType>();
        }
        return this.includedMasterConsignmentItem;
    }

    /**
     * Gets the value of the transportMasterConsignmentPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportMasterConsignmentPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMasterConsignmentPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterConsignmentPackageType }
     * 
     * 
     */
    public List<MasterConsignmentPackageType> getTransportMasterConsignmentPackage() {
        if (transportMasterConsignmentPackage == null) {
            transportMasterConsignmentPackage = new ArrayList<MasterConsignmentPackageType>();
        }
        return this.transportMasterConsignmentPackage;
    }

    /**
     * Gets the value of the includedHouseConsignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedHouseConsignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedHouseConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseConsignmentType }
     * 
     * 
     */
    public List<HouseConsignmentType> getIncludedHouseConsignment() {
        if (includedHouseConsignment == null) {
            includedHouseConsignment = new ArrayList<HouseConsignmentType>();
        }
        return this.includedHouseConsignment;
    }

}
