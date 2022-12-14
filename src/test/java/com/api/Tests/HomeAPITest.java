package com.api.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.Endpoints.APIConstant;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HomeAPITest extends BaseTest {
	
//	@BeforeClass
//	public void init() {
//		LoginAPITest login = new LoginAPITest();		
//		login.testGuestLoginAPI();
//		System.out.println("345");
//	}
	
	@Test
	public void testHomeAPI() {
		LoginAPITest login = new LoginAPITest();
		
		login.testGuestLoginAPI();

		Response response = RestAssured.given().spec(repoSpec)
				.headers("guestToken", guestToken , "timeZone", "Asia/Kolkata")
				.get(APIConstant.HOME);
		
		//	System.out.println(response.asPrettyString());		
		String expResponse = "Home page data fetched successfully";
		String actResponse = apiAction.getDataFromJsonPath(response, "message");

		assertAction.verifyOKStatusCode(response);
		assertAction.verifyResponseBody(expResponse, actResponse, "Home API response is not fetched");
	
	
	
	}

}
