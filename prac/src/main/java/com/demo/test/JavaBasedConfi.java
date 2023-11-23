package com.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.classes.Address;
import com.classes.Student;

@Configuration
@ComponentScan(basePackages = {"com.classes"})
public class JavaBasedConfi 
{

	
	@Bean
	public Student setstudent() 
	{
			Student student = new Student();
			student.setName("Alok");
			student.setStuId(1234);
//			student.setAddress(setaddress());
		
		return student; 
	}
	
	@Bean("alok")
	public Address setaddress() 
	{
		Address add=new Address();
		add.setName("Thane");
		add.setStreet("madrasi chwal");
		add.setPincode(12334);
		
		return add;
	}

	
	@Bean("alok1")
//	@Conditional(value = MyCustomCondition.class)
	public Address setaddress1() 
	{
		Address add=new Address();
		add.setName("Thane");
		add.setStreet("pakistan");
		add.setPincode(12334);
		
		return add;
	}
	
	

	
}
