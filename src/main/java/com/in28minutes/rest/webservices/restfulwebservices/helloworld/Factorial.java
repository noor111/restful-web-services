package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {
	
	public static int factorialWithRecursion(int number) {
		
		System.out.println("Entering factorial for number " + number);
		if (number == 0 ) {
			return 1;
		}
		
		return number * factorialWithRecursion(number - 1);
		
	}
	
	public static int factorialWithRecursion2(int number) {
		if (number == 0) {
			return 1;
		}
		
		return number * factorialWithRecursion2(number -1);
	}
	
	public static long factorialWithRecursion3(long number) {
		System.out.println("Entering factorial for number " + number);
		if (number == 0) {
			return 1;
		}
		
		return number * factorialWithRecursion3(number -1);
	}
	
	public static long factorialWithRecursion4(long number) {
		if (number == 0) {
			return 1;
		}
		
		return number * factorialWithRecursion4(number - 1);
	}
	
	public static int factorialWithRecursion5(int number) {
		
		if (number == 0) {
			return 0;
		}
		
		return number * factorialWithRecursion5(number - 1);
	}
	
	public static int factorialWithoutRecursion(int number) {
		
		int result = 1;
		
		while (number > 0 ) {
			result = result * number;
			number--;
		}
		return result;
	}
	
	public static int factorialWithoutRecursion2(int number) {
		int result = 1;
		
		while (number > 0) {
			result = result * number;
			number--;
		}
		
		return result;		
	}
	
	public static int factorialWithoutRecursion3(int number) {
		int result = 1;
		
		while (number > 0) {
			result = result * number;
			number--;
		}
		return result;
	}
	
	public static int factorialWithoutRecursion4(int number) {
		
		int result = 1;
		
		while (number > 0) {
			result = result * number;
			number--;
		}
		return result;		
	}

}
