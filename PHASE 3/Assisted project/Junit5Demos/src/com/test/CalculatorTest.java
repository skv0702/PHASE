package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.io.File;
import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
//import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;
import com.demo.MathTools;

public class CalculatorTest {

	Calculator cal;
	File file ;
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("*******  BEFORE ALL ***********");
	}
	@BeforeEach
	public void before()
	{
		cal = new Calculator();
		System.out.println("*******  BEFORE EACH ***********");
		file = new File("test.txt");
	}
	@Test
	@DisplayName("Test Add for positive values")
	public void testAddShouldReturnPositiveValue()
	{
		System.out.println("*******  TEST POSITIVE ***********");
		int expected = 10;
		int actual = cal.add(5, 5);
		assertEquals(expected, actual);
	}
	@Test()
	@Disabled
	public void testAddShouldReturnNegativeValue()
	{
		System.out.println("*******  TEST NEGATIVE ***********");
		int expected = -10;
		int actual = cal.add(-5, -5);
		assertEquals(expected, actual);
	}
	@Test
	public void testFactorialShouldThrowException()
	{
		assertThrows(RuntimeException.class, ()->{
			cal.factorial(0);
		});
	}
	
	@Test
	public void testShouldTimeOut()
	{
		assertTimeout(Duration.ofSeconds(3), ()->MathTools.convertToDecimal(10, 3));
	}
	@AfterEach
	public void after()
	{
		System.out.println("*******  AFTER EACH ***********");
		cal = null;
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("*******  AFTER ALL ***********");
	}
}
