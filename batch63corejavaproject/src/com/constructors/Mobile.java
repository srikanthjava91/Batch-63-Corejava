package com.constructors;

public class Mobile {

	String model;
	String brand;
	String color;

	public Mobile(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}

//	public Mobile(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("9R", "One Plus");
		m1.display();

		Mobile m2 = new Mobile("9R", "Blue");
		m2.display();
	}

	void display() {
		System.out.println("Model : " + model);
		System.out.println("brand : " + brand);
		System.out.println("Color : " + color);
	}

}
