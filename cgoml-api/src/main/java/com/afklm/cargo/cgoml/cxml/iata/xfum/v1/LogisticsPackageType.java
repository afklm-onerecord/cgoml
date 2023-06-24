//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:20 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfum.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;


/**
 * <p>Classe Java pour LogisticsPackageType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="LinearSpatialDimension" type="{iata:datamodel:3}SpatialDimensionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsPackageType", propOrder = {
    "itemQuantity",
    "grossWeightMeasure",
    "linearSpatialDimension"
})
public class LogisticsPackageType {

    @XmlElement(name = "ItemQuantity", required = true)
    protected QuantityType itemQuantity;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "LinearSpatialDimension", required = true)
    protected SpatialDimensionType linearSpatialDimension;

    /**
     * Obtient la valeur de la propriété itemQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Définit la valeur de la propriété itemQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setItemQuantity(QuantityType value) {
        this.itemQuantity = value;
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

}
