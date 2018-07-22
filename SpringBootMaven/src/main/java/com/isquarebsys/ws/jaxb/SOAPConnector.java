package com.isquarebsys.ws.jaxb;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
 * 
 * 
 * Basically injects one interface with internal implementation of WebServiceTemplate 
 * 		which is available by getWebServiceTemplate() method
 * 
 * Expects the following
 * 1. WebserviceConfig
 * 		1.1. Requires Marshaller and Unmarshaller, which are instances of Jaxb2Marshaller class
 * 		1.2. Uses the package mentioned in WebserviceConfig to create the JAXB Context
 * 
 * @author user
 *
 */
public class SOAPConnector extends WebServiceGatewaySupport {
 
    public Object callWebService(String url, Object request){
    	WebServiceTemplate webServiceTemplate= getWebServiceTemplate();
        return webServiceTemplate.marshalSendAndReceive(url, request);
    }
}