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


/**
 * <p>Classe Java pour ItineraryRouteType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ItineraryRouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartLocation" type="{iata:datamodel:3}StartLocationType"/&gt;
 *         &lt;element name="EndLocation" type="{iata:datamodel:3}EndLocationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryRouteType", propOrder = {
    "startLocation",
    "endLocation"
})
public class ItineraryRouteType {

    @XmlElement(name = "StartLocation", required = true)
    protected StartLocationType startLocation;
    @XmlElement(name = "EndLocation", required = true)
    protected EndLocationType endLocation;

    /**
     * Obtient la valeur de la propriété startLocation.
     * 
     * @return
     *     possible object is
     *     {@link StartLocationType }
     *     
     */
    public StartLocationType getStartLocation() {
        return startLocation;
    }

    /**
     * Définit la valeur de la propriété startLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link StartLocationType }
     *     
     */
    public void setStartLocation(StartLocationType value) {
        this.startLocation = value;
    }

    /**
     * Obtient la valeur de la propriété endLocation.
     * 
     * @return
     *     possible object is
     *     {@link EndLocationType }
     *     
     */
    public EndLocationType getEndLocation() {
        return endLocation;
    }

    /**
     * Définit la valeur de la propriété endLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link EndLocationType }
     *     
     */
    public void setEndLocation(EndLocationType value) {
        this.endLocation = value;
    }

}
