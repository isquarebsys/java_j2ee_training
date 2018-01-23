package com.isquarebsys.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

 
@RestController
public class RestConsumerController
{
    @RequestMapping("/consume/rest")
    public Response getResponse()
    {
    	RestTemplate restTemplate = new RestTemplate();
		Response response = restTemplate.getForObject("http://services.groupkt.com/country/get/iso2code/IN",
				Response.class);
		return response;
    }
}

