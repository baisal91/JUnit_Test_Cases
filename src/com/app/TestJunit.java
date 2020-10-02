package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJunit {
	
	String message = "Robert";
	MessageUtil messageUtl = new MessageUtil(message);
	
	
	//@Test(timeout = 1000)
	@Test(expected = ArithmeticException.class)
	//@Test(expected = NullPointerException.class)
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage()");
		messageUtl.printMessage();
	}
	
	
	@Test
	public void testSalutatMessage() {
		System.out.println("Inside testSalutatMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtl.salutaionMessage());
	}

}
