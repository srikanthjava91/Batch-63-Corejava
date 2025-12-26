package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(7, "Dhoni");
		m.put(18, "Kohli");
		m.put(45, "Rohit");
		m.put(10, "Sachin");
		m.put(10, "Arjun");
		m.put(1, "Rahul");
		m.put(77, "Gill");
		m.put(33, "Pandya");
		m.put(32, "Pandya");
		m.put(11, null);
		m.put(null, "Hello");

		// the previous value associated with key,
//		or null if there was no mapping for key. 
//		(A null return can also indicate that the map previously associated null with key, 
//		if the implementation supports null values.)
		System.out.println(m.put(4, "Abhishek"));// null
		System.out.println(m.put(7, "Srikanth"));// Dhoni
		System.out.println(m.put(18, "Arun"));// Kohli
		System.out.println(m.put(11, "Sri"));// null
		System.out.println(m.put(null, "Welcome"));
		System.out.println(m);
	}
}
