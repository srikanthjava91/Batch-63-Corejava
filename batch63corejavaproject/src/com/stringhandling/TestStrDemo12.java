package com.stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {

		System.out.println("main method started !");
		String[] names = { "Abhishek", "Gill", "SKY", "Tilak Varma", "Sanju Smason", "Harshit Rana" };

		for (String name : names) {
			if (name.toUpperCase().contains("S") && name.endsWith("a") || name.startsWith("S")) {
				System.out.println(name);
			}
		}
	}
}
