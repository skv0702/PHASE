package com.test;

import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.demo.StringUtilities;

public class ParameterizedTestsDemo {
	
	String data[]={"racecar", "radar", "able was I ere I saw elba"};
	
	@Test
	public void testIfStringsSuppliedArePalindromes1()
	{
		for(String s :data)
		{
			assertTrue(StringUtilities.isPalindrome(s));
		}
	}
	@ParameterizedTest
	@ValueSource(strings= {"racecar", "radar", "able was I ere I saw elba"})
	public void testIfStringsSuppliedArePalindromes(String source)
	{
		
		System.out.println("source "+source);
		assertTrue(StringUtilities.isPalindrome(source));
	}
	
	@ParameterizedTest
	@MethodSource("palindromeValues")
	public void testIfStringsSuppliedArePalindromesFromMethod(String source)
	{
		
		System.out.println("source "+source);
		assertTrue(StringUtilities.isPalindrome(source));
	}
	
	public static Stream<String> palindromeValues()
	{
		return Stream.of("mam","madam","ere","malayalam","naan");
	}

	
}
