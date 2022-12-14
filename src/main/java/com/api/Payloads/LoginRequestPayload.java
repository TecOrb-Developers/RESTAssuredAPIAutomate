package com.api.Payloads;

import com.api.Pojos.Login;
import com.api.Utilities.ExcelReadUtil;
import com.google.gson.Gson;

public class LoginRequestPayload {

	private Gson gson = new Gson();

	public String getLoginPayload() {
		Login la = new Login();
		la.setEmail(ExcelReadUtil.getDataFromExcelSheet("TestData", "email", "value"));
		la.setPassword(ExcelReadUtil.getDataFromExcelSheet("TestData", "password", "value"));

		return gson.toJson(la);
	}

}
