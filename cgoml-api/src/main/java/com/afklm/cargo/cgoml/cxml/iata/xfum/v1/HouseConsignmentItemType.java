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


/**
 * <p>Classe Java pour HouseConsignmentItemType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HouseConsignmentItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportLogisticsPackage" type="{iata:datamodel:3}LogisticsPackageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseConsignmentItemType", propOrder = {
    "transportLogisticsPackage"
})
public class HouseConsignmentItemType {

    @XmlElement(name = "TransportLogisticsPackage", required = true)
    protected LogisticsPackageType transportLogisticsPackage;

    /**
     * Obtient la valeur de la propriété transportLogisticsPackage.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsPackageType }
     *     
     */
    public LogisticsPackageType getTransportLogisticsPackage() {
        return transportLogisticsPackage;
    }

    /**
     * Définit la valeur de la propriété transportLogisticsPackage.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsPackageType }
     *     
     */
    public void setTransportLogisticsPackage(LogisticsPackageType value) {
        this.transportLogisticsPackage = value;
    }

}
