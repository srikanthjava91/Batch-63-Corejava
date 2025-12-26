package com.stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		System.out.println("main method strated !");

		String s = "Java is simple and flexible";
		String[] arrStr = s.split("\\s", 3);
		int count = 0;

		for (String str : arrStr) {
			System.out.println(str);
			count++;
		}

		System.out.println("word count  : " + count);

	}

}
