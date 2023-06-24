//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:41 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xtmv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour CancellationEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CancellationEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationEventType", propOrder = {
    "reasonTypeCode",
    "reasonDescription"
})
public class CancellationEventType {

    @XmlElement(name = "ReasonTypeCode")
    protected CodeType reasonTypeCode;
    @XmlElement(name = "ReasonDescription", required = true)
    protected TextType reasonDescription;

    /**
     * Obtient la valeur de la propriété reasonTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonTypeCode() {
        return reasonTypeCode;
    }

    /**
     * Définit la valeur de la propriété reasonTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonTypeCode(CodeType value) {
        this.reasonTypeCode = value;
    }

    /**
     * Obtient la valeur de la propriété reasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Définit la valeur de la propriété reasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setReasonDescription(TextType value) {
        this.reasonDescription = value;
    }

}
