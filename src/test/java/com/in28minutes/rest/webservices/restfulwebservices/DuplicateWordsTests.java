package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Set;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.DuplicateWords;

public class DuplicateWordsTests {
	
	@Test
	public void testDuplicateWords() {
		
		String phrase = "This sentence contains two words, one and two along with three more, one, two, and three";
	
		DuplicateWords duplicateWords = new DuplicateWords();		
	
		Set<String> dups = duplicateWords.findDuplicateWords3(phrase);
		
		Iterator<String> it = dups.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		assertTrue(dups.contains("and"));
		assertTrue(dups.contains("three"));
		assertTrue(dups.size() == 3);
		
	}

}
