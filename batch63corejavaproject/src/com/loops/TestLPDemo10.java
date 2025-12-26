package com.loops;

//Q) WAP for 0 to 100 prime numbers ..? 
public class TestLPDemo10 {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");

		for (int i = 0; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}
	}
}
