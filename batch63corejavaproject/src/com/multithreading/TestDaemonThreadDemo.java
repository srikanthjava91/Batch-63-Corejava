package com.multithreading;

public class TestDaemonThreadDemo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("child :  " + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestDaemonThreadDemo t1 = new TestDaemonThreadDemo();
		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isDaemon());

//		for (int i = 0; i <= 1; i++) {
//			System.out.println("main :  " + i);
//		}

		System.out.println("main method ended !");
	}

}
