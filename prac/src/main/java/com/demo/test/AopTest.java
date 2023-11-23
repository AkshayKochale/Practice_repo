package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classes.TestMethod;

public class AopTest {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("configure.xml");
		TestMethod t = (TestMethod)context.getBean("test");
		t.check(5,6);
		
	}
	

}
