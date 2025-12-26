package com.exceptionhandling;

//No exception of type Object can be thrown; an exception type must be a subclass of Throwable
public class TestExDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		String s = "Srikanth";
		System.out.println(s.length());// 8
		String s1 = "null";
		String s2 = null;

		try {
			System.out.println(s1.equals(s2));// false
			System.out.println(s1.length());// 4
			System.out.println(s2.length());// NPE

		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			// null dot any operation is always NPE
			System.out.println(s2.equals(s1));// NPE
		} catch (NullPointerException e1) {
			System.err.println(e1.getMessage());
		}

		System.out.println("main method ended !");
		System.out.println("main method ended !");
		System.out.println("main method ended !");

	}
}
