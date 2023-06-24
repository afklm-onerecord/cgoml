//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:46 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT0000013&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;2.01&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A numeric value determined by measuring an object along with the unit of measure specified or implied.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Type&lt;/ccts:PropertyTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:clm60133="urn:un:unece:uncefact:codelist:standard:6:0133:40106" xmlns:clm63055="urn:un:unece:uncefact:codelist:standard:6:3055:D09A" xmlns:clm6Recommendation20="urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6" xmlns:clmIANACharacterSetCode="urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2007-05-14" xmlns:clmIANAMIMEMediaType="urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-09-01" xmlns:ids5ISO316612A="urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-6" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java pour MeasureType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attribute name="unitCode" type="{urn:un:unece:uncefact:codelist:standard:6:Recommendation20:6}MeasurementUnitCommonCodeContentType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
    "value"
})
public class MeasureType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unitCode;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété unitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Définit la valeur de la propriété unitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

}
