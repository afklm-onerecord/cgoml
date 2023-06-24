//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;


/**
 * <p>Classe Java pour TransportMovementHeaderType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransportMovementHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightManifestID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="SpecifiedTransportMovement" type="{iata:datamodel:3}SpecifiedTransportMovementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMovementHeaderType", propOrder = {
    "flightManifestID",
    "specifiedTransportMovement"
})
public class TransportMovementHeaderType {

    @XmlElement(name = "FlightManifestID", required = true)
    protected IDType flightManifestID;
    @XmlElement(name = "SpecifiedTransportMovement", required = true)
    protected SpecifiedTransportMovementType specifiedTransportMovement;

    /**
     * Obtient la valeur de la propriété flightManifestID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getFlightManifestID() {
        return flightManifestID;
    }

    /**
     * Définit la valeur de la propriété flightManifestID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setFlightManifestID(IDType value) {
        this.flightManifestID = value;
    }

    /**
     * Obtient la valeur de la propriété specifiedTransportMovement.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedTransportMovementType }
     *     
     */
    public SpecifiedTransportMovementType getSpecifiedTransportMovement() {
        return specifiedTransportMovement;
    }

    /**
     * Définit la valeur de la propriété specifiedTransportMovement.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedTransportMovementType }
     *     
     */
    public void setSpecifiedTransportMovement(SpecifiedTransportMovementType value) {
        this.specifiedTransportMovement = value;
    }

}
