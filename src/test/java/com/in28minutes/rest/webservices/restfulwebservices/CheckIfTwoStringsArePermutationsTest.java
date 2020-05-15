package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.StringSort;

public class CheckIfTwoStringsArePermutationsTest {
	
	@Test
	public void checkIfTwoStringsArePermutationsTest1() {
	
		String str1 = "apple";
		String str2 = "lapep";
		
		assertTrue(StringSort.sort(str1).equals(StringSort.sort(str2)));
	}
	
	@Test
	public void checkIfTwoStringsArePermutationsTest2() {
	
		String str1 = "orange";
		String str2 = "naroeg";
		
		assertTrue(StringSort.sort(str1).equals(StringSort.sort(str2)));
	}
	
	@Test
	public void checkIfTwoStringsArePermutationsTest3() {
	
		String str1 = "orange";
		String str2 = "narogn";
		
		assertTrue(StringSort.sort(str1).equals(StringSort.sort(str2)));
	}

}
