package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LonelyIntegerWithScanner {
	
	public static void main(String args[]) {
		Scanner consoleInput = new Scanner(System.in);
	
		int arraySize = Integer.parseInt(consoleInput.nextLine());
	
		int[] array = new int[arraySize];
	
		for (int i = 0; i < arraySize; i++) {
			array[i] = Integer.parseInt(consoleInput.nextLine());
		}
		
		int searchForInt = Integer.parseInt(consoleInput.nextLine());
		
		boolean isNumberFound = findNumber(array, searchForInt);
	}
	
	private static boolean findNumber(int[] array, int searchForInt) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchForInt)
				return true;
		}
		return false;
	}
}
