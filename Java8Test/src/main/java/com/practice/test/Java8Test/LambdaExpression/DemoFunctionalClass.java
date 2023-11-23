package com.practice.test.Java8Test.LambdaExpression;


@FunctionalInterface
public interface DemoFunctionalClass 
{

	void print(int a) ;

	default void de1() 
	{
		System.out.println("de1");
	}
	
	static void se1() 
	{
		System.out.println("se1");
	}
}
