package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class StringSort {
	
	public static String sort(String s) {
		
		char[] content = s.toCharArray();		
		java.util.Arrays.sort(content);
		return new String(content);
	}

}
