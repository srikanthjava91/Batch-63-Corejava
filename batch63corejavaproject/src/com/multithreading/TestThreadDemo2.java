package com.multithreading;

class Test1{
	void method1() {
		
	}
}

public class TestThreadDemo2 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method strated !!");
		System.out.println(Thread.currentThread());
		TestThreadDemo2 t2 = new TestThreadDemo2();
		t2.start();
//		t2.start();

		for (int i = 0; i <= 20; i++) {
			System.out.println("main : " + i);
		}
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 20; i++) {
			System.out.println("hello :" + i);
		}
	}
}
