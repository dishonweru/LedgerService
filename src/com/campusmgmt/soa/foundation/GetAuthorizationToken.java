
package com.campusmgmt.soa.foundation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.campusmgmt.soa.foundation.messagedefinition.TokenRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd}TokenRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenRequest"
})
@XmlRootElement(name = "GetAuthorizationToken")
public class GetAuthorizationToken {

    @XmlElement(name = "TokenRequest", namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd")
    protected TokenRequest tokenRequest;

    /**
     * Gets the value of the tokenRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequest }
     *     
     */
    public TokenRequest getTokenRequest() {
        return tokenRequest;
    }

    /**
     * Sets the value of the tokenRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequest }
     *     
     */
    public void setTokenRequest(TokenRequest value) {
        this.tokenRequest = value;
    }

}
