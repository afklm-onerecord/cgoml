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

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.CurrencyCodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour DestinationCurrencyExchangeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DestinationCurrencyExchangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CurrencyCodeType"/&gt;
 *         &lt;element name="MarketID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ConversionRate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}RateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationCurrencyExchangeType", propOrder = {
    "targetCurrencyCode",
    "marketID",
    "conversionRate"
})
public class DestinationCurrencyExchangeType {

    @XmlElement(name = "TargetCurrencyCode", required = true)
    protected CurrencyCodeType targetCurrencyCode;
    @XmlElement(name = "MarketID")
    protected IDType marketID;
    @XmlElement(name = "ConversionRate", required = true)
    protected BigDecimal conversionRate;

    /**
     * Obtient la valeur de la propriété targetCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Définit la valeur de la propriété targetCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTargetCurrencyCode(CurrencyCodeType value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Obtient la valeur de la propriété marketID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMarketID() {
        return marketID;
    }

    /**
     * Définit la valeur de la propriété marketID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMarketID(IDType value) {
        this.marketID = value;
    }

    /**
     * Obtient la valeur de la propriété conversionRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Définit la valeur de la propriété conversionRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

}
