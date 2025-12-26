package com.multithreading;

public class TestThread extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println(Thread.currentThread());
		
		TestThread t1 = new TestThread();
		t1.start();

		
		for (int i = 0; i <= 20; i++) {
			System.out.println("main ");
		}

		System.out.println("main method ended !!");
	}

	@Override
	public void run() {
		System.out.println("show method called ");
		System.out.println(Thread.currentThread());

		for (int i = 0; i <= 20; i++) {
			System.out.println("show ");
		}

		System.out.println("show method ended ");
	}

}
