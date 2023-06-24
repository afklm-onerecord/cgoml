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


/**
 * <p>Classe Java pour PositioningEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PositioningEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccurrencePositioningLocation" type="{iata:datamodel:3}PositioningLocationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositioningEventType", propOrder = {
    "occurrencePositioningLocation"
})
public class PositioningEventType {

    @XmlElement(name = "OccurrencePositioningLocation", required = true)
    protected PositioningLocationType occurrencePositioningLocation;

    /**
     * Obtient la valeur de la propriété occurrencePositioningLocation.
     * 
     * @return
     *     possible object is
     *     {@link PositioningLocationType }
     *     
     */
    public PositioningLocationType getOccurrencePositioningLocation() {
        return occurrencePositioningLocation;
    }

    /**
     * Définit la valeur de la propriété occurrencePositioningLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link PositioningLocationType }
     *     
     */
    public void setOccurrencePositioningLocation(PositioningLocationType value) {
        this.occurrencePositioningLocation = value;
    }

}
