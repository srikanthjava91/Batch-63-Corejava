package com.multithreading;

class Test2 {
	void method1() {

	}
}

public class TestThreadDemo4 extends Test2 implements Runnable {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestThreadDemo4 r = new TestThreadDemo4();
		Thread t = new Thread(r);
		t.start();// always calls no arg run method

		Thread.currentThread().setName("main-jay");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("mian : " + i);
		}

		System.out.println("main method ended ");
	}

	public void run(int a) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run1 : " + i);
		}
	}

	@Override
	public void run() {

		Thread.currentThread().setName("jay");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}
	}

}
