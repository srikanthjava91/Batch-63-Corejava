package com.multithreading;

//VLC media Player : Audio Video Timer 

class AudioThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio info : " + i);
		}
	}

}

class VideoThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Video info : " + i);
		}
	}

}

class TimerThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Timer info : " + i);
		}
	}

}

public class TestThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("mian method started !");

		AudioThread a = new AudioThread();
		VideoThread v = new VideoThread();
		TimerThread t = new TimerThread();
		a.start();
		v.start();
		t.start();

	}
}
