package com.jspiders.mappingcollection.ci;

import java.util.Map;

public class Galaxy {
	
	String name;
	
	Map<Double,String> starsCollection;

	@Override
	public String toString() {
		return "Galaxy [name=" + name + ", starsCollection=" + starsCollection + "]";
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

	public Map<Double, String> getStarsCollection() {
		return starsCollection;
	}

	public void setStarsCollection(Map<Double, String> starsCollection) {
		this.starsCollection = starsCollection;
	}

	public Galaxy(String name, Map<Double, String> starsCollection) {
		super();
		this.name = name;
		this.starsCollection = starsCollection;
	}
	
}
