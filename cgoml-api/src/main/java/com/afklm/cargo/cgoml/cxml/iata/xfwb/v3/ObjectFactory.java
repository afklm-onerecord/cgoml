//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

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
 * generated in the com.afklm.cargo.schemas.iata.xfwb.v3 package. 
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

    private final static QName _Waybill_QNAME = new QName("iata:waybill:1", "Waybill");
    private final static QName _AccountingNote_QNAME = new QName("iata:datamodel:3", "AccountingNote");
    private final static QName _AddressLocation_QNAME = new QName("iata:datamodel:3", "AddressLocation");
    private final static QName _ArrivalEvent_QNAME = new QName("iata:datamodel:3", "ArrivalEvent");
    private final static QName _ArrivalLocation_QNAME = new QName("iata:datamodel:3", "ArrivalLocation");
    private final static QName _AssociatedParty_QNAME = new QName("iata:datamodel:3", "AssociatedParty");
    private final static QName _AuthenticationLocation_QNAME = new QName("iata:datamodel:3", "AuthenticationLocation");
    private final static QName _BusinessHeaderDocument_QNAME = new QName("iata:datamodel:3", "BusinessHeaderDocument");
    private final static QName _CargoAgentLocation_QNAME = new QName("iata:datamodel:3", "CargoAgentLocation");
    private final static QName _CarrierAuthentication_QNAME = new QName("iata:datamodel:3", "CarrierAuthentication");
    private final static QName _ConsigneeParty_QNAME = new QName("iata:datamodel:3", "ConsigneeParty");
    private final static QName _ConsignmentCustomsProcedure_QNAME = new QName("iata:datamodel:3", "ConsignmentCustomsProcedure");
    private final static QName _ConsignorAuthentication_QNAME = new QName("iata:datamodel:3", "ConsignorAuthentication");
    private final static QName _ConsignorParty_QNAME = new QName("iata:datamodel:3", "ConsignorParty");
    private final static QName _CustomsNote_QNAME = new QName("iata:datamodel:3", "CustomsNote");
    private final static QName _DepartureEvent_QNAME = new QName("iata:datamodel:3", "DepartureEvent");
    private final static QName _DepartureLocation_QNAME = new QName("iata:datamodel:3", "DepartureLocation");
    private final static QName _DestinationCurrencyExchange_QNAME = new QName("iata:datamodel:3", "DestinationCurrencyExchange");
    private final static QName _DestinationCurrencyServiceCharge_QNAME = new QName("iata:datamodel:3", "DestinationCurrencyServiceCharge");
    private final static QName _EmailCommunication_QNAME = new QName("iata:datamodel:3", "EmailCommunication");
    private final static QName _FaxCommunication_QNAME = new QName("iata:datamodel:3", "FaxCommunication");
    private final static QName _FinalDestinationLocation_QNAME = new QName("iata:datamodel:3", "FinalDestinationLocation");
    private final static QName _FreightForwarderAddress_QNAME = new QName("iata:datamodel:3", "FreightForwarderAddress");
    private final static QName _FreightForwarderParty_QNAME = new QName("iata:datamodel:3", "FreightForwarderParty");
    private final static QName _FreightRateServiceCharge_QNAME = new QName("iata:datamodel:3", "FreightRateServiceCharge");
    private final static QName _HeaderNote_QNAME = new QName("iata:datamodel:3", "HeaderNote");
    private final static QName _LogisticsAllowanceCharge_QNAME = new QName("iata:datamodel:3", "LogisticsAllowanceCharge");
    private final static QName _LogisticsPackage_QNAME = new QName("iata:datamodel:3", "LogisticsPackage");
    private final static QName _LogisticsSeal_QNAME = new QName("iata:datamodel:3", "LogisticsSeal");
    private final static QName _LogisticsServiceCharge_QNAME = new QName("iata:datamodel:3", "LogisticsServiceCharge");
    private final static QName _LogisticsTransportEquipment_QNAME = new QName("iata:datamodel:3", "LogisticsTransportEquipment");
    private final static QName _LogisticsTransportMeans_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMeans");
    private final static QName _LogisticsTransportMovement_QNAME = new QName("iata:datamodel:3", "LogisticsTransportMovement");
    private final static QName _MasterConsignment_QNAME = new QName("iata:datamodel:3", "MasterConsignment");
    private final static QName _MasterConsignmentItem_QNAME = new QName("iata:datamodel:3", "MasterConsignmentItem");
    private final static QName _MessageHeaderDocument_QNAME = new QName("iata:datamodel:3", "MessageHeaderDocument");
    private final static QName _OperatingParty_QNAME = new QName("iata:datamodel:3", "OperatingParty");
    private final static QName _OriginCountry_QNAME = new QName("iata:datamodel:3", "OriginCountry");
    private final static QName _OriginCurrencyExchange_QNAME = new QName("iata:datamodel:3", "OriginCurrencyExchange");
    private final static QName _OriginLocation_QNAME = new QName("iata:datamodel:3", "OriginLocation");
    private final static QName _OSIInstructions_QNAME = new QName("iata:datamodel:3", "OSIInstructions");
    private final static QName _PrepaidCollectMonetarySummation_QNAME = new QName("iata:datamodel:3", "PrepaidCollectMonetarySummation");
    private final static QName _RateCombinationPointLocation_QNAME = new QName("iata:datamodel:3", "RateCombinationPointLocation");
    private final static QName _Rating_QNAME = new QName("iata:datamodel:3", "Rating");
    private final static QName _RecipientParty_QNAME = new QName("iata:datamodel:3", "RecipientParty");
    private final static QName _ReferenceDocument_QNAME = new QName("iata:datamodel:3", "ReferenceDocument");
    private final static QName _SenderParty_QNAME = new QName("iata:datamodel:3", "SenderParty");
    private final static QName _SpatialDimension_QNAME = new QName("iata:datamodel:3", "SpatialDimension");
    private final static QName _SPHInstructions_QNAME = new QName("iata:datamodel:3", "SPHInstructions");
    private final static QName _SSRInstructions_QNAME = new QName("iata:datamodel:3", "SSRInstructions");
    private final static QName _StructuredAddress_QNAME = new QName("iata:datamodel:3", "StructuredAddress");
    private final static QName _TelephoneCommunication_QNAME = new QName("iata:datamodel:3", "TelephoneCommunication");
    private final static QName _TelexCommunication_QNAME = new QName("iata:datamodel:3", "TelexCommunication");
    private final static QName _TotalRating_QNAME = new QName("iata:datamodel:3", "TotalRating");
    private final static QName _TradeContact_QNAME = new QName("iata:datamodel:3", "TradeContact");
    private final static QName _TransportCargo_QNAME = new QName("iata:datamodel:3", "TransportCargo");
    private final static QName _UnitLoadDeviceRateClassType_QNAME = new QName("iata:datamodel:3", "UnitLoadDeviceRateClassType");
    private final static QName _UnitLoadTransportEquipment_QNAME = new QName("iata:datamodel:3", "UnitLoadTransportEquipment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afklm.cargo.schemas.iata.xfwb.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WaybillType }
     * 
     */
    public WaybillType createWaybillType() {
        return new WaybillType();
    }

    /**
     * Create an instance of {@link AccountingNoteType }
     * 
     */
    public AccountingNoteType createAccountingNoteType() {
        return new AccountingNoteType();
    }

    /**
     * Create an instance of {@link AddressLocationType }
     * 
     */
    public AddressLocationType createAddressLocationType() {
        return new AddressLocationType();
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
     * Create an instance of {@link AssociatedPartyType }
     * 
     */
    public AssociatedPartyType createAssociatedPartyType() {
        return new AssociatedPartyType();
    }

    /**
     * Create an instance of {@link AuthenticationLocationType }
     * 
     */
    public AuthenticationLocationType createAuthenticationLocationType() {
        return new AuthenticationLocationType();
    }

    /**
     * Create an instance of {@link BusinessHeaderDocumentType }
     * 
     */
    public BusinessHeaderDocumentType createBusinessHeaderDocumentType() {
        return new BusinessHeaderDocumentType();
    }

    /**
     * Create an instance of {@link CargoAgentLocationType }
     * 
     */
    public CargoAgentLocationType createCargoAgentLocationType() {
        return new CargoAgentLocationType();
    }

    /**
     * Create an instance of {@link CarrierAuthenticationType }
     * 
     */
    public CarrierAuthenticationType createCarrierAuthenticationType() {
        return new CarrierAuthenticationType();
    }

    /**
     * Create an instance of {@link ConsigneePartyType }
     * 
     */
    public ConsigneePartyType createConsigneePartyType() {
        return new ConsigneePartyType();
    }

    /**
     * Create an instance of {@link ConsignmentCustomsProcedureType }
     * 
     */
    public ConsignmentCustomsProcedureType createConsignmentCustomsProcedureType() {
        return new ConsignmentCustomsProcedureType();
    }

    /**
     * Create an instance of {@link ConsignorAuthenticationType }
     * 
     */
    public ConsignorAuthenticationType createConsignorAuthenticationType() {
        return new ConsignorAuthenticationType();
    }

    /**
     * Create an instance of {@link ConsignorPartyType }
     * 
     */
    public ConsignorPartyType createConsignorPartyType() {
        return new ConsignorPartyType();
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
     * Create an instance of {@link DestinationCurrencyExchangeType }
     * 
     */
    public DestinationCurrencyExchangeType createDestinationCurrencyExchangeType() {
        return new DestinationCurrencyExchangeType();
    }

    /**
     * Create an instance of {@link DestinationCurrencyServiceChargeType }
     * 
     */
    public DestinationCurrencyServiceChargeType createDestinationCurrencyServiceChargeType() {
        return new DestinationCurrencyServiceChargeType();
    }

    /**
     * Create an instance of {@link EmailCommunicationType }
     * 
     */
    public EmailCommunicationType createEmailCommunicationType() {
        return new EmailCommunicationType();
    }

    /**
     * Create an instance of {@link FaxCommunicationType }
     * 
     */
    public FaxCommunicationType createFaxCommunicationType() {
        return new FaxCommunicationType();
    }

    /**
     * Create an instance of {@link FinalDestinationLocationType }
     * 
     */
    public FinalDestinationLocationType createFinalDestinationLocationType() {
        return new FinalDestinationLocationType();
    }

    /**
     * Create an instance of {@link FreightForwarderAddressType }
     * 
     */
    public FreightForwarderAddressType createFreightForwarderAddressType() {
        return new FreightForwarderAddressType();
    }

    /**
     * Create an instance of {@link FreightForwarderPartyType }
     * 
     */
    public FreightForwarderPartyType createFreightForwarderPartyType() {
        return new FreightForwarderPartyType();
    }

    /**
     * Create an instance of {@link FreightRateServiceChargeType }
     * 
     */
    public FreightRateServiceChargeType createFreightRateServiceChargeType() {
        return new FreightRateServiceChargeType();
    }

    /**
     * Create an instance of {@link HeaderNoteType }
     * 
     */
    public HeaderNoteType createHeaderNoteType() {
        return new HeaderNoteType();
    }

    /**
     * Create an instance of {@link LogisticsAllowanceChargeType }
     * 
     */
    public LogisticsAllowanceChargeType createLogisticsAllowanceChargeType() {
        return new LogisticsAllowanceChargeType();
    }

    /**
     * Create an instance of {@link LogisticsPackageType }
     * 
     */
    public LogisticsPackageType createLogisticsPackageType() {
        return new LogisticsPackageType();
    }

    /**
     * Create an instance of {@link LogisticsSealType }
     * 
     */
    public LogisticsSealType createLogisticsSealType() {
        return new LogisticsSealType();
    }

    /**
     * Create an instance of {@link LogisticsServiceChargeType }
     * 
     */
    public LogisticsServiceChargeType createLogisticsServiceChargeType() {
        return new LogisticsServiceChargeType();
    }

    /**
     * Create an instance of {@link LogisticsTransportEquipmentType }
     * 
     */
    public LogisticsTransportEquipmentType createLogisticsTransportEquipmentType() {
        return new LogisticsTransportEquipmentType();
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
     * Create an instance of {@link MasterConsignmentItemType }
     * 
     */
    public MasterConsignmentItemType createMasterConsignmentItemType() {
        return new MasterConsignmentItemType();
    }

    /**
     * Create an instance of {@link OperatingPartyType }
     * 
     */
    public OperatingPartyType createOperatingPartyType() {
        return new OperatingPartyType();
    }

    /**
     * Create an instance of {@link OriginCountryType }
     * 
     */
    public OriginCountryType createOriginCountryType() {
        return new OriginCountryType();
    }

    /**
     * Create an instance of {@link OriginCurrencyExchangeType }
     * 
     */
    public OriginCurrencyExchangeType createOriginCurrencyExchangeType() {
        return new OriginCurrencyExchangeType();
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
     * Create an instance of {@link PrepaidCollectMonetarySummationType }
     * 
     */
    public PrepaidCollectMonetarySummationType createPrepaidCollectMonetarySummationType() {
        return new PrepaidCollectMonetarySummationType();
    }

    /**
     * Create an instance of {@link RateCombinationPointLocationType }
     * 
     */
    public RateCombinationPointLocationType createRateCombinationPointLocationType() {
        return new RateCombinationPointLocationType();
    }

    /**
     * Create an instance of {@link RatingType }
     * 
     */
    public RatingType createRatingType() {
        return new RatingType();
    }

    /**
     * Create an instance of {@link ReferenceDocumentType }
     * 
     */
    public ReferenceDocumentType createReferenceDocumentType() {
        return new ReferenceDocumentType();
    }

    /**
     * Create an instance of {@link SpatialDimensionType }
     * 
     */
    public SpatialDimensionType createSpatialDimensionType() {
        return new SpatialDimensionType();
    }

    /**
     * Create an instance of {@link SPHInstructionsType }
     * 
     */
    public SPHInstructionsType createSPHInstructionsType() {
        return new SPHInstructionsType();
    }

    /**
     * Create an instance of {@link SSRInstructionsType }
     * 
     */
    public SSRInstructionsType createSSRInstructionsType() {
        return new SSRInstructionsType();
    }

    /**
     * Create an instance of {@link StructuredAddressType }
     * 
     */
    public StructuredAddressType createStructuredAddressType() {
        return new StructuredAddressType();
    }

    /**
     * Create an instance of {@link TelephoneCommunicationType }
     * 
     */
    public TelephoneCommunicationType createTelephoneCommunicationType() {
        return new TelephoneCommunicationType();
    }

    /**
     * Create an instance of {@link TelexCommunicationType }
     * 
     */
    public TelexCommunicationType createTelexCommunicationType() {
        return new TelexCommunicationType();
    }

    /**
     * Create an instance of {@link TotalRatingType }
     * 
     */
    public TotalRatingType createTotalRatingType() {
        return new TotalRatingType();
    }

    /**
     * Create an instance of {@link TradeContactType }
     * 
     */
    public TradeContactType createTradeContactType() {
        return new TradeContactType();
    }

    /**
     * Create an instance of {@link TransportCargoType }
     * 
     */
    public TransportCargoType createTransportCargoType() {
        return new TransportCargoType();
    }

    /**
     * Create an instance of {@link UnitLoadDeviceRateClassType }
     * 
     */
    public UnitLoadDeviceRateClassType createUnitLoadDeviceRateClassType() {
        return new UnitLoadDeviceRateClassType();
    }

    /**
     * Create an instance of {@link UnitLoadTransportEquipmentType }
     * 
     */
    public UnitLoadTransportEquipmentType createUnitLoadTransportEquipmentType() {
        return new UnitLoadTransportEquipmentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaybillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:waybill:1", name = "Waybill")
    public JAXBElement<WaybillType> createWaybill(WaybillType value) {
        return new JAXBElement<WaybillType>(_Waybill_QNAME, WaybillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingNoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "AccountingNote")
    public JAXBElement<AccountingNoteType> createAccountingNote(AccountingNoteType value) {
        return new JAXBElement<AccountingNoteType>(_AccountingNote_QNAME, AccountingNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "AddressLocation")
    public JAXBElement<AddressLocationType> createAddressLocation(AddressLocationType value) {
        return new JAXBElement<AddressLocationType>(_AddressLocation_QNAME, AddressLocationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "AssociatedParty")
    public JAXBElement<AssociatedPartyType> createAssociatedParty(AssociatedPartyType value) {
        return new JAXBElement<AssociatedPartyType>(_AssociatedParty_QNAME, AssociatedPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "AuthenticationLocation")
    public JAXBElement<AuthenticationLocationType> createAuthenticationLocation(AuthenticationLocationType value) {
        return new JAXBElement<AuthenticationLocationType>(_AuthenticationLocation_QNAME, AuthenticationLocationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoAgentLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "CargoAgentLocation")
    public JAXBElement<CargoAgentLocationType> createCargoAgentLocation(CargoAgentLocationType value) {
        return new JAXBElement<CargoAgentLocationType>(_CargoAgentLocation_QNAME, CargoAgentLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierAuthenticationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "CarrierAuthentication")
    public JAXBElement<CarrierAuthenticationType> createCarrierAuthentication(CarrierAuthenticationType value) {
        return new JAXBElement<CarrierAuthenticationType>(_CarrierAuthentication_QNAME, CarrierAuthenticationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsigneePartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ConsigneeParty")
    public JAXBElement<ConsigneePartyType> createConsigneeParty(ConsigneePartyType value) {
        return new JAXBElement<ConsigneePartyType>(_ConsigneeParty_QNAME, ConsigneePartyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignorAuthenticationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ConsignorAuthentication")
    public JAXBElement<ConsignorAuthenticationType> createConsignorAuthentication(ConsignorAuthenticationType value) {
        return new JAXBElement<ConsignorAuthenticationType>(_ConsignorAuthentication_QNAME, ConsignorAuthenticationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignorPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ConsignorParty")
    public JAXBElement<ConsignorPartyType> createConsignorParty(ConsignorPartyType value) {
        return new JAXBElement<ConsignorPartyType>(_ConsignorParty_QNAME, ConsignorPartyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationCurrencyExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DestinationCurrencyExchange")
    public JAXBElement<DestinationCurrencyExchangeType> createDestinationCurrencyExchange(DestinationCurrencyExchangeType value) {
        return new JAXBElement<DestinationCurrencyExchangeType>(_DestinationCurrencyExchange_QNAME, DestinationCurrencyExchangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationCurrencyServiceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "DestinationCurrencyServiceCharge")
    public JAXBElement<DestinationCurrencyServiceChargeType> createDestinationCurrencyServiceCharge(DestinationCurrencyServiceChargeType value) {
        return new JAXBElement<DestinationCurrencyServiceChargeType>(_DestinationCurrencyServiceCharge_QNAME, DestinationCurrencyServiceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "EmailCommunication")
    public JAXBElement<EmailCommunicationType> createEmailCommunication(EmailCommunicationType value) {
        return new JAXBElement<EmailCommunicationType>(_EmailCommunication_QNAME, EmailCommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaxCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FaxCommunication")
    public JAXBElement<FaxCommunicationType> createFaxCommunication(FaxCommunicationType value) {
        return new JAXBElement<FaxCommunicationType>(_FaxCommunication_QNAME, FaxCommunicationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightForwarderAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FreightForwarderAddress")
    public JAXBElement<FreightForwarderAddressType> createFreightForwarderAddress(FreightForwarderAddressType value) {
        return new JAXBElement<FreightForwarderAddressType>(_FreightForwarderAddress_QNAME, FreightForwarderAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightForwarderPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FreightForwarderParty")
    public JAXBElement<FreightForwarderPartyType> createFreightForwarderParty(FreightForwarderPartyType value) {
        return new JAXBElement<FreightForwarderPartyType>(_FreightForwarderParty_QNAME, FreightForwarderPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightRateServiceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "FreightRateServiceCharge")
    public JAXBElement<FreightRateServiceChargeType> createFreightRateServiceCharge(FreightRateServiceChargeType value) {
        return new JAXBElement<FreightRateServiceChargeType>(_FreightRateServiceCharge_QNAME, FreightRateServiceChargeType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsAllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsAllowanceCharge")
    public JAXBElement<LogisticsAllowanceChargeType> createLogisticsAllowanceCharge(LogisticsAllowanceChargeType value) {
        return new JAXBElement<LogisticsAllowanceChargeType>(_LogisticsAllowanceCharge_QNAME, LogisticsAllowanceChargeType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsSealType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsSeal")
    public JAXBElement<LogisticsSealType> createLogisticsSeal(LogisticsSealType value) {
        return new JAXBElement<LogisticsSealType>(_LogisticsSeal_QNAME, LogisticsSealType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LogisticsTransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "LogisticsTransportEquipment")
    public JAXBElement<LogisticsTransportEquipmentType> createLogisticsTransportEquipment(LogisticsTransportEquipmentType value) {
        return new JAXBElement<LogisticsTransportEquipmentType>(_LogisticsTransportEquipment_QNAME, LogisticsTransportEquipmentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterConsignmentItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "MasterConsignmentItem")
    public JAXBElement<MasterConsignmentItemType> createMasterConsignmentItem(MasterConsignmentItemType value) {
        return new JAXBElement<MasterConsignmentItemType>(_MasterConsignmentItem_QNAME, MasterConsignmentItemType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginCountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "OriginCountry")
    public JAXBElement<OriginCountryType> createOriginCountry(OriginCountryType value) {
        return new JAXBElement<OriginCountryType>(_OriginCountry_QNAME, OriginCountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginCurrencyExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "OriginCurrencyExchange")
    public JAXBElement<OriginCurrencyExchangeType> createOriginCurrencyExchange(OriginCurrencyExchangeType value) {
        return new JAXBElement<OriginCurrencyExchangeType>(_OriginCurrencyExchange_QNAME, OriginCurrencyExchangeType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepaidCollectMonetarySummationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "PrepaidCollectMonetarySummation")
    public JAXBElement<PrepaidCollectMonetarySummationType> createPrepaidCollectMonetarySummation(PrepaidCollectMonetarySummationType value) {
        return new JAXBElement<PrepaidCollectMonetarySummationType>(_PrepaidCollectMonetarySummation_QNAME, PrepaidCollectMonetarySummationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateCombinationPointLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "RateCombinationPointLocation")
    public JAXBElement<RateCombinationPointLocationType> createRateCombinationPointLocation(RateCombinationPointLocationType value) {
        return new JAXBElement<RateCombinationPointLocationType>(_RateCombinationPointLocation_QNAME, RateCombinationPointLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "Rating")
    public JAXBElement<RatingType> createRating(RatingType value) {
        return new JAXBElement<RatingType>(_Rating_QNAME, RatingType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "ReferenceDocument")
    public JAXBElement<ReferenceDocumentType> createReferenceDocument(ReferenceDocumentType value) {
        return new JAXBElement<ReferenceDocumentType>(_ReferenceDocument_QNAME, ReferenceDocumentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SPHInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SPHInstructions")
    public JAXBElement<SPHInstructionsType> createSPHInstructions(SPHInstructionsType value) {
        return new JAXBElement<SPHInstructionsType>(_SPHInstructions_QNAME, SPHInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSRInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "SSRInstructions")
    public JAXBElement<SSRInstructionsType> createSSRInstructions(SSRInstructionsType value) {
        return new JAXBElement<SSRInstructionsType>(_SSRInstructions_QNAME, SSRInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "StructuredAddress")
    public JAXBElement<StructuredAddressType> createStructuredAddress(StructuredAddressType value) {
        return new JAXBElement<StructuredAddressType>(_StructuredAddress_QNAME, StructuredAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephoneCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TelephoneCommunication")
    public JAXBElement<TelephoneCommunicationType> createTelephoneCommunication(TelephoneCommunicationType value) {
        return new JAXBElement<TelephoneCommunicationType>(_TelephoneCommunication_QNAME, TelephoneCommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelexCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TelexCommunication")
    public JAXBElement<TelexCommunicationType> createTelexCommunication(TelexCommunicationType value) {
        return new JAXBElement<TelexCommunicationType>(_TelexCommunication_QNAME, TelexCommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalRatingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TotalRating")
    public JAXBElement<TotalRatingType> createTotalRating(TotalRatingType value) {
        return new JAXBElement<TotalRatingType>(_TotalRating_QNAME, TotalRatingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "TradeContact")
    public JAXBElement<TradeContactType> createTradeContact(TradeContactType value) {
        return new JAXBElement<TradeContactType>(_TradeContact_QNAME, TradeContactType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitLoadDeviceRateClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "UnitLoadDeviceRateClassType")
    public JAXBElement<UnitLoadDeviceRateClassType> createUnitLoadDeviceRateClassType(UnitLoadDeviceRateClassType value) {
        return new JAXBElement<UnitLoadDeviceRateClassType>(_UnitLoadDeviceRateClassType_QNAME, UnitLoadDeviceRateClassType.class, null, value);
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
