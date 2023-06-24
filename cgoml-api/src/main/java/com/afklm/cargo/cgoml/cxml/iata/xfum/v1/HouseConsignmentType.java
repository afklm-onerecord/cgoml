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
 * <p>Classe Java pour HouseConsignmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HouseConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludedTareGrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DensityID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="DensityGroupCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="TotalPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="SummaryDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="TransportEquipmentSplitGoodsIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="ManifestedGrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="ManifestedPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="TransportContractDocument" type="{iata:datamodel:3}TransportContractDocumentType"/&gt;
 *         &lt;element name="OriginLocation" type="{iata:datamodel:3}OriginLocationType"/&gt;
 *         &lt;element name="FinalDestinationLocation" type="{iata:datamodel:3}FinalDestinationLocationType"/&gt;
 *         &lt;element name="IncludedCustomsNote" type="{iata:datamodel:3}CustomsNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedHouseConsignmentItem" type="{iata:datamodel:3}HouseConsignmentItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportHouseConsignmentPackage" type="{iata:datamodel:3}HouseConsignmentPackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseConsignmentType", propOrder = {
    "includedTareGrossWeightMeasure",
    "grossVolumeMeasure",
    "densityID",
    "densityGroupCode",
    "packageQuantity",
    "pieceQuantity",
    "totalPieceQuantity",
    "summaryDescription",
    "transportEquipmentSplitGoodsIndicator",
    "manifestedGrossWeightMeasure",
    "manifestedPieceQuantity",
    "transportContractDocument",
    "originLocation",
    "finalDestinationLocation",
    "includedCustomsNote",
    "includedHouseConsignmentItem",
    "transportHouseConsignmentPackage"
})
public class HouseConsignmentType {

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
    @XmlElement(name = "TotalPieceQuantity", required = true)
    protected QuantityType totalPieceQuantity;
    @XmlElement(name = "SummaryDescription", required = true)
    protected TextType summaryDescription;
    @XmlElement(name = "TransportEquipmentSplitGoodsIndicator")
    protected boolean transportEquipmentSplitGoodsIndicator;
    @XmlElement(name = "ManifestedGrossWeightMeasure", required = true)
    protected MeasureType manifestedGrossWeightMeasure;
    @XmlElement(name = "ManifestedPieceQuantity", required = true)
    protected QuantityType manifestedPieceQuantity;
    @XmlElement(name = "TransportContractDocument", required = true)
    protected TransportContractDocumentType transportContractDocument;
    @XmlElement(name = "OriginLocation", required = true)
    protected OriginLocationType originLocation;
    @XmlElement(name = "FinalDestinationLocation", required = true)
    protected FinalDestinationLocationType finalDestinationLocation;
    @XmlElement(name = "IncludedCustomsNote")
    protected List<CustomsNoteType> includedCustomsNote;
    @XmlElement(name = "IncludedHouseConsignmentItem")
    protected List<HouseConsignmentItemType> includedHouseConsignmentItem;
    @XmlElement(name = "TransportHouseConsignmentPackage")
    protected List<HouseConsignmentPackageType> transportHouseConsignmentPackage;

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
     * Obtient la valeur de la propriété manifestedGrossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getManifestedGrossWeightMeasure() {
        return manifestedGrossWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété manifestedGrossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setManifestedGrossWeightMeasure(MeasureType value) {
        this.manifestedGrossWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété manifestedPieceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getManifestedPieceQuantity() {
        return manifestedPieceQuantity;
    }

    /**
     * Définit la valeur de la propriété manifestedPieceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setManifestedPieceQuantity(QuantityType value) {
        this.manifestedPieceQuantity = value;
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
     * Gets the value of the includedHouseConsignmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedHouseConsignmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedHouseConsignmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseConsignmentItemType }
     * 
     * 
     */
    public List<HouseConsignmentItemType> getIncludedHouseConsignmentItem() {
        if (includedHouseConsignmentItem == null) {
            includedHouseConsignmentItem = new ArrayList<HouseConsignmentItemType>();
        }
        return this.includedHouseConsignmentItem;
    }

    /**
     * Gets the value of the transportHouseConsignmentPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportHouseConsignmentPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportHouseConsignmentPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseConsignmentPackageType }
     * 
     * 
     */
    public List<HouseConsignmentPackageType> getTransportHouseConsignmentPackage() {
        if (transportHouseConsignmentPackage == null) {
            transportHouseConsignmentPackage = new ArrayList<HouseConsignmentPackageType>();
        }
        return this.transportHouseConsignmentPackage;
    }

}
