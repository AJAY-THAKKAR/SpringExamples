package com.jspiders.ci;

import org.springframework.stereotype.Component;

@Component
public class CatImpl implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Cat eats....");
	}

}
