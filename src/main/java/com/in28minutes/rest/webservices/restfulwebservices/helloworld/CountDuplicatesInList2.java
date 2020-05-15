package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDuplicatesInList2 {
	
	public static void main(String[] args) {
		int numberOfDuplicates = 0;
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		
		System.out.println("Frequency for 'a' " + Collections.frequency(list, "a"));
		
		Set<String> uniqueStringSet = new HashSet<String>(list);
		for (String element : uniqueStringSet) {
			
			System.out.println("Frequency for " + element + " = " + Collections.frequency(list, element));	
			numberOfDuplicates += Collections.frequency(list, element);
		}
		System.out.println("Duplicates in list: " + numberOfDuplicates);
	}

}
