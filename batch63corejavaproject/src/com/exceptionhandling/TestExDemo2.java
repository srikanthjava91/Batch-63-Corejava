package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		try {
			System.out.println(10 / 0);
			System.out.println("in try !!");
			System.out.println("Hello jay !");
			return;
		} catch (Exception e) {
			System.err.println("In catch !!");
			System.err.println(e.toString());
		}

		System.out.println("Good morning !");
		System.out.println("main method ended !");

	}

}
