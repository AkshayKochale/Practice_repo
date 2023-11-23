package com.classes;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopImpl {

	
	@Before("execution(* com.classes.*.check(..))")
	public void before() 
	{
		System.out.println("before called from aspect");
	}
	
	
	
	
}
