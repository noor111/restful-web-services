package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class FibonacciSeriesWithRecursion {
	
	private int n1=0, n2=1, n3=0;
	
	public void fibonacciWithRecursion(int count) {
		if (count > 0) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(n3);
			
			fibonacciWithRecursion(count - 1);
		}
	}
	
	public void fibonacciWithRecursion2(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			System.out.println("Count: " + count + "  number: " + n3);
			
			n1 = n2;
			n2 = n3;
			
			fibonacciWithRecursion2(count - 1);
		}
	}
	
	public void fibonacciWithRecursion3(int count) {
			
		if (count > 0) {
			
			n3 = n1 + n2;			
			System.out.println("Number " + count + " = " + n3);
			n1 = n2;
			n2 = n3;
			
			fibonacciWithRecursion3(count - 1);			
		}
		
	}
	
	public void fibonacciWithRecursion4(int count) {
		
		if (count > 0) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println("===> Number " + count + " = " + n3);
			
			fibonacciWithRecursion4(count - 1);
		}
	}
	
	public void fibonacciWithRecursion5(int count) {
		
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(" ==> Number " + count + " = " + n3);
			
			fibonacciWithRecursion5(count - 1);
		}
	}
	
	public void fibonacciWithRecursion6(int count) {
		
		if (count > 0) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println("===> Number " + count + " is " + n3);
			
			fibonacciWithRecursion6(count - 1);
		}
	}
	
	public void fibonacciWithRecursion7(int count) {
		
		if (count > 0) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println("===> Number " + count + " is " + n3);
			
			fibonacciWithRecursion7(count - 1);
		}
	}

}
