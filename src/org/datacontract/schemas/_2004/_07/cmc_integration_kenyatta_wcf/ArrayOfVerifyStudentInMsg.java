
package org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVerifyStudentInMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVerifyStudentInMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerifyStudentInMsg" type="{http://schemas.datacontract.org/2004/07/Cmc.Integration.Kenyatta.Wcf.Messages}VerifyStudentInMsg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVerifyStudentInMsg", propOrder = {
    "verifyStudentInMsg"
})
public class ArrayOfVerifyStudentInMsg {

    @XmlElement(name = "VerifyStudentInMsg", nillable = true)
    protected List<VerifyStudentInMsg> verifyStudentInMsg;

    /**
     * Gets the value of the verifyStudentInMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifyStudentInMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifyStudentInMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerifyStudentInMsg }
     * 
     * 
     */
    public List<VerifyStudentInMsg> getVerifyStudentInMsg() {
        if (verifyStudentInMsg == null) {
            verifyStudentInMsg = new ArrayList<VerifyStudentInMsg>();
        }
        return this.verifyStudentInMsg;
    }

}
