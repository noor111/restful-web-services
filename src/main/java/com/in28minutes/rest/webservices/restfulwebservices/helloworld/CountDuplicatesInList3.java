package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountDuplicatesInList3 {
	
	public static void main (String[] args) {
		
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
		
		int totalNumberOfDuplicates = 0;

		Set<String> uniqueSet = new HashSet<String>(list);
		for (String uniqueEntry : uniqueSet ) {
			int countForEntry = Collections.frequency(list, uniqueEntry);
			if (countForEntry > 1) {
				totalNumberOfDuplicates += (countForEntry - 1);
			}			
		}
		
		Map<String,Integer> totalPerEntry = new HashMap<String,Integer>();
		
		for (String entry : list) {
			Integer count = totalPerEntry.get(entry);
			totalPerEntry.put(entry, (count == null ? 1 : count + 1));			
		}
		
		CountDuplicatesInList3.printCountPerEntry(totalPerEntry);		
		
	}
	
	private static void printCountPerEntry(Map<String,Integer> totalPerEntry) {
	
		for (Map.Entry<String, Integer> entry : totalPerEntry.entrySet()) {
			log.info(String.format("Entry: %s  Count: %d"), entry.getKey(), entry.getValue());			
		}
		
	}
}
