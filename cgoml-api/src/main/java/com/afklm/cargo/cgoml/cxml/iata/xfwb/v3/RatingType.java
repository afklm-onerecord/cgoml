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

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.AmountType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;


/**
 * <p>Classe Java pour RatingType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RatingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="TotalChargeAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ConsignmentItemQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="IncludedMasterConsignmentItem" type="{iata:datamodel:3}MasterConsignmentItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingType", propOrder = {
    "typeCode",
    "totalChargeAmount",
    "consignmentItemQuantity",
    "includedMasterConsignmentItem"
})
public class RatingType {

    @XmlElement(name = "TypeCode", required = true)
    protected CodeType typeCode;
    @XmlElement(name = "TotalChargeAmount")
    protected AmountType totalChargeAmount;
    @XmlElement(name = "ConsignmentItemQuantity")
    protected QuantityType consignmentItemQuantity;
    @XmlElement(name = "IncludedMasterConsignmentItem", required = true)
    protected List<MasterConsignmentItemType> includedMasterConsignmentItem;

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
     * Obtient la valeur de la propriété totalChargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalChargeAmount() {
        return totalChargeAmount;
    }

    /**
     * Définit la valeur de la propriété totalChargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalChargeAmount(AmountType value) {
        this.totalChargeAmount = value;
    }

    /**
     * Obtient la valeur de la propriété consignmentItemQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getConsignmentItemQuantity() {
        return consignmentItemQuantity;
    }

    /**
     * Définit la valeur de la propriété consignmentItemQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setConsignmentItemQuantity(QuantityType value) {
        this.consignmentItemQuantity = value;
    }

    /**
     * Gets the value of the includedMasterConsignmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedMasterConsignmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedMasterConsignmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterConsignmentItemType }
     * 
     * 
     */
    public List<MasterConsignmentItemType> getIncludedMasterConsignmentItem() {
        if (includedMasterConsignmentItem == null) {
            includedMasterConsignmentItem = new ArrayList<MasterConsignmentItemType>();
        }
        return this.includedMasterConsignmentItem;
    }

}
