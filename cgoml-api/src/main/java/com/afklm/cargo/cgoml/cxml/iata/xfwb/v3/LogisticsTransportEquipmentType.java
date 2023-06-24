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

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour LogisticsTransportEquipmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsTransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Characteristic" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="AffixedLogisticsSeal" type="{iata:datamodel:3}LogisticsSealType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsTransportEquipmentType", propOrder = {
    "id",
    "characteristicCode",
    "characteristic",
    "affixedLogisticsSeal"
})
public class LogisticsTransportEquipmentType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "CharacteristicCode")
    protected CodeType characteristicCode;
    @XmlElement(name = "Characteristic")
    protected TextType characteristic;
    @XmlElement(name = "AffixedLogisticsSeal")
    protected LogisticsSealType affixedLogisticsSeal;

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
     * Obtient la valeur de la propriété characteristicCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Définit la valeur de la propriété characteristicCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCharacteristicCode(CodeType value) {
        this.characteristicCode = value;
    }

    /**
     * Obtient la valeur de la propriété characteristic.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCharacteristic() {
        return characteristic;
    }

    /**
     * Définit la valeur de la propriété characteristic.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCharacteristic(TextType value) {
        this.characteristic = value;
    }

    /**
     * Obtient la valeur de la propriété affixedLogisticsSeal.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsSealType }
     *     
     */
    public LogisticsSealType getAffixedLogisticsSeal() {
        return affixedLogisticsSeal;
    }

    /**
     * Définit la valeur de la propriété affixedLogisticsSeal.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsSealType }
     *     
     */
    public void setAffixedLogisticsSeal(LogisticsSealType value) {
        this.affixedLogisticsSeal = value;
    }

}
