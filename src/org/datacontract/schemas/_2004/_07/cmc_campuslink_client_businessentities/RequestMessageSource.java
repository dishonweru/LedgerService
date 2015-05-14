
package org.datacontract.schemas._2004._07.cmc_campuslink_client_businessentities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestMessageSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CmcWcfService"/>
 *     &lt;enumeration value="CmcFaAutomation"/>
 *     &lt;enumeration value="CmcCVueRegulatory"/>
 *     &lt;enumeration value="CmcCVue"/>
 *     &lt;enumeration value="CmcCVuePortal"/>
 *     &lt;enumeration value="ExternalService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestMessageSource", namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Client.BusinessEntities.Common")
@XmlEnum
public enum RequestMessageSource {

    @XmlEnumValue("CmcWcfService")
    CMC_WCF_SERVICE("CmcWcfService"),
    @XmlEnumValue("CmcFaAutomation")
    CMC_FA_AUTOMATION("CmcFaAutomation"),
    @XmlEnumValue("CmcCVueRegulatory")
    CMC_C_VUE_REGULATORY("CmcCVueRegulatory"),
    @XmlEnumValue("CmcCVue")
    CMC_C_VUE("CmcCVue"),
    @XmlEnumValue("CmcCVuePortal")
    CMC_C_VUE_PORTAL("CmcCVuePortal"),
    @XmlEnumValue("ExternalService")
    EXTERNAL_SERVICE("ExternalService");
    private final String value;

    RequestMessageSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestMessageSource fromValue(String v) {
        for (RequestMessageSource c: RequestMessageSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
