
package com.campusmgmt.soa.foundation.messagedefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerResponse;


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
 *         &lt;element name="PostLedgerResult" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}KUPostLedgerResponse" minOccurs="0"/>
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
    "postLedgerResult"
})
@XmlRootElement(name = "PostLedgerResponse")
public class PostLedgerResponse {

    @XmlElementRef(name = "PostLedgerResult", namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<KUPostLedgerResponse> postLedgerResult;

    /**
     * Gets the value of the postLedgerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KUPostLedgerResponse }{@code >}
     *     
     */
    public JAXBElement<KUPostLedgerResponse> getPostLedgerResult() {
        return postLedgerResult;
    }

    /**
     * Sets the value of the postLedgerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KUPostLedgerResponse }{@code >}
     *     
     */
    public void setPostLedgerResult(JAXBElement<KUPostLedgerResponse> value) {
        this.postLedgerResult = value;
    }

}
