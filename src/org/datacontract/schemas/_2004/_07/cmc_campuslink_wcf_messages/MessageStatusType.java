
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="FailedValidation"/>
 *     &lt;enumeration value="FailedExecution"/>
 *     &lt;enumeration value="FailedAuthorization"/>
 *     &lt;enumeration value="FailedOther"/>
 *     &lt;enumeration value="ForcedComplete"/>
 *     &lt;enumeration value="ForcedFail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageStatusType")
@XmlEnum
public enum MessageStatusType {

    OK("OK"),
    @XmlEnumValue("FailedValidation")
    FAILED_VALIDATION("FailedValidation"),
    @XmlEnumValue("FailedExecution")
    FAILED_EXECUTION("FailedExecution"),
    @XmlEnumValue("FailedAuthorization")
    FAILED_AUTHORIZATION("FailedAuthorization"),
    @XmlEnumValue("FailedOther")
    FAILED_OTHER("FailedOther"),
    @XmlEnumValue("ForcedComplete")
    FORCED_COMPLETE("ForcedComplete"),
    @XmlEnumValue("ForcedFail")
    FORCED_FAIL("ForcedFail");
    private final String value;

    MessageStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageStatusType fromValue(String v) {
        for (MessageStatusType c: MessageStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
