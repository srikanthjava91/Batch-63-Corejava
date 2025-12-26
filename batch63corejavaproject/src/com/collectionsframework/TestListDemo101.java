package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo101 {

	public static void main(String[] args) {

		List<Integer> items1 = new ArrayList<>();

		items1.add(10);
		items1.add(15);
		items1.add(25);
		items1.add(8);
		items1.add(9);

		items1.remove(items1.indexOf(8));
		System.out.println(items1);
		System.out.println(items1.get(3));//

		List<String> items = new ArrayList<>();

		items.add("Kohli");
		items.add("Rohit");
		items.add("Rahul");
		items.add("Gaikwad");
		items.add("Dhoni");

		items.set(1, "Sharma");
		items.add(2, "Virat");

		items.remove("Dhoni");

		System.out.println(items);

	}

}
