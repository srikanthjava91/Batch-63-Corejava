package com.javaintro;

public class Cricketer {

	// Declaration
	// instance variables or Non-static variables
	int jerseyNo;
	String cricketerName;

	// Static variables
	static int countryID;
	static String countryName;
	
	
	static {
		System.out.println("Welcome to Indian Cricket Team");
	}
	
	{
		System.out.println("Congrtulations  you are select for Indian Cricket Team !");
	
	}

	public static void main(String[] args) {
		System.out.println("Indian Team info ");

		// Creating an object of a class
		// RHS = Object
		// LHS = Object Reference variable which is g here.
		System.out.println("1st object info ***********************");
		Cricketer g = new Cricketer();
		
		new Cricketer();

		// Assigning the values to static data
		countryID = 91;
		countryName = "India";

		g.jerseyNo = 77;
		g.cricketerName = "Shubman Gill";

		// Accessing the static data directly
		System.out.println("Country ID : " + countryID);// 0
		System.out.println("Country Name : " + countryName);// null

		// Accessing the instance data is not possible in main method, because main
		// method static.
		// So, We cannot access instance data in static area directly but we can access
		// instance data in static area by creating Object with object reference
		// variable.
		System.out.println("Jersey Number : " + g.jerseyNo);// 0
		System.out.println("Name of the Cricketer :" + g.cricketerName);// null

		System.out.println("2nd object info ***********************");
		Cricketer j = new Cricketer();
		j.jerseyNo = 64;
		j.cricketerName = "Yashaswi Jaiswal";
		System.out.println("Country ID : " + countryID); // 91
		System.out.println("Country Name : " + countryName); // India
		System.out.println("Jersey Number : " + j.jerseyNo);// 0
		System.out.println("Name of the Cricketer :" + j.cricketerName);// null

		System.out.println("3nd object info ***********************");
		Cricketer p = new Cricketer();
		p.jerseyNo = 17;
		p.cricketerName = "Rishab Pant";
		System.out.println("Country ID : " + countryID); // 91
		System.out.println("Country Name : " + countryName); // India
		System.out.println("Jersey Number : " + p.jerseyNo);// 0
		System.out.println("Name of the Cricketer :" + p.cricketerName);// null

		System.out.println("4th object info ***********************");
		Cricketer r = new Cricketer();
		countryID = 92;
		countryName = "Bharath";
		r.jerseyNo = 1;
		r.cricketerName = "K Lokesh Rahul";

		System.out.println("Country ID : " + countryID);// 92
		System.out.println("Country Name : " + countryName);// Bharath
		System.out.println("Jersey Number : " + r.jerseyNo);
		System.out.println("Name of the Cricketer :" + r.cricketerName);

		System.out.println("5th object info ***********************");
		Cricketer jaddu = new Cricketer();
		System.out.println("Country ID : " + countryID);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + jaddu.jerseyNo);
		System.out.println("Name of the Cricketer :" + jaddu.cricketerName);

	}

}
