package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public void walk() {
		System.out.println("Every animal can walk but Monkey can also jump !!");
	}

	@Override
	public void sound() {
		System.out.println("kich kich chik ");
	}

	@Override
	public void eat() {
		System.out.println("Monkey can eat banana's");

	}

	@Override
	public void sleep() {
		System.out.println("Monkey can sleep anytime !");
	}

}
