package com.api.Tests;

import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;

import org.testng.annotations.BeforeMethod;

import com.api.Actions.APIAction;
import com.api.Actions.AssertAction;
import com.api.Payloads.LoginRequestPayload;
import com.api.Utilities.ConfigReader;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
	
	protected static RequestSpecification repoSpec;
	public static String accessToken = "";
	public static String guestToken = "";
	
	public ConfigReader configfile = new ConfigReader();
	LoginRequestPayload payload = new LoginRequestPayload();
	protected AssertAction assertAction = new AssertAction();
	protected APIAction apiAction = new APIAction();

	@BeforeMethod
	protected void commonRequestConfiguration() {
//		repoSpec = new RequestSpecBuilder().setBaseUri("https://apis.learnautism.tv/")
//				.setConfig(newConfig().logConfig(logConfig().blacklistHeader("Authorization ")))
//				.addHeader("Authorization", "token 723867cc2d52bbe 1fSd9d@c2ce44 fb793 d57d096").build().log().all();
		
		repoSpec = new RequestSpecBuilder().setBaseUri(configfile.loadProperties("base_uri"))
				.setConfig(newConfig().logConfig(logConfig().blacklistHeader("Authorization ")))
				.build().log().all();	 
	}

}
