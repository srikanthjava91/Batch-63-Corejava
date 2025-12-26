package com.exceptionhandling;

class Test {
	void method1() {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.err.println("in catch !");
		}
	}
}

public class TestExDemo11 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Test t = new Test();
		t.method1();
		System.out.println("main method ended !");
	}
}
