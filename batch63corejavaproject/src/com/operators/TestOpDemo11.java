package com.operators;

class Vehicle {
	String name = "Bike";

}

class Car extends Vehicle {
	String name = "Car";

}

public class TestOpDemo11 {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		Car c = new Car();

		System.out.println(c instanceof Vehicle);// true
		System.out.println(c instanceof Object);// true
//		System.out.println(c instanceof TestOpDemo11); //CE

		System.out.println(v instanceof Car);//false

	}

}
