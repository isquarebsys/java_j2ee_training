package com.isquarebsys.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * http://
 * javarevisited.blogspot.com/2017/02/how-to-consume-json-from-restful-web-services-Spring-RESTTemplate-Example.html#ixzz4yb6f8ziC
 * 
 * @author user
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	private String name;
	private String alpha2_code;
	private String alpah3_code;

	public Result() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlpha2_code() {
		return alpha2_code;
	}

	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}

	public String getAlpah3_code() {
		return alpah3_code;
	}

	public void setAlpah3_code(String alpah3_code) {
		this.alpah3_code = alpah3_code;
	}

	@Override
	public String toString() {
		return "Result [name=" + name + ", alpha2_code=" + alpha2_code + ", alpah3_code=" + alpah3_code + "]";
	}
}
