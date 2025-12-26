package com.stringhandling;

public class TestStrDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		String s = "Java is simple and flexible 123";
		System.out.println(s.replace('a', 'A'));
		System.out.println(s.replace("le", "LEEEEEE"));
		System.out.println(s.replaceAll("le", "LIIIIIIIIII"));
		System.out.println(s.replace("123", "567"));
		System.out.println(s.replaceAll("\\d", "a"));

		String s1 = "                 Hello         Good       Morning    ";
		System.out.println(s1);
		System.out.println(s1.trim());// with all leading and trailing space removed
		System.out.println(s1.replaceAll("\\s", ""));

	}
}
