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

import com.afklm.cargo.cgoml.cxml.uncefact.ISO3AlphaCurrencyCodeContentType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN02000004&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;DT&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Currency_ Code. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.1&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string used to represent a currency.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimaryRepresentationTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:PrimaryRepresentationTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;String&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DataTypeQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm61001="urn:un:unece:uncefact:codelist:standard:UNECE:DocumentNameCode:D09A" xmlns:clm63035="urn:un:unece:uncefact:codelist:standard:UNECE:PartyRoleCode:D09A" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm67065="urn:un:unece:uncefact:codelist:standard:UNECE:PackageTypeCode:2006" xmlns:clm6Recommendation19="urn:un:unece:uncefact:codelist:standard:UNECE:TransportModeCode:2" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:7" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Currency&lt;/ccts:DataTypeQualifierTerm&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java pour CurrencyCodeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CurrencyCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09&gt;ISO3AlphaCurrencyCodeContentType"&gt;
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}token" fixed="ISO 4217 3A" /&gt;
 *       &lt;attribute name="listAgencyID" type="{urn:un:unece:uncefact:codelist:standard:6:3055:D09A}AgencyIdentificationCodeContentType" fixed="5" /&gt;
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}token" fixed="2007-06-18" /&gt;
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyCodeType", propOrder = {
    "value"
})
public class CurrencyCodeType {

    @XmlValue
    protected ISO3AlphaCurrencyCodeContentType value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String listAgencyID;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listVersionID;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link ISO3AlphaCurrencyCodeContentType }
     *     
     */
    public ISO3AlphaCurrencyCodeContentType getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link ISO3AlphaCurrencyCodeContentType }
     *     
     */
    public void setValue(ISO3AlphaCurrencyCodeContentType value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété listID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        if (listID == null) {
            return "ISO 4217 3A";
        } else {
            return listID;
        }
    }

    /**
     * Définit la valeur de la propriété listID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Obtient la valeur de la propriété listAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyID() {
        if (listAgencyID == null) {
            return "5";
        } else {
            return listAgencyID;
        }
    }

    /**
     * Définit la valeur de la propriété listAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * Obtient la valeur de la propriété listVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        if (listVersionID == null) {
            return "2007-06-18";
        } else {
            return listVersionID;
        }
    }

    /**
     * Définit la valeur de la propriété listVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * Obtient la valeur de la propriété listURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * Définit la valeur de la propriété listURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

}
