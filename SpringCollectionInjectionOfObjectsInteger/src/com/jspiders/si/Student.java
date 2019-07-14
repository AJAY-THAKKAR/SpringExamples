package com.jspiders.si;

import java.util.Collection;

public class Student {

	String name;
	
	Collection<Address> listOfAddress;

	@Override
	public String toString() {
		return "Student [name=" + name + ", listOfAddress=" + listOfAddress + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Collection<Address> listOfAddress) {
		super();
		this.name = name;
		this.listOfAddress = listOfAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
}
