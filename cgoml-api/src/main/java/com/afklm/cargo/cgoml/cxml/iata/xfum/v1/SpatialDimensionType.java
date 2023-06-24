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


/**
 * <p>Classe Java pour SpatialDimensionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SpatialDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WidthMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="LengthMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="HeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialDimensionType", propOrder = {
    "widthMeasure",
    "lengthMeasure",
    "heightMeasure"
})
public class SpatialDimensionType
{

    @XmlElement(name = "WidthMeasure", required = true)
    protected MeasureType widthMeasure;
    @XmlElement(name = "LengthMeasure", required = true)
    protected MeasureType lengthMeasure;
    @XmlElement(name = "HeightMeasure", required = true)
    protected MeasureType heightMeasure;

    /**
     * Obtient la valeur de la propriété widthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Définit la valeur de la propriété widthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWidthMeasure(MeasureType value) {
        this.widthMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété lengthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Définit la valeur de la propriété lengthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLengthMeasure(MeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété heightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Définit la valeur de la propriété heightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

}
