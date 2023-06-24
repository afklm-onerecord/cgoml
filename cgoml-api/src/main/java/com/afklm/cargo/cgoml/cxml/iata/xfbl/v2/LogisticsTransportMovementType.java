//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:27 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfbl.v2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.TransportModeCodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour LogisticsTransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsTransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StageCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ModeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}TransportModeCodeType"/&gt;
 *         &lt;element name="Mode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="SequenceNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}NumericType"/&gt;
 *         &lt;element name="TotalGrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="TotalGrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="TotalTransportEquipmentQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="UsedLogisticsTransportMeans" type="{iata:datamodel:3}LogisticsTransportMeansType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureEvent" type="{iata:datamodel:3}DepartureEventType" minOccurs="0"/&gt;
 *         &lt;element name="IncludedCustomsNote" type="{iata:datamodel:3}CustomsNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RelatedConsignmentCustomsProcedure" type="{iata:datamodel:3}ConsignmentCustomsProcedureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsTransportMovementType", propOrder = {
    "stageCode",
    "modeCode",
    "mode",
    "id",
    "sequenceNumeric",
    "totalGrossWeightMeasure",
    "totalGrossVolumeMeasure",
    "totalPieceQuantity",
    "totalTransportEquipmentQuantity",
    "usedLogisticsTransportMeans",
    "departureEvent",
    "includedCustomsNote",
    "relatedConsignmentCustomsProcedure"
})
public class LogisticsTransportMovementType {

    @XmlElement(name = "StageCode", required = true)
    protected CodeType stageCode;
    @XmlElement(name = "ModeCode", required = true)
    protected TransportModeCodeType modeCode;
    @XmlElement(name = "Mode")
    protected TextType mode;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "SequenceNumeric", required = true)
    protected BigDecimal sequenceNumeric;
    @XmlElement(name = "TotalGrossWeightMeasure")
    protected MeasureType totalGrossWeightMeasure;
    @XmlElement(name = "TotalGrossVolumeMeasure")
    protected MeasureType totalGrossVolumeMeasure;
    @XmlElement(name = "TotalPieceQuantity")
    protected QuantityType totalPieceQuantity;
    @XmlElement(name = "TotalTransportEquipmentQuantity")
    protected QuantityType totalTransportEquipmentQuantity;
    @XmlElement(name = "UsedLogisticsTransportMeans")
    protected LogisticsTransportMeansType usedLogisticsTransportMeans;
    @XmlElement(name = "DepartureEvent")
    protected DepartureEventType departureEvent;
    @XmlElement(name = "IncludedCustomsNote")
    protected List<CustomsNoteType> includedCustomsNote;
    @XmlElement(name = "RelatedConsignmentCustomsProcedure")
    protected ConsignmentCustomsProcedureType relatedConsignmentCustomsProcedure;

    /**
     * Obtient la valeur de la propriété stageCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStageCode() {
        return stageCode;
    }

    /**
     * Définit la valeur de la propriété stageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStageCode(CodeType value) {
        this.stageCode = value;
    }

    /**
     * Obtient la valeur de la propriété modeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportModeCodeType }
     *     
     */
    public TransportModeCodeType getModeCode() {
        return modeCode;
    }

    /**
     * Définit la valeur de la propriété modeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModeCodeType }
     *     
     */
    public void setModeCode(TransportModeCodeType value) {
        this.modeCode = value;
    }

    /**
     * Obtient la valeur de la propriété mode.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMode() {
        return mode;
    }

    /**
     * Définit la valeur de la propriété mode.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMode(TextType value) {
        this.mode = value;
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
     * Obtient la valeur de la propriété totalGrossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalGrossWeightMeasure() {
        return totalGrossWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété totalGrossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalGrossWeightMeasure(MeasureType value) {
        this.totalGrossWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété totalGrossVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalGrossVolumeMeasure() {
        return totalGrossVolumeMeasure;
    }

    /**
     * Définit la valeur de la propriété totalGrossVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalGrossVolumeMeasure(MeasureType value) {
        this.totalGrossVolumeMeasure = value;
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
     * Obtient la valeur de la propriété totalTransportEquipmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTotalTransportEquipmentQuantity() {
        return totalTransportEquipmentQuantity;
    }

    /**
     * Définit la valeur de la propriété totalTransportEquipmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTotalTransportEquipmentQuantity(QuantityType value) {
        this.totalTransportEquipmentQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété usedLogisticsTransportMeans.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsTransportMeansType }
     *     
     */
    public LogisticsTransportMeansType getUsedLogisticsTransportMeans() {
        return usedLogisticsTransportMeans;
    }

    /**
     * Définit la valeur de la propriété usedLogisticsTransportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsTransportMeansType }
     *     
     */
    public void setUsedLogisticsTransportMeans(LogisticsTransportMeansType value) {
        this.usedLogisticsTransportMeans = value;
    }

    /**
     * Obtient la valeur de la propriété departureEvent.
     * 
     * @return
     *     possible object is
     *     {@link DepartureEventType }
     *     
     */
    public DepartureEventType getDepartureEvent() {
        return departureEvent;
    }

    /**
     * Définit la valeur de la propriété departureEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureEventType }
     *     
     */
    public void setDepartureEvent(DepartureEventType value) {
        this.departureEvent = value;
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
     * Obtient la valeur de la propriété relatedConsignmentCustomsProcedure.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentCustomsProcedureType }
     *     
     */
    public ConsignmentCustomsProcedureType getRelatedConsignmentCustomsProcedure() {
        return relatedConsignmentCustomsProcedure;
    }

    /**
     * Définit la valeur de la propriété relatedConsignmentCustomsProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentCustomsProcedureType }
     *     
     */
    public void setRelatedConsignmentCustomsProcedure(ConsignmentCustomsProcedureType value) {
        this.relatedConsignmentCustomsProcedure = value;
    }

}
