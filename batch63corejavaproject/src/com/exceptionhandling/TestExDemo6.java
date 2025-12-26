package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			System.out.println("in try !");
			int a = 100 / 5;// 2

			String s = "Srikanth";
			System.out.println(s.charAt(a));// i

		} catch (ArithmeticException ae) {
			System.err.println("in catch of AE");
			System.err.println(ae.getMessage());
		} catch (StringIndexOutOfBoundsException ae) {
			System.err.println("in catch of SIOBE");
		} catch (Exception ae) {
			System.err.println("in catch of AE");
			System.err.println(ae.getMessage());
		} catch (Error ae) {
			System.err.println("in catch of E");
			System.err.println(ae.getMessage());
		}
		System.out.println("main method ended ");
	}
}
