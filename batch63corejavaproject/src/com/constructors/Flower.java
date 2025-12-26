package com.constructors;

//super or Parent or Base 
public class Flower {
	String name = "Lotus";

	public static void main(String[] args) {
		System.out.println("main method stratred from Flower");
	}
}

//sub or Child or Derived 
class Rose extends Flower {
	String name = "Rose";

	public static void main(String[] args) {
		System.out.println("main method stratred from Rose");
		Rose r = new Rose();
		r.show();
		// Cannot use super in a static context
//		System.out.println("Flower Name : " + super.name);
	}

	public void show() {
		String name = "Jasmine";
		System.out.println("show method called ");
		System.out.println("Flower Name : " + super.name);

	}
}
