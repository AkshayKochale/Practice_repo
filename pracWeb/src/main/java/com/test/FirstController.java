package com.test;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/demo")
public class FirstController {

	@RequestMapping("/first")
	
	public ModelAndView firstpage(HttpServletResponse res,ModelAndView m) throws IOException 
	{
		System.out.println("first changed");
		m.addObject("name", "goku");
		m.setViewName("first");
		
		
		
		
		return m;
	}
	
}
