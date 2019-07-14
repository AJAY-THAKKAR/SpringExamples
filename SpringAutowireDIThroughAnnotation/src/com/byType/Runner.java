package com.jspiders.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		Student aman=(Student) container.getBean("aman");
		System.out.println(aman);
		
		Student aakash=(Student) container.getBean("aakash");
		System.out.println(aakash);
	}

}
