//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.afklm.cargo.cgoml.cxml.iata.common.MessageHeaderDocumentType;
import com.afklm.cargo.cgoml.cxml.iata.common.RecipientPartyType;
import com.afklm.cargo.cgoml.cxml.iata.common.SenderPartyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.afklm.cargo.schemas.iata.xtmv.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransportMovement_QNAME = new QName("iata:transportmovement:1", "TransportMovement");
    private final static QName _ApprovalEvent_QNAME = new QName("iata:datamodel:3", "ApprovalEvent");
    private final static QName _CancellationEvent_QNAME = new QName("iata:datamodel:3", "CancellationEvent");
    private final static QName _DelayPeriod_QNAME = new QName("iata:datamodel:3", "DelayPeriod");
    private final static QName _DelayEvent_QNAME = new QName("iata:datamodel:3", "DelayEvent");
    private final static QName _DepartureEvent_QNAME = new QName("iata:datamodel:3", "DepartureEvent");
    private final static QName _DepartureLocation_QNAME = new QName("iata:datamodel:3", "DepartureLocation");
    private final static QName _EndLocation_QNAME = new QName("iata:datamodel:3", "EndLocation");
    private final static QName _EntryEvent_QNAME = new QName("iata:datamodel:3", "EntryEvent");
    private final static QName _FirstArrivalCountry_QNAME = new QName("iata:datamodel:3", "FirstArrivalCountry");
    private final static QName _ItineraryRoute_QNAME = new QName("iata:datamodel:3", "ItineraryRoute");
    private final static QName _LogisticsTransportMeans_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMeans");
    private final static QName _MessageHeaderDocument_QNAME = new QName("iata:datamodel:3", "MessageHeaderDocument");
    private final static QName _MovementLocation_QNAME = new QName("iata:datamodel:3", "MovementLocation");
    private final static QName _OperatorParty_QNAME = new QName("iata:datamodel:3", "OperatorParty");
    private final static QName _OSIInstructions_QNAME = new QName("iata:datamodel:3", "OSIInstructions");
    private final static QName _RecipientParty_QNAME = new QName("iata:datamodel:3", "RecipientParty");
    private final static QName _RegistrationCountry_QNAME = new QName("iata:datamodel:3", "RegistrationCountry");
    private final static QName _SenderParty_QNAME = new QName("iata:datamodel:3", "SenderParty");
    private final static QName _SpecifiedTransportMovement_QNAME = new QName("iata:datamodel:3", "SpecifiedTransportMovement");
    private final static QName _StartLocation_QNAME = new QName("iata:datamodel:3", "StartLocation");
    private final static QName _TransportMovementHeader_QNAME = new QName("iata:datamodel:3", "TransportMovementHeader");
    private final static QName _TransportMovementEvent_QNAME = new QName("iata:datamodel:3", "TransportMovementEvent");
    private final static QName _TransportPerson_QNAME = new QName("iata:datamodel:3", "TransportPerson");
    private final static QName _VerificationEvent_QNAME = new QName("iata:datamodel:3", "VerificationEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afklm.cargo.schemas.iata.xtmv.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransportMovementType }
     * 
     */
    public TransportMovementType createTransportMovementType() {
        return new TransportMovementType();
    }

    /**
     * Create an instance of {@link ApprovalEventType }
     * 
     */
    public ApprovalEventType createApprovalEventType() {
        return new ApprovalEventType();
    }

    /**
     * Create an instance of {@link CancellationEventType }
     * 
     */
    public CancellationEventType createCancellationEventType() {
        return new CancellationEventType();
    }

    /**
     * Create an instance of {@link DelayPeriodType }
     * 
     */
    public DelayPeriodType createDelayPeriodType() {
        return new DelayPeriodType();
    }

    /**
     * Create an instance of {@link DelayEventType }
     * 
     */
    public DelayEventType createDelayEventType() {
        return new DelayEventType();
    }

    /**
     * Create an instance of {@link DepartureEventType }
     * 
     */
    public DepartureEventType createDepartureEventType() {
        return new DepartureEventType();
    }

    /**
     * Create an instance of {@link DepartureLocationType }
     * 
     */
    public DepartureLocationType createDepartureLocationType() {
        return new DepartureLocationType();
    }

    /**
     * Create an instance of {@link EndLocationType }
     * 
     */
    public EndLocationType createEndLocationType() {
        return new EndLocationType();
    }

    /**
     * Create an instance of {@link EntryEventType }
     * 
     */
    public EntryEventType createEntryEventType() {
        return new EntryEventType();
    }

    /**
     * Create an instance of {@link FirstArrivalCountryType }
     * 
     */
    public FirstArrivalCountryType createFirstArrivalCountryType() {
        return new FirstArrivalCountryType();
    }

    /**
     * Create an instance of {@link ItineraryRouteType }
     * 
     */
    public ItineraryRouteType createItineraryRouteType() {
        return new ItineraryRouteType();
    }

    /**
     * Create an instance of {@link LogisticsTransportMeansType }
     * 
     */
    public LogisticsTransportMeansType createLogisticsTransportMeansType() {
        return new LogisticsTransportMeansType();
    }

    /**
     * Create an instance of {@link MovementLocationType }
     * 
     */
    public MovementLocationType createMovementLocationType() {
        return new MovementLocationType();
    }

    /**
     * Create an instance of {@link OperatorPartyType }
     * 
     */
    public OperatorPartyType createOperatorPartyType() {
        return new OperatorPartyType();
    }

    /**
     * Create an instance of {@link OSIInstructionsType }
     * 
     */
    public OSIInstructionsType createOSIInstructionsType() {
        return new OSIInstructionsType();
    }

    /**
     * Create an instance of {@link RegistrationCountryType }
     * 
     */
    public RegistrationCountryType createRegistrationCountryType() {
        return new RegistrationCountryType();
    }

    /**
     * Create an instance of {@link SpecifiedTransportMovementType }
     * 
     */
    public SpecifiedTransportMovementType createSpecifiedTransportMovementType() {
        return new SpecifiedTransportMovementType();
    }

    /**
     * Create an instance of {@link StartLocationType }
     * 
     */
    public StartLocationType createStartLocationType() {
        return new StartLocationType();
    }

    /**
     * Create an instance of {@link TransportMovementHeaderType }
     * 
     */
    public TransportMovementHeaderType createTransportMovementHeaderType() {
        return new TransportMovementHeaderType();
    }

    /**
     * Create an instance of {@link TransportMovementEventType }
     * 
     */
    public TransportMovementEventType createTransportMovementEventType() {
        return new TransportMovementEventType();
    }

    /**
     * Create an instance of {@link TransportPersonType }
     * 
     */
    public TransportPersonType createTransportPersonType() {
        return new TransportPersonType();
    }

    /**
     * Create an instance of {@link VerificationEventType }
     * 
     */
    public VerificationEventType createVerificationEventType() {
        return new VerificationEventType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMovementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:transportmovement:1", name = "TransportMovement")
    public JAXBElement<TransportMovementType> createTransportMovement(TransportMovementType value) {
        return new JAXBElement<TransportMovementType>(_TransportMovement_QNAME, TransportMovementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ApprovalEvent")
    public JAXBElement<ApprovalEventType> createApprovalEvent(ApprovalEventType value) {
        return new JAXBElement<ApprovalEventType>(_ApprovalEvent_QNAME, ApprovalEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "CancellationEvent")
    public JAXBElement<CancellationEventType> createCancellationEvent(CancellationEventType value) {
        return new JAXBElement<CancellationEventType>(_CancellationEvent_QNAME, CancellationEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DelayPeriod")
    public JAXBElement<DelayPeriodType> createDelayPeriod(DelayPeriodType value) {
        return new JAXBElement<DelayPeriodType>(_DelayPeriod_QNAME, DelayPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DelayEvent")
    public JAXBElement<DelayEventType> createDelayEvent(DelayEventType value) {
        return new JAXBElement<DelayEventType>(_DelayEvent_QNAME, DelayEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DepartureEvent")
    public JAXBElement<DepartureEventType> createDepartureEvent(DepartureEventType value) {
        return new JAXBElement<DepartureEventType>(_DepartureEvent_QNAME, DepartureEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DepartureLocation")
    public JAXBElement<DepartureLocationType> createDepartureLocation(DepartureLocationType value) {
        return new JAXBElement<DepartureLocationType>(_DepartureLocation_QNAME, DepartureLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "EndLocation")
    public JAXBElement<EndLocationType> createEndLocation(EndLocationType value) {
        return new JAXBElement<EndLocationType>(_EndLocation_QNAME, EndLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "EntryEvent")
    public JAXBElement<EntryEventType> createEntryEvent(EntryEventType value) {
        return new JAXBElement<EntryEventType>(_EntryEvent_QNAME, EntryEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstArrivalCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FirstArrivalCountry")
    public JAXBElement<FirstArrivalCountryType> createFirstArrivalCountry(FirstArrivalCountryType value) {
        return new JAXBElement<FirstArrivalCountryType>(_FirstArrivalCountry_QNAME, FirstArrivalCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryRouteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ItineraryRoute")
    public JAXBElement<ItineraryRouteType> createItineraryRoute(ItineraryRouteType value) {
        return new JAXBElement<ItineraryRouteType>(_ItineraryRoute_QNAME, ItineraryRouteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsTransportMeansType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsTransportMeans")
    public JAXBElement<LogisticsTransportMeansType> createLogisticsTransportMeans(LogisticsTransportMeansType value) {
        return new JAXBElement<LogisticsTransportMeansType>(_LogisticsTransportMeans_QNAME, LogisticsTransportMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageHeaderDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "MessageHeaderDocument")
    public JAXBElement<MessageHeaderDocumentType> createMessageHeaderDocument(MessageHeaderDocumentType value) {
        return new JAXBElement<MessageHeaderDocumentType>(_MessageHeaderDocument_QNAME, MessageHeaderDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovementLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "MovementLocation")
    public JAXBElement<MovementLocationType> createMovementLocation(MovementLocationType value) {
        return new JAXBElement<MovementLocationType>(_MovementLocation_QNAME, MovementLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "OperatorParty")
    public JAXBElement<OperatorPartyType> createOperatorParty(OperatorPartyType value) {
        return new JAXBElement<OperatorPartyType>(_OperatorParty_QNAME, OperatorPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OSIInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "OSIInstructions")
    public JAXBElement<OSIInstructionsType> createOSIInstructions(OSIInstructionsType value) {
        return new JAXBElement<OSIInstructionsType>(_OSIInstructions_QNAME, OSIInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipientPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "RecipientParty")
    public JAXBElement<RecipientPartyType> createRecipientParty(RecipientPartyType value) {
        return new JAXBElement<RecipientPartyType>(_RecipientParty_QNAME, RecipientPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "RegistrationCountry")
    public JAXBElement<RegistrationCountryType> createRegistrationCountry(RegistrationCountryType value) {
        return new JAXBElement<RegistrationCountryType>(_RegistrationCountry_QNAME, RegistrationCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SenderParty")
    public JAXBElement<SenderPartyType> createSenderParty(SenderPartyType value) {
        return new JAXBElement<SenderPartyType>(_SenderParty_QNAME, SenderPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedTransportMovementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SpecifiedTransportMovement")
    public JAXBElement<SpecifiedTransportMovementType> createSpecifiedTransportMovement(SpecifiedTransportMovementType value) {
        return new JAXBElement<SpecifiedTransportMovementType>(_SpecifiedTransportMovement_QNAME, SpecifiedTransportMovementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "StartLocation")
    public JAXBElement<StartLocationType> createStartLocation(StartLocationType value) {
        return new JAXBElement<StartLocationType>(_StartLocation_QNAME, StartLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMovementHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TransportMovementHeader")
    public JAXBElement<TransportMovementHeaderType> createTransportMovementHeader(TransportMovementHeaderType value) {
        return new JAXBElement<TransportMovementHeaderType>(_TransportMovementHeader_QNAME, TransportMovementHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMovementEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TransportMovementEvent")
    public JAXBElement<TransportMovementEventType> createTransportMovementEvent(TransportMovementEventType value) {
        return new JAXBElement<TransportMovementEventType>(_TransportMovementEvent_QNAME, TransportMovementEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TransportPerson")
    public JAXBElement<TransportPersonType> createTransportPerson(TransportPersonType value) {
        return new JAXBElement<TransportPersonType>(_TransportPerson_QNAME, TransportPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "VerificationEvent")
    public JAXBElement<VerificationEventType> createVerificationEvent(VerificationEventType value) {
        return new JAXBElement<VerificationEventType>(_VerificationEvent_QNAME, VerificationEventType.class, null, value);
    }

}
