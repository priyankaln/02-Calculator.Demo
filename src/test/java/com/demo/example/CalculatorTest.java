package com.demo.example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	obj = new Calculator();
	}

	@Test
	public void testAdd() {
	//fail("Not yet implemented");
	int result = obj.add(5,3);
	assertEquals(8, result);
	}

}
