package com.jspiders.ci;

import org.springframework.stereotype.Component;

@Component
public class Dog implements IAnimal{
	
	@Override
	public void eat(){
		System.out.println("Dog Eats........");
	}

}
