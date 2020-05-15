package com.in28minutes.rest.webservices.restfulwebservices;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.StringReverse;

public class StringReverseTests {
	
	@Test
	public void reverseStringTest() {
		String reversedString = StringReverse.reverseString("hello world");
		System.out.println("Reversed String: " + reversedString);
		assertTrue("dlrow olleh".equals(reversedString));
	}
	
	@Test
	public void reverseStringTest2() {
		String reversedString = StringReverse.reverseString5("Cecil Taylor");
		System.out.println("Reversed String: " + reversedString);
		assertTrue("rolyaT liceC".equals(reversedString));
	}
	
	@Test
	public void reverseStringTest3() {
		String reversedString = StringReverse.reverseString5("Nina Simone");
		System.out.println("Reversed String: " + reversedString);
		assertTrue("enomiS aniN".equals(reversedString));
	}

}
