package com.isquarebsys.ws.jaxb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ref: https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
 * @author user
 *
 */
 
@RestController
public class WeatherWSController
{
	@Autowired
	SOAPConnector soapConnector;
    @RequestMapping("/ws/weather")
    public GetWeatherResponse getWeather()
    {
    	GetWeather weatherRequest=new GetWeather();
    	weatherRequest.setCityName("Chennai");
    	weatherRequest.setCountryName("India");
    	GetWeatherResponse weatherResponse=(GetWeatherResponse)soapConnector.callWebService("http://localhost:8080/mockGlobalWeatherSoap", weatherRequest);
    	System.out.println(weatherResponse.getGetWeatherResult());
    	return weatherResponse;
    }
}

