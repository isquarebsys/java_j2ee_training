package com.isquarebsys.ws.jaxb;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
 
/**
 * 
 * https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
 * 
 * 
 * This is expected by SOAPConnector
 * @author user
 *
 */
@Configuration
public class WebserviceConfig {
	 @Bean
	    public Jaxb2Marshaller marshaller() {
	        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	        // this is the package name specified in the <generatePackage> specified in pom.xml
	        marshaller.setContextPath("com.isquarebsys.ws.jaxb");
	        return marshaller;
	    }
	 
	    @Bean
	    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
	        SOAPConnector client = new SOAPConnector();
	        client.setDefaultUri("http://vijay-e460:6060/mockGlobalWeatherSoap");
	        client.setMarshaller(marshaller);
	        client.setUnmarshaller(marshaller);
	        return client;
	    }
	}
