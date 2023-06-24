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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.AmountType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour LogisticsAllowanceChargeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsAllowanceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="AdditionalID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="PrepaidIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="LocationTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PartyTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ActualAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}AmountType"/&gt;
 *         &lt;element name="TimeBasisQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ItemBasisQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServiceDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServiceTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsAllowanceChargeType", propOrder = {
    "id",
    "additionalID",
    "prepaidIndicator",
    "locationTypeCode",
    "reason",
    "partyTypeCode",
    "actualAmount",
    "timeBasisQuantity",
    "itemBasisQuantity",
    "serviceDate",
    "specialServiceDescription",
    "specialServiceTime"
})
public class LogisticsAllowanceChargeType {

    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "AdditionalID")
    protected IDType additionalID;
    @XmlElement(name = "PrepaidIndicator")
    protected boolean prepaidIndicator;
    @XmlElement(name = "LocationTypeCode")
    protected CodeType locationTypeCode;
    @XmlElement(name = "Reason")
    protected TextType reason;
    @XmlElement(name = "PartyTypeCode", required = true)
    protected CodeType partyTypeCode;
    @XmlElement(name = "ActualAmount", required = true)
    protected AmountType actualAmount;
    @XmlElement(name = "TimeBasisQuantity")
    protected QuantityType timeBasisQuantity;
    @XmlElement(name = "ItemBasisQuantity")
    protected QuantityType itemBasisQuantity;
    @XmlElement(name = "ServiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "SpecialServiceDescription")
    protected TextType specialServiceDescription;
    @XmlElement(name = "SpecialServiceTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar specialServiceTime;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété additionalID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAdditionalID() {
        return additionalID;
    }

    /**
     * Définit la valeur de la propriété additionalID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAdditionalID(IDType value) {
        this.additionalID = value;
    }

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
     * Obtient la valeur de la propriété locationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationTypeCode() {
        return locationTypeCode;
    }

    /**
     * Définit la valeur de la propriété locationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationTypeCode(CodeType value) {
        this.locationTypeCode = value;
    }

    /**
     * Obtient la valeur de la propriété reason.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getReason() {
        return reason;
    }

    /**
     * Définit la valeur de la propriété reason.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setReason(TextType value) {
        this.reason = value;
    }

    /**
     * Obtient la valeur de la propriété partyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Définit la valeur de la propriété partyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPartyTypeCode(CodeType value) {
        this.partyTypeCode = value;
    }

    /**
     * Obtient la valeur de la propriété actualAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActualAmount() {
        return actualAmount;
    }

    /**
     * Définit la valeur de la propriété actualAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActualAmount(AmountType value) {
        this.actualAmount = value;
    }

    /**
     * Obtient la valeur de la propriété timeBasisQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTimeBasisQuantity() {
        return timeBasisQuantity;
    }

    /**
     * Définit la valeur de la propriété timeBasisQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTimeBasisQuantity(QuantityType value) {
        this.timeBasisQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété itemBasisQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getItemBasisQuantity() {
        return itemBasisQuantity;
    }

    /**
     * Définit la valeur de la propriété itemBasisQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setItemBasisQuantity(QuantityType value) {
        this.itemBasisQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété serviceDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Définit la valeur de la propriété serviceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Obtient la valeur de la propriété specialServiceDescription.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSpecialServiceDescription() {
        return specialServiceDescription;
    }

    /**
     * Définit la valeur de la propriété specialServiceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSpecialServiceDescription(TextType value) {
        this.specialServiceDescription = value;
    }

    /**
     * Obtient la valeur de la propriété specialServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecialServiceTime() {
        return specialServiceTime;
    }

    /**
     * Définit la valeur de la propriété specialServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecialServiceTime(XMLGregorianCalendar value) {
        this.specialServiceTime = value;
    }

}
