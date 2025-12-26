package com.stringhandling;

public class TestStrDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		String str = "Java is simple in Vcube, Java is Great";
		System.out.println(str.indexOf('i'));// 5
		System.out.println(str.lastIndexOf('i'));// 15
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));// 15

		System.out.println(str.indexOf("is"));
		System.out.println(str.lastIndexOf("Java"));

		System.out.println("***************************");

		String s2 = "Java"; // SCP
		String s1 = new String("Java");// Heap area

//		s2 = s2.intern();
		s1 = s1.intern();// Returns a canonical representation for the string object.
//		s1.intern();
		System.out.println(s1 == s2);// false --> true
		System.out.println("**********s3*****************");

		String s3 = "";
		String s4 = " ";
		String s5 = null;
		String s6 = "Srikanth";

		// Returns true if the string is empty or
//		contains only white space codepoints, otherwise false.
		System.out.println(s3.isBlank());//

		// Returns true if, and only if, length() is 0.
		System.out.println(s3.isEmpty());//
		System.out.println(s3.length());// 0
		System.out.println("***********s4*****************");
		System.out.println(s4.isBlank());// true
		System.out.println(s4.isEmpty());// false
		System.out.println(s4.length());
		System.out.println();
		System.out.println("***********s5*****************");
//		System.out.println(s5.isBlank());//
//		System.out.println(s5.isEmpty());//
//		System.out.println(s5.length());//

	}
}
