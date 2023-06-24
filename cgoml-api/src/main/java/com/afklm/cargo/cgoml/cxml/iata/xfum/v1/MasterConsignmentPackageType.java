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

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;


/**
 * <p>Classe Java pour MasterConsignmentPackageType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MasterConsignmentPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="LinearSpatialDimension" type="{iata:datamodel:3}SpatialDimensionType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingSPHInstructions" type="{iata:datamodel:3}SPHInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterConsignmentPackageType", propOrder = {
    "id",
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "linearSpatialDimension",
    "handlingSPHInstructions"
})
public class MasterConsignmentPackageType {

    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "LinearSpatialDimension")
    protected SpatialDimensionType linearSpatialDimension;
    @XmlElement(name = "HandlingSPHInstructions")
    protected List<SPHInstructionsType> handlingSPHInstructions;

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
     * Obtient la valeur de la propriété linearSpatialDimension.
     * 
     * @return
     *     possible object is
     *     {@link SpatialDimensionType }
     *     
     */
    public SpatialDimensionType getLinearSpatialDimension() {
        return linearSpatialDimension;
    }

    /**
     * Définit la valeur de la propriété linearSpatialDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialDimensionType }
     *     
     */
    public void setLinearSpatialDimension(SpatialDimensionType value) {
        this.linearSpatialDimension = value;
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

}
