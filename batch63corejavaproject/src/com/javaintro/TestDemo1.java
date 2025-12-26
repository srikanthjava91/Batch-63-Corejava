package com.javaintro;

public class TestDemo1 {

	// static method
	static void welcome() {
		System.out.println("Welcome to Java World !");

	}

	// instance method
	void hello() {
		System.out.println("Hello guys, Good Evening !");
		System.out.println("Hello Shafi, Good Evening !");
	}

	// main method
	public static void main(String[] args) {

		System.out.println("main method started !");
		TestDemo1 t = new TestDemo1();
		welcome();
		t.hello();
		System.out.println("main method ended !");

	}
}
