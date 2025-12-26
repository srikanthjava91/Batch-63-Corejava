package com.javaintro;

public class TestDemo2 {

	// In static methods, we can call static methods directly !
	static void method1() {
		System.out.println("Hello method1");
		method2();

	}

	// In instance methods, can we call instance methods directly ..?Yes
	void method4() {
		System.out.println("Hello method4");
		method5();
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		method1();
		TestDemo2 t2 = new TestDemo2();
		t2.method4();
		System.out.println("main method ended !");

	}

	static void method2() {
		method3();
		System.out.println("Hello method2");
	}

	static void method3() {
		System.out.println("Hello method3");
	}

	void method5() {
		method6();
		System.out.println("Hello method5");
	}

	void method6() {
		System.out.println("Hello method6");
	}

}
