package com.stringhandling;

public class TestStrDemo25 {

	public static void main(String[] args) {

		StringBuffer b10 = new StringBuffer();
		b10.ensureCapacity(50);
		System.out.println(b10.capacity());//16

		StringBuffer sb = new StringBuffer("Java Srikanth");
//		System.out.println(sb.reverse());

		System.out.println(sb.delete(0, 3));//

		StringBuffer sb1 = new StringBuffer("Srikanth");
		System.out.println(sb1);
		System.out.println(sb1.capacity());// 24

		System.out.println("***************");
		StringBuffer sb2 = new StringBuffer();// 16
		sb2.append("SrikanthSrikanthSrikanthSrikanthSrikanth");
		System.out.println(sb2);// 34
		System.out.println(sb2.capacity());

		System.out.println("******************");
		StringBuffer sb3 = new StringBuffer("Java");// 16
		System.out.println(sb3);
		sb3.append("SrikanthSrikanthSrikanthSrikanthSrikanth");
		System.out.println(sb3.capacity());// 42

		System.out.println("******************");
		StringBuffer sb4 = new StringBuffer();// 16
		sb4.append("SrikanthSrikanth");
		sb4.append("SrikanthSrikanthSri");
		sb4.append("kanth");
		System.out.println(sb4);
		System.out.println(sb4.capacity());

		System.out.println("******************");
		StringBuffer sb5 = new StringBuffer();// 16
		sb5.ensureCapacity(100);
		System.out.println(sb5.capacity());

	}

}
