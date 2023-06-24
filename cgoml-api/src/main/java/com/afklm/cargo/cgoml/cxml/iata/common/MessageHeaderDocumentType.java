//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.07.07 à 03:05:11 PM CEST 
//


package com.afklm.cargo.cgoml.cxml.iata.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.afklm.cargo.cgoml.cxml.iata.common.qualifieddatatype.DocumentCodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.CodeType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.IDType;
import com.afklm.cargo.cgoml.cxml.iata.common.unqualifieddatatype.TextType;


/**
 * <p>Classe Java pour MessageHeaderDocumentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MessageHeaderDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}TextType"/&gt;
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentCodeType"/&gt;
 *         &lt;element name="IssueDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}DateTimeType"/&gt;
 *         &lt;element name="PurposeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}CodeType"/&gt;
 *         &lt;element name="VersionID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType"/&gt;
 *         &lt;element name="ConversationID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:8}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SenderParty" type="{iata:datamodel:3}SenderPartyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RecipientParty" type="{iata:datamodel:3}RecipientPartyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeaderDocumentType", propOrder = {
    "id",
    "name",
    "typeCode",
    "issueDateTime",
    "purposeCode",
    "versionID",
    "conversationID",
    "senderParty",
    "recipientParty"
})
public class MessageHeaderDocumentType
{

    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "Name", required = true)
    protected TextType name;
    @XmlElement(name = "TypeCode", required = true)
    protected DocumentCodeType typeCode;
    @XmlElement(name = "IssueDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDateTime;
    @XmlElement(name = "PurposeCode", required = true)
    protected CodeType purposeCode;
    @XmlElement(name = "VersionID", required = true)
    protected IDType versionID;
    @XmlElement(name = "ConversationID")
    protected IDType conversationID;
    @XmlElement(name = "SenderParty", required = true)
    protected List<SenderPartyType> senderParty;
    @XmlElement(name = "RecipientParty", required = true)
    protected List<RecipientPartyType> recipientParty;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété typeCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCodeType }
     *     
     */
    public DocumentCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Définit la valeur de la propriété typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCodeType }
     *     
     */
    public void setTypeCode(DocumentCodeType value) {
        this.typeCode = value;
    }

    /**
     * Obtient la valeur de la propriété issueDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Définit la valeur de la propriété issueDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDateTime(XMLGregorianCalendar value) {
        this.issueDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété purposeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPurposeCode() {
        return purposeCode;
    }

    /**
     * Définit la valeur de la propriété purposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPurposeCode(CodeType value) {
        this.purposeCode = value;
    }

    /**
     * Obtient la valeur de la propriété versionID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getVersionID() {
        return versionID;
    }

    /**
     * Définit la valeur de la propriété versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setVersionID(IDType value) {
        this.versionID = value;
    }

    /**
     * Obtient la valeur de la propriété conversationID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getConversationId() {
        return conversationID;
    }

    /**
     * Définit la valeur de la propriété conversationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setConversationID(IDType value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the senderParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the senderParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenderParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SenderPartyType }
     * 
     * 
     */
    public List<SenderPartyType> getSenderParty() {
        if (senderParty == null) {
            senderParty = new ArrayList<SenderPartyType>();
        }
        return this.senderParty;
    }

    /**
     * Gets the value of the recipientParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipientPartyType }
     * 
     * 
     */
    public List<RecipientPartyType> getRecipientParty() {
        if (recipientParty == null) {
            recipientParty = new ArrayList<RecipientPartyType>();
        }
        return this.recipientParty;
    }

}
