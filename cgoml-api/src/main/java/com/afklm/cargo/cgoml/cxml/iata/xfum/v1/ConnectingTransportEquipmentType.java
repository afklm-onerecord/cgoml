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
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour ConnectingTransportEquipmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectingTransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharacteristicCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="OperatingParty" type="{iata:datamodel:3}OperatingPartyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectingTransportEquipmentType", propOrder = {
    "characteristicCode",
    "id",
    "operatingParty"
})
public class ConnectingTransportEquipmentType {

    @XmlElement(name = "CharacteristicCode", required = true)
    protected CodeType characteristicCode;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "OperatingParty", required = true)
    protected OperatingPartyType operatingParty;

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
     * Obtient la valeur de la propriété operatingParty.
     * 
     * @return
     *     possible object is
     *     {@link OperatingPartyType }
     *     
     */
    public OperatingPartyType getOperatingParty() {
        return operatingParty;
    }

    /**
     * Définit la valeur de la propriété operatingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingPartyType }
     *     
     */
    public void setOperatingParty(OperatingPartyType value) {
        this.operatingParty = value;
    }

}
