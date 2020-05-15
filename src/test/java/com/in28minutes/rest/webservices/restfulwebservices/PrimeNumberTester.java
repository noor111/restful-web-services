package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.PrimeNumbers;

public class PrimeNumberTester {
	
	@Test
	public void primeNumberTest() {	
		Integer numberToTest = 7;
		System.out.println("primeNumberTest(): Testing integer: " + numberToTest);
		assertTrue(PrimeNumbers.isPrime(numberToTest));
	}
	
	@Test
	public void primeNumberTest2() {
		Integer numberToTest = 4;
		System.out.println("primeNumberTest2: Testing integer: " + numberToTest);
		assertFalse(PrimeNumbers.isPrime2(numberToTest));
	}
	
	@Test
	public void primeNumberTest4() {
		Integer numberToTest = 74551;
		System.out.println("Prime Number to Test: " + numberToTest);
		assertTrue(PrimeNumbers.isPrime4(numberToTest));
	}

}
