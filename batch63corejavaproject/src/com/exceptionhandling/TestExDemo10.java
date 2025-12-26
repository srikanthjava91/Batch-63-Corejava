package com.exceptionhandling;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		try {
			System.out.println("in try !!");

			try {

			} finally {

			}

//			try {
//				System.out.println("In try1 !");
//				System.out.println(10 / 0);
//			} catch (Exception e) {
//				System.out.println("In catch1 !");
//			}

		} catch (Exception e) {
			System.out.println("in catch !!");
		} finally {
			System.out.println("in finally ");
		}
	}
}
