//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:46 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.afklm.cargo.cgoml.cxml.uncefact.ISOTwoletterCountryCodeIdentifierContentType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN02000003&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;DT&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Country_ Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and distinguish uniquely, one instance of a country in an identification scheme from all other objects within the same scheme.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimaryRepresentationTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:PrimaryRepresentationTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;String&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DataTypeQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Country&lt;/ccts:DataTypeQualifierTerm&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java pour CountryIDType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountryIDType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6&gt;ISOTwoletterCountryCodeIdentifierContentType"&gt;
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="schemeAgencyID" type="{urn:un:unece:uncefact:codelist:standard:6:3055:D09A}AgencyIdentificationCodeContentType" /&gt;
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}token" fixed="second edition 2006" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryIDType", propOrder = {
    "value"
})
public class CountryIDType {

    @XmlValue
    protected ISOTwoletterCountryCodeIdentifierContentType value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeID;
    @XmlAttribute(name = "schemeAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schemeAgencyID;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeVersionID;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link ISOTwoletterCountryCodeIdentifierContentType }
     *     
     */
    public ISOTwoletterCountryCodeIdentifierContentType getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link ISOTwoletterCountryCodeIdentifierContentType }
     *     
     */
    public void setValue(ISOTwoletterCountryCodeIdentifierContentType value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété schemeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Définit la valeur de la propriété schemeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Obtient la valeur de la propriété schemeAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Définit la valeur de la propriété schemeAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

    /**
     * Obtient la valeur de la propriété schemeVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersionID() {
        if (schemeVersionID == null) {
            return "second edition 2006";
        } else {
            return schemeVersionID;
        }
    }

    /**
     * Définit la valeur de la propriété schemeVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

}
