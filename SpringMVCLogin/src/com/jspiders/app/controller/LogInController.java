package com.jspiders.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogInController {
	
	

	public LogInController() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("Controller Started...." + new Date());
	}

	@RequestMapping("/login")
	public ModelAndView sayHello(@RequestParam String username,@RequestParam String password){
	
		System.out.println(username);
		System.out.println(password);
		
		return new ModelAndView("response.jsp");
		
	}
	
}
