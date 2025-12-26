package com.arrays;

public class TestArrDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		String[] names = new String[5];// 0 1 2 3 4

		names[0] = "Abhishek";
		names[1] = "Tilak";
		names[2] = "Sanju";
		names[3] = "SKY";
		names[4] = "Gill";
//		names[5] = "srikanth";

//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		for(String name: names) {
			System.out.println(name);
		}

	}

}
