package com.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("development")
public class ClassATest {
	
	@Test
	@Tag("usermanage")
	void testCaseA(TestInfo testInfo) {
		
	}

}
