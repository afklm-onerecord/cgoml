//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

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
 * <p>Classe Java pour SpecifiedTransportMovementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedTransportMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}NumericType"/&gt;
 *         &lt;element name="StageCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="ModeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}TransportModeCodeType"/&gt;
 *         &lt;element name="Mode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="UsedLogisticsTransportMeans" type="{iata:datamodel:3}LogisticsTransportMeansType" minOccurs="0"/&gt;
 *         &lt;element name="FirstRegistrationID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SecondRegistrationID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="MasterResponsibleTransportPerson" type="{iata:datamodel:3}TransportPersonType" minOccurs="0"/&gt;
 *         &lt;element name="SupplementalTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureEvent" type="{iata:datamodel:3}DepartureEventType"/&gt;
 *         &lt;element name="CargoLoadIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="MailLoadIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="SealConformanceIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="SealCheckIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="SealExemptionIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IndicatorType"/&gt;
 *         &lt;element name="SealIssuerName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="SealID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryRoute" type="{iata:datamodel:3}ItineraryRouteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecifiedTransportMovementType", propOrder = {
    "sequenceNumeric",
    "stageCode",
    "modeCode",
    "mode",
    "id",
    "usedLogisticsTransportMeans",
    "firstRegistrationID",
    "secondRegistrationID",
    "masterResponsibleTransportPerson",
    "supplementalTypeCode",
    "departureEvent",
    "cargoLoadIndicator",
    "mailLoadIndicator",
    "sealConformanceIndicator",
    "sealCheckIndicator",
    "sealExemptionIndicator",
    "sealIssuerName",
    "sealID",
    "itineraryRoute"
})
public class SpecifiedTransportMovementType {

    @XmlElement(name = "SequenceNumeric", required = true)
    protected BigDecimal sequenceNumeric;
    @XmlElement(name = "StageCode", required = true)
    protected CodeType stageCode;
    @XmlElement(name = "ModeCode", required = true)
    protected TransportModeCodeType modeCode;
    @XmlElement(name = "Mode")
    protected TextType mode;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "UsedLogisticsTransportMeans")
    protected LogisticsTransportMeansType usedLogisticsTransportMeans;
    @XmlElement(name = "FirstRegistrationID")
    protected IDType firstRegistrationID;
    @XmlElement(name = "SecondRegistrationID")
    protected IDType secondRegistrationID;
    @XmlElement(name = "MasterResponsibleTransportPerson")
    protected TransportPersonType masterResponsibleTransportPerson;
    @XmlElement(name = "SupplementalTypeCode")
    protected CodeType supplementalTypeCode;
    @XmlElement(name = "DepartureEvent", required = true)
    protected DepartureEventType departureEvent;
    @XmlElement(name = "CargoLoadIndicator")
    protected boolean cargoLoadIndicator;
    @XmlElement(name = "MailLoadIndicator")
    protected Boolean mailLoadIndicator;
    @XmlElement(name = "SealConformanceIndicator")
    protected boolean sealConformanceIndicator;
    @XmlElement(name = "SealCheckIndicator")
    protected boolean sealCheckIndicator;
    @XmlElement(name = "SealExemptionIndicator")
    protected boolean sealExemptionIndicator;
    @XmlElement(name = "SealIssuerName")
    protected TextType sealIssuerName;
    @XmlElement(name = "SealID")
    protected IDType sealID;
    @XmlElement(name = "ItineraryRoute")
    protected ItineraryRouteType itineraryRoute;

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
     * Obtient la valeur de la propriété firstRegistrationID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getFirstRegistrationID() {
        return firstRegistrationID;
    }

    /**
     * Définit la valeur de la propriété firstRegistrationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setFirstRegistrationID(IDType value) {
        this.firstRegistrationID = value;
    }

    /**
     * Obtient la valeur de la propriété secondRegistrationID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSecondRegistrationID() {
        return secondRegistrationID;
    }

    /**
     * Définit la valeur de la propriété secondRegistrationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSecondRegistrationID(IDType value) {
        this.secondRegistrationID = value;
    }

    /**
     * Obtient la valeur de la propriété masterResponsibleTransportPerson.
     * 
     * @return
     *     possible object is
     *     {@link TransportPersonType }
     *     
     */
    public TransportPersonType getMasterResponsibleTransportPerson() {
        return masterResponsibleTransportPerson;
    }

    /**
     * Définit la valeur de la propriété masterResponsibleTransportPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportPersonType }
     *     
     */
    public void setMasterResponsibleTransportPerson(TransportPersonType value) {
        this.masterResponsibleTransportPerson = value;
    }

    /**
     * Obtient la valeur de la propriété supplementalTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSupplementalTypeCode() {
        return supplementalTypeCode;
    }

    /**
     * Définit la valeur de la propriété supplementalTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSupplementalTypeCode(CodeType value) {
        this.supplementalTypeCode = value;
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

    /**
     * Obtient la valeur de la propriété cargoLoadIndicator.
     * 
     */
    public boolean isCargoLoadIndicator() {
        return cargoLoadIndicator;
    }

    /**
     * Définit la valeur de la propriété cargoLoadIndicator.
     * 
     */
    public void setCargoLoadIndicator(boolean value) {
        this.cargoLoadIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété mailLoadIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMailLoadIndicator() {
        return mailLoadIndicator;
    }

    /**
     * Définit la valeur de la propriété mailLoadIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailLoadIndicator(Boolean value) {
        this.mailLoadIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété sealConformanceIndicator.
     * 
     */
    public boolean isSealConformanceIndicator() {
        return sealConformanceIndicator;
    }

    /**
     * Définit la valeur de la propriété sealConformanceIndicator.
     * 
     */
    public void setSealConformanceIndicator(boolean value) {
        this.sealConformanceIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété sealCheckIndicator.
     * 
     */
    public boolean isSealCheckIndicator() {
        return sealCheckIndicator;
    }

    /**
     * Définit la valeur de la propriété sealCheckIndicator.
     * 
     */
    public void setSealCheckIndicator(boolean value) {
        this.sealCheckIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété sealExemptionIndicator.
     * 
     */
    public boolean isSealExemptionIndicator() {
        return sealExemptionIndicator;
    }

    /**
     * Définit la valeur de la propriété sealExemptionIndicator.
     * 
     */
    public void setSealExemptionIndicator(boolean value) {
        this.sealExemptionIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété sealIssuerName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSealIssuerName() {
        return sealIssuerName;
    }

    /**
     * Définit la valeur de la propriété sealIssuerName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSealIssuerName(TextType value) {
        this.sealIssuerName = value;
    }

    /**
     * Obtient la valeur de la propriété sealID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSealID() {
        return sealID;
    }

    /**
     * Définit la valeur de la propriété sealID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSealID(IDType value) {
        this.sealID = value;
    }

    /**
     * Obtient la valeur de la propriété itineraryRoute.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryRouteType }
     *     
     */
    public ItineraryRouteType getItineraryRoute() {
        return itineraryRoute;
    }

    /**
     * Définit la valeur de la propriété itineraryRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryRouteType }
     *     
     */
    public void setItineraryRoute(ItineraryRouteType value) {
        this.itineraryRoute = value;
    }

}
