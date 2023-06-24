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
 * <p>Classe Java pour DestinationCurrencyServiceChargeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DestinationCurrencyServiceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollectAppliedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType"/&gt;
 *         &lt;element name="DestinationAppliedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType"/&gt;
 *         &lt;element name="TotalAppliedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationCurrencyServiceChargeType", propOrder = {
    "collectAppliedAmount",
    "destinationAppliedAmount",
    "totalAppliedAmount"
})
public class DestinationCurrencyServiceChargeType {

    @XmlElement(name = "CollectAppliedAmount", required = true)
    protected AmountType collectAppliedAmount;
    @XmlElement(name = "DestinationAppliedAmount", required = true)
    protected AmountType destinationAppliedAmount;
    @XmlElement(name = "TotalAppliedAmount", required = true)
    protected AmountType totalAppliedAmount;

    /**
     * Obtient la valeur de la propriété collectAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCollectAppliedAmount() {
        return collectAppliedAmount;
    }

    /**
     * Définit la valeur de la propriété collectAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCollectAppliedAmount(AmountType value) {
        this.collectAppliedAmount = value;
    }

    /**
     * Obtient la valeur de la propriété destinationAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDestinationAppliedAmount() {
        return destinationAppliedAmount;
    }

    /**
     * Définit la valeur de la propriété destinationAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDestinationAppliedAmount(AmountType value) {
        this.destinationAppliedAmount = value;
    }

    /**
     * Obtient la valeur de la propriété totalAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAppliedAmount() {
        return totalAppliedAmount;
    }

    /**
     * Définit la valeur de la propriété totalAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAppliedAmount(AmountType value) {
        this.totalAppliedAmount = value;
    }

}
