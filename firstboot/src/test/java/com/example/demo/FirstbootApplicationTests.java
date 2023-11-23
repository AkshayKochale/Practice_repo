package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstbootApplicationTests {

	
	@Test
	void testSum() 
	{
		FirstbootApplication f=new FirstbootApplication();
		
		assertEquals(11, f.getSum(5, 6));
		assertEquals(13, f.getSum(7, 6));
		assertEquals(19, f.getSum(13, 6));
		
	}


}
