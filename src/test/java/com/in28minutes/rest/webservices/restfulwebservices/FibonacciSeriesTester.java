package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.FibonacciSeries;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.FibonacciSeriesWithRecursion;

public class FibonacciSeriesTester {
	
	@Test
	public void testFirstTenOfFibonacciSeriesWithoutRecursion() {
		System.out.println("Entering testFirstTenOfFibonacciSeriesWithoutRecursion");
		FibonacciSeries fs = new FibonacciSeries();
		
		fs.fibonacciWithoutRecursion8(16);
	}
	
	@Test
	public void testFirstTenOfFibonacciWithRecursion() {
		System.out.println("Entering testFirstTenOfFibonacciWithRecursion");
		FibonacciSeriesWithRecursion fs = new FibonacciSeriesWithRecursion();
		
		fs.fibonacciWithRecursion5(16);		
	}
}
