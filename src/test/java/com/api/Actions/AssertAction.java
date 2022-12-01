package com.api.Actions;

import static org.testng.Assert.assertEquals;

import io.restassured.response.Response;

public class AssertAction {

	public void verifyCreateStatusCode(Response res) {
		assertEquals(res.getStatusCode(), 201);
	}
	
	public void verifyOKStatusCode(Response res) {
		assertEquals(res.getStatusCode(), 200);
	}
	
	public void verifyResponseBody(String expected, String actual, String desc) {
		assertEquals(expected, actual, desc);
	}

}
