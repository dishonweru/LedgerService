
package com.campusmgmt.soa.foundation.messagedefinition;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrxStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ErrorSQL"/>
 *     &lt;enumeration value="ErrorBusinessLogic"/>
 *     &lt;enumeration value="ErrorWebService"/>
 *     &lt;enumeration value="ErrorArguments"/>
 *     &lt;enumeration value="ErrorSecurity"/>
 *     &lt;enumeration value="ErrorSystem"/>
 *     &lt;enumeration value="ErrorMultiple"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrxStatus")
@XmlEnum
public enum TrxStatus {

    OK("OK"),
    @XmlEnumValue("ErrorSQL")
    ERROR_SQL("ErrorSQL"),
    @XmlEnumValue("ErrorBusinessLogic")
    ERROR_BUSINESS_LOGIC("ErrorBusinessLogic"),
    @XmlEnumValue("ErrorWebService")
    ERROR_WEB_SERVICE("ErrorWebService"),
    @XmlEnumValue("ErrorArguments")
    ERROR_ARGUMENTS("ErrorArguments"),
    @XmlEnumValue("ErrorSecurity")
    ERROR_SECURITY("ErrorSecurity"),
    @XmlEnumValue("ErrorSystem")
    ERROR_SYSTEM("ErrorSystem"),
    @XmlEnumValue("ErrorMultiple")
    ERROR_MULTIPLE("ErrorMultiple");
    private final String value;

    TrxStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrxStatus fromValue(String v) {
        for (TrxStatus c: TrxStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
