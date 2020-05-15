package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.UniqueCharactersInString;

public class UniqueCharactersInStringTests {
	
	@Test
	public void uniqueCharactersInStringTest1() {
		String str = "Elizabeth";
		boolean isUnique = UniqueCharactersInString.isUniqueChars1(str);
		assertTrue(isUnique);
	}
	
	@Test
	public void uniqueCharactersInStringTest2() {
		String str = "Mississippi";
		boolean isUnique = UniqueCharactersInString.isUniqueChars1(str);
		assertTrue(isUnique);
	}
	
	@Test
	public void uniqueCharactersInStringTest3() {
		String str = "tonality";
		boolean isUnique = UniqueCharactersInString.isUniqueChars1(str);
		assertTrue(isUnique);
	}
	
	@Test
	public void uniqueCharactersInStringTest4() {
		String str = "muskrat";
		boolean isUnique = UniqueCharactersInString.isUniqueChars1(str);
		assertTrue(isUnique);
	}
	
	@Test
	public void uniqueCharactersInStringTest5() {
		String str = "collection";
		boolean isUnique = UniqueCharactersInString.isUniqueChars2(str);
		assertFalse(isUnique);
	}
	
	@Test
	public void uniqueCharactersInStringTest6() {
		String str = "aftershock";
		boolean isUnique = UniqueCharactersInString.isUniqueChars2(str);
		assertTrue(isUnique);
	}
	
	@Test
	public void uniqueCharactersInStringTest7() {
		String str = "conscientious";
		boolean isUnique = UniqueCharactersInString.isUniqueChars3(str);
		assertFalse(isUnique);
	}
	
	@Test
	public void uniquCharactersInStringWithSortingTest1() {
		String str = "liberation";
		boolean isUnique = UniqueCharactersInString.isUniqueCharsUsingSorting(str);
		assertFalse(isUnique);
	}
	
	@Test
	public void uniquCharactersInStringWithSortingTest2() {
		String str = "leonard";
		boolean isUnique = UniqueCharactersInString.isUniqueCharsUsingSorting(str);
		assertTrue(isUnique);
	}
	
	@Test
	public void uniquCharactersInStringWithSortingTest3() {
		String str = "Pennsylvania";
		boolean isUnique = UniqueCharactersInString.isUniqueCharsUsingSorting2(str);
		assertFalse(isUnique);
	}

}
