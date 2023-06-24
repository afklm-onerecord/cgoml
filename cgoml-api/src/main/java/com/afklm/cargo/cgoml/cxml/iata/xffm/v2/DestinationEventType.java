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
 * <p>Classe Java pour DestinationEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DestinationEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccurrenceDestinationLocation" type="{iata:datamodel:3}DestinationLocationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationEventType", propOrder = {
    "occurrenceDestinationLocation"
})
public class DestinationEventType {

    @XmlElement(name = "OccurrenceDestinationLocation", required = true)
    protected DestinationLocationType occurrenceDestinationLocation;

    /**
     * Obtient la valeur de la propriété occurrenceDestinationLocation.
     * 
     * @return
     *     possible object is
     *     {@link DestinationLocationType }
     *     
     */
    public DestinationLocationType getOccurrenceDestinationLocation() {
        return occurrenceDestinationLocation;
    }

    /**
     * Définit la valeur de la propriété occurrenceDestinationLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationLocationType }
     *     
     */
    public void setOccurrenceDestinationLocation(DestinationLocationType value) {
        this.occurrenceDestinationLocation = value;
    }

}
