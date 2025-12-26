package com.oops.abstraction;

public class TestDemo1 {
	int i;
	String name;

	TestDemo1() {
		System.out.println("no arg");
	}

	TestDemo1(int i, String name) {
		System.out.println("Parm arg");
		this();
	}

	 void main() {
		System.out.println("Hello main method started !");
		TestDemo1 t1 = new TestDemo1(1, "sri");
	}

}
