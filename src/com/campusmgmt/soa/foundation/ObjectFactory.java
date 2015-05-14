
package com.campusmgmt.soa.foundation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.campusmgmt.soa.foundation package. 
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

    private final static QName _RequestHeader_QNAME = new QName("http://www.campusmgmt.com/Soa/Foundation/", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("http://www.campusmgmt.com/Soa/Foundation/", "ResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.campusmgmt.soa.foundation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuthorizationTokenResponse }
     * 
     */
    public GetAuthorizationTokenResponse createGetAuthorizationTokenResponse() {
        return new GetAuthorizationTokenResponse();
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link GetAuthorizationToken }
     * 
     */
    public GetAuthorizationToken createGetAuthorizationToken() {
        return new GetAuthorizationToken();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.campusmgmt.com/Soa/Foundation/", name = "RequestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.campusmgmt.com/Soa/Foundation/", name = "ResponseHeader")
    public JAXBElement<ResponseHeader> createResponseHeader(ResponseHeader value) {
        return new JAXBElement<ResponseHeader>(_ResponseHeader_QNAME, ResponseHeader.class, null, value);
    }

}
