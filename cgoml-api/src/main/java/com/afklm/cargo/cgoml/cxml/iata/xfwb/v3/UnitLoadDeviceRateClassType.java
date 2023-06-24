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

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour UnitLoadDeviceRateClassType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UnitLoadDeviceRateClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="BasisCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AppliedPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitLoadDeviceRateClassType", propOrder = {
    "typeCode",
    "basisCode",
    "appliedPercent",
    "referenceID",
    "referenceTypeCode"
})
public class UnitLoadDeviceRateClassType {

    @XmlElement(name = "TypeCode")
    protected CodeType typeCode;
    @XmlElement(name = "BasisCode")
    protected CodeType basisCode;
    @XmlElement(name = "AppliedPercent")
    protected BigDecimal appliedPercent;
    @XmlElement(name = "ReferenceID")
    protected IDType referenceID;
    @XmlElement(name = "ReferenceTypeCode")
    protected CodeType referenceTypeCode;

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
     * Obtient la valeur de la propriété basisCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBasisCode() {
        return basisCode;
    }

    /**
     * Définit la valeur de la propriété basisCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBasisCode(CodeType value) {
        this.basisCode = value;
    }

    /**
     * Obtient la valeur de la propriété appliedPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppliedPercent() {
        return appliedPercent;
    }

    /**
     * Définit la valeur de la propriété appliedPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppliedPercent(BigDecimal value) {
        this.appliedPercent = value;
    }

    /**
     * Obtient la valeur de la propriété referenceID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getReferenceID() {
        return referenceID;
    }

    /**
     * Définit la valeur de la propriété referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setReferenceID(IDType value) {
        this.referenceID = value;
    }

    /**
     * Obtient la valeur de la propriété referenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReferenceTypeCode() {
        return referenceTypeCode;
    }

    /**
     * Définit la valeur de la propriété referenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReferenceTypeCode(CodeType value) {
        this.referenceTypeCode = value;
    }

}
