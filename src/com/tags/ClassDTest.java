package com.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassDTest {
	
	@Test
	@Tag("development")
	@Tag("production")
	void testCaseD(TestInfo testinfo) {
	
	}
		

}
