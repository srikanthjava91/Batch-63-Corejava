package com.multithreading;

public class TestThreadDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		TestThreadDemo1 t1 = new TestThreadDemo1();
		t1.hello();
		System.out.println("Thread Info : " + Thread.currentThread());
		System.out.println("main method ended !");
	}

	void hello() {
		System.out.println("hello method called !");
	}
}
