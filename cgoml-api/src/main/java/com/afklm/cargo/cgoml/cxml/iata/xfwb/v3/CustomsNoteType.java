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

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.CountryIDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour CustomsNoteType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CustomsNoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="SubjectCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CountryID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CountryIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsNoteType", propOrder = {
    "contentCode",
    "content",
    "subjectCode",
    "countryID"
})
public class CustomsNoteType {

    @XmlElement(name = "ContentCode")
    protected CodeType contentCode;
    @XmlElement(name = "Content", required = true)
    protected TextType content;
    @XmlElement(name = "SubjectCode")
    protected CodeType subjectCode;
    @XmlElement(name = "CountryID")
    protected CountryIDType countryID;

    /**
     * Obtient la valeur de la propriété contentCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContentCode() {
        return contentCode;
    }

    /**
     * Définit la valeur de la propriété contentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContentCode(CodeType value) {
        this.contentCode = value;
    }

    /**
     * Obtient la valeur de la propriété content.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setContent(TextType value) {
        this.content = value;
    }

    /**
     * Obtient la valeur de la propriété subjectCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSubjectCode() {
        return subjectCode;
    }

    /**
     * Définit la valeur de la propriété subjectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSubjectCode(CodeType value) {
        this.subjectCode = value;
    }

    /**
     * Obtient la valeur de la propriété countryID.
     * 
     * @return
     *     possible object is
     *     {@link CountryIDType }
     *     
     */
    public CountryIDType getCountryID() {
        return countryID;
    }

    /**
     * Définit la valeur de la propriété countryID.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryIDType }
     *     
     */
    public void setCountryID(CountryIDType value) {
        this.countryID = value;
    }

}
