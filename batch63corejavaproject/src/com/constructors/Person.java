package com.constructors;

public class Person {
	String id;
	String name;

	Person() {
		this("3c", "Srikanth");
		System.out.println("no arg constructor called from Person");
	}

	Person(String id, String name) {
		System.out.println("two arg constructor called from Person");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Person");
	}
}

class Employee extends Person {

	Employee() {
		System.out.println("no arg constructor called from Employee");
	}

	Employee(String id, String name) {
		this();
		System.out.println("2-arg parameterized constructor called !");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Employee");

		Employee e = new Employee();
		System.out.println(e.id);
		System.out.println(e.name);

//		Employee e1 = new Employee();
//		System.out.println(e1.id);
//		System.out.println(e1.name);

	}
}
