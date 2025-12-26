package com.stringhandling;

public class TestStrDemo8 {

	public static void main(String[] args) {
		String s1 = "Good morning";
		System.out.println(s1.codePointAt(3));// 100
		System.out.println(s1.codePointBefore(3));// 111
		System.out.println(s1.codePointAt(0));// 71
		System.out.println(s1.codePointCount(0, 3));// 3

		System.out.println("********************");
		String s2 = "Srikanth";// 107
		String s3 = "Sriram";// 114
		System.out.println(s2.compareTo(s3));// -7

		String s4 = "Advaith";// 65
		String s5 = "advaith";// 97
		System.out.println(s4.compareTo(s5));// -32
		System.out.println(s4.compareToIgnoreCase(s5));// 0

		String s6 = "Srikanth";//8
		String s7 = "Srikanth Java";//13
		System.out.println(s6.compareTo(s7));//-5

	}

}
