package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {
	
	public static int findLonelyIntegerInArray(String[] array) {
	
		List<String> list = Arrays.asList(array);
		
		for (String entry : list) {
			int frequency = Collections.frequency(list, entry);
			if (frequency == 1) {
				return Integer.parseInt(entry);
			}
		}
		
		return -1;
		
	}

}
