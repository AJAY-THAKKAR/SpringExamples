package com.jspiders.si;

public class Address {
	
	String street;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String street) {
		super();
		this.street = street;
	}
	
	

}
