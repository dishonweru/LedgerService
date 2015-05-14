
package com.campusmgmt.soa.foundation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Authentication", targetNamespace = "http://www.campusmgmt.com/Soa/Foundation/", wsdlLocation = "https://cvue-mapi.ku.ac.ke/cmc.campuslink.webservices.security/Authentication.asmx?wsdl")
public class Authentication
    extends Service
{

    private final static URL AUTHENTICATION_WSDL_LOCATION;
    private final static WebServiceException AUTHENTICATION_EXCEPTION;
    private final static QName AUTHENTICATION_QNAME = new QName("http://www.campusmgmt.com/Soa/Foundation/", "Authentication");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://cvue-mapi.ku.ac.ke/cmc.campuslink.webservices.security/Authentication.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHENTICATION_WSDL_LOCATION = url;
        AUTHENTICATION_EXCEPTION = e;
    }

    public Authentication() {
        super(__getWsdlLocation(), AUTHENTICATION_QNAME);
    }

    public Authentication(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHENTICATION_QNAME, features);
    }

    public Authentication(URL wsdlLocation) {
        super(wsdlLocation, AUTHENTICATION_QNAME);
    }

    public Authentication(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHENTICATION_QNAME, features);
    }

    public Authentication(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Authentication(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthenticationSoap
     */
    @WebEndpoint(name = "AuthenticationSoap")
    public AuthenticationSoap getAuthenticationSoap() {
        return super.getPort(new QName("http://www.campusmgmt.com/Soa/Foundation/", "AuthenticationSoap"), AuthenticationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticationSoap
     */
    @WebEndpoint(name = "AuthenticationSoap")
    public AuthenticationSoap getAuthenticationSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.campusmgmt.com/Soa/Foundation/", "AuthenticationSoap"), AuthenticationSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHENTICATION_EXCEPTION!= null) {
            throw AUTHENTICATION_EXCEPTION;
        }
        return AUTHENTICATION_WSDL_LOCATION;
    }

}
