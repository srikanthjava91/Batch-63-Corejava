package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		String s1 = "Java";// String Literal Object

//		Initializes a newly created String object so that it represents an empty character sequence. 
//		Note that use of this constructor is unnecessary since Strings are immutable.
		String s2 = new String();
		String s3 = new String("Srikanth");// String with new Object
		String s4 = "Srikanth" + "Java";// String Concatenation
		String s5 = s4; // String with re-assignment

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		System.out.println("main method ended !");
	}

}
