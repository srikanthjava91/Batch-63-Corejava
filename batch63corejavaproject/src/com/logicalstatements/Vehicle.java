package com.logicalstatements;

class Vehicle {
	String name;

}

class Car extends Vehicle {

	String name;

	public static void main(String[] args) {
		Car c = new Car();

		System.out.println(c.hashCode());

	}
}
