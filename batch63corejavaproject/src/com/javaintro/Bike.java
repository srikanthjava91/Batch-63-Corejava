package com.javaintro;

public class Bike {

	static String brand;
	static String model;

	double price = 350000.00; // 350000.00

	// instance method
	void method1() {
		System.out.println(price);
	}

	static void method2() {
		System.out.println("Hello method2 !");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Bike class ");

		System.out.println(brand);// null
		System.out.println(model);// null

		method2();

		Bike b = new Bike();
		b.method1();

	}

}
