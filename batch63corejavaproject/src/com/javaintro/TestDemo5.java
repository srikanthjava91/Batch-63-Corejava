package com.javaintro;

public class TestDemo5 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started from TestDemo5!");

		// unhandled exception type ClassNotFoundException
		System.out.println(Class.forName("com.javaintro.TestDemo6"));

		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		System.out.println("Driver class loaded !!");

	}
}
