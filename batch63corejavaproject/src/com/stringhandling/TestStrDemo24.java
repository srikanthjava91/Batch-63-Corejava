package com.stringhandling;

public class TestStrDemo24 {

	String s1;

	public static void main(String[] args) {

		System.out.println("main method strated ");

		
//		StringBuffer sb8 = "Java";//CE : STring Cannot conevrt to STringBuffer
//		System.out.println(sb8 + "Srikanth");
		
		// Mutable
		StringBuffer sb9 = new StringBuffer("Srikanth");
		sb9.append("Java");
		System.out.println(sb9);

		String s = new String();
		System.out.println(s);

		StringBuffer sb = new StringBuffer();//16
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());// 16

		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1);
		System.out.println(sb1.capacity());//20

		

		System.out.println("main method ended ");

	}

}
