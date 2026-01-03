package com.multithreading;

public class ThreadSleepDemo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("I am lazy Thread");
			} catch (InterruptedException e) {
				System.err.println("I got interrupted !!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started ");

		ThreadSleepDemo t1 = new ThreadSleepDemo();
		t1.start();
		t1.interrupt();
		System.out.println("main method ended ");
	}

}
