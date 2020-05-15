package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountDuplicatesInList {
	
	public static void main(String[] args) {
		
		int numberOfDuplicates = 0;
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("g");
		list.add("c");
		list.add("f");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("f");
		list.add("g");
		list.add("p");
		list.add("a");
		list.add("a");
		list.add("p");
		list.add("p");
		list.add("s");
		list.add("m");
		list.add("g");
		list.add("f");
		list.add("m");
		list.add("p");

		System.out.println("\nExample 1 - Count 'a' with frequency");
		System.out.println("a : " + Collections.frequency(list, "a"));
		
		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			int frequency = Collections.frequency(list, temp);
			System.out.println(temp + ": " + frequency);
			if (frequency > 1) {
				numberOfDuplicates += (frequency - 1);
			}
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String entry : list) {
			Integer count = map.get(entry);
			map.put(entry, (count == null) ? 1 : count + 1);
		}
		
		System.out.println("Number of Duplicates: " + numberOfDuplicates);
		
		CountDuplicatesInList.printMap(map);
	}
	
	private static void printMap(Map<String, Integer> map) {
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "   Value: " + entry.getValue());
		}
		
	}

}
