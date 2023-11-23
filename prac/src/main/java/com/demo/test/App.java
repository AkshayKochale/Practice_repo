package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classes.Address;

public class App 
{
    public static void main(String[] args) throws Exception
    {
		
		
		/*
		 * ApplicationContext context=new
		 * AnnotationConfigApplicationContext(JavaBasedConfi.class);
		 * 
		 * Student bean = context.getBean("setstudent",Student.class);
		 * System.out.println(bean);
		 */
		 
		/*
		 * JdbcTemplate j = context.getBean("jbdcTemp",JdbcTemplate.class);
		 * 
		 * String q="insert into student values(12134,'akshay1')"; int update =
		 * j.update(q); System.out.println("data inserted "+update);
		 */
        
        
        //Class.forName("");
    	
//    	Class.forName ("org.h2.Driver"); 
//    	System.out.println("class loaded");
//        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "akshay","");
//        System.out.println("con done");
    
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaBasedConfi.class);
    			  
    	//Checked conditional bean creation
    	Address bean = context.getBean("alok1",Address.class);
    	System.out.println(bean);
    			
    			
    	
    }
     
    
}
