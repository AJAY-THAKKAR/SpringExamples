package com.jspiders.ci;

import java.util.Collection;

public class Galaxy {
	
	String name;
	
	Collection<String> starName;

	public Galaxy(String name, Collection<String> starName) {
		super();
		this.name = name;
		this.starName = starName;
	}

	@Override
	public String toString() {
		return "Galaxy [name=" + name + ", starName=" + starName + "]";
	}

	public Galaxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<String> getStarName() {
		return starName;
	}

	public void setStarName(Collection<String> starName) {
		this.starName = starName;
	}
		
}
