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
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="TotalGrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="PieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="TotalPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="TransportSplitDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="TransportContractDocument" type="{iata:datamodel:3}TransportContractDocumentType"/&gt;
 *         &lt;element name="OriginLocation" type="{iata:datamodel:3}OriginLocationType"/&gt;
 *         &lt;element name="FinalDestinationLocation" type="{iata:datamodel:3}FinalDestinationLocationType"/&gt;
 *         &lt;element name="RoutingLocation" type="{iata:datamodel:3}RoutingLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReportedStatus" type="{iata:datamodel:3}ReportedStatusType" maxOccurs="unbounded"/&gt;
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
    "totalGrossWeightMeasure",
    "pieceQuantity",
    "totalPieceQuantity",
    "transportSplitDescription",
    "transportContractDocument",
    "originLocation",
    "finalDestinationLocation",
    "routingLocation",
    "reportedStatus"
})
public class MasterConsignmentType {

    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "TotalGrossWeightMeasure")
    protected MeasureType totalGrossWeightMeasure;
    @XmlElement(name = "PieceQuantity", required = true)
    protected QuantityType pieceQuantity;
    @XmlElement(name = "TotalPieceQuantity", required = true)
    protected QuantityType totalPieceQuantity;
    @XmlElement(name = "TransportSplitDescription", required = true)
    protected TextType transportSplitDescription;
    @XmlElement(name = "TransportContractDocument", required = true)
    protected TransportContractDocumentType transportContractDocument;
    @XmlElement(name = "OriginLocation", required = true)
    protected OriginLocationType originLocation;
    @XmlElement(name = "FinalDestinationLocation", required = true)
    protected FinalDestinationLocationType finalDestinationLocation;
    @XmlElement(name = "RoutingLocation")
    protected List<RoutingLocationType> routingLocation;
    @XmlElement(name = "ReportedStatus", required = true)
    protected List<ReportedStatusType> reportedStatus;

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
     * Gets the value of the routingLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingLocationType }
     * 
     * 
     */
    public List<RoutingLocationType> getRoutingLocation() {
        if (routingLocation == null) {
            routingLocation = new ArrayList<RoutingLocationType>();
        }
        return this.routingLocation;
    }

    /**
     * Gets the value of the reportedStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportedStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportedStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedStatusType }
     * 
     * 
     */
    public List<ReportedStatusType> getReportedStatus() {
        if (reportedStatus == null) {
            reportedStatus = new ArrayList<ReportedStatusType>();
        }
        return this.reportedStatus;
    }

}
