package com.multithreading;

// 1 to 10 
//1 is lowest priority 
//10 is the Highest  priority 
//5 is the Norm Priority

class Thread1 extends Thread {

	@Override
	public void run() {
		currentThread().setPriority(MAX_PRIORITY);
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread 1 info : " + i);
		}
	}

}

class Thread2 extends Thread {
	@Override
	public void run() {
		currentThread().setPriority(MAX_PRIORITY);
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread 2 info : " + i);
		}
	}

}

class Thread3 extends Thread {
	@Override
	public void run() {
		currentThread().setPriority(9);
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread 3 info : " + i);
		}
	}

}

public class TestThreadDemo5 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();

		t1.start();
		t2.start();
		t3.start();

	}

}
