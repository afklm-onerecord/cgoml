//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:55 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfsu.v3;

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
 * <p>Classe Java pour StatusConsignmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StatusConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DensityGroupCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="TransportSplitDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="DiscrepancyDescriptionCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedManifestDocument" type="{iata:datamodel:3}ManifestDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableLogisticsServiceCharge" type="{iata:datamodel:3}LogisticsServiceChargeType" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedLogisticsTransportMovement" type="{iata:datamodel:3}LogisticsTransportMovementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NotifiedParty" type="{iata:datamodel:3}NotifiedPartyType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryParty" type="{iata:datamodel:3}DeliveryPartyType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedReceivedFromParty" type="{iata:datamodel:3}ReceivedFromPartyType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedTransferredFromParty" type="{iata:datamodel:3}TransferredFromPartyType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingOSIInstructions" type="{iata:datamodel:3}OSIInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedCustomsNote" type="{iata:datamodel:3}CustomsNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedConsignmentCustomsProcedure" type="{iata:datamodel:3}ConsignmentCustomsProcedureType" minOccurs="0"/&gt;
 *         &lt;element name="UtilizedUnitLoadTransportEquipment" type="{iata:datamodel:3}UnitLoadTransportEquipmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "StatusConsignmentType", propOrder = {
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "densityGroupCode",
    "pieceQuantity",
    "transportSplitDescription",
    "discrepancyDescriptionCode",
    "associatedManifestDocument",
    "applicableLogisticsServiceCharge",
    "specifiedLogisticsTransportMovement",
    "notifiedParty",
    "deliveryParty",
    "associatedReceivedFromParty",
    "associatedTransferredFromParty",
    "handlingOSIInstructions",
    "includedCustomsNote",
    "associatedConsignmentCustomsProcedure",
    "utilizedUnitLoadTransportEquipment",
    "includedHouseConsignment"
})
public class StatusConsignmentType {

    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "DensityGroupCode")
    protected CodeType densityGroupCode;
    @XmlElement(name = "PieceQuantity", required = true)
    protected QuantityType pieceQuantity;
    @XmlElement(name = "TransportSplitDescription", required = true)
    protected TextType transportSplitDescription;
    @XmlElement(name = "DiscrepancyDescriptionCode")
    protected CodeType discrepancyDescriptionCode;
    @XmlElement(name = "AssociatedManifestDocument")
    protected ManifestDocumentType associatedManifestDocument;
    @XmlElement(name = "ApplicableLogisticsServiceCharge")
    protected LogisticsServiceChargeType applicableLogisticsServiceCharge;
    @XmlElement(name = "SpecifiedLogisticsTransportMovement")
    protected List<LogisticsTransportMovementType> specifiedLogisticsTransportMovement;
    @XmlElement(name = "NotifiedParty")
    protected NotifiedPartyType notifiedParty;
    @XmlElement(name = "DeliveryParty")
    protected DeliveryPartyType deliveryParty;
    @XmlElement(name = "AssociatedReceivedFromParty")
    protected ReceivedFromPartyType associatedReceivedFromParty;
    @XmlElement(name = "AssociatedTransferredFromParty")
    protected TransferredFromPartyType associatedTransferredFromParty;
    @XmlElement(name = "HandlingOSIInstructions")
    protected List<OSIInstructionsType> handlingOSIInstructions;
    @XmlElement(name = "IncludedCustomsNote")
    protected List<CustomsNoteType> includedCustomsNote;
    @XmlElement(name = "AssociatedConsignmentCustomsProcedure")
    protected ConsignmentCustomsProcedureType associatedConsignmentCustomsProcedure;
    @XmlElement(name = "UtilizedUnitLoadTransportEquipment")
    protected List<UnitLoadTransportEquipmentType> utilizedUnitLoadTransportEquipment;
    @XmlElement(name = "IncludedHouseConsignment")
    protected List<HouseConsignmentType> includedHouseConsignment;

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
     * Obtient la valeur de la propriété discrepancyDescriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDiscrepancyDescriptionCode() {
        return discrepancyDescriptionCode;
    }

    /**
     * Définit la valeur de la propriété discrepancyDescriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDiscrepancyDescriptionCode(CodeType value) {
        this.discrepancyDescriptionCode = value;
    }

    /**
     * Obtient la valeur de la propriété associatedManifestDocument.
     * 
     * @return
     *     possible object is
     *     {@link ManifestDocumentType }
     *     
     */
    public ManifestDocumentType getAssociatedManifestDocument() {
        return associatedManifestDocument;
    }

    /**
     * Définit la valeur de la propriété associatedManifestDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestDocumentType }
     *     
     */
    public void setAssociatedManifestDocument(ManifestDocumentType value) {
        this.associatedManifestDocument = value;
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
     * Obtient la valeur de la propriété notifiedParty.
     * 
     * @return
     *     possible object is
     *     {@link NotifiedPartyType }
     *     
     */
    public NotifiedPartyType getNotifiedParty() {
        return notifiedParty;
    }

    /**
     * Définit la valeur de la propriété notifiedParty.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifiedPartyType }
     *     
     */
    public void setNotifiedParty(NotifiedPartyType value) {
        this.notifiedParty = value;
    }

    /**
     * Obtient la valeur de la propriété deliveryParty.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPartyType }
     *     
     */
    public DeliveryPartyType getDeliveryParty() {
        return deliveryParty;
    }

    /**
     * Définit la valeur de la propriété deliveryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPartyType }
     *     
     */
    public void setDeliveryParty(DeliveryPartyType value) {
        this.deliveryParty = value;
    }

    /**
     * Obtient la valeur de la propriété associatedReceivedFromParty.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedFromPartyType }
     *     
     */
    public ReceivedFromPartyType getAssociatedReceivedFromParty() {
        return associatedReceivedFromParty;
    }

    /**
     * Définit la valeur de la propriété associatedReceivedFromParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedFromPartyType }
     *     
     */
    public void setAssociatedReceivedFromParty(ReceivedFromPartyType value) {
        this.associatedReceivedFromParty = value;
    }

    /**
     * Obtient la valeur de la propriété associatedTransferredFromParty.
     * 
     * @return
     *     possible object is
     *     {@link TransferredFromPartyType }
     *     
     */
    public TransferredFromPartyType getAssociatedTransferredFromParty() {
        return associatedTransferredFromParty;
    }

    /**
     * Définit la valeur de la propriété associatedTransferredFromParty.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferredFromPartyType }
     *     
     */
    public void setAssociatedTransferredFromParty(TransferredFromPartyType value) {
        this.associatedTransferredFromParty = value;
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
     * Gets the value of the utilizedUnitLoadTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilizedUnitLoadTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilizedUnitLoadTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitLoadTransportEquipmentType }
     * 
     * 
     */
    public List<UnitLoadTransportEquipmentType> getUtilizedUnitLoadTransportEquipment() {
        if (utilizedUnitLoadTransportEquipment == null) {
            utilizedUnitLoadTransportEquipment = new ArrayList<UnitLoadTransportEquipmentType>();
        }
        return this.utilizedUnitLoadTransportEquipment;
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
