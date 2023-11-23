package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstCont {

	@RequestMapping("/home")
	public String home() 
	{
		System.out.println("HOME1 CALLED");
		
		return "Home.jsp";
	}
		
}
