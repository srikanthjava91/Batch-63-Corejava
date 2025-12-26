package com.exceptionhandling;

public class TestExDemo7 {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
