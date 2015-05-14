
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.GenericOutMsg;


/**
 * <p>Java class for VerifyStudentOutMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyStudentOutMsg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}GenericOutMsg">
 *       &lt;sequence>
 *         &lt;element name="BillReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}StudentStatus" minOccurs="0"/>
 *         &lt;element name="StudentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StudentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "VerifyStudentOutMsg", propOrder = {
    "billReferenceNumber",
    "status",
    "studentID",
    "studentName",
    "remark",
    "amount",
    "errorDescription",
    "mscFld1",
    "mscFld2"
})
public class VerifyStudentOutMsg
    extends GenericOutMsg
{

    @XmlElementRef(name = "BillReferenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billReferenceNumber;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected StudentStatus status;
    @XmlElement(name = "StudentID")
    protected Integer studentID;
    @XmlElementRef(name = "StudentName", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentName;
    @XmlElementRef(name = "Remark", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "MscFld1", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mscFld1;
    @XmlElementRef(name = "MscFld2", namespace = "http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mscFld2;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StudentStatus }
     *     
     */
    public StudentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentStatus }
     *     
     */
    public void setStatus(StudentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the studentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStudentID() {
        return studentID;
    }

    /**
     * Sets the value of the studentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStudentID(Integer value) {
        this.studentID = value;
    }

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentName(JAXBElement<String> value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
