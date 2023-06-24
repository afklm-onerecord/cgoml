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
 * <p>Classe Java pour LoadingEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LoadingEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccurrenceLoadingLocation" type="{iata:datamodel:3}LoadingLocationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadingEventType", propOrder = {
    "occurrenceLoadingLocation"
})
public class LoadingEventType {

    @XmlElement(name = "OccurrenceLoadingLocation", required = true)
    protected LoadingLocationType occurrenceLoadingLocation;

    /**
     * Obtient la valeur de la propriété occurrenceLoadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LoadingLocationType }
     *     
     */
    public LoadingLocationType getOccurrenceLoadingLocation() {
        return occurrenceLoadingLocation;
    }

    /**
     * Définit la valeur de la propriété occurrenceLoadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingLocationType }
     *     
     */
    public void setOccurrenceLoadingLocation(LoadingLocationType value) {
        this.occurrenceLoadingLocation = value;
    }

}
