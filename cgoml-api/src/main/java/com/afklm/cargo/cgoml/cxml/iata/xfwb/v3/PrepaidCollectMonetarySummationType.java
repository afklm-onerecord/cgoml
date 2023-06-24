//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.AmountType;


/**
 * <p>Classe Java pour PrepaidCollectMonetarySummationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PrepaidCollectMonetarySummationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrepaidIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="WeightChargeTotalAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ValuationChargeTotalAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TaxTotalAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="AgentTotalDuePayableAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierTotalDuePayableAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="GrandTotalAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidCollectMonetarySummationType", propOrder = {
    "prepaidIndicator",
    "weightChargeTotalAmount",
    "valuationChargeTotalAmount",
    "taxTotalAmount",
    "agentTotalDuePayableAmount",
    "carrierTotalDuePayableAmount",
    "grandTotalAmount"
})
public class PrepaidCollectMonetarySummationType {

    @XmlElement(name = "PrepaidIndicator")
    protected boolean prepaidIndicator;
    @XmlElement(name = "WeightChargeTotalAmount")
    protected AmountType weightChargeTotalAmount;
    @XmlElement(name = "ValuationChargeTotalAmount")
    protected AmountType valuationChargeTotalAmount;
    @XmlElement(name = "TaxTotalAmount")
    protected AmountType taxTotalAmount;
    @XmlElement(name = "AgentTotalDuePayableAmount")
    protected AmountType agentTotalDuePayableAmount;
    @XmlElement(name = "CarrierTotalDuePayableAmount")
    protected AmountType carrierTotalDuePayableAmount;
    @XmlElement(name = "GrandTotalAmount", required = true)
    protected AmountType grandTotalAmount;

    /**
     * Obtient la valeur de la propriété prepaidIndicator.
     * 
     */
    public boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Définit la valeur de la propriété prepaidIndicator.
     * 
     */
    public void setPrepaidIndicator(boolean value) {
        this.prepaidIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété weightChargeTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWeightChargeTotalAmount() {
        return weightChargeTotalAmount;
    }

    /**
     * Définit la valeur de la propriété weightChargeTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWeightChargeTotalAmount(AmountType value) {
        this.weightChargeTotalAmount = value;
    }

    /**
     * Obtient la valeur de la propriété valuationChargeTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getValuationChargeTotalAmount() {
        return valuationChargeTotalAmount;
    }

    /**
     * Définit la valeur de la propriété valuationChargeTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setValuationChargeTotalAmount(AmountType value) {
        this.valuationChargeTotalAmount = value;
    }

    /**
     * Obtient la valeur de la propriété taxTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxTotalAmount() {
        return taxTotalAmount;
    }

    /**
     * Définit la valeur de la propriété taxTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxTotalAmount(AmountType value) {
        this.taxTotalAmount = value;
    }

    /**
     * Obtient la valeur de la propriété agentTotalDuePayableAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAgentTotalDuePayableAmount() {
        return agentTotalDuePayableAmount;
    }

    /**
     * Définit la valeur de la propriété agentTotalDuePayableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAgentTotalDuePayableAmount(AmountType value) {
        this.agentTotalDuePayableAmount = value;
    }

    /**
     * Obtient la valeur de la propriété carrierTotalDuePayableAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCarrierTotalDuePayableAmount() {
        return carrierTotalDuePayableAmount;
    }

    /**
     * Définit la valeur de la propriété carrierTotalDuePayableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCarrierTotalDuePayableAmount(AmountType value) {
        this.carrierTotalDuePayableAmount = value;
    }

    /**
     * Obtient la valeur de la propriété grandTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Définit la valeur de la propriété grandTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

}
