package jspiders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
	
	@Value(value="ram")
	private String name;
	
	@Value(value="23.453")
	private double weight;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object Created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
