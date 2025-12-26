package com.oops.abstraction;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("main method started !");

		System.out.println("**********Monkey Info ");
		Animal m = new Monkey();
		m.sound();
		m.sleep();
		m.eat();
		m.walk();
		m.run();
//		The final field Animal.ORG_NAME cannot be assigned
//		Animal.ORG_NAME = "Animal PArk1";
		System.out.println(Animal.ORG_NAME);

		System.out.println("**********Dog info !!");
		// UpCasting = Abstraction
		// Dynamic Dispatching
		Animal d = new Dog();
		d.sleep();
		d.eat();
		d.sound();
		d.walk();
		d.run();
		
		//This static method of interface Animal can only be accessed as Animal.breath
//		d.breath();
		Animal.breath();

//		List al = new ArrayList();
//		al.add("Hello");
//		System.out.println(al);

		System.out.println("**********Cat info !!");
		Animal c = new Cat();
		c.sound();
		c.sleep();
		c.eat();
		c.walk();
		c.run();
		//This static method of interface Animal can only be accessed as Animal.breath
//		c.breath();

	}
}
