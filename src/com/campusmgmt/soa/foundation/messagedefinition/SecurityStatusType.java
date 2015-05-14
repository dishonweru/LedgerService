
package com.campusmgmt.soa.foundation.messagedefinition;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="FailedPasswordLength"/>
 *     &lt;enumeration value="FailedPasswordComplex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityStatusType")
@XmlEnum
public enum SecurityStatusType {

    OK("OK"),
    @XmlEnumValue("FailedPasswordLength")
    FAILED_PASSWORD_LENGTH("FailedPasswordLength"),
    @XmlEnumValue("FailedPasswordComplex")
    FAILED_PASSWORD_COMPLEX("FailedPasswordComplex");
    private final String value;

    SecurityStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityStatusType fromValue(String v) {
        for (SecurityStatusType c: SecurityStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
