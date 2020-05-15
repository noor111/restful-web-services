package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class PrimeNumbers {
	
	public static boolean isPrime(int number) {
		
		if (number == 2 || number == 3) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		
		double sqrt = Math.sqrt(number);
		
		for (int i = 3; i <= sqrt; i += 2) {
			if (number%i == 0) {
				return false;
			}
		}
		return true;		
	}
	
	public static boolean isPrime2(int number) {
		if (number == 2 || number == 3) {
			return true;
		}
		
		if (number % 2 == 0) {
			return false;
		}
		
		Double sqrt = Math.sqrt(number);
		
		for (int i = 3; i <= sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}			
		}
		return true;
	}
	
	public static boolean isPrime3(int number) {
		if (number == 2 || number == 3) {
			return true;
		}
		
		if (number % 2 == 0) {
			return false;
		}
		
		Double sqrt = Math.sqrt(number);
		
		for (int i = 3; i <= sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPrime4(int number) {
		if (number == 2 || number == 3) {
			return true;			
		}
		if (number % 2 == 0) {
			return false;
		}
		
		Double sqrt = Math.sqrt(number);
		
		for (int i = 2; i <= sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}			
		}
		
		return true;
	}
	
	public static boolean isPrime5(int number) {
		if (number == 2 || number == 3) {
			return true;
		}
		
		if (number % 2 == 0) {
			return false;
		}
		
		Double sqrt = Math.sqrt(number);
		for (int i = 2; i <= sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
