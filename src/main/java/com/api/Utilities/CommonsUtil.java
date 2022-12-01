package com.api.Utilities;

import java.util.Random;

public class CommonsUtil {
	
	public static String generateUniqueString(String prefix) {
		return prefix + System.currentTimeMillis();	
	}
	
	protected String getRandomString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while(salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
	
//	public static void main(String[] args) {
//		DataUtils test = new DataUtils();
//		String a = test.getRandomString();
//		
//		System.out.println("Random String: "+a);
//		System.out.println(a+"@gmail.com");
//			
//		System.out.println(generateUniqueString("Ankesh"));
//	}

}
