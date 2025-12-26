package com.oops;

//POJO : Plain old Java Object 
//DTO : Data Transfer Object 
public class Employee {

	private int eid;
	private String firstname;
	private String lastname;
	String uname;
	private String password;
	private int age;
	private double salary;
	private long phone;

	public static final int COLLEGE_ID = 555;

	public void display() {
		System.out.println(eid);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(uname);
		System.out.println(password);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(phone);

	}

	public Employee(int eid, String firstname, String lastname, String uname, String password, int age, double salary,
			long phone) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.uname = uname;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}

}
