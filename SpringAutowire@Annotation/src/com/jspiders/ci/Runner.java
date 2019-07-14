package com.jspiders.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		Human h=(Human) container.getBean("human");
		
		h.dog1.eat();
	}
	
	
}
