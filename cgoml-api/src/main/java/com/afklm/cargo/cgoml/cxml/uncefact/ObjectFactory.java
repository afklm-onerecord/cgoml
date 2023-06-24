//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:46 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.uncefact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.afklm.cargo.schemas.uncefact package. 
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

    private final static QName _ISOTwoletterCountryCodeIdentifier_QNAME = new QName("urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6", "ISOTwoletterCountryCodeIdentifier");
    private final static QName _ISO3AlphaCurrencyCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09", "ISO3AlphaCurrencyCode");
    private final static QName _PartyRoleCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A", "PartyRoleCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afklm.cargo.schemas.uncefact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISOTwoletterCountryCodeIdentifierContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6", name = "ISOTwoletterCountryCodeIdentifier")
    public JAXBElement<ISOTwoletterCountryCodeIdentifierContentType> createISOTwoletterCountryCodeIdentifier(ISOTwoletterCountryCodeIdentifierContentType value) {
        return new JAXBElement<ISOTwoletterCountryCodeIdentifierContentType>(_ISOTwoletterCountryCodeIdentifier_QNAME, ISOTwoletterCountryCodeIdentifierContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISO3AlphaCurrencyCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09", name = "ISO3AlphaCurrencyCode")
    public JAXBElement<ISO3AlphaCurrencyCodeContentType> createISO3AlphaCurrencyCode(ISO3AlphaCurrencyCodeContentType value) {
        return new JAXBElement<ISO3AlphaCurrencyCodeContentType>(_ISO3AlphaCurrencyCode_QNAME, ISO3AlphaCurrencyCodeContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyRoleCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A", name = "PartyRoleCode")
    public JAXBElement<PartyRoleCodeContentType> createPartyRoleCode(PartyRoleCodeContentType value) {
        return new JAXBElement<PartyRoleCodeContentType>(_PartyRoleCode_QNAME, PartyRoleCodeContentType.class, null, value);
    }

}
