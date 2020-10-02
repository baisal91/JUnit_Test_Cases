package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private Integer input;
    private Boolean expected;
    private PrimeNumberChecker primchecker;
    
	
	
	public PrimeNumberCheckerTest(Integer input, Boolean expected) {
	        this.input = input;
	        this.expected = expected;
	        primchecker = new PrimeNumberChecker();
	     }
	
	
	@Parameterized.Parameters
    public static Collection primeNumbers() {
     
       return Arrays.asList(new Object[][] {
          { 9, false },
          { 29, true },
          { 24, false },
          { 31, true }
          
       });
    }
	
	
	@Test
    public  void testPrimeNumberChecker() {
       
       assertEquals(expected, primchecker.validate(input));
    }

}
