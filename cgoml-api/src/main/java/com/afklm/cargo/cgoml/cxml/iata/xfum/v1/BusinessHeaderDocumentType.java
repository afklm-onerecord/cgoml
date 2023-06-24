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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.QuantityType;


/**
 * <p>Classe Java pour BusinessHeaderDocumentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessHeaderDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssueDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType"/&gt;
 *         &lt;element name="UnitLoadDeviceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="HouseWaybillQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="LoadedPieceQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}QuantityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessHeaderDocumentType", propOrder = {
    "issueDateTime",
    "unitLoadDeviceQuantity",
    "shipmentQuantity",
    "houseWaybillQuantity",
    "loadedPieceQuantity"
})
public class BusinessHeaderDocumentType
{

    @XmlElement(name = "IssueDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDateTime;
    @XmlElement(name = "UnitLoadDeviceQuantity")
    protected QuantityType unitLoadDeviceQuantity;
    @XmlElement(name = "ShipmentQuantity")
    protected QuantityType shipmentQuantity;
    @XmlElement(name = "HouseWaybillQuantity")
    protected QuantityType houseWaybillQuantity;
    @XmlElement(name = "LoadedPieceQuantity")
    protected QuantityType loadedPieceQuantity;

    /**
     * Obtient la valeur de la propriété issueDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Définit la valeur de la propriété issueDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDateTime(XMLGregorianCalendar value) {
        this.issueDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété unitLoadDeviceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getUnitLoadDeviceQuantity() {
        return unitLoadDeviceQuantity;
    }

    /**
     * Définit la valeur de la propriété unitLoadDeviceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setUnitLoadDeviceQuantity(QuantityType value) {
        this.unitLoadDeviceQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété shipmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getShipmentQuantity() {
        return shipmentQuantity;
    }

    /**
     * Définit la valeur de la propriété shipmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setShipmentQuantity(QuantityType value) {
        this.shipmentQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété houseWaybillQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getHouseWaybillQuantity() {
        return houseWaybillQuantity;
    }

    /**
     * Définit la valeur de la propriété houseWaybillQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setHouseWaybillQuantity(QuantityType value) {
        this.houseWaybillQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété loadedPieceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getLoadedPieceQuantity() {
        return loadedPieceQuantity;
    }

    /**
     * Définit la valeur de la propriété loadedPieceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setLoadedPieceQuantity(QuantityType value) {
        this.loadedPieceQuantity = value;
    }

}
