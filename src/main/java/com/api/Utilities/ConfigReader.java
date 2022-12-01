package com.api.Utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	String  path = "/Users/apple/eclipse-workspace/API_AutomationDemo/config/config.properties";

	public String loadProperties(String property) {
		Properties prop = new Properties();
		InputStream input;
	//	path = "/API_AutomationDemo/config/config.properties";
		try {
			input = new FileInputStream(path);
			prop.load(input);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return prop.getProperty(property);
	}
	
}
