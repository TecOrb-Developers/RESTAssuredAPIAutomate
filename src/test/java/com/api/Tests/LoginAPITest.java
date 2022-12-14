package com.api.Tests;

import org.testng.annotations.Test;
import com.api.Endpoints.APIConstant;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LoginAPITest extends BaseTest {

//	@Test
	public void testLoginAPI() {

//		String responseName = RestAssured.given().log().all().baseUri("https://api.github.com/")
//				.header("Authorization", "token 723867cc2d52bbe 1f5d9d@c2ce44fb793 d57d096 ").when()
//				.body("{\n"
//						+ "    \"email\":\"ankesh@tecorb.co\",\n"
//						+ "    \"password\":\"Qwerty123\"\n"
//						+ "}")
//				.post("api/v1/login").then().log().all().assertThat().statusCode(201).extract().jsonPath().get("name");

		Response response = RestAssured.given().spec(repoSpec).header("Content-Type", "application/json").when()
				.body(payload.getLoginPayload()).post(APIConstant.LOGIN);
		
		guestToken = response.jsonPath().get("token");

		String expResponse = "User created successfully";
		String actResponse = apiAction.getDataFromJsonPath(response, "message");
		
	//	assertAction.verifyCreateStatusCode(response);
		assertAction.verifyOKStatusCode(response);
		assertAction.verifyResponseBody(expResponse, actResponse, "Response not received");
	}
	
	@Test
	public void testGuestLoginAPI() {

		Response response = RestAssured.given().spec(repoSpec)
				.headers("deviceType", "ios" , "timeZone", "Asia/Kolkata").when()
				.get(APIConstant.GUEST_LOGIN);
		
		guestToken = response.jsonPath().get("token");
		System.out.println(response.asPrettyString());
		String expResponse = "Guest Created successfully";
		String actResponse = apiAction.getDataFromJsonPath(response, "message");
		
	//	assertAction.verifyCreateStatusCode(response);
		assertAction.verifyOKStatusCode(response);
		assertAction.verifyResponseBody(expResponse, actResponse, "Response not received");
	
	
	
	}
	
	

}
