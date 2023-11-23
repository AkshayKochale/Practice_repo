package com.demo.test;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

class MyCustomCondition implements Condition {
	
	
	
	
	
    public MyCustomCondition() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
       
    	
        return false; // Enable the configuration if the condition is met
    }
}