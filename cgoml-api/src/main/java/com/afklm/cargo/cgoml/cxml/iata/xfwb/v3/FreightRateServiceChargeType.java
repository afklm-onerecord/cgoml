//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.AmountType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.MeasureType;


/**
 * <p>Classe Java pour FreightRateServiceChargeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FreightRateServiceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CommodityItemID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ChargeableWeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}MeasureType"/&gt;
 *         &lt;element name="AppliedRate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}RateType"/&gt;
 *         &lt;element name="AppliedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightRateServiceChargeType", propOrder = {
    "categoryCode",
    "commodityItemID",
    "chargeableWeightMeasure",
    "appliedRate",
    "appliedAmount"
})
public class FreightRateServiceChargeType {

    @XmlElement(name = "CategoryCode")
    protected CodeType categoryCode;
    @XmlElement(name = "CommodityItemID")
    protected IDType commodityItemID;
    @XmlElement(name = "ChargeableWeightMeasure", required = true)
    protected MeasureType chargeableWeightMeasure;
    @XmlElement(name = "AppliedRate", required = true)
    protected BigDecimal appliedRate;
    @XmlElement(name = "AppliedAmount", required = true)
    protected AmountType appliedAmount;

    /**
     * Obtient la valeur de la propriété categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCategoryCode() {
        return categoryCode;
    }

    /**
     * Définit la valeur de la propriété categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCategoryCode(CodeType value) {
        this.categoryCode = value;
    }

    /**
     * Obtient la valeur de la propriété commodityItemID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCommodityItemID() {
        return commodityItemID;
    }

    /**
     * Définit la valeur de la propriété commodityItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCommodityItemID(IDType value) {
        this.commodityItemID = value;
    }

    /**
     * Obtient la valeur de la propriété chargeableWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété chargeableWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setChargeableWeightMeasure(MeasureType value) {
        this.chargeableWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété appliedRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppliedRate() {
        return appliedRate;
    }

    /**
     * Définit la valeur de la propriété appliedRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppliedRate(BigDecimal value) {
        this.appliedRate = value;
    }

    /**
     * Obtient la valeur de la propriété appliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Définit la valeur de la propriété appliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAppliedAmount(AmountType value) {
        this.appliedAmount = value;
    }

}
