//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:47:13 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xffm.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour HeaderNoteType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderNoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderNoteType", propOrder = {
    "contentCode",
    "content"
})
public class HeaderNoteType {

    @XmlElement(name = "ContentCode")
    protected CodeType contentCode;
    @XmlElement(name = "Content")
    protected TextType content;

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

}
