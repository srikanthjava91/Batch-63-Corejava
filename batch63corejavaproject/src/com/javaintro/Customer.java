package com.javaintro;

public class Customer {

	int cid;
	String cname;

	public static void main(String[] args) {
		System.out.println("main method started ");

		Customer c1 = new Customer();
		Customer c2 = new Customer();

		c1.cid = 1;
		c1.cname = "Ramesh";
		System.out.println(c1.cid);
		System.out.println(c1.cname);

		c2.cid = 2;
		c2.cname = "Suresh";
		System.out.println(c2.cid);
		System.out.println(c2.cname);

	}

}
