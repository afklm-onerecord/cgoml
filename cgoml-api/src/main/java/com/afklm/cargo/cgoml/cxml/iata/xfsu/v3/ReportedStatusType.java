//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.06.03 à 10:46:55 AM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.xfsu.v3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;


/**
 * <p>Classe Java pour ReportedStatusType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReportedStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="AssociatedStatusConsignment" type="{iata:datamodel:3}StatusConsignmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedStatusType", propOrder = {
    "reasonCode",
    "associatedStatusConsignment"
})
public class ReportedStatusType {

    @XmlElement(name = "ReasonCode", required = true)
    protected CodeType reasonCode;
    @XmlElement(name = "AssociatedStatusConsignment")
    protected List<StatusConsignmentType> associatedStatusConsignment;

    /**
     * Obtient la valeur de la propriété reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Définit la valeur de la propriété reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the associatedStatusConsignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedStatusConsignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedStatusConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusConsignmentType }
     * 
     * 
     */
    public List<StatusConsignmentType> getAssociatedStatusConsignment() {
        if (associatedStatusConsignment == null) {
            associatedStatusConsignment = new ArrayList<StatusConsignmentType>();
        }
        return this.associatedStatusConsignment;
    }

}
