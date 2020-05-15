package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.LogarithmicOperation;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.LogarithmicOperationTester;

public class LogarithmicMathTests {
	
	@Test
	public void logarithmicMathTest() {
		
		LogarithmicOperationTester logarithmicOperationTester = new LogarithmicOperationTester();
		
		LogarithmicOperation operation = (a, b) -> a / b;
		
		logarithmicOperationTester.LogarithmicMath(22.0, 16.0, operation);
		
	}

}
