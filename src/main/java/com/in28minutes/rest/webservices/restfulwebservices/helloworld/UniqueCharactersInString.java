package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Arrays;

public class UniqueCharactersInString {
	
	public static boolean isUniqueChars1(String str) {
		if (str.length() > 128) {
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		Arrays.fill(char_set, false);		
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
	}
	
	public static boolean isUniqueChars2(String str) {
		if (str.length() > 128) {
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		Arrays.fill(char_set, false);	
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
	}
	
	public static boolean isUniqueChars3(String str) {
	
		if (str.length() > 128) {
			return false;  // max num of chars is 128; therefore, if len of string is greater than 128
		}
		boolean[] char_set = new boolean[128];
		Arrays.fill(char_set, false);
		
		for (int i = 0; i < str.length() - 1; i++) {
			int val = str.charAt(i);
			
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean isUniqueCharsUsingSorting(String str) {
		if (str.length() > 128) {
			return false;
		}
		
		char[] strArray = str.toCharArray();
		Arrays.sort(strArray);
		
		for (int i = 0; i < strArray.length - 1; i++) {
			
			if (strArray[i] != strArray[i + 1]) {
				continue;
			} else {
				return false;
			}			
		}
		return true;
		
	}
	
	public static boolean isUniqueCharsUsingSorting2(String str) {
		if (str.length() > 128) {
			return false;
		}
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		
		for (int i = 0; i < charArray.length -1; i++) {
			if (charArray[i] != charArray[i + 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;		
	}

}
