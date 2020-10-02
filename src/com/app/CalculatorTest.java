package com.app;




import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;





@RunWith(Parameterized.class)
public class CalculatorTest {

	@Parameterized.Parameter(0)
	
	public int expected;
	@Parameterized.Parameter(1)
	public int first1;
	@Parameterized.Parameter(2)
	public int first2;
	
	
	
	/*
	 * public CalculatorTest(int expected, int first, int last) {
	 * this.expected=expected; this.first1=first; this.first2=last; }
	 */
	
	@Parameterized.Parameters
	public static Collection addNumbers() {
		
		
		return Arrays.asList(new Integer [][] { {3,1,2}, {5,2,3} } );
		
		
	}
	
	@Test
	public void sum() {
		Calculator ca= new Calculator();
		assertEquals(expected, ca.add(first1, first2));
	}

}









