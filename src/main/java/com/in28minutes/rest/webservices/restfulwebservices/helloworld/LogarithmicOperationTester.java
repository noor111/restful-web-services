package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class LogarithmicOperationTester {		
	
	public double LogarithmicMath(double a, double b, LogarithmicOperation operation) {
		double result = operation.logarithmicOperation(a, b);
		
		System.out.println("===> logarithmic result is:" + result);
		
		return result;
	}
}


