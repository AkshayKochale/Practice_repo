package com.practice.test.JUnitTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class MyCalculatorTest {

	
	MyCalculator m=null;
	
	@Before
	public void beforeAny() 
	{
		System.out.println("before called");
		m = Mockito.mock(MyCalculator.class);
		when(m.add(anyInt(), anyInt())).thenReturn(5);
		
	}
	
	


	@Test
	public void test() {
	
		assertEquals(5, m.add(4, 3));
		System.out.println(m.hashCode());
		verify(m).add(4, 3);
		
	}
	
	@Test
	public void tes1() 
	{
		m.print();
	}
	
	@After
	public void AfterAny() 
	{
		System.out.println("After called");
	}
	

}
