package com.methods;

public class TestTypesOfmethods2 {

	public static void main(String[] args) {
		System.out.println("main method strated !");

		System.out.println(addition());
		System.out.println(getName());

		method1();

//		int add = addition();// 300
//		String fn = getName();// Narasimha
//
//		System.out.println("Addition of values : " + add);
//		System.out.println("Name of the Person : " + fn);

		System.out.println("main method ended !");
	}

	static void method1() {
		System.out.println("Hello method1 !!");
		return;
	}

	// This method must return a result of type int
	static double addition() {
		int sum = 0;
		sum = 100 + 200;
		return sum;
	}

	static String getName() {
		String s = "";
		s = "Narasimha";
		return s;
	}

}
