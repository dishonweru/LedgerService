
package org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages package. 
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

    private final static QName _ArrayOfProcessedRequestInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ArrayOfProcessedRequestInfo");
    private final static QName _TrxStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "TrxStatus");
    private final static QName _GenericRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "GenericRequest");
    private final static QName _GenericMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "GenericMsg");
    private final static QName _ArrayOfCustomAttributeMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ArrayOfCustomAttributeMsg");
    private final static QName _GenericResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "GenericResponse");
    private final static QName _ProcessedRequestInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ProcessedRequestInfo");
    private final static QName _GenericOutMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "GenericOutMsg");
    private final static QName _ServiceFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ServiceFault");
    private final static QName _CustomAttributeMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "CustomAttributeMsg");
    private final static QName _MessageStatusType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "MessageStatusType");
    private final static QName _GenericInMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "GenericInMsg");
    private final static QName _GenericMsgCustomAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "CustomAttributes");
    private final static QName _CustomAttributeMsgName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "Name");
    private final static QName _CustomAttributeMsgValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "Value");
    private final static QName _ProcessedRequestInfoProcessedCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ProcessedCode");
    private final static QName _ProcessedRequestInfoProcessedRequests_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ProcessedRequests");
    private final static QName _GenericOutMsgMessageErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "MessageErrorCode");
    private final static QName _GenericOutMsgMessageResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "MessageResult");
    private final static QName _GenericRequestTokenId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "TokenId");
    private final static QName _GenericInMsgMessageState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "MessageState");
    private final static QName _GenericResponseTrxResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "TrxResult");
    private final static QName _GenericResponseProcessedRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "ProcessedRequest");
    private final static QName _ServiceFaultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfCustomAttributeMsg }
     * 
     */
    public ArrayOfCustomAttributeMsg createArrayOfCustomAttributeMsg() {
        return new ArrayOfCustomAttributeMsg();
    }

    /**
     * Create an instance of {@link GenericOutMsg }
     * 
     */
    public GenericOutMsg createGenericOutMsg() {
        return new GenericOutMsg();
    }

    /**
     * Create an instance of {@link GenericResponse }
     * 
     */
    public GenericResponse createGenericResponse() {
        return new GenericResponse();
    }

    /**
     * Create an instance of {@link ProcessedRequestInfo }
     * 
     */
    public ProcessedRequestInfo createProcessedRequestInfo() {
        return new ProcessedRequestInfo();
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link ArrayOfProcessedRequestInfo }
     * 
     */
    public ArrayOfProcessedRequestInfo createArrayOfProcessedRequestInfo() {
        return new ArrayOfProcessedRequestInfo();
    }

    /**
     * Create an instance of {@link GenericMsg }
     * 
     */
    public GenericMsg createGenericMsg() {
        return new GenericMsg();
    }

    /**
     * Create an instance of {@link GenericInMsg }
     * 
     */
    public GenericInMsg createGenericInMsg() {
        return new GenericInMsg();
    }

    /**
     * Create an instance of {@link GenericRequest }
     * 
     */
    public GenericRequest createGenericRequest() {
        return new GenericRequest();
    }

    /**
     * Create an instance of {@link CustomAttributeMsg }
     * 
     */
    public CustomAttributeMsg createCustomAttributeMsg() {
        return new CustomAttributeMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessedRequestInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ArrayOfProcessedRequestInfo")
    public JAXBElement<ArrayOfProcessedRequestInfo> createArrayOfProcessedRequestInfo(ArrayOfProcessedRequestInfo value) {
        return new JAXBElement<ArrayOfProcessedRequestInfo>(_ArrayOfProcessedRequestInfo_QNAME, ArrayOfProcessedRequestInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrxStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "TrxStatus")
    public JAXBElement<TrxStatus> createTrxStatus(TrxStatus value) {
        return new JAXBElement<TrxStatus>(_TrxStatus_QNAME, TrxStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "GenericRequest")
    public JAXBElement<GenericRequest> createGenericRequest(GenericRequest value) {
        return new JAXBElement<GenericRequest>(_GenericRequest_QNAME, GenericRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "GenericMsg")
    public JAXBElement<GenericMsg> createGenericMsg(GenericMsg value) {
        return new JAXBElement<GenericMsg>(_GenericMsg_QNAME, GenericMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomAttributeMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ArrayOfCustomAttributeMsg")
    public JAXBElement<ArrayOfCustomAttributeMsg> createArrayOfCustomAttributeMsg(ArrayOfCustomAttributeMsg value) {
        return new JAXBElement<ArrayOfCustomAttributeMsg>(_ArrayOfCustomAttributeMsg_QNAME, ArrayOfCustomAttributeMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "GenericResponse")
    public JAXBElement<GenericResponse> createGenericResponse(GenericResponse value) {
        return new JAXBElement<GenericResponse>(_GenericResponse_QNAME, GenericResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessedRequestInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ProcessedRequestInfo")
    public JAXBElement<ProcessedRequestInfo> createProcessedRequestInfo(ProcessedRequestInfo value) {
        return new JAXBElement<ProcessedRequestInfo>(_ProcessedRequestInfo_QNAME, ProcessedRequestInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericOutMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "GenericOutMsg")
    public JAXBElement<GenericOutMsg> createGenericOutMsg(GenericOutMsg value) {
        return new JAXBElement<GenericOutMsg>(_GenericOutMsg_QNAME, GenericOutMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ServiceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomAttributeMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "CustomAttributeMsg")
    public JAXBElement<CustomAttributeMsg> createCustomAttributeMsg(CustomAttributeMsg value) {
        return new JAXBElement<CustomAttributeMsg>(_CustomAttributeMsg_QNAME, CustomAttributeMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "MessageStatusType")
    public JAXBElement<MessageStatusType> createMessageStatusType(MessageStatusType value) {
        return new JAXBElement<MessageStatusType>(_MessageStatusType_QNAME, MessageStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericInMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "GenericInMsg")
    public JAXBElement<GenericInMsg> createGenericInMsg(GenericInMsg value) {
        return new JAXBElement<GenericInMsg>(_GenericInMsg_QNAME, GenericInMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomAttributeMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "CustomAttributes", scope = GenericMsg.class)
    public JAXBElement<ArrayOfCustomAttributeMsg> createGenericMsgCustomAttributes(ArrayOfCustomAttributeMsg value) {
        return new JAXBElement<ArrayOfCustomAttributeMsg>(_GenericMsgCustomAttributes_QNAME, ArrayOfCustomAttributeMsg.class, GenericMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "Name", scope = CustomAttributeMsg.class)
    public JAXBElement<String> createCustomAttributeMsgName(String value) {
        return new JAXBElement<String>(_CustomAttributeMsgName_QNAME, String.class, CustomAttributeMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "Value", scope = CustomAttributeMsg.class)
    public JAXBElement<String> createCustomAttributeMsgValue(String value) {
        return new JAXBElement<String>(_CustomAttributeMsgValue_QNAME, String.class, CustomAttributeMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ProcessedCode", scope = ProcessedRequestInfo.class)
    public JAXBElement<String> createProcessedRequestInfoProcessedCode(String value) {
        return new JAXBElement<String>(_ProcessedRequestInfoProcessedCode_QNAME, String.class, ProcessedRequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessedRequestInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ProcessedRequests", scope = ProcessedRequestInfo.class)
    public JAXBElement<ArrayOfProcessedRequestInfo> createProcessedRequestInfoProcessedRequests(ArrayOfProcessedRequestInfo value) {
        return new JAXBElement<ArrayOfProcessedRequestInfo>(_ProcessedRequestInfoProcessedRequests_QNAME, ArrayOfProcessedRequestInfo.class, ProcessedRequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "MessageErrorCode", scope = GenericOutMsg.class)
    public JAXBElement<String> createGenericOutMsgMessageErrorCode(String value) {
        return new JAXBElement<String>(_GenericOutMsgMessageErrorCode_QNAME, String.class, GenericOutMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "MessageResult", scope = GenericOutMsg.class)
    public JAXBElement<String> createGenericOutMsgMessageResult(String value) {
        return new JAXBElement<String>(_GenericOutMsgMessageResult_QNAME, String.class, GenericOutMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "TokenId", scope = GenericRequest.class)
    public JAXBElement<String> createGenericRequestTokenId(String value) {
        return new JAXBElement<String>(_GenericRequestTokenId_QNAME, String.class, GenericRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "MessageState", scope = GenericInMsg.class)
    public JAXBElement<String> createGenericInMsgMessageState(String value) {
        return new JAXBElement<String>(_GenericInMsgMessageState_QNAME, String.class, GenericInMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "TrxResult", scope = GenericResponse.class)
    public JAXBElement<String> createGenericResponseTrxResult(String value) {
        return new JAXBElement<String>(_GenericResponseTrxResult_QNAME, String.class, GenericResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessedRequestInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "ProcessedRequest", scope = GenericResponse.class)
    public JAXBElement<ProcessedRequestInfo> createGenericResponseProcessedRequest(ProcessedRequestInfo value) {
        return new JAXBElement<ProcessedRequestInfo>(_GenericResponseProcessedRequest_QNAME, ProcessedRequestInfo.class, GenericResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "TokenId", scope = GenericResponse.class)
    public JAXBElement<String> createGenericResponseTokenId(String value) {
        return new JAXBElement<String>(_GenericRequestTokenId_QNAME, String.class, GenericResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Cmc.CampusLink.Wcf.Messages.Common", name = "Message", scope = ServiceFault.class)
    public JAXBElement<String> createServiceFaultMessage(String value) {
        return new JAXBElement<String>(_ServiceFaultMessage_QNAME, String.class, ServiceFault.class, value);
    }

}
