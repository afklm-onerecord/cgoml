package com.afklm.cargo.cgoml.cxml.iata.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.afklm.soa.stubs.w001283.v2.iata.reusablebizinfo package. 
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

    private final static QName _SenderParty_QNAME = new QName("iata:datamodel:3", "SenderParty");
    private final static QName _MessageHeaderDocument_QNAME = new QName("iata:datamodel:3", "MessageHeaderDocument");
    private final static QName _RecipientParty_QNAME = new QName("iata:datamodel:3", "RecipientParty");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afklm.soa.stubs.w001283.v2.iata.reusablebizinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SenderPartyType }
     * 
     */
    public SenderPartyType createSenderPartyType() {
        return new SenderPartyType();
    }

    /**
     * Create an instance of {@link RecipientPartyType }
     * 
     */
    public RecipientPartyType createRecipientPartyType() {
        return new RecipientPartyType();
    }

    /**
     * Create an instance of {@link MessageHeaderDocumentType }
     * 
     */
    public MessageHeaderDocumentType createMessageHeaderDocumentType() {
        return new MessageHeaderDocumentType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageHeaderDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "MessageHeaderDocument")
    public JAXBElement<MessageHeaderDocumentType> createMessageHeaderDocument(MessageHeaderDocumentType value) {
        return new JAXBElement<MessageHeaderDocumentType>(_MessageHeaderDocument_QNAME, MessageHeaderDocumentType.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipientPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "iata:datamodel:3", name = "RecipientParty")
    public JAXBElement<RecipientPartyType> createRecipientParty(RecipientPartyType value) {
        return new JAXBElement<RecipientPartyType>(_RecipientParty_QNAME, RecipientPartyType.class, null, value);
    }

}
