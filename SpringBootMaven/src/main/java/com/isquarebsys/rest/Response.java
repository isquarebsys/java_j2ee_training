package com.isquarebsys.rest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	@JsonProperty
	private RestResponse RestResponse;

	public RestResponse getRestResponse() {
		return RestResponse;
	}

	public void setRestResponse(RestResponse restResponse) {
		RestResponse = restResponse;
	}

	public Response() {
	}

	@Override
	public String toString() {
		return "Response [RestResponse=" + RestResponse + "]";
	}
}
