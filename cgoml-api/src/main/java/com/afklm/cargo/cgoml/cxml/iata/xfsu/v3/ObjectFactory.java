//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:55 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfsu.v3;

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
 * generated in the com.afklm.cargo.schemas.iata.xfsu.v3 package. 
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

    private final static QName _StatusMessage_QNAME = new QName("iata:statusmessage:1", "StatusMessage");
    private final static QName _ArrivalEvent_QNAME = new QName("iata:datamodel:3", "ArrivalEvent");
    private final static QName _BusinessHeaderDocument_QNAME = new QName("iata:datamodel:3", "BusinessHeaderDocument");
    private final static QName _CarrierParty_QNAME = new QName("iata:datamodel:3", "CarrierParty");
    private final static QName _ConsignmentCustomsProcedure_QNAME = new QName("iata:datamodel:3", "ConsignmentCustomsProcedure");
    private final static QName _CustomsNote_QNAME = new QName("iata:datamodel:3", "CustomsNote");
    private final static QName _DeliveryParty_QNAME = new QName("iata:datamodel:3", "DeliveryParty");
    private final static QName _DepartureEvent_QNAME = new QName("iata:datamodel:3", "DepartureEvent");
    private final static QName _FinalDestinationLocation_QNAME = new QName("iata:datamodel:3", "FinalDestinationLocation");
    private final static QName _HouseConsignment_QNAME = new QName("iata:datamodel:3", "HouseConsignment");
    private final static QName _LogisticsServiceCharge_QNAME = new QName("iata:datamodel:3", "LogisticsServiceCharge");
    private final static QName _LogisticsTransportMeans_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMeans");
    private final static QName _LogisticsTransportMovement_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMovement");
    private final static QName _ManifestDocument_QNAME = new QName("iata:datamodel:3", "ManifestDocument");
    private final static QName _MasterConsignment_QNAME = new QName("iata:datamodel:3", "MasterConsignment");
    private final static QName _MessageHeaderDocument_QNAME = new QName("iata:datamodel:3", "MessageHeaderDocument");
    private final static QName _NotifiedParty_QNAME = new QName("iata:datamodel:3", "NotifiedParty");
    private final static QName _OperatingParty_QNAME = new QName("iata:datamodel:3", "OperatingParty");
    private final static QName _OriginLocation_QNAME = new QName("iata:datamodel:3", "OriginLocation");
    private final static QName _OSIInstructions_QNAME = new QName("iata:datamodel:3", "OSIInstructions");
    private final static QName _ReceivedFromParty_QNAME = new QName("iata:datamodel:3", "ReceivedFromParty");
    private final static QName _RecipientParty_QNAME = new QName("iata:datamodel:3", "RecipientParty");
    private final static QName _ReportedStatus_QNAME = new QName("iata:datamodel:3", "ReportedStatus");
    private final static QName _RoutingLocation_QNAME = new QName("iata:datamodel:3", "RoutingLocation");
    private final static QName _ScheduledArrivalEvent_QNAME = new QName("iata:datamodel:3", "ScheduledArrivalEvent");
    private final static QName _SenderParty_QNAME = new QName("iata:datamodel:3", "SenderParty");
    private final static QName _SpecifiedEvent_QNAME = new QName("iata:datamodel:3", "SpecifiedEvent");
    private final static QName _SpecifiedLocation_QNAME = new QName("iata:datamodel:3", "SpecifiedLocation");
    private final static QName _StatusConsignment_QNAME = new QName("iata:datamodel:3", "StatusConsignment");
    private final static QName _TransferredFromParty_QNAME = new QName("iata:datamodel:3", "TransferredFromParty");
    private final static QName _TransportContractDocument_QNAME = new QName("iata:datamodel:3", "TransportContractDocument");
    private final static QName _UnitLoadTransportEquipment_QNAME = new QName("iata:datamodel:3", "UnitLoadTransportEquipment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afklm.cargo.schemas.iata.xfsu.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusMessageType }
     * 
     */
    public StatusMessageType createStatusMessageType() {
        return new StatusMessageType();
    }

    /**
     * Create an instance of {@link ArrivalEventType }
     * 
     */
    public ArrivalEventType createArrivalEventType() {
        return new ArrivalEventType();
    }

    /**
     * Create an instance of {@link BusinessHeaderDocumentType }
     * 
     */
    public BusinessHeaderDocumentType createBusinessHeaderDocumentType() {
        return new BusinessHeaderDocumentType();
    }

    /**
     * Create an instance of {@link CarrierPartyType }
     * 
     */
    public CarrierPartyType createCarrierPartyType() {
        return new CarrierPartyType();
    }

    /**
     * Create an instance of {@link ConsignmentCustomsProcedureType }
     * 
     */
    public ConsignmentCustomsProcedureType createConsignmentCustomsProcedureType() {
        return new ConsignmentCustomsProcedureType();
    }

    /**
     * Create an instance of {@link CustomsNoteType }
     * 
     */
    public CustomsNoteType createCustomsNoteType() {
        return new CustomsNoteType();
    }

    /**
     * Create an instance of {@link DeliveryPartyType }
     * 
     */
    public DeliveryPartyType createDeliveryPartyType() {
        return new DeliveryPartyType();
    }

    /**
     * Create an instance of {@link DepartureEventType }
     * 
     */
    public DepartureEventType createDepartureEventType() {
        return new DepartureEventType();
    }

    /**
     * Create an instance of {@link FinalDestinationLocationType }
     * 
     */
    public FinalDestinationLocationType createFinalDestinationLocationType() {
        return new FinalDestinationLocationType();
    }

    /**
     * Create an instance of {@link HouseConsignmentType }
     * 
     */
    public HouseConsignmentType createHouseConsignmentType() {
        return new HouseConsignmentType();
    }

    /**
     * Create an instance of {@link LogisticsServiceChargeType }
     * 
     */
    public LogisticsServiceChargeType createLogisticsServiceChargeType() {
        return new LogisticsServiceChargeType();
    }

    /**
     * Create an instance of {@link LogisticsTransportMeansType }
     * 
     */
    public LogisticsTransportMeansType createLogisticsTransportMeansType() {
        return new LogisticsTransportMeansType();
    }

    /**
     * Create an instance of {@link LogisticsTransportMovementType }
     * 
     */
    public LogisticsTransportMovementType createLogisticsTransportMovementType() {
        return new LogisticsTransportMovementType();
    }

    /**
     * Create an instance of {@link ManifestDocumentType }
     * 
     */
    public ManifestDocumentType createManifestDocumentType() {
        return new ManifestDocumentType();
    }

    /**
     * Create an instance of {@link MasterConsignmentType }
     * 
     */
    public MasterConsignmentType createMasterConsignmentType() {
        return new MasterConsignmentType();
    }

    /**
     * Create an instance of {@link NotifiedPartyType }
     * 
     */
    public NotifiedPartyType createNotifiedPartyType() {
        return new NotifiedPartyType();
    }

    /**
     * Create an instance of {@link OperatingPartyType }
     * 
     */
    public OperatingPartyType createOperatingPartyType() {
        return new OperatingPartyType();
    }

    /**
     * Create an instance of {@link OriginLocationType }
     * 
     */
    public OriginLocationType createOriginLocationType() {
        return new OriginLocationType();
    }

    /**
     * Create an instance of {@link OSIInstructionsType }
     * 
     */
    public OSIInstructionsType createOSIInstructionsType() {
        return new OSIInstructionsType();
    }

    /**
     * Create an instance of {@link ReceivedFromPartyType }
     * 
     */
    public ReceivedFromPartyType createReceivedFromPartyType() {
        return new ReceivedFromPartyType();
    }

    /**
     * Create an instance of {@link ReportedStatusType }
     * 
     */
    public ReportedStatusType createReportedStatusType() {
        return new ReportedStatusType();
    }

    /**
     * Create an instance of {@link RoutingLocationType }
     * 
     */
    public RoutingLocationType createRoutingLocationType() {
        return new RoutingLocationType();
    }

    /**
     * Create an instance of {@link ScheduledArrivalEventType }
     * 
     */
    public ScheduledArrivalEventType createScheduledArrivalEventType() {
        return new ScheduledArrivalEventType();
    }

    /**
     * Create an instance of {@link SpecifiedEventType }
     * 
     */
    public SpecifiedEventType createSpecifiedEventType() {
        return new SpecifiedEventType();
    }

    /**
     * Create an instance of {@link SpecifiedLocationType }
     * 
     */
    public SpecifiedLocationType createSpecifiedLocationType() {
        return new SpecifiedLocationType();
    }

    /**
     * Create an instance of {@link StatusConsignmentType }
     * 
     */
    public StatusConsignmentType createStatusConsignmentType() {
        return new StatusConsignmentType();
    }

    /**
     * Create an instance of {@link TransferredFromPartyType }
     * 
     */
    public TransferredFromPartyType createTransferredFromPartyType() {
        return new TransferredFromPartyType();
    }

    /**
     * Create an instance of {@link TransportContractDocumentType }
     * 
     */
    public TransportContractDocumentType createTransportContractDocumentType() {
        return new TransportContractDocumentType();
    }

    /**
     * Create an instance of {@link UnitLoadTransportEquipmentType }
     * 
     */
    public UnitLoadTransportEquipmentType createUnitLoadTransportEquipmentType() {
        return new UnitLoadTransportEquipmentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:statusmessage:1", name = "StatusMessage")
    public JAXBElement<StatusMessageType> createStatusMessage(StatusMessageType value) {
        return new JAXBElement<StatusMessageType>(_StatusMessage_QNAME, StatusMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ArrivalEvent")
    public JAXBElement<ArrivalEventType> createArrivalEvent(ArrivalEventType value) {
        return new JAXBElement<ArrivalEventType>(_ArrivalEvent_QNAME, ArrivalEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessHeaderDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "BusinessHeaderDocument")
    public JAXBElement<BusinessHeaderDocumentType> createBusinessHeaderDocument(BusinessHeaderDocumentType value) {
        return new JAXBElement<BusinessHeaderDocumentType>(_BusinessHeaderDocument_QNAME, BusinessHeaderDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "CarrierParty")
    public JAXBElement<CarrierPartyType> createCarrierParty(CarrierPartyType value) {
        return new JAXBElement<CarrierPartyType>(_CarrierParty_QNAME, CarrierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentCustomsProcedureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ConsignmentCustomsProcedure")
    public JAXBElement<ConsignmentCustomsProcedureType> createConsignmentCustomsProcedure(ConsignmentCustomsProcedureType value) {
        return new JAXBElement<ConsignmentCustomsProcedureType>(_ConsignmentCustomsProcedure_QNAME, ConsignmentCustomsProcedureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsNoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "CustomsNote")
    public JAXBElement<CustomsNoteType> createCustomsNote(CustomsNoteType value) {
        return new JAXBElement<CustomsNoteType>(_CustomsNote_QNAME, CustomsNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DeliveryParty")
    public JAXBElement<DeliveryPartyType> createDeliveryParty(DeliveryPartyType value) {
        return new JAXBElement<DeliveryPartyType>(_DeliveryParty_QNAME, DeliveryPartyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalDestinationLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FinalDestinationLocation")
    public JAXBElement<FinalDestinationLocationType> createFinalDestinationLocation(FinalDestinationLocationType value) {
        return new JAXBElement<FinalDestinationLocationType>(_FinalDestinationLocation_QNAME, FinalDestinationLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "HouseConsignment")
    public JAXBElement<HouseConsignmentType> createHouseConsignment(HouseConsignmentType value) {
        return new JAXBElement<HouseConsignmentType>(_HouseConsignment_QNAME, HouseConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsServiceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsServiceCharge")
    public JAXBElement<LogisticsServiceChargeType> createLogisticsServiceCharge(LogisticsServiceChargeType value) {
        return new JAXBElement<LogisticsServiceChargeType>(_LogisticsServiceCharge_QNAME, LogisticsServiceChargeType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsTransportMovementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsTransportMovement")
    public JAXBElement<LogisticsTransportMovementType> createLogisticsTransportMovement(LogisticsTransportMovementType value) {
        return new JAXBElement<LogisticsTransportMovementType>(_LogisticsTransportMovement_QNAME, LogisticsTransportMovementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ManifestDocument")
    public JAXBElement<ManifestDocumentType> createManifestDocument(ManifestDocumentType value) {
        return new JAXBElement<ManifestDocumentType>(_ManifestDocument_QNAME, ManifestDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "MasterConsignment")
    public JAXBElement<MasterConsignmentType> createMasterConsignment(MasterConsignmentType value) {
        return new JAXBElement<MasterConsignmentType>(_MasterConsignment_QNAME, MasterConsignmentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifiedPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "NotifiedParty")
    public JAXBElement<NotifiedPartyType> createNotifiedParty(NotifiedPartyType value) {
        return new JAXBElement<NotifiedPartyType>(_NotifiedParty_QNAME, NotifiedPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "OperatingParty")
    public JAXBElement<OperatingPartyType> createOperatingParty(OperatingPartyType value) {
        return new JAXBElement<OperatingPartyType>(_OperatingParty_QNAME, OperatingPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "OriginLocation")
    public JAXBElement<OriginLocationType> createOriginLocation(OriginLocationType value) {
        return new JAXBElement<OriginLocationType>(_OriginLocation_QNAME, OriginLocationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedFromPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ReceivedFromParty")
    public JAXBElement<ReceivedFromPartyType> createReceivedFromParty(ReceivedFromPartyType value) {
        return new JAXBElement<ReceivedFromPartyType>(_ReceivedFromParty_QNAME, ReceivedFromPartyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportedStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ReportedStatus")
    public JAXBElement<ReportedStatusType> createReportedStatus(ReportedStatusType value) {
        return new JAXBElement<ReportedStatusType>(_ReportedStatus_QNAME, ReportedStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "RoutingLocation")
    public JAXBElement<RoutingLocationType> createRoutingLocation(RoutingLocationType value) {
        return new JAXBElement<RoutingLocationType>(_RoutingLocation_QNAME, RoutingLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledArrivalEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ScheduledArrivalEvent")
    public JAXBElement<ScheduledArrivalEventType> createScheduledArrivalEvent(ScheduledArrivalEventType value) {
        return new JAXBElement<ScheduledArrivalEventType>(_ScheduledArrivalEvent_QNAME, ScheduledArrivalEventType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SpecifiedEvent")
    public JAXBElement<SpecifiedEventType> createSpecifiedEvent(SpecifiedEventType value) {
        return new JAXBElement<SpecifiedEventType>(_SpecifiedEvent_QNAME, SpecifiedEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SpecifiedLocation")
    public JAXBElement<SpecifiedLocationType> createSpecifiedLocation(SpecifiedLocationType value) {
        return new JAXBElement<SpecifiedLocationType>(_SpecifiedLocation_QNAME, SpecifiedLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "StatusConsignment")
    public JAXBElement<StatusConsignmentType> createStatusConsignment(StatusConsignmentType value) {
        return new JAXBElement<StatusConsignmentType>(_StatusConsignment_QNAME, StatusConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferredFromPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TransferredFromParty")
    public JAXBElement<TransferredFromPartyType> createTransferredFromParty(TransferredFromPartyType value) {
        return new JAXBElement<TransferredFromPartyType>(_TransferredFromParty_QNAME, TransferredFromPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportContractDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TransportContractDocument")
    public JAXBElement<TransportContractDocumentType> createTransportContractDocument(TransportContractDocumentType value) {
        return new JAXBElement<TransportContractDocumentType>(_TransportContractDocument_QNAME, TransportContractDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitLoadTransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "UnitLoadTransportEquipment")
    public JAXBElement<UnitLoadTransportEquipmentType> createUnitLoadTransportEquipment(UnitLoadTransportEquipmentType value) {
        return new JAXBElement<UnitLoadTransportEquipmentType>(_UnitLoadTransportEquipment_QNAME, UnitLoadTransportEquipmentType.class, null, value);
    }

}
