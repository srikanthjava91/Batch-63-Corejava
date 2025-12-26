package com.languagefundamentals;

class Employee {
	String ename = "Jai";
	int eid = 1;
	double esalary = 600000.00;
	int eage = 21;
	Address address  = new Address();
}

class Address {
	int flatno = 123;
	String plotname = "LIG";
	String street = "KPHB";
	String city = "Hyd";
}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Employee emp = new Employee();
		System.out.println("Employee Details ********");
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(emp.esalary);
		System.out.println(emp.eage);
		System.out.println("Address details ********");
		System.out.println(emp.address.flatno);
		System.out.println(emp.address.plotname);
		System.out.println(emp.address.street);
		System.out.println(emp.address.city);

	}

}
