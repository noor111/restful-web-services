package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.QuadraticOperation;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.QuadraticOperationTester;

public class QuadraticEquationTest {
	
	@Test
	public void quadraticEquationTest() {
		System.out.println("Entering quadraticEquationTest");
		
		QuadraticOperationTester tester = new QuadraticOperationTester();
		
		QuadraticOperation function = (a, b, c) -> {
			
			double resultA = a * a - 4.0 * a * c;
			double resultB = 0.0;
			
			if (resultA > 0.0) {
				resultB = b + Math.sqrt(resultA) / (2.0 * a);
			} else if (resultA == 0.0) {
				resultB = b / (2.0 * a);
			} else {
				return 0.0;
			}
			System.out.println("Quadratic Answer: " + resultB);
			return resultB;
		};
		
		tester.doQuadraticOperationFunction(Double.valueOf(22.0), Double.valueOf(37.0), Double.valueOf(3.0), function);
		
	}

}
