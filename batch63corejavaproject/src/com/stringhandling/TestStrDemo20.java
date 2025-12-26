package com.stringhandling;

public class TestStrDemo20 {

	public static void main(String[] args) {

		String s3 = "Good morning Have a nive day";
		System.out.println(s3.substring(5));

//		 the beginning index, inclusive.
//		 the ending index, exclusive.
		String s4 = "Java Srikanth";
		System.out.println(s4.substring(2, 7));// va Sr

		String s5 = "Java is simple";
		System.out.println(s5.subSequence(2, 6));// va i

		String s6 = "All the best for Collections and will start from next monday - 500090";
		char[] ch = s6.toCharArray();
		int count = 0;
		for (char c : ch) {
			if (Character.isLetter(c)) {
				count++;
			}
		}

		System.out.println(count);

		String s2 = "abc";
		System.out.println(s2.replaceAll("\\D", "1"));

	}
}
