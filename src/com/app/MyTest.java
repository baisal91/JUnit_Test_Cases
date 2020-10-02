package com.app;

import junit.framework.TestCase;

public class MyTest extends TestCase {

	protected void setUp() throws Exception{
		System.out.println("in setup");
	}
	
	protected void tearDown() throws Exception{
		System.out.println("in teardown");
	}
	
	public void testApp() {
		System.out.println("inside test");
	}
	
	public void testApp2() {
		System.out.println("inside test2");
	}
	
	

}
