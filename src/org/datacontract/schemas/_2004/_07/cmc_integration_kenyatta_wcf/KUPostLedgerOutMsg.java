
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericOutMsg;


/**
 * <p>Java class for KUPostLedgerOutMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KUPostLedgerOutMsg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericOutMsg">
 *       &lt;sequence>
 *         &lt;element name="BankTransactionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MscFld1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MscFld2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KUPostLedgerOutMsg", propOrder = {
    "bankTransactionReference",
    "billReferenceNumber",
    "ledgerReferenceNumber",
    "status",
    "errorDescription",
    "mscFld1",
    "mscFld2"
})
public class KUPostLedgerOutMsg
    extends GenericOutMsg
{

    @XmlElementRef(name = "BankTransactionReference", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankTransactionReference;
    @XmlElementRef(name = "BillReferenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billReferenceNumber;
    @XmlElementRef(name = "LedgerReferenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ledgerReferenceNumber;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "MscFld1", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mscFld1;
    @XmlElementRef(name = "MscFld2", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mscFld2;

    /**
     * Gets the value of the bankTransactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankTransactionReference() {
        return bankTransactionReference;
    }

    /**
     * Sets the value of the bankTransactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankTransactionReference(JAXBElement<String> value) {
        this.bankTransactionReference = value;
    }

    /**
     * Gets the value of the billReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillReferenceNumber() {
        return billReferenceNumber;
    }

    /**
     * Sets the value of the billReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillReferenceNumber(JAXBElement<String> value) {
        this.billReferenceNumber = value;
    }

    /**
     * Gets the value of the ledgerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLedgerReferenceNumber() {
        return ledgerReferenceNumber;
    }

    /**
     * Sets the value of the ledgerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLedgerReferenceNumber(JAXBElement<String> value) {
        this.ledgerReferenceNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescription(JAXBElement<String> value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the mscFld1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMscFld1() {
        return mscFld1;
    }

    /**
     * Sets the value of the mscFld1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMscFld1(JAXBElement<String> value) {
        this.mscFld1 = value;
    }

    /**
     * Gets the value of the mscFld2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMscFld2() {
        return mscFld2;
    }

    /**
     * Sets the value of the mscFld2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMscFld2(JAXBElement<String> value) {
        this.mscFld2 = value;
    }

}
