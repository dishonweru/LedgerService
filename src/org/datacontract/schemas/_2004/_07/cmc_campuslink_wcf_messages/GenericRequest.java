
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_client_businessentities.RequestMessageSource;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerRequest;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.VerifyStudentRequest;


/**
 * <p>Java class for GenericRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRequestId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Client.BusinessEntities.Common}RequestMessageSource" minOccurs="0"/>
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
@XmlType(name = "GenericRequest", propOrder = {
    "serviceRequestId",
    "source",
    "tokenId"
})
@XmlSeeAlso({
    KUPostLedgerRequest.class,
    VerifyStudentRequest.class
})
public class GenericRequest {

    @XmlElement(name = "ServiceRequestId")
    protected Integer serviceRequestId;
    @XmlElement(name = "Source")
    @XmlSchemaType(name = "string")
    protected RequestMessageSource source;
    @XmlElementRef(name = "TokenId", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenId;

    /**
     * Gets the value of the serviceRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceRequestId() {
        return serviceRequestId;
    }

    /**
     * Sets the value of the serviceRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceRequestId(Integer value) {
        this.serviceRequestId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMessageSource }
     *     
     */
    public RequestMessageSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMessageSource }
     *     
     */
    public void setSource(RequestMessageSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenId(JAXBElement<String> value) {
        this.tokenId = value;
    }

}
