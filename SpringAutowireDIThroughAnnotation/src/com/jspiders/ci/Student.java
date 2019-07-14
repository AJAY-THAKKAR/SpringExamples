package com.jspiders.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value="ram")
	private String name;
	
	@Value(value="23")
	private String rollNo;
	
	private String stream;
	
	//i wan to do this line automatically.
	//private address add=new Address();
	
	private Address add;

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", add=" + add + "]";
	}
		
}
