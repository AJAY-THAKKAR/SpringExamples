package com.jspiders.siInt;

import java.util.Collection;

public class Engine {

	Collection<Integer> listOfIntegers;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Engine [listOfIntegers=" + listOfIntegers + "]";
	}

	public Collection<Integer> getListOfIntegers() {
		return listOfIntegers;
	}

	public void setListOfIntegers(Collection<Integer> listOfIntegers) {
		this.listOfIntegers = listOfIntegers;
	}

	public Engine(Collection<Integer> listOfIntegers) {
		super();
		this.listOfIntegers = listOfIntegers;
	}
	
}