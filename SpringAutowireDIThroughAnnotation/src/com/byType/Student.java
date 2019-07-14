package com.jspiders.byType;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;
	
	private String rollNo;
	
	private String stream;
	
	private Address add;

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", add=" + add + "]";
	}
		
}
