package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.Java8LambdaTester;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.MathOperation;

public class LambdaTests {
	
	@Test
	public void lambdaMathOperationTests() {
		
		Java8LambdaTester tester = new Java8LambdaTester();	
		
		MathOperation addition = (a, b) -> a + b;		
		MathOperation divisison = (a, b) -> a / b;		
		MathOperation multiply = (a, b) -> a * b;
		
		assertEquals(12, tester.operate(5, 7, addition));
		
		assertEquals(5, tester.operate(15, 3, divisison));
		
		assertEquals(32, tester.operate(8, 4, multiply));	
		
	}

}
