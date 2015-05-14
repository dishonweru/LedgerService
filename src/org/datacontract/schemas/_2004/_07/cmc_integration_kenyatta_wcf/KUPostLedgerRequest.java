
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericRequest;


/**
 * <p>Java class for KUPostLedgerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KUPostLedgerRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericRequest">
 *       &lt;sequence>
 *         &lt;element name="KUPostLedgerInMsg" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}ArrayOfKUPostLedgerInMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KUPostLedgerRequest", propOrder = {
    "kuPostLedgerInMsg"
})
public class KUPostLedgerRequest
    extends GenericRequest
{

    @XmlElementRef(name = "KUPostLedgerInMsg", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKUPostLedgerInMsg> kuPostLedgerInMsg;

    /**
     * Gets the value of the kuPostLedgerInMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKUPostLedgerInMsg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKUPostLedgerInMsg> getKUPostLedgerInMsg() {
        return kuPostLedgerInMsg;
    }

    /**
     * Sets the value of the kuPostLedgerInMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKUPostLedgerInMsg }{@code >}
     *     
     */
    public void setKUPostLedgerInMsg(JAXBElement<ArrayOfKUPostLedgerInMsg> value) {
        this.kuPostLedgerInMsg = value;
    }

}
