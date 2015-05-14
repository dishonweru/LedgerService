
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerResponse;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.VerifyStudentResponse;


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
 *         &lt;element name="ProcessedRequest" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}ProcessedRequestInfo" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}TrxStatus" minOccurs="0"/>
 *         &lt;element name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrxResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "processedRequest",
    "status",
    "tokenId",
    "trxResult"
})
@XmlSeeAlso({
    KUPostLedgerResponse.class,
    VerifyStudentResponse.class
})
public class GenericResponse {

    @XmlElementRef(name = "ProcessedRequest", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessedRequestInfo> processedRequest;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected TrxStatus status;
    @XmlElementRef(name = "TokenId", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenId;
    @XmlElementRef(name = "TrxResult", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trxResult;

    /**
     * Gets the value of the processedRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessedRequestInfo }{@code >}
     *     
     */
    public JAXBElement<ProcessedRequestInfo> getProcessedRequest() {
        return processedRequest;
    }

    /**
     * Sets the value of the processedRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessedRequestInfo }{@code >}
     *     
     */
    public void setProcessedRequest(JAXBElement<ProcessedRequestInfo> value) {
        this.processedRequest = value;
    }

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

    /**
     * Gets the value of the trxResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrxResult() {
        return trxResult;
    }

    /**
     * Sets the value of the trxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrxResult(JAXBElement<String> value) {
        this.trxResult = value;
    }

}
