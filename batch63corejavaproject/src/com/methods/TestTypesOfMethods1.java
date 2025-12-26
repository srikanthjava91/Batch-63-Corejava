package com.methods;

//WAP to calculate numbers.?
public class TestTypesOfMethods1 {

	void addition() {
		System.out.println("addition method called ");
		int a = 10;
		int b = 100;
		System.out.println("sum : " + (a + b));
	}

	void subtraction() {
		System.out.println("subtraction method called ");
		int a = 10;
		int b = 100;
		System.out.println("diff : " + (a - b));
	}

	void multiplication() {
		System.out.println("multiplication method called ");
		int a = 10;
		int b = 100;
		System.out.println("mul : " + (a * b));
	}

	void division() {
		System.out.println("division method called ");
		int a = 100;
		int b = 8;
		System.out.println("div : " + (a / b));
	}

	void modulus() {
		System.out.println("modulus method called ");
		int a = 100;
		int b = 8;
		System.out.println("mod : " + (a % b));
	}

	// main method + with arguments + no return type 
	public static void main(String[] args) {
		System.out.println("main method started !");

		TestTypesOfMethods1 t1 = new TestTypesOfMethods1();

		// calling the method
		t1.addition();
		t1.subtraction();
		t1.modulus();
		t1.multiplication();
		t1.division();

		System.out.println("main method ended !");
	}

}
