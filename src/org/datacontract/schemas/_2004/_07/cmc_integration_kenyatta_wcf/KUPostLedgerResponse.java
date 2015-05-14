
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericResponse;


/**
 * <p>Java class for KUPostLedgerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KUPostLedgerResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericResponse">
 *       &lt;sequence>
 *         &lt;element name="KUPostLedgerOutMsg" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}ArrayOfKUPostLedgerOutMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KUPostLedgerResponse", propOrder = {
    "kuPostLedgerOutMsg"
})
public class KUPostLedgerResponse
    extends GenericResponse
{

    @XmlElementRef(name = "KUPostLedgerOutMsg", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKUPostLedgerOutMsg> kuPostLedgerOutMsg;

    /**
     * Gets the value of the kuPostLedgerOutMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKUPostLedgerOutMsg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKUPostLedgerOutMsg> getKUPostLedgerOutMsg() {
        return kuPostLedgerOutMsg;
    }

    /**
     * Sets the value of the kuPostLedgerOutMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKUPostLedgerOutMsg }{@code >}
     *     
     */
    public void setKUPostLedgerOutMsg(JAXBElement<ArrayOfKUPostLedgerOutMsg> value) {
        this.kuPostLedgerOutMsg = value;
    }

}
