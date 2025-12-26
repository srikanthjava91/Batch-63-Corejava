package com.stringhandling;

//Memory allocations in String
public class TestStrDemo2 {

	public static void main(String[] args) {

		// 1 object created in SCP
		String s1 = "Srikanth";// String Literals --> SCP : String Constant Pool

		// 2 objects created : 1 is in SCP + 1 is in Heap
		String s2 = new String("Java");// String with new Object : Heap memory

		// 1 object in SCP
		String s3 = "Deepak";
		// 1 object in Heap
		String s4 = new String("Deepak");

		// 0 objects
		String s5 = "Java";

		// 1 object
		String s6 = new String("Java");

		// 2 objects : 1 is in Heap + 1 is in SCP
		String s7 = new String("Pinki");

		//0 object
		String s8 = "Pinki";

	}

}
