
package com.campusmgmt.soa.foundation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.campusmgmt.soa.foundation.messagedefinition.TokenRequest;
import com.campusmgmt.soa.foundation.messagedefinition.TokenResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AuthenticationSoap", targetNamespace = "http://www.campusmgmt.com/Soa/Foundation/")
@XmlSeeAlso({
    com.campusmgmt.soa.foundation.ObjectFactory.class,
    com.campusmgmt.soa.foundation.messagedefinition.ObjectFactory.class
})
public interface AuthenticationSoap {


    /**
     * 
     * @param tokenRequest
     * @return
     *     returns com.campusmgmt.soa.foundation.messagedefinition.TokenResponse
     */
    @WebMethod(operationName = "GetAuthorizationToken", action = "http://www.campusmgmt.com/Soa/Foundation/GetAuthorizationToken")
    @WebResult(name = "TokenResponse", targetNamespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd")
    @RequestWrapper(localName = "GetAuthorizationToken", targetNamespace = "http://www.campusmgmt.com/Soa/Foundation/", className = "com.campusmgmt.soa.foundation.GetAuthorizationToken")
    @ResponseWrapper(localName = "GetAuthorizationTokenResponse", targetNamespace = "http://www.campusmgmt.com/Soa/Foundation/", className = "com.campusmgmt.soa.foundation.GetAuthorizationTokenResponse")
    public TokenResponse getAuthorizationToken(
        @WebParam(name = "TokenRequest", targetNamespace = "http://www.campusmgmt.com/Soa/Foundation/MessageDefinition.xsd")
        TokenRequest tokenRequest);

}