package com.constructors;

//Note 1 : 
//Whenever in a program if there is no constructor 
//then Java Compiler will create default constructor for a class.

//Note 2: 
//with No-arg constructor, we can initialize data based on our requirement or dummy data.

//Note 3: While creating an Object, if we want to pass or initialize the data then we can go for 
//parameterized constructor.
public class Car {
	String model;
	String brand;
	String color;

	// No-arg constructor
	Car() {
		System.out.println("no arg constructor called ");
		model = "unknown";
		brand = "unknown";
		color = "unknown";
	}

	// parameterized constructor
	Car(String model, String brand, String color) {
		this.model = model;
		this.brand = brand;
		this.color = color;

	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		// this below object is created with the help of default constructor.
		// this below object is create with the help of no-arg constructor.
		Car c = new Car();
		c.show();
		Car c1 = new Car("Sonet", "KIA", "RED");
		c1.show();
		
		Car c2 = new Car();
		c2.model = "Seltos";
		c2.brand = "KIA";
		c2.color = "White";
		c2.show();

	}

	void show() {
		System.out.println("*******************");
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Car Color is : " + color);
	}

}
