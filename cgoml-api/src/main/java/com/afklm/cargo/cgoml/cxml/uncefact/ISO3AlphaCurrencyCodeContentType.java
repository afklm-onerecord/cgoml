//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:46 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.uncefact;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ISO3AlphaCurrencyCodeContentType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ISO3AlphaCurrencyCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFN"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZN"/&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BOV"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CHW"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="COU"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CUC"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="GHS"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GWP"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MGA"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MXV"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZN"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDG"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRD"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TMT"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="USN"/&gt;
 *     &lt;enumeration value="USS"/&gt;
 *     &lt;enumeration value="UYI"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XAG"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="XBA"/&gt;
 *     &lt;enumeration value="XBB"/&gt;
 *     &lt;enumeration value="XBC"/&gt;
 *     &lt;enumeration value="XBD"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XDR"/&gt;
 *     &lt;enumeration value="XFU"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XPD"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="XPT"/&gt;
 *     &lt;enumeration value="XTS"/&gt;
 *     &lt;enumeration value="XXX"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZWL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ISO3AlphaCurrencyCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09")
@XmlEnum
public enum ISO3AlphaCurrencyCodeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UAE Dirham&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AED,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Afghani&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AFN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lek&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ALL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Armenian Dram&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Netherlands Antillian Guilder&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ANG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kwanza&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AOA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Argentine Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ARS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Australian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AUD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Aruban Guilder&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AWG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Azerbaijanian Manat&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AZN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Convertible Marks&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BAM,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Barbados Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BBD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Taka&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BDT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bulgarian Lev&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BGN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bahraini Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BHD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Burundi Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BIF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bermudian Dollar (customarily known as Bermuda Dollar)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brunei Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BND,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Boliviano&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BOB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mvdol&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BOV,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brazilian Real&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BRL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bahamian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BSD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ngultrum&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BTN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pula&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BWP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Belarussian Ruble&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BYR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Belize Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BZD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Canadian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CAD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Congolese Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CDF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;WIR Euro&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CHE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Swiss Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CHF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;WIR Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CHW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unidades de fomento&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CLF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Chilean Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CLP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Yuan Renminbi&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CNY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Colombian Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    COP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unidad de Valor Real&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    COU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costa Rican Colon&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CRC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Peso Convertible&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CUC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cuban Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CUP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cape Verde Escudo&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CVE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Czech Koruna&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CZK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Djibouti Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DJF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Danish Krone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DKK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dominican Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DOP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Algerian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DZD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kroon&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    EEK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Egyptian Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    EGP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Nakfa&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ERN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ethiopian Birr&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ETB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Euro&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    EUR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Fiji Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    FJD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Falkland Islands Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    FKP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pound Sterling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GBP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lari&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GEL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cedi&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GHS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Gibraltar Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GIP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dalasi&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guinea Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GNF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quetzal&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GTQ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guinea-Bissau Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GWP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guyana Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GYD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hong Kong Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HKD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lempira&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HNL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Croatian Kuna&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HRK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Gourde&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HTG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Forint&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HUF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rupiah&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    IDR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Israeli Sheqel&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ILS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indian Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    INR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iraqi Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    IQD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iranian Rial&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    IRR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iceland Krona&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ISK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Jamaican Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    JMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Jordanian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    JOD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Yen&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    JPY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kenyan Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KES,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Som&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KGS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Riel&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KHR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Comoro Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KMF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;North Korean Won&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KPW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Won&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KRW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kuwaiti Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KWD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cayman Islands Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KYD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tenge&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KZT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kip&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LAK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lebanese Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LBP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sri Lanka Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LKR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Liberian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LRD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Loti&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LSL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lithuanian Litas&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LTL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Latvian Lats&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LVL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Libyan Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LYD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Moroccan Dirham&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MAD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Moldovan Leu&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MDL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Malagasy Ariary&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MGA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Denar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MKD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kyat&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MMK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tugrik&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MNT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pataca&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MOP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ouguiya&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MRO,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mauritius Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MUR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rufiyaa&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MVR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kwacha&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MWK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mexican Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MXN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mexican Unidad de Inversion (UDI)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MXV,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Malaysian Ringgit&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MYR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Metical&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MZN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Namibia Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NAD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Naira&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NGN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cordoba Oro&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NIO,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Norwegian Krone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NOK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Nepalese Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NPR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Zealand Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NZD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rial Omani&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    OMR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Balboa&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PAB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Nuevo Sol&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PEN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kina&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PGK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Philippine Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PHP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pakistan Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PKR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zloty&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PLN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guarani&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PYG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Qatari Rial&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    QAR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Leu&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RON,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Serbian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RSD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russian Ruble&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RUB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rwanda Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RWF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Saudi Riyal&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SAR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Solomon Islands Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SBD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Seychelles Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SCR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sudanese Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SDG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Swedish Krona&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SEK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Singapore Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SGD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Saint Helena Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SHP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Leone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SLL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Somali Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SOS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Surinam Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SRD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dobra&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    STD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;El Salvador Colon&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SVC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Syrian Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SYP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lilangeni&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SZL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Baht&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    THB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Somoni&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TJS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Manat&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TMT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tunisian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TND,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pa'anga&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TOP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Turkish Lira&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TRY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trinidad and Tobago Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TTD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Taiwan Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TWD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tanzanian Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TZS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hryvnia&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UAH,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uganda Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UGX,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;US Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    USD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;US Dollar (Next day)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    USN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;US Dollar (Same day)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    USS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uruguay Peso en Unidades Indexadas&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UYI,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Peso Uruguayo&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UYU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uzbekistan Sum&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UZS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bolivar Fuerte&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    VEF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dong&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    VND,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Vatu&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    VUV,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tala&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    WST,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CFA Franc BEAC ‡&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XAF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Silver&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XAG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Gold&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XAU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bond Markets Units European Composite Unit (EURCO)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;European Monetary Unit (E.M.U.-6)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;European Unit of Account 9(E.U.A.-9)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;European Unit of Account 17(E.U.A.-17)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;East Caribbean Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XCD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SDR&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XDR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UIC-Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XFU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CFA Franc BCEAO †&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XOF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Palladium&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XPD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CFP Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XPF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Platinum&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XPT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Codes specifically reserved for testing purposes&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XTS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The codes assigned for transactions where no currency is involved are:&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XXX,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Yemeni Rial&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    YER,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rand&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ZAR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zambian Kwacha&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ZMK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2009-09-09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zimbabwe Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ZWL;

    public String value() {
        return name();
    }

    public static ISO3AlphaCurrencyCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
