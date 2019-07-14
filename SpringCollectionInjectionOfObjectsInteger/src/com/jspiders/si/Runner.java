package com.jspiders.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Student aman=(Student) context.getBean("Aman");
		System.out.println(aman);
		
		aman.setName("PQRRRRSSSTTTIUUUU");
		
		Student aman12=(Student) context.getBean("Aman");
		System.out.println(aman12);
		System.out.println(aman==aman12);
		/*Student aman=(Student) context.getBean("Aman");
		System.out.println(aman);*/
		
		A a=(A) context.getBean("object");
		System.out.println(a);
	}
	
}
