package com.jspiders.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		Student aman=(Student) container.getBean("student");
		System.out.println(aman);
	}
}
