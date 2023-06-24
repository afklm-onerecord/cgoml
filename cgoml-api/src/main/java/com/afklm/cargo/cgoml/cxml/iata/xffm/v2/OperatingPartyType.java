//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:13 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xffm.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour OperatingPartyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperatingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingPartyType", propOrder = {
    "primaryID"
})
public class OperatingPartyType {

    @XmlElement(name = "PrimaryID", required = true)
    protected IDType primaryID;

    /**
     * Obtient la valeur de la propriété primaryID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPrimaryID() {
        return primaryID;
    }

    /**
     * Définit la valeur de la propriété primaryID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPrimaryID(IDType value) {
        this.primaryID = value;
    }

}
