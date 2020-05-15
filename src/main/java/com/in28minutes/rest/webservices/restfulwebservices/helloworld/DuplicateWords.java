package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
	
	public Set<String> findDuplicateWords(String phrase) {
		
		if (phrase == null || phrase.isEmpty()) {
			return Collections.emptySet();
		}
		
		Set<String> wordsAccum = new HashSet<String>();
		
		Set<String> duplicateWords = new HashSet<String>();
		
		String[] wordsArray = phrase.split("\\s+");
		
		for (String word : wordsArray) {
			if (!wordsAccum.add(word)) {
				duplicateWords.add(word);
			}
		}
		
		return duplicateWords;
	}
	
	public Set<String> findDuplicateWords2(String phrase) {
		if (phrase == null || phrase.isEmpty()) {
			return Collections.emptySet();
		}
		Set<String> accumWords = new HashSet<String>();
		Set<String> duplicateWords = new HashSet<String>();
		
		String[] wordArray = phrase.split("\\s+");
		
		for (String word : wordArray) {
			if (!accumWords.add(word)) {
				duplicateWords.add(word);
			}
		}
		return duplicateWords;
		
	}
	
	public Set<String> findDuplicateWords3(String phrase) {
		if (phrase == null || phrase.isEmpty()) {
			return Collections.emptySet();
		}
		
		Set<String> duplicateWords = new HashSet<String>();
		Set<String> accumWords = new HashSet<String>();
		
		String[] wordsArray = phrase.split("\\s+"); 
		
		for (String word : wordsArray) {
			if (!accumWords.add(word)) {
				duplicateWords.add(word);
			}
		}		
		return duplicateWords;
	}

}
