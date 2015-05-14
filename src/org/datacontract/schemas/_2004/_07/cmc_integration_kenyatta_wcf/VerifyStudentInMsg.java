
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericInMsg;


/**
 * <p>Java class for VerifyStudentInMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyStudentInMsg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericInMsg">
 *       &lt;sequence>
 *         &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsNationalID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyStudentInMsg", propOrder = {
    "billRefNumber",
    "isNationalID"
})
public class VerifyStudentInMsg
    extends GenericInMsg
{

    @XmlElementRef(name = "BillRefNumber", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billRefNumber;
    @XmlElement(name = "IsNationalID")
    protected Boolean isNationalID;

    /**
     * Gets the value of the billRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillRefNumber() {
        return billRefNumber;
    }

    /**
     * Sets the value of the billRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillRefNumber(JAXBElement<String> value) {
        this.billRefNumber = value;
    }

    /**
     * Gets the value of the isNationalID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNationalID() {
        return isNationalID;
    }

    /**
     * Sets the value of the isNationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNationalID(Boolean value) {
        this.isNationalID = value;
    }

}
