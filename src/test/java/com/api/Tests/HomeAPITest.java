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
	
	@Test(description = "Login in home API using guest token")
	public void testHomeAPI_AsGuest() {
		LoginAPITest login = new LoginAPITest();
		
		login.testGuestLoginAPI();

		Response response = RestAssured.given().spec(repoSpec)
				.headers("guestToken", guestToken , "timeZone", "Asia/Kolkata")
				.get(APIConstant.HOME);
		
		//	System.out.println(response.asPrettyString());		
		String expResponse = "Home page data fetched successfully";
		String actResponse = apiAction.getDataFromJsonPath(response, "message");

		assertAction.verifyOKStatusCode(response);
		assertAction.verifyResponseBody(actResponse, expResponse, "Home API response is not fetched");
	
	}
	
	@Test(description = "Login in home API using access token")
	public void testHomeAPI_AsUser() {
		LoginAPITest login = new LoginAPITest();
		
		login.testUserLoginAPI();

		Response response = RestAssured.given().spec(repoSpec)
				.headers("sessionToken", accessToken , "timeZone", "Asia/Kolkata")
				.get(APIConstant.HOME);
		
		//	System.out.println(response.asPrettyString());		
		String expResponse = "Home page data fetched successfully";
		String actResponse = apiAction.getDataFromJsonPath(response, "message");

		assertAction.verifyOKStatusCode(response);
		assertAction.verifyResponseBody(actResponse, expResponse, "Home API response is not fetched");
	
	}

}
