
package com.campusmgmt.soa.foundation.messagedefinition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd}TrxStatus"/>
 *         &lt;element name="TrxResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResponse", propOrder = {
    "status",
    "trxResult",
    "tokenId"
})
@XmlSeeAlso({
    TokenResponse.class
})
public class GenericResponse {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected TrxStatus status;
    @XmlElement(name = "TrxResult")
    protected String trxResult;
    @XmlElement(name = "TokenId")
    protected String tokenId;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TrxStatus }
     *     
     */
    public TrxStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrxStatus }
     *     
     */
    public void setStatus(TrxStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the trxResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxResult() {
        return trxResult;
    }

    /**
     * Sets the value of the trxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxResult(String value) {
        this.trxResult = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

}
