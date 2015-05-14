
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomAttributeMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomAttributeMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomAttributeMsg" type="{http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common}CustomAttributeMsg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomAttributeMsg", propOrder = {
    "customAttributeMsg"
})
public class ArrayOfCustomAttributeMsg {

    @XmlElement(name = "CustomAttributeMsg", nillable = true)
    protected List<CustomAttributeMsg> customAttributeMsg;

    /**
     * Gets the value of the customAttributeMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customAttributeMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomAttributeMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttributeMsg }
     * 
     * 
     */
    public List<CustomAttributeMsg> getCustomAttributeMsg() {
        if (customAttributeMsg == null) {
            customAttributeMsg = new ArrayList<CustomAttributeMsg>();
        }
        return this.customAttributeMsg;
    }

}
