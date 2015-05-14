
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericRequest;


/**
 * <p>Java class for VerifyStudentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyStudentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericRequest">
 *       &lt;sequence>
 *         &lt;element name="VerifyStudentInMsg" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}ArrayOfVerifyStudentInMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyStudentRequest", propOrder = {
    "verifyStudentInMsg"
})
public class VerifyStudentRequest
    extends GenericRequest
{

    @XmlElementRef(name = "VerifyStudentInMsg", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVerifyStudentInMsg> verifyStudentInMsg;

    /**
     * Gets the value of the verifyStudentInMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerifyStudentInMsg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVerifyStudentInMsg> getVerifyStudentInMsg() {
        return verifyStudentInMsg;
    }

    /**
     * Sets the value of the verifyStudentInMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerifyStudentInMsg }{@code >}
     *     
     */
    public void setVerifyStudentInMsg(JAXBElement<ArrayOfVerifyStudentInMsg> value) {
        this.verifyStudentInMsg = value;
    }

}
