//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;


/**
 * <p>Classe Java pour TotalRatingType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TotalRatingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ApplicableDestinationCurrencyServiceCharge" type="{iata:datamodel:3}DestinationCurrencyServiceChargeType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicablePrepaidCollectMonetarySummation" type="{iata:datamodel:3}PrepaidCollectMonetarySummationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalRatingType", propOrder = {
    "typeCode",
    "applicableDestinationCurrencyServiceCharge",
    "applicablePrepaidCollectMonetarySummation"
})
public class TotalRatingType {

    @XmlElement(name = "TypeCode", required = true)
    protected CodeType typeCode;
    @XmlElement(name = "ApplicableDestinationCurrencyServiceCharge")
    protected DestinationCurrencyServiceChargeType applicableDestinationCurrencyServiceCharge;
    @XmlElement(name = "ApplicablePrepaidCollectMonetarySummation", required = true)
    protected List<PrepaidCollectMonetarySummationType> applicablePrepaidCollectMonetarySummation;

    /**
     * Obtient la valeur de la propriété typeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Définit la valeur de la propriété typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeCode(CodeType value) {
        this.typeCode = value;
    }

    /**
     * Obtient la valeur de la propriété applicableDestinationCurrencyServiceCharge.
     * 
     * @return
     *     possible object is
     *     {@link DestinationCurrencyServiceChargeType }
     *     
     */
    public DestinationCurrencyServiceChargeType getApplicableDestinationCurrencyServiceCharge() {
        return applicableDestinationCurrencyServiceCharge;
    }

    /**
     * Définit la valeur de la propriété applicableDestinationCurrencyServiceCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationCurrencyServiceChargeType }
     *     
     */
    public void setApplicableDestinationCurrencyServiceCharge(DestinationCurrencyServiceChargeType value) {
        this.applicableDestinationCurrencyServiceCharge = value;
    }

    /**
     * Gets the value of the applicablePrepaidCollectMonetarySummation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicablePrepaidCollectMonetarySummation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicablePrepaidCollectMonetarySummation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrepaidCollectMonetarySummationType }
     * 
     * 
     */
    public List<PrepaidCollectMonetarySummationType> getApplicablePrepaidCollectMonetarySummation() {
        if (applicablePrepaidCollectMonetarySummation == null) {
            applicablePrepaidCollectMonetarySummation = new ArrayList<PrepaidCollectMonetarySummationType>();
        }
        return this.applicablePrepaidCollectMonetarySummation;
    }

}
