package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class FibonacciSeries {
	
	public void fibonacciWithoutRecursion(int maxNumber) {		
		for (int i = 0; i <= maxNumber; i++) {
			int num = getFibonacci(i);
			System.out.println(num + " ");
		}
	}
	
	public void fibonacciWithoutRecursion2(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci2(i);
			System.out.println(num + " ");
		}
	}
	
	public void fibonacciWithoutRecursion3(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci4(i);
			System.out.println(num + " ");
		}
	}
	
	public void fibonacciWithoutRecursion4(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci4(i);
			System.out.println(num + " ");
		}
	}
	
	public void fibonacciWithoutRecursion5(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci5(i);
			System.out.println(num + " ");
		}
	}
	
	public void fibonacciWithoutRecursion6(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci(i);
			System.out.println("Number " + i + " is " + num);
		}
	}
	
	public void fibonacciWithoutRecursion7(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci(i);
			System.out.println("Number " + i + " is " + num);
		}
	}
	
	public void fibonacciWithoutRecursion8(int maxNumber) {
		for (int i = 0; i < maxNumber; i++) {
			int num = getFibonacci(i);
			System.out.println("Number " + i + " is " + num);
		}		
	}
	
	private int getFibonacci(int currentNum) {
		if (currentNum == 0) {
			return 0;
		}		
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int current = 1;
		
		for (int i = 2; i <= currentNum; i++) {
			current = first + second;
			first = second;
			second = current;
		}
		
		return current;
		
	}
	
	private int getFibonacci2(int currentNum) {
		if (currentNum == 0) {
			return 0;
		}
		
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int current = 1;
		
		for (int i = 2; i <= currentNum; i++) {
			current = first + second;
			first = second;
			second = current;
		}
		
		return current;		
	}
	
	private int getFibonacci3(int currentNum) {
		if (currentNum == 0) {
			return 0;
		}
		
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int current = 1;
		
		for (int i = 2; i <= currentNum; i++) {
			current = first + second;
			first = second;
			second = current;
		}
		
		return current;				
	}
	
	private int getFibonacci4(int currentNum) {
		if (currentNum == 0) {
			return 0;
		}
		
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int current = 1;
		
		for (int i = 2; i <= currentNum; i++) {
			current = first + second;
			first = second;
			second = current;
		}
		
		return current;
	}

	private int getFibonacci5(int currentNum) {
		if (currentNum == 0) {
			return currentNum;
		}
		if (currentNum == 1) {
			return currentNum;
		}
		
		int first = 0;
		int second = 1;
		int current = 1;
		
		for (int i = 2; i <= currentNum; i++ ) {
			current = first + second;
			first =second;
			second = current;
		}
		
		return current;	
	}
	
	private int getFibonacci6(int currentNum) {
		
		if (currentNum == 0) {
			return 0;
		}
		
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int third = 1;
		
		for (int i = 2; i <= currentNum; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
	
	private int getFibonacci7(int currentNum) {
		
		if (currentNum == 0) {
			return 0;
		}
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int third = 1;
		
		for (int i = 2; i <= currentNum; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return third;		
	}
	
	private int getFibonacci8(int currentNum) {
	
		if (currentNum == 0) {
			return 0;
		}
		if (currentNum == 1) {
			return 1;
		}
		
		int first = 0;
		int second = 1;
		int third = 1;
		
		for (int i = 2; i < currentNum; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
}
	
