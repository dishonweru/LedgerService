
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericResponse;


/**
 * <p>Java class for VerifyStudentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyStudentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericResponse">
 *       &lt;sequence>
 *         &lt;element name="VerifyStudentOutmsg" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}ArrayOfVerifyStudentOutMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyStudentResponse", propOrder = {
    "verifyStudentOutmsg"
})
public class VerifyStudentResponse
    extends GenericResponse
{

    @XmlElementRef(name = "VerifyStudentOutmsg", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVerifyStudentOutMsg> verifyStudentOutmsg;

    /**
     * Gets the value of the verifyStudentOutmsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerifyStudentOutMsg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVerifyStudentOutMsg> getVerifyStudentOutmsg() {
        return verifyStudentOutmsg;
    }

    /**
     * Sets the value of the verifyStudentOutmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerifyStudentOutMsg }{@code >}
     *     
     */
    public void setVerifyStudentOutmsg(JAXBElement<ArrayOfVerifyStudentOutMsg> value) {
        this.verifyStudentOutmsg = value;
    }

}
