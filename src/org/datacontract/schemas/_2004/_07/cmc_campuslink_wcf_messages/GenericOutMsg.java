
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerOutMsg;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.VerifyStudentOutMsg;


/**
 * <p>Java class for GenericOutMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericOutMsg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericMsg">
 *       &lt;sequence>
 *         &lt;element name="MessageErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageStatus" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}MessageStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericOutMsg", propOrder = {
    "messageErrorCode",
    "messageResult",
    "messageStatus"
})
@XmlSeeAlso({
    VerifyStudentOutMsg.class,
    KUPostLedgerOutMsg.class
})
public class GenericOutMsg
    extends GenericMsg
{

    @XmlElementRef(name = "MessageErrorCode", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageErrorCode;
    @XmlElementRef(name = "MessageResult", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageResult;
    @XmlElement(name = "MessageStatus")
    @XmlSchemaType(name = "string")
    protected MessageStatusType messageStatus;

    /**
     * Gets the value of the messageErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageErrorCode() {
        return messageErrorCode;
    }

    /**
     * Sets the value of the messageErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageErrorCode(JAXBElement<String> value) {
        this.messageErrorCode = value;
    }

    /**
     * Gets the value of the messageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageResult() {
        return messageResult;
    }

    /**
     * Sets the value of the messageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageResult(JAXBElement<String> value) {
        this.messageResult = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusType }
     *     
     */
    public MessageStatusType getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusType }
     *     
     */
    public void setMessageStatus(MessageStatusType value) {
        this.messageStatus = value;
    }

}
