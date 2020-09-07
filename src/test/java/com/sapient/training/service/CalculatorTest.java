package com.sapient.training.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after test class");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before test method");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test method");

	}

	@Test
	public void testAddition() {
		Calculator cal=new Calculator();
		assertEquals("Addition passed",5.0,cal.addition(2.0, 3.0),0.01);
	}
	@Test
	public void testfailAddition() {
		Calculator cal=new Calculator();
		assertNotEquals("Addition failed",5.0,cal.addition(1.0, 3.0),0.01);
	}

	@Test
	public void testSubtraction() {
		assertEquals("Subtraction passed",1,new Calculator().subtraction(4,3));
	}
	@Test
	public void testfailSubtraction() {
		assertNotEquals("Subtraction failed",-1,new Calculator().subtraction(4,3));
	}

}
