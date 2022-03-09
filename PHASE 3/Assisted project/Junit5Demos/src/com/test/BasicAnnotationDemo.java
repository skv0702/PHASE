package com.test;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BasicAnnotationDemo {
	
	@BeforeEach
	public void setUp()
	{
		System.out.println("befor");
	}
	
	@Test
	public void shouldTestTheTestCase()
	{
		System.out.println("test the test case");
	}
	@Test
	public void shouldTestTheTestCase1()
	{
		System.out.println("test the test case1");
		
	}
	@AfterEach
	public void tearDown()
	{
		System.out.println("after");
	}
	

}
