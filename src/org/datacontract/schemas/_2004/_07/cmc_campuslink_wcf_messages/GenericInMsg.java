
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerInMsg;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.VerifyStudentInMsg;


/**
 * <p>Java class for GenericInMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericInMsg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericMsg">
 *       &lt;sequence>
 *         &lt;element name="MessageState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceMessageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericInMsg", propOrder = {
    "messageState",
    "serviceMessageId"
})
@XmlSeeAlso({
    VerifyStudentInMsg.class,
    KUPostLedgerInMsg.class
})
public class GenericInMsg
    extends GenericMsg
{

    @XmlElementRef(name = "MessageState", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageState;
    @XmlElement(name = "ServiceMessageId")
    protected Integer serviceMessageId;

    /**
     * Gets the value of the messageState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageState() {
        return messageState;
    }

    /**
     * Sets the value of the messageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageState(JAXBElement<String> value) {
        this.messageState = value;
    }

    /**
     * Gets the value of the serviceMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceMessageId() {
        return serviceMessageId;
    }

    /**
     * Sets the value of the serviceMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceMessageId(Integer value) {
        this.serviceMessageId = value;
    }

}
