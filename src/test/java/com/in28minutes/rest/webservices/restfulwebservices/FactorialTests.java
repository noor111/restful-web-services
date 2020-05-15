package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.Factorial;

public class FactorialTests {
	
	@Test
	public void testFactorialWithRecursion() {
		
		System.out.println("Factorial of 5 using recursion: " + Factorial.factorialWithRecursion(5));
		
		assertTrue(Factorial.factorialWithRecursion(5) == 120);
		
		System.out.println("Factorial of 5 using recursion: " + Factorial.factorialWithRecursion(11));
		
		assertTrue(Factorial.factorialWithRecursion(11) == 39916800);
		
		System.out.println("Factorial of 2 using recursion: " + Factorial.factorialWithRecursion3(2));
		
		assertTrue(Factorial.factorialWithRecursion3(2) == 2);
		
		System.out.println("Factorial of 5 using recursion: " + Factorial.factorialWithRecursion4(5));
		
		assertTrue(Factorial.factorialWithRecursion4(5) == 120);
		
		System.out.println("Factorial of 8 using recursion: " + Factorial.factorialWithRecursion5(8));
		
		assertTrue(Factorial.factorialWithRecursion5(8) == 40320);
	}
	
	@Test
	public void testFactorialWithoutRecursion() {
		
		System.out.println("Factorial of 5 not using recursion: " + Factorial.factorialWithoutRecursion(5));
		
		assertTrue(Factorial.factorialWithoutRecursion(5) == 120);
		
		System.out.println("Factorial of 5 not using recursion: " + Factorial.factorialWithoutRecursion3(5));
		
		assertTrue(Factorial.factorialWithoutRecursion3(5) == 120);
		
		System.out.println("Factorial of 8 not using recursion: " + Factorial.factorialWithoutRecursion4(8));
		
		assertTrue(Factorial.factorialWithoutRecursion4(8) == 40320);
		
	}

}
