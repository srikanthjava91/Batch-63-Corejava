package com.methods;

class Employee {
	static int eid;
	String ename;
	int age;
	double salary;
}

public class TestTypesOfMethods7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Employee e = new Employee();
		Employee.eid = 10;
		e.ename = "Teja";
		e.ename = "Sai teja";
		e.age = 22;
		e.salary = 100000.00;

		// Call by reference
		getEmployeeDetails(e);
	}

	static void getEmployeeDetails(Employee e) {
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.age);
		System.out.println(e.salary);
	}

}
