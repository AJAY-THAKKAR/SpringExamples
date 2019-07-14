package com.jspider.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.app.dao.StudentDao;
import com.jspider.app.dto.StudentDto;

@Controller
public class StudentController {

	/*@RequestMapping("/studentInfo")
	public ModelAndView getStudentInfo(StudentDto dto,Model model){
		
		System.out.println(dto);
		model.addAttribute("dto", dto);
		return new ModelAndView("response.jsp");
		
	}*/
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping(value="/studentInfo",method=RequestMethod.POST)
	public ModelAndView getStudentInfo(StudentDto dto,Model model){
		
		System.out.println(dto);
		
		int rollNo= dao.saveStudent(dto);
		dto.setRollNo(rollNo);
		model.addAttribute("dto", dto);
		return new ModelAndView("response.jsp");
		
	}
}
