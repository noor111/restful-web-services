package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class SimpleAlgebraicFunctionTester {	
	
	public Double doSimpleAlgebraicFunction(Double a, Double b, Double c, SimpleAlgebraicFunction function) {
		return function.doSimpleAlgebraicOperation(a, b, c);
	}
}
