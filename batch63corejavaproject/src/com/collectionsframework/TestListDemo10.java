package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo10 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();

		// Adding elements
		items.add("A"); // index 0
		items.add("B"); // index 1
		items.add("C"); // index 2
		items.add(1, "X"); // inserts at index 1, shifts others

		// Updating element
		items.set(2, "Y"); // replaces element at index 2

		// Removing element
		items.remove(3); // removes element at index 3

//		 Searching
		int index = items.indexOf("Y");

		// Printing list
		System.out.println("Items: " + items);
		System.out.println("Index of Y: " + index);
	}
}
