package com.multithreading;

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield(); // Line 1
			System.out.println("Child Thread");
		}
	}
}

public class YieldDemo1 {

	public static void main(String args[]) {

		MyThread1 t = new MyThread1();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
