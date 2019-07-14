package com.jspiders.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	

	public HelloController() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("Controller Started...." + new Date());
	}

	@RequestMapping("/sayHello")
	public ModelAndView sayHello(){
	
		return new ModelAndView("hello.jsp");
		
	}
	
}
