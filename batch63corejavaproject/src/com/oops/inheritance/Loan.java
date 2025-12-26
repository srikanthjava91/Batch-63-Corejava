package com.oops.inheritance;

import java.util.Scanner;

public class Loan implements LoanIn {

	static Scanner sc = new Scanner(System.in);

	@Override
	public String getEmpAddressDetails() {
		String address = "";

		System.out.println("Enter your flat number : ");
		String flat = sc.next();

		System.out.println("Enter your plot details : ");
		String plot = sc.next();

		System.out.println("Enter your Street : ");
		String street = sc.next();

		System.out.println("Enter your city : ");
		String city = sc.next();

		System.out.println("Enter your pinocde : ");
		long pin = sc.nextLong();

		address = "Flat no: " + flat + ", " + "Plot Details : " + plot + ", " + "Street Name : " + street + ","
				+ "City name : " + city + "," + "pincode : " + pin;

		return address;
	}

	public static void welcome() {
		System.out.println("Welcome to Vcube Loan Banking !");
	}

	private String hello() {
		return "Good Morning";
	}

	@Override
	public Object getLoanROI() {
		return 10.5;
	}

	@Override
	public int getEmpCibilScore() {
		System.out.println("Enter your Cibil score :");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public int getEmpAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	public double getEmpSal() {
		System.out.println("Enter your salary info : ");
		double salary = sc.nextDouble();
		return salary;

	}

}
