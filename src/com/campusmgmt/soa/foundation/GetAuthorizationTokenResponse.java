
package com.campusmgmt.soa.foundation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.campusmgmt.soa.foundation.messagedefinition.TokenResponse;


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
 *         &lt;element ref="{http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd}TokenResponse" minOccurs="0"/>
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
    "tokenResponse"
})
@XmlRootElement(name = "GetAuthorizationTokenResponse")
public class GetAuthorizationTokenResponse {

    @XmlElement(name = "TokenResponse", namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd")
    protected TokenResponse tokenResponse;

    /**
     * Gets the value of the tokenResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TokenResponse }
     *     
     */
    public TokenResponse getTokenResponse() {
        return tokenResponse;
    }

    /**
     * Sets the value of the tokenResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenResponse }
     *     
     */
    public void setTokenResponse(TokenResponse value) {
        this.tokenResponse = value;
    }

}
