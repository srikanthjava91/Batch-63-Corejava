package com.stringhandling;

//==  operator  always meant for addresses of the objects but not for content.
//equals method always checks content of the String.
public class TestStrDemo3 {

	TestStrDemo3(String s) {

	}

	public static void main(String[] args) {
		String str1 = "Karthik";
		String str2 = "Karthik";
		String str3 = new String("Srikanth");// 2 object
		String str4 = new String("Srikanth");// 1 object

		System.out.println(str1 == str2);// true
		System.out.println(str3 == str4);// false

		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));

		TestStrDemo3 t3 = new TestStrDemo3("Hello");
		TestStrDemo3 t4 = new TestStrDemo3("Hello");
		System.out.println(t3.equals(t4));// false

	}

}
