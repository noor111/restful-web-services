package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.SimpleAlgebraicFunction;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.SimpleAlgebraicFunctionTester;

public class LambdaAlgebraicFunctionTester {
	
	@Test
	public void algebraicFunctionTest() {
		
		SimpleAlgebraicFunctionTester tester = new SimpleAlgebraicFunctionTester(); 
		
		SimpleAlgebraicFunction simpleFunction1 = (a, b, c) -> (2 * a) + (6 * b) - (3 * c); 		
		
		Double answer = tester.doSimpleAlgebraicFunction(3.0, 4.0, 5.0, simpleFunction1);
		System.out.println("Test 1 answer: " + answer);
		
		SimpleAlgebraicFunction simpleFunction2 = (a, b, c) -> 2 * a + 10 * b - 3 * c; 	
		
		answer = doSimpleAlgebraicFunction1(3.0, 4.0, 5.0, simpleFunction2);
		System.out.println("Test 2 answer: " + answer);
	}
	
	@Test
	public void algebraicFunctionTest1() {
		
		SimpleAlgebraicFunction function = (a, b, c) -> (2 * a) + (6 * b) + (3 * c);
		Double answer = LambdaAlgebraicFunctionTester.doSimpleAlgebraicFunction1(1.0, 2.0, 3.0, function);
		System.out.println("Test 3 answer: " + answer);
	}
	
	public static Double doSimpleAlgebraicFunction1(Double a, Double b, Double c, SimpleAlgebraicFunction function) {
		return function.doSimpleAlgebraicOperation(a, b, c);
	}
	
}
