package com.jspiders.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Student aman=(Student) context.getBean("Aman");
		System.out.println(aman);	
		
		
	}
	
}
