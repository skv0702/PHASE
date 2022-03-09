package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;

public class FileTest {

	File file ;
	
	
	@BeforeEach
	public void before() throws IOException
	{
		file = new File("test.txt");
		file.createNewFile();
	}
	
	
	@Test
	public void testAddShouldWriteInFile()
	{
		System.out.println("*******  TEST POSITIVE ***********");
		
		
	}
	@Test
	public void testAddShouldReadFromFile()
	{
		System.out.println("*******  TEST NEGATIVE ***********");
		
		
	}
	@AfterEach
	public void after()
	{
		
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("*******  AFTER ALL ***********");
	}
}

