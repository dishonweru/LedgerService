
package com.campusmgmt.soa.foundation.messagedefinition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd}GenericResponse">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecurityTransactionStatus" type="{http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd}SecurityStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenResponse", propOrder = {
    "userId",
    "securityTransactionStatus"
})
public class TokenResponse
    extends GenericResponse
{

    @XmlElement(name = "UserId", defaultValue = "-1")
    protected Integer userId;
    @XmlElement(name = "SecurityTransactionStatus", defaultValue = "OK")
    @XmlSchemaType(name = "string")
    protected SecurityStatusType securityTransactionStatus;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the securityTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatusType }
     *     
     */
    public SecurityStatusType getSecurityTransactionStatus() {
        return securityTransactionStatus;
    }

    /**
     * Sets the value of the securityTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatusType }
     *     
     */
    public void setSecurityTransactionStatus(SecurityStatusType value) {
        this.securityTransactionStatus = value;
    }

}
