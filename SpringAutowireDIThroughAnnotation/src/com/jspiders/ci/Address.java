package com.jspiders.ci;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	
	private String state;
	
	private String pinCode;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}	
}
