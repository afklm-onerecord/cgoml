//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;


/**
 * <p>Classe Java pour TransportMovementEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransportMovementEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelatedFirstArrivalCountry" type="{iata:datamodel:3}FirstArrivalCountryType" minOccurs="0"/&gt;
 *         &lt;element name="MovementTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="OccurrenceMovementLocation" type="{iata:datamodel:3}MovementLocationType"/&gt;
 *         &lt;element name="MovementOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="SpecifiedDelayEvent" type="{iata:datamodel:3}DelayEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedCancellationEvent" type="{iata:datamodel:3}CancellationEventType" minOccurs="0"/&gt;
 *         &lt;element name="SpecifiedOSIInstructions" type="{iata:datamodel:3}OSIInstructionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMovementEventType", propOrder = {
    "relatedFirstArrivalCountry",
    "movementTypeCode",
    "occurrenceMovementLocation",
    "movementOccurrenceDateTime",
    "specifiedDelayEvent",
    "specifiedCancellationEvent",
    "specifiedOSIInstructions"
})
public class TransportMovementEventType {

    @XmlElement(name = "RelatedFirstArrivalCountry")
    protected FirstArrivalCountryType relatedFirstArrivalCountry;
    @XmlElement(name = "MovementTypeCode", required = true)
    protected CodeType movementTypeCode;
    @XmlElement(name = "OccurrenceMovementLocation", required = true)
    protected MovementLocationType occurrenceMovementLocation;
    @XmlElement(name = "MovementOccurrenceDateTime", required = true)
    protected CodeType movementOccurrenceDateTime;
    @XmlElement(name = "SpecifiedDelayEvent")
    protected List<DelayEventType> specifiedDelayEvent;
    @XmlElement(name = "SpecifiedCancellationEvent")
    protected CancellationEventType specifiedCancellationEvent;
    @XmlElement(name = "SpecifiedOSIInstructions")
    protected List<OSIInstructionsType> specifiedOSIInstructions;

    /**
     * Obtient la valeur de la propriété relatedFirstArrivalCountry.
     * 
     * @return
     *     possible object is
     *     {@link FirstArrivalCountryType }
     *     
     */
    public FirstArrivalCountryType getRelatedFirstArrivalCountry() {
        return relatedFirstArrivalCountry;
    }

    /**
     * Définit la valeur de la propriété relatedFirstArrivalCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstArrivalCountryType }
     *     
     */
    public void setRelatedFirstArrivalCountry(FirstArrivalCountryType value) {
        this.relatedFirstArrivalCountry = value;
    }

    /**
     * Obtient la valeur de la propriété movementTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMovementTypeCode() {
        return movementTypeCode;
    }

    /**
     * Définit la valeur de la propriété movementTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMovementTypeCode(CodeType value) {
        this.movementTypeCode = value;
    }

    /**
     * Obtient la valeur de la propriété occurrenceMovementLocation.
     * 
     * @return
     *     possible object is
     *     {@link MovementLocationType }
     *     
     */
    public MovementLocationType getOccurrenceMovementLocation() {
        return occurrenceMovementLocation;
    }

    /**
     * Définit la valeur de la propriété occurrenceMovementLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementLocationType }
     *     
     */
    public void setOccurrenceMovementLocation(MovementLocationType value) {
        this.occurrenceMovementLocation = value;
    }

    /**
     * Obtient la valeur de la propriété movementOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMovementOccurrenceDateTime() {
        return movementOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété movementOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMovementOccurrenceDateTime(CodeType value) {
        this.movementOccurrenceDateTime = value;
    }

    /**
     * Gets the value of the specifiedDelayEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedDelayEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedDelayEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelayEventType }
     * 
     * 
     */
    public List<DelayEventType> getSpecifiedDelayEvent() {
        if (specifiedDelayEvent == null) {
            specifiedDelayEvent = new ArrayList<DelayEventType>();
        }
        return this.specifiedDelayEvent;
    }

    /**
     * Obtient la valeur de la propriété specifiedCancellationEvent.
     * 
     * @return
     *     possible object is
     *     {@link CancellationEventType }
     *     
     */
    public CancellationEventType getSpecifiedCancellationEvent() {
        return specifiedCancellationEvent;
    }

    /**
     * Définit la valeur de la propriété specifiedCancellationEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationEventType }
     *     
     */
    public void setSpecifiedCancellationEvent(CancellationEventType value) {
        this.specifiedCancellationEvent = value;
    }

    /**
     * Gets the value of the specifiedOSIInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedOSIInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedOSIInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSIInstructionsType }
     * 
     * 
     */
    public List<OSIInstructionsType> getSpecifiedOSIInstructions() {
        if (specifiedOSIInstructions == null) {
            specifiedOSIInstructions = new ArrayList<OSIInstructionsType>();
        }
        return this.specifiedOSIInstructions;
    }

}
