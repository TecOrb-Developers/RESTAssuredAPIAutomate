package com.api.Payloads;

import com.api.Pojos.LearnAutism;
import com.api.Utilities.ExcelReadUtil;
import com.google.gson.Gson;

public class RequestPayload {

	private Gson gson = new Gson();

	public String getLoginPayload() {
		LearnAutism la = new LearnAutism();
		la.setEmail(ExcelReadUtil.getDataFromExcelSheet("TestData", "email", "value"));
		la.setPassword(ExcelReadUtil.getDataFromExcelSheet("TestData", "password", "value"));

		return gson.toJson(la);
	}

}
