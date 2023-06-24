//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:27 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfbl.v2;

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
 * <p>Classe Java pour MasterConsignmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MasterConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DensityGroupCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="SummaryDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="TransportSplitDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="MovementPriorityCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="TransportContractDocument" type="{iata:datamodel:3}TransportContractDocumentType"/&gt;
 *         &lt;element name="OriginLocation" type="{iata:datamodel:3}OriginLocationType"/&gt;
 *         &lt;element name="FinalDestinationLocation" type="{iata:datamodel:3}FinalDestinationLocationType"/&gt;
 *         &lt;element name="HandlingInstructions" type="{iata:datamodel:3}HandlingInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedCustomsNote" type="{iata:datamodel:3}CustomsNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedConsignmentCustomsProcedure" type="{iata:datamodel:3}ConsignmentCustomsProcedureType" minOccurs="0"/&gt;
 *         &lt;element name="TransportLogisticsPackage" type="{iata:datamodel:3}LogisticsPackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreCarriageTransportMovement" type="{iata:datamodel:3}PreCarriageTransportMovementType" minOccurs="0"/&gt;
 *         &lt;element name="UtilizedUnitLoadTransportEquipment" type="{iata:datamodel:3}UnitLoadTransportEquipmentType" minOccurs="0"/&gt;
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
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "densityGroupCode",
    "totalPieceQuantity",
    "summaryDescription",
    "transportSplitDescription",
    "movementPriorityCode",
    "transportContractDocument",
    "originLocation",
    "finalDestinationLocation",
    "handlingInstructions",
    "includedCustomsNote",
    "associatedConsignmentCustomsProcedure",
    "transportLogisticsPackage",
    "preCarriageTransportMovement",
    "utilizedUnitLoadTransportEquipment"
})
public class MasterConsignmentType {

    @XmlElement(name = "GrossWeightMeasure", required = true)
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "DensityGroupCode")
    protected CodeType densityGroupCode;
    @XmlElement(name = "TotalPieceQuantity", required = true)
    protected QuantityType totalPieceQuantity;
    @XmlElement(name = "SummaryDescription", required = true)
    protected TextType summaryDescription;
    @XmlElement(name = "TransportSplitDescription", required = true)
    protected TextType transportSplitDescription;
    @XmlElement(name = "MovementPriorityCode")
    protected CodeType movementPriorityCode;
    @XmlElement(name = "TransportContractDocument", required = true)
    protected TransportContractDocumentType transportContractDocument;
    @XmlElement(name = "OriginLocation", required = true)
    protected OriginLocationType originLocation;
    @XmlElement(name = "FinalDestinationLocation", required = true)
    protected FinalDestinationLocationType finalDestinationLocation;
    @XmlElement(name = "HandlingInstructions")
    protected List<HandlingInstructionsType> handlingInstructions;
    @XmlElement(name = "IncludedCustomsNote")
    protected List<CustomsNoteType> includedCustomsNote;
    @XmlElement(name = "AssociatedConsignmentCustomsProcedure")
    protected ConsignmentCustomsProcedureType associatedConsignmentCustomsProcedure;
    @XmlElement(name = "TransportLogisticsPackage")
    protected List<LogisticsPackageType> transportLogisticsPackage;
    @XmlElement(name = "PreCarriageTransportMovement")
    protected PreCarriageTransportMovementType preCarriageTransportMovement;
    @XmlElement(name = "UtilizedUnitLoadTransportEquipment")
    protected UnitLoadTransportEquipmentType utilizedUnitLoadTransportEquipment;

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
     * Obtient la valeur de la propriété transportSplitDescription.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getTransportSplitDescription() {
        return transportSplitDescription;
    }

    /**
     * Définit la valeur de la propriété transportSplitDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setTransportSplitDescription(TextType value) {
        this.transportSplitDescription = value;
    }

    /**
     * Obtient la valeur de la propriété movementPriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMovementPriorityCode() {
        return movementPriorityCode;
    }

    /**
     * Définit la valeur de la propriété movementPriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMovementPriorityCode(CodeType value) {
        this.movementPriorityCode = value;
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
     * Gets the value of the handlingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingInstructionsType }
     * 
     * 
     */
    public List<HandlingInstructionsType> getHandlingInstructions() {
        if (handlingInstructions == null) {
            handlingInstructions = new ArrayList<HandlingInstructionsType>();
        }
        return this.handlingInstructions;
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
     * Obtient la valeur de la propriété preCarriageTransportMovement.
     * 
     * @return
     *     possible object is
     *     {@link PreCarriageTransportMovementType }
     *     
     */
    public PreCarriageTransportMovementType getPreCarriageTransportMovement() {
        return preCarriageTransportMovement;
    }

    /**
     * Définit la valeur de la propriété preCarriageTransportMovement.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCarriageTransportMovementType }
     *     
     */
    public void setPreCarriageTransportMovement(PreCarriageTransportMovementType value) {
        this.preCarriageTransportMovement = value;
    }

    /**
     * Obtient la valeur de la propriété utilizedUnitLoadTransportEquipment.
     * 
     * @return
     *     possible object is
     *     {@link UnitLoadTransportEquipmentType }
     *     
     */
    public UnitLoadTransportEquipmentType getUtilizedUnitLoadTransportEquipment() {
        return utilizedUnitLoadTransportEquipment;
    }

    /**
     * Définit la valeur de la propriété utilizedUnitLoadTransportEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitLoadTransportEquipmentType }
     *     
     */
    public void setUtilizedUnitLoadTransportEquipment(UnitLoadTransportEquipmentType value) {
        this.utilizedUnitLoadTransportEquipment = value;
    }

}
