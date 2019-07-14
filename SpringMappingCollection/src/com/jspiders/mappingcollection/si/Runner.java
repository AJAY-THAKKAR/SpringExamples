package com.jspiders.mappingcollection.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		/*Computer com=container.getBean(Computer.class, "com");
		System.out.println(com);*/
		
		Galaxy gx=(Galaxy) container.getBean("galaxy" );
		System.out.println(gx);
		
		/*Galaxy gx1=(Galaxy) container.getBean("galaxy1" );
		System.out.println(gx1);
		
		Galaxy gx2=(Galaxy) container.getBean("galaxy2" );
		System.out.println(gx2);
*/
	}

}
