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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour EntryEventType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EntryEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnteredByName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType" minOccurs="0"/&gt;
 *         &lt;element name="EntryOccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryEventType", propOrder = {
    "enteredByName",
    "entryOccurrenceDateTime"
})
public class EntryEventType {

    @XmlElement(name = "EnteredByName")
    protected TextType enteredByName;
    @XmlElement(name = "EntryOccurrenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryOccurrenceDateTime;

    /**
     * Obtient la valeur de la propriété enteredByName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getEnteredByName() {
        return enteredByName;
    }

    /**
     * Définit la valeur de la propriété enteredByName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setEnteredByName(TextType value) {
        this.enteredByName = value;
    }

    /**
     * Obtient la valeur de la propriété entryOccurrenceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryOccurrenceDateTime() {
        return entryOccurrenceDateTime;
    }

    /**
     * Définit la valeur de la propriété entryOccurrenceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryOccurrenceDateTime(XMLGregorianCalendar value) {
        this.entryOccurrenceDateTime = value;
    }

}
