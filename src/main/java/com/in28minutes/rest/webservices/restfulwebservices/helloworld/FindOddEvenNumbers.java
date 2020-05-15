package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.List;

public class FindOddEvenNumbers {
	
	public int[] findOddNumbers(int lowInt, int highInt) {
		
		int size = (highInt - lowInt) + 1;
		int[] totalInts = new int[size];
		
		List<Integer> oddNumbers = new ArrayList<Integer>();
		
		totalInts[0] = lowInt;
		int nextInt = lowInt;
		
		for (int i = 1; i < size; i++) {
			nextInt = nextInt + 1;;
			totalInts[i] = nextInt;
		}
		
		for (int i = 0; i < totalInts.length; i++) {
			if (totalInts[i] % 2 == 0) {
				// even number
			} else {
				oddNumbers.add(totalInts[i]);
			}
		}
		
		int[] oddNumArray = oddNumbers.stream().mapToInt(i -> i).toArray();
		return oddNumArray;
	}
	
	public int[] findEvenNumbers(int lowInt, int highInt) {
		
		int size = (highInt - lowInt) + 1;
		int[] totalInts = new int[size];
		
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		totalInts[0] = lowInt;
		int nextInt = lowInt;
		
		for (int i = 1; i < size; i++) {
			nextInt = nextInt + 1;;
			totalInts[i] = nextInt;
		}
		
		for (int i = 0; i < totalInts.length; i++) {
			if (totalInts[i] % 2 == 0) {
				evenNumbers.add(totalInts[i]);
			} else {
				// odd number
			}
		}
		
		int[] evenNumArray = evenNumbers.stream().mapToInt(i -> i).toArray();
		return evenNumArray;
	}

}
