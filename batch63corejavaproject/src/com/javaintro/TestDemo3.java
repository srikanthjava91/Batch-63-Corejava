package com.javaintro;

public class TestDemo3 {

	static TestDemo3 t = new TestDemo3();

	// In static area, we cannot call instance methods directly, we must need to
	// create objects.
	static void hello1() {
		System.out.println("Hello1 called ");
		t.welcome1();
		hello2();
	}

	static void hello2() {
		System.out.println("Hello2 called ");
		t.welcome2();

	}

	static void hello3() {
		System.out.println("Hello3 called ");
		t.welcome3();
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		hello1();

		System.out.println("main method ENDED !");
	}

	// in instance method, we can call static method directly
	void welcome1() {
		System.out.println("Welcome1 called !");
		hello2();
	}

	void welcome2() {
		System.out.println("welcome2 called !");
		hello3();
	}

	void welcome3() {
		System.out.println("Welcome3 called ");
	}

}
