package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class StringReverse {
	
	public static String reverseString(String str) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseString2(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseString3(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}	
	
	public static String reverseString4(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseString5(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));			
		}
		return sb.toString();
	}

}
