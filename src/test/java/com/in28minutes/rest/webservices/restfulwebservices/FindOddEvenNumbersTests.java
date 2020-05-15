package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.FindOddEvenNumbers;

public class FindOddEvenNumbersTests {
	
	@Test
	public void findOddNumbers() {
		FindOddEvenNumbers findOddEvenNumbs = new FindOddEvenNumbers();
		int[] oddNumbers = findOddEvenNumbs.findOddNumbers(3, 9);
		System.out.println("===> ODD NUMBERS:");
		for (int i = 0; i < oddNumbers.length; i++) {
			System.out.println("The " + (i + 1) + " odd number is " + oddNumbers[i]);
		}	
		
		System.out.println("===> MATH function:" + Math.floor(-4.7));
		System.out.println("===> MATH function:" + Math.round(-4.7));
		System.out.println("===> MATH function:" + Math.ceil(-4.7));
		// System.out.println("===> MATH function:" + Math.(-4.7));
		
		String s1 = new String("Hello");
		String s2 = new String("there");
		String s3 = new String();
	}
	
	@Test
	public void findEvenNumbers() {
		FindOddEvenNumbers findOddEvenNumbs = new FindOddEvenNumbers();
		int[] evenNumbers = findOddEvenNumbs.findEvenNumbers(3, 9);
		System.out.println("===> EVEN NUMBERS:");
		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.println("The " + (i + 1) + " even number is " + evenNumbers[i]);
		}		
	}
}
