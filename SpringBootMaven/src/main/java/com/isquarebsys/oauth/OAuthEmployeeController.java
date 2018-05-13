package com.isquarebsys.oauth;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.isquarebsys.rest.Employee;

/**
 * Once you access oauth/employees, its redirected to FetchTokenAndRedirect.jsp
 * 
 * FetchTokenAndRedirect.jsp gets the Authorisation Code and then jsp is redirected to /oauth/apis/employees
 * @author user
 *
 */
@Controller
public class OAuthEmployeeController {
	@RequestMapping(value = "/oauth/employees", method = RequestMethod.GET)
    public ModelAndView getEmployees() {
        return new ModelAndView("oauth/FetchTokenAndRedirect");
    }
	
	@RequestMapping(value = "/oauth/server_token/employees", method = RequestMethod.GET)
    public ModelAndView getEmployeeInfoWithServerTokens() {
        return new ModelAndView("oauth/FetchTokenByServer");
    }
	@RequestMapping(value = "/oauth/token_by_server/employees")
	public ModelAndView showEmployees(@RequestParam("code") String code) throws JsonProcessingException, IOException {
		ResponseEntity<String> response = null;
		System.out.println("Authorization Code------" + code);

		RestTemplate restTemplate = new RestTemplate();

		String credentials = "admin:admin";
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Basic " + encodedCredentials);

		HttpEntity<String> request = new HttpEntity<String>(headers);

		String access_token_url = "http://localhost:9090/oauth/token";
		access_token_url += "?code=" + code;
		access_token_url += "&grant_type=authorization_code";
		access_token_url += "&redirect_uri=http://localhost:9090/oauth/employees";

		response = restTemplate.exchange(access_token_url, HttpMethod.POST, request, String.class);

		System.out.println("Access Token Response ---------" + response.getBody());

		// Get the Access Token From the recieved JSON response
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(response.getBody());
		String token = node.path("access_token").asText();

		String url = "http://localhost:9090/oauth/apis/employees";

		// Use the access token for authentication
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Authorization", "Bearer " + token);
		HttpEntity<String> entity = new HttpEntity<>(headers1);

		ResponseEntity<Employee[]> employees = restTemplate.exchange(url, HttpMethod.GET, entity, Employee[].class);
		System.out.println(employees);
		Employee[] employeeArray = employees.getBody();

		ModelAndView model = new ModelAndView("JustListEmployees");
		model.addObject("employees", Arrays.asList(employeeArray));
		return model;
	}	
}
