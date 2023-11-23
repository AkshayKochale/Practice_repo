package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstbootApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(FirstbootApplication.class, args);
		System.out.println("Working...");
	}

	
	public int getSum(int a,int b) 
	{
		
		return a+b;
	}
	
	
}
