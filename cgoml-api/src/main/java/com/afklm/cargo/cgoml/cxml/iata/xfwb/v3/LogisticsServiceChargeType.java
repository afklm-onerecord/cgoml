//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:51 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfwb.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;


/**
 * <p>Classe Java pour LogisticsServiceChargeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LogisticsServiceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportPaymentMethodCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsServiceChargeType", propOrder = {
    "transportPaymentMethodCode",
    "serviceTypeCode"
})
public class LogisticsServiceChargeType {

    @XmlElement(name = "TransportPaymentMethodCode")
    protected CodeType transportPaymentMethodCode;
    @XmlElement(name = "ServiceTypeCode")
    protected CodeType serviceTypeCode;

    /**
     * Obtient la valeur de la propriété transportPaymentMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransportPaymentMethodCode() {
        return transportPaymentMethodCode;
    }

    /**
     * Définit la valeur de la propriété transportPaymentMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportPaymentMethodCode(CodeType value) {
        this.transportPaymentMethodCode = value;
    }

    /**
     * Obtient la valeur de la propriété serviceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Définit la valeur de la propriété serviceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setServiceTypeCode(CodeType value) {
        this.serviceTypeCode = value;
    }

}
