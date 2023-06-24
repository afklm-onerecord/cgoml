//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:27 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfbl.v2;

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
 * generated in the com.afklm.cargo.schemas.iata.xfbl.v2 package. 
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

    private final static QName _FreightBookedList_QNAME = new QName("iata:freightbookedlist:1", "FreightBookedList");
    private final static QName _ArrivalEvent_QNAME = new QName("iata:datamodel:3", "ArrivalEvent");
    private final static QName _ArrivalLocation_QNAME = new QName("iata:datamodel:3", "ArrivalLocation");
    private final static QName _BusinessHeaderDocument_QNAME = new QName("iata:datamodel:3", "BusinessHeaderDocument");
    private final static QName _ConsignmentCustomsProcedure_QNAME = new QName("iata:datamodel:3", "ConsignmentCustomsProcedure");
    private final static QName _CustomsNote_QNAME = new QName("iata:datamodel:3", "CustomsNote");
    private final static QName _DepartureEvent_QNAME = new QName("iata:datamodel:3", "DepartureEvent");
    private final static QName _DepartureLocation_QNAME = new QName("iata:datamodel:3", "DepartureLocation");
    private final static QName _FinalDestinationLocation_QNAME = new QName("iata:datamodel:3", "FinalDestinationLocation");
    private final static QName _ForwardingAgentParty_QNAME = new QName("iata:datamodel:3", "ForwardingAgentParty");
    private final static QName _HandlingInstructions_QNAME = new QName("iata:datamodel:3", "HandlingInstructions");
    private final static QName _HeaderNote_QNAME = new QName("iata:datamodel:3", "HeaderNote");
    private final static QName _LoadingEvent_QNAME = new QName("iata:datamodel:3", "LoadingEvent");
    private final static QName _LoadingLocation_QNAME = new QName("iata:datamodel:3", "LoadingLocation");
    private final static QName _LogisticsPackage_QNAME = new QName("iata:datamodel:3", "LogisticsPackage");
    private final static QName _LogisticsTransportMeans_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMeans");
    private final static QName _LogisticsTransportMovement_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMovement");
    private final static QName _MasterConsignment_QNAME = new QName("iata:datamodel:3", "MasterConsignment");
    private final static QName _MessageHeaderDocument_QNAME = new QName("iata:datamodel:3", "MessageHeaderDocument");
    private final static QName _OperatingParty_QNAME = new QName("iata:datamodel:3", "OperatingParty");
    private final static QName _OriginLocation_QNAME = new QName("iata:datamodel:3", "OriginLocation");
    private final static QName _PreCarriageEvent_QNAME = new QName("iata:datamodel:3", "PreCarriageEvent");
    private final static QName _PreCarriageTransportMovement_QNAME = new QName("iata:datamodel:3", "PreCarriageTransportMovement");
    private final static QName _RecipientParty_QNAME = new QName("iata:datamodel:3", "RecipientParty");
    private final static QName _SenderParty_QNAME = new QName("iata:datamodel:3", "SenderParty");
    private final static QName _SpatialDimension_QNAME = new QName("iata:datamodel:3", "SpatialDimension");
    private final static QName _TransportCargo_QNAME = new QName("iata:datamodel:3", "TransportCargo");
    private final static QName _TransportContractDocument_QNAME = new QName("iata:datamodel:3", "TransportContractDocument");
    private final static QName _UnitLoadTransportEquipment_QNAME = new QName("iata:datamodel:3", "UnitLoadTransportEquipment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afklm.cargo.schemas.iata.xfbl.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FreightBookedListType }
     * 
     */
    public FreightBookedListType createFreightBookedListType() {
        return new FreightBookedListType();
    }

    /**
     * Create an instance of {@link ArrivalEventType }
     * 
     */
    public ArrivalEventType createArrivalEventType() {
        return new ArrivalEventType();
    }

    /**
     * Create an instance of {@link ArrivalLocationType }
     * 
     */
    public ArrivalLocationType createArrivalLocationType() {
        return new ArrivalLocationType();
    }

    /**
     * Create an instance of {@link BusinessHeaderDocumentType }
     * 
     */
    public BusinessHeaderDocumentType createBusinessHeaderDocumentType() {
        return new BusinessHeaderDocumentType();
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
     * Create an instance of {@link FinalDestinationLocationType }
     * 
     */
    public FinalDestinationLocationType createFinalDestinationLocationType() {
        return new FinalDestinationLocationType();
    }

    /**
     * Create an instance of {@link ForwardingAgentPartyType }
     * 
     */
    public ForwardingAgentPartyType createForwardingAgentPartyType() {
        return new ForwardingAgentPartyType();
    }

    /**
     * Create an instance of {@link HandlingInstructionsType }
     * 
     */
    public HandlingInstructionsType createHandlingInstructionsType() {
        return new HandlingInstructionsType();
    }

    /**
     * Create an instance of {@link HeaderNoteType }
     * 
     */
    public HeaderNoteType createHeaderNoteType() {
        return new HeaderNoteType();
    }

    /**
     * Create an instance of {@link LoadingEventType }
     * 
     */
    public LoadingEventType createLoadingEventType() {
        return new LoadingEventType();
    }

    /**
     * Create an instance of {@link LoadingLocationType }
     * 
     */
    public LoadingLocationType createLoadingLocationType() {
        return new LoadingLocationType();
    }

    /**
     * Create an instance of {@link LogisticsPackageType }
     * 
     */
    public LogisticsPackageType createLogisticsPackageType() {
        return new LogisticsPackageType();
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
     * Create an instance of {@link MasterConsignmentType }
     * 
     */
    public MasterConsignmentType createMasterConsignmentType() {
        return new MasterConsignmentType();
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
     * Create an instance of {@link PreCarriageTransportMovementType }
     * 
     */
    public PreCarriageTransportMovementType createPreCarriageTransportMovementType() {
        return new PreCarriageTransportMovementType();
    }

    /**
     * Create an instance of {@link SpatialDimensionType }
     * 
     */
    public SpatialDimensionType createSpatialDimensionType() {
        return new SpatialDimensionType();
    }

    /**
     * Create an instance of {@link TransportCargoType }
     * 
     */
    public TransportCargoType createTransportCargoType() {
        return new TransportCargoType();
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
     * Create an instance of {@link PreCarriageEventType }
     * 
     */
    public PreCarriageEventType createPreCarriageEventType() {
        return new PreCarriageEventType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBookedListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:freightbookedlist:1", name = "FreightBookedList")
    public JAXBElement<FreightBookedListType> createFreightBookedList(FreightBookedListType value) {
        return new JAXBElement<FreightBookedListType>(_FreightBookedList_QNAME, FreightBookedListType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ArrivalLocation")
    public JAXBElement<ArrivalLocationType> createArrivalLocation(ArrivalLocationType value) {
        return new JAXBElement<ArrivalLocationType>(_ArrivalLocation_QNAME, ArrivalLocationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalDestinationLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FinalDestinationLocation")
    public JAXBElement<FinalDestinationLocationType> createFinalDestinationLocation(FinalDestinationLocationType value) {
        return new JAXBElement<FinalDestinationLocationType>(_FinalDestinationLocation_QNAME, FinalDestinationLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardingAgentPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ForwardingAgentParty")
    public JAXBElement<ForwardingAgentPartyType> createForwardingAgentParty(ForwardingAgentPartyType value) {
        return new JAXBElement<ForwardingAgentPartyType>(_ForwardingAgentParty_QNAME, ForwardingAgentPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandlingInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "HandlingInstructions")
    public JAXBElement<HandlingInstructionsType> createHandlingInstructions(HandlingInstructionsType value) {
        return new JAXBElement<HandlingInstructionsType>(_HandlingInstructions_QNAME, HandlingInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderNoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "HeaderNote")
    public JAXBElement<HeaderNoteType> createHeaderNote(HeaderNoteType value) {
        return new JAXBElement<HeaderNoteType>(_HeaderNote_QNAME, HeaderNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadingEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LoadingEvent")
    public JAXBElement<LoadingEventType> createLoadingEvent(LoadingEventType value) {
        return new JAXBElement<LoadingEventType>(_LoadingEvent_QNAME, LoadingEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadingLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LoadingLocation")
    public JAXBElement<LoadingLocationType> createLoadingLocation(LoadingLocationType value) {
        return new JAXBElement<LoadingLocationType>(_LoadingLocation_QNAME, LoadingLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsPackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsPackage")
    public JAXBElement<LogisticsPackageType> createLogisticsPackage(LogisticsPackageType value) {
        return new JAXBElement<LogisticsPackageType>(_LogisticsPackage_QNAME, LogisticsPackageType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "PreCarriageEvent")
    public JAXBElement<DepartureEventType> createPreCarriageEvent(DepartureEventType value) {
        return new JAXBElement<DepartureEventType>(_PreCarriageEvent_QNAME, DepartureEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreCarriageTransportMovementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "PreCarriageTransportMovement")
    public JAXBElement<PreCarriageTransportMovementType> createPreCarriageTransportMovement(PreCarriageTransportMovementType value) {
        return new JAXBElement<PreCarriageTransportMovementType>(_PreCarriageTransportMovement_QNAME, PreCarriageTransportMovementType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SenderParty")
    public JAXBElement<SenderPartyType> createSenderParty(SenderPartyType value) {
        return new JAXBElement<SenderPartyType>(_SenderParty_QNAME, SenderPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpatialDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SpatialDimension")
    public JAXBElement<SpatialDimensionType> createSpatialDimension(SpatialDimensionType value) {
        return new JAXBElement<SpatialDimensionType>(_SpatialDimension_QNAME, SpatialDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportCargoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TransportCargo")
    public JAXBElement<TransportCargoType> createTransportCargo(TransportCargoType value) {
        return new JAXBElement<TransportCargoType>(_TransportCargo_QNAME, TransportCargoType.class, null, value);
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
