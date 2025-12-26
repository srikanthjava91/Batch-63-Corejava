package com.oops.inheritance;

class Employee {
	int id = 9;
	String name = "Sanju Samson";
	int age = 28;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp);
	}

}
