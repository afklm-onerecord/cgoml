//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:27 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfbl.v2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrivalEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrivalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccurrenceArrivalLocation" type="{iata:datamodel:3}ArrivalLocationType"/&gt;
 *         &lt;element name="AssociatedTransportCargo" type="{iata:datamodel:3}TransportCargoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalEventType", propOrder = {
    "occurrenceArrivalLocation",
    "associatedTransportCargo"
})
public class ArrivalEventType {

    @XmlElement(name = "OccurrenceArrivalLocation", required = true)
    protected ArrivalLocationType occurrenceArrivalLocation;
    @XmlElement(name = "AssociatedTransportCargo")
    protected List<TransportCargoType> associatedTransportCargo;

    /**
     * Obtient la valeur de la propriété occurrenceArrivalLocation.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalLocationType }
     *     
     */
    public ArrivalLocationType getOccurrenceArrivalLocation() {
        return occurrenceArrivalLocation;
    }

    /**
     * Définit la valeur de la propriété occurrenceArrivalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalLocationType }
     *     
     */
    public void setOccurrenceArrivalLocation(ArrivalLocationType value) {
        this.occurrenceArrivalLocation = value;
    }

    /**
     * Gets the value of the associatedTransportCargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedTransportCargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedTransportCargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportCargoType }
     * 
     * 
     */
    public List<TransportCargoType> getAssociatedTransportCargo() {
        if (associatedTransportCargo == null) {
            associatedTransportCargo = new ArrayList<TransportCargoType>();
        }
        return this.associatedTransportCargo;
    }

}
