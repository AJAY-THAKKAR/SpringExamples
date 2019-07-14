package com.jspiders.si;

import java.util.Map;

public class Student {

	String name;
	
	//Collection<Address> listOfAddress;

	Map<Object,Address> listOfAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Object, Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Map<Object, Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

		
}
