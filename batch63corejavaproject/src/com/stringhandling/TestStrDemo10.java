package com.stringhandling;

class Employee {
	String name;

	Employee(String name) {
		this.name = name;
	}
}

public class TestStrDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		System.out.println("******************* Object class .equals");
		Employee e1 = new Employee("Srikanth");//
		Employee e2 = new Employee("Srikanth");//
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));// false

		System.out.println("*******************==");
		String s3 = "Vcube";// SCP
		String s4 = "Vcube";// SCP
		System.out.println(s3 == s4);// true
		System.out.println(s3.equals(s4));// true

		System.out.println("******************* String class .equals");
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1.equals(s2));// true
		System.out.println(s1 == s2);// false
		System.out.println("************************");

		int i = 100;
		int j = 200;
		System.out.println(i == j);

		System.out.println(s1.hashCode());//
		System.out.println(s2.hashCode());//
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

	}
}
