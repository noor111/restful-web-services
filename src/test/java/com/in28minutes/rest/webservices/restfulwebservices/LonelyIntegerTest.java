package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.LonelyInteger;

public class LonelyIntegerTest {
	
	@Test
	public void testLonelyInteger() {
		String listOfIntegers = "9 3 8 4 6 2 3 9 4 8 2";
		String[] list = listOfIntegers.split("\\s+");
		int lonelyInteger = LonelyInteger.findLonelyIntegerInArray(list);
		System.out.println("Lonely integer is: " + lonelyInteger);
	}

}
