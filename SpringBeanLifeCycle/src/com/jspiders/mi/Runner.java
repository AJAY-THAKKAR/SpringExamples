package com.jspiders.mi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		/*Computer com=container.getBean(Computer.class, "com");
		System.out.println(com);*/
		Computer com1=(Computer)container.getBean("com1");
		System.out.println(com1);
	}
}
