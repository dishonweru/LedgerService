
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomAttributes" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}ArrayOfCustomAttributeMsg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericMsg", propOrder = {
    "correlationId",
    "customAttributes"
})
@XmlSeeAlso({
    GenericOutMsg.class,
    GenericInMsg.class
})
public class GenericMsg {

    @XmlElement(name = "CorrelationId")
    protected int correlationId;
    @XmlElementRef(name = "CustomAttributes", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomAttributeMsg> customAttributes;

    /**
     * Gets the value of the correlationId property.
     * 
     */
    public int getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     */
    public void setCorrelationId(int value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomAttributeMsg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomAttributeMsg> getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomAttributeMsg }{@code >}
     *     
     */
    public void setCustomAttributes(JAXBElement<ArrayOfCustomAttributeMsg> value) {
        this.customAttributes = value;
    }

}
