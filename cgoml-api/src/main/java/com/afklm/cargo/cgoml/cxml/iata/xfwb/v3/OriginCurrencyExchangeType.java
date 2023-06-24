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

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.CurrencyCodeType;


/**
 * <p>Classe Java pour OriginCurrencyExchangeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OriginCurrencyExchangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CurrencyCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginCurrencyExchangeType", propOrder = {
    "sourceCurrencyCode"
})
public class OriginCurrencyExchangeType {

    @XmlElement(name = "SourceCurrencyCode", required = true)
    protected CurrencyCodeType sourceCurrencyCode;

    /**
     * Obtient la valeur de la propriété sourceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Définit la valeur de la propriété sourceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setSourceCurrencyCode(CurrencyCodeType value) {
        this.sourceCurrencyCode = value;
    }

}
