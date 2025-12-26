package com.oops.inheritance;

//Shallow Copy  --> clone() method 
class Student implements Cloneable {
	String name;
	Address address;

	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class TestStudentDetails {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");
		Address address = new Address("Hyderabad");
		Student s1 = new Student("Srikanth", address);
		System.out.println(s1.name);// Srikanth
		System.out.println(s1.address.city);// Hyderabad

		Student s2 = (Student) s1.clone();
		System.out.println(s2.name);// Srikanth
		System.out.println(s2.address.city);// Hyderabad

		System.out.println("*****************************");
		s2.name = "Sanju";
		s2.address.city = "Banglore";
		System.out.println(s2.name);// Sanju
		System.out.println(s2.address.city);// Banglore

		System.out.println(s1.name);// Srikanth
		System.out.println(s1.address.city);// Banglore

	}

}
