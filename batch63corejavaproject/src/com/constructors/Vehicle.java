package com.constructors;

class Scooty extends Vehicle {
	Scooty() {
		super(100000.00, "Ather");
		System.out.println("No arg constructor from scooty");
	}

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();
		System.out.println("main method from Scooty");
		Scooty s1 = new Scooty();
		System.out.println(s1.price);
		System.out.println(s1.name);
	}
}

public class Vehicle {

	double price;
	String name;

	Vehicle(double price, String name) {
		System.out.println("Two arg constructor from Vehicle");
		this.price = price;
		this.name = name;
	}

	private Vehicle() {
		System.out.println("No arg constructor from Vehicle");
	}

	public static void main(String[] args) {
		System.out.println("main method from Vehicle");
	}

}
