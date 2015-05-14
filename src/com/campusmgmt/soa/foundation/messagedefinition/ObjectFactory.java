
package com.campusmgmt.soa.foundation.messagedefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerRequest;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.KUPostLedgerResponse;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.VerifyStudentRequest;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.VerifyStudentResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.campusmgmt.soa.foundation.messagedefinition package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PostLedgerRequest_QNAME = new QName("http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", "request");
    private final static QName _VerifyStudentDetailsResponseVerifyStudentDetailsResult_QNAME = new QName("http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", "VerifyStudentDetailsResult");
    private final static QName _PostLedgerResponsePostLedgerResult_QNAME = new QName("http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", "PostLedgerResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.campusmgmt.soa.foundation.messagedefinition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostLedger }
     * 
     */
    public PostLedger createPostLedger() {
        return new PostLedger();
    }

    /**
     * Create an instance of {@link VerifyStudentDetails }
     * 
     */
    public VerifyStudentDetails createVerifyStudentDetails() {
        return new VerifyStudentDetails();
    }

    /**
     * Create an instance of {@link PostLedgerResponse }
     * 
     */
    public PostLedgerResponse createPostLedgerResponse() {
        return new PostLedgerResponse();
    }

    /**
     * Create an instance of {@link VerifyStudentDetailsResponse }
     * 
     */
    public VerifyStudentDetailsResponse createVerifyStudentDetailsResponse() {
        return new VerifyStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KUPostLedgerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", name = "request", scope = PostLedger.class)
    public JAXBElement<KUPostLedgerRequest> createPostLedgerRequest(KUPostLedgerRequest value) {
        return new JAXBElement<KUPostLedgerRequest>(_PostLedgerRequest_QNAME, KUPostLedgerRequest.class, PostLedger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyStudentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", name = "request", scope = VerifyStudentDetails.class)
    public JAXBElement<VerifyStudentRequest> createVerifyStudentDetailsRequest(VerifyStudentRequest value) {
        return new JAXBElement<VerifyStudentRequest>(_PostLedgerRequest_QNAME, VerifyStudentRequest.class, VerifyStudentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", name = "VerifyStudentDetailsResult", scope = VerifyStudentDetailsResponse.class)
    public JAXBElement<VerifyStudentResponse> createVerifyStudentDetailsResponseVerifyStudentDetailsResult(VerifyStudentResponse value) {
        return new JAXBElement<VerifyStudentResponse>(_VerifyStudentDetailsResponseVerifyStudentDetailsResult_QNAME, VerifyStudentResponse.class, VerifyStudentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KUPostLedgerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd", name = "PostLedgerResult", scope = PostLedgerResponse.class)
    public JAXBElement<KUPostLedgerResponse> createPostLedgerResponsePostLedgerResult(KUPostLedgerResponse value) {
        return new JAXBElement<KUPostLedgerResponse>(_PostLedgerResponsePostLedgerResult_QNAME, KUPostLedgerResponse.class, PostLedgerResponse.class, value);
    }

}
