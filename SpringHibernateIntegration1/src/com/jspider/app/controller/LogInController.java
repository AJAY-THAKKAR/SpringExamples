package com.jspider.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.app.dao.logInDao;
import com.jspider.app.dto.LogInDto;
import com.jspider.app.dto.SignUpDto;

@Controller
public class LogInController {

	@Autowired
	logInDao dao;
	
	@RequestMapping(value="/saveSignUpData",method=RequestMethod.POST)
	public ModelAndView saveSignUpData(SignUpDto signUp,Model model){
		Long id=dao.saveSignUpData(signUp);
		System.out.println(id + signUp.getUserName() + signUp.getPassword());
		if(id==0 || id==null)
			model.addAttribute("message", "Sorry..Please try again...");
		else
			model.addAttribute("message", "Successfully signed up....");
		
		signUp=null;
		System.out.println(signUp);
		return new ModelAndView("SignUp.jsp");
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView checkLogin(LogInDto logIn,Model model){
		
		System.out.println(logIn);
		
		boolean res= dao.checkLogin(logIn);
		
		model.addAttribute("login", logIn);
		
		if(res)
			return new ModelAndView("Response.jsp");
		else{
			model.addAttribute("message", "Sorry..Please try again.Username or Password is incorrect..");
			return new ModelAndView("LogIn.jsp");
		}
	}
}
