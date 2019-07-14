package com.jspiders.si;

public class Computer {

	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Computer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
