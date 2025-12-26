package com.stringhandling;

public class TestStrDemo18 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		String str = String.join("@", "java", "is", "simple", "in", "vcube", "JNTU");
		System.out.println(str);

		String[] arrStr = str.split("@");
		int count = 0;

		for (String str1 : arrStr) {
			System.out.println(str1);
			count++;
		}

		System.out.println("count : " + count);
		System.out.println("main method ended !");
	}

}
