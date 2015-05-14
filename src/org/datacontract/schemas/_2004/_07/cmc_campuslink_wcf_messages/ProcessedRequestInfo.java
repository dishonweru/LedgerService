
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedRequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessedRequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessedRequestId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcessedRequests" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}ArrayOfProcessedRequestInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessedRequestInfo", propOrder = {
    "processId",
    "processedCode",
    "processedRequestId",
    "processedRequests"
})
public class ProcessedRequestInfo {

    @XmlElement(name = "ProcessId")
    protected Integer processId;
    @XmlElementRef(name = "ProcessedCode", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processedCode;
    @XmlElement(name = "ProcessedRequestId")
    protected Integer processedRequestId;
    @XmlElementRef(name = "ProcessedRequests", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProcessedRequestInfo> processedRequests;

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessId(Integer value) {
        this.processId = value;
    }

    /**
     * Gets the value of the processedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessedCode() {
        return processedCode;
    }

    /**
     * Sets the value of the processedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessedCode(JAXBElement<String> value) {
        this.processedCode = value;
    }

    /**
     * Gets the value of the processedRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessedRequestId() {
        return processedRequestId;
    }

    /**
     * Sets the value of the processedRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessedRequestId(Integer value) {
        this.processedRequestId = value;
    }

    /**
     * Gets the value of the processedRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessedRequestInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProcessedRequestInfo> getProcessedRequests() {
        return processedRequests;
    }

    /**
     * Sets the value of the processedRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessedRequestInfo }{@code >}
     *     
     */
    public void setProcessedRequests(JAXBElement<ArrayOfProcessedRequestInfo> value) {
        this.processedRequests = value;
    }

}
