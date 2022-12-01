package com.api.Actions;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIAction {

	public <T> T getDataFromJsonPath(Response r, String jsonPath) {
		JsonPath jpath = r.jsonPath();
		return jpath.get(jsonPath);
	}
}
