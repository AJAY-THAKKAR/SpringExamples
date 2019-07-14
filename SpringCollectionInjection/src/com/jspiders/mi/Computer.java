package com.jspiders.mi;

public class Computer {

	private MotherBoard motherBoard;
	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public Computer(MotherBoard motherBoard, String brand, double price) {
		super();
		this.motherBoard = motherBoard;
		this.brand = brand;
		this.price = price;
	}

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
		return "Computer [motherBoard=" + motherBoard + ", brand=" + brand + ", price=" + price + "]";
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
