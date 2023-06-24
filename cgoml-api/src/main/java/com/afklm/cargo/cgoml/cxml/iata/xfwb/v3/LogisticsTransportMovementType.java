//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.TransportModeCodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour LogisticsTransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsTransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StageCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ModeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}TransportModeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="UsedLogisticsTransportMeans" type="{iata:datamodel:3}LogisticsTransportMeansType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalEvent" type="{iata:datamodel:3}ArrivalEventType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureEvent" type="{iata:datamodel:3}DepartureEventType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsTransportMovementType", propOrder = {
    "stageCode",
    "modeCode",
    "mode",
    "id",
    "sequenceNumeric",
    "usedLogisticsTransportMeans",
    "arrivalEvent",
    "departureEvent"
})
public class LogisticsTransportMovementType {

    @XmlElement(name = "StageCode", required = true)
    protected CodeType stageCode;
    @XmlElement(name = "ModeCode")
    protected TransportModeCodeType modeCode;
    @XmlElement(name = "Mode")
    protected TextType mode;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "SequenceNumeric")
    protected BigDecimal sequenceNumeric;
    @XmlElement(name = "UsedLogisticsTransportMeans")
    protected LogisticsTransportMeansType usedLogisticsTransportMeans;
    @XmlElement(name = "ArrivalEvent")
    protected ArrivalEventType arrivalEvent;
    @XmlElement(name = "DepartureEvent")
    protected DepartureEventType departureEvent;

    /**
     * Obtient la valeur de la propriété stageCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStageCode() {
        return stageCode;
    }

    /**
     * Définit la valeur de la propriété stageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStageCode(CodeType value) {
        this.stageCode = value;
    }

    /**
     * Obtient la valeur de la propriété modeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportModeCodeType }
     *     
     */
    public TransportModeCodeType getModeCode() {
        return modeCode;
    }

    /**
     * Définit la valeur de la propriété modeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModeCodeType }
     *     
     */
    public void setModeCode(TransportModeCodeType value) {
        this.modeCode = value;
    }

    /**
     * Obtient la valeur de la propriété mode.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMode() {
        return mode;
    }

    /**
     * Définit la valeur de la propriété mode.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMode(TextType value) {
        this.mode = value;
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
     * Obtient la valeur de la propriété sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Définit la valeur de la propriété sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequenceNumeric(BigDecimal value) {
        this.sequenceNumeric = value;
    }

    /**
     * Obtient la valeur de la propriété usedLogisticsTransportMeans.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsTransportMeansType }
     *     
     */
    public LogisticsTransportMeansType getUsedLogisticsTransportMeans() {
        return usedLogisticsTransportMeans;
    }

    /**
     * Définit la valeur de la propriété usedLogisticsTransportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsTransportMeansType }
     *     
     */
    public void setUsedLogisticsTransportMeans(LogisticsTransportMeansType value) {
        this.usedLogisticsTransportMeans = value;
    }

    /**
     * Obtient la valeur de la propriété arrivalEvent.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalEventType }
     *     
     */
    public ArrivalEventType getArrivalEvent() {
        return arrivalEvent;
    }

    /**
     * Définit la valeur de la propriété arrivalEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalEventType }
     *     
     */
    public void setArrivalEvent(ArrivalEventType value) {
        this.arrivalEvent = value;
    }

    /**
     * Obtient la valeur de la propriété departureEvent.
     * 
     * @return
     *     possible object is
     *     {@link DepartureEventType }
     *     
     */
    public DepartureEventType getDepartureEvent() {
        return departureEvent;
    }

    /**
     * Définit la valeur de la propriété departureEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureEventType }
     *     
     */
    public void setDepartureEvent(DepartureEventType value) {
        this.departureEvent = value;
    }

}
