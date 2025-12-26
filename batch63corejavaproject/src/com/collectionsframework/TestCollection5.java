package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//WAP to iterate the elements from a Collection 
public class TestCollection5 {

	public static void main(String[] args) {

		Collection<String> cricketers = new ArrayList<>();
		cricketers.add("Rohit");
		cricketers.add("virat");
		cricketers.add("K L rahul");
		cricketers.add("Siraj");
		cricketers.add("Bumrha");
		cricketers.add("Jadeja");

		System.out.println(cricketers);
		cricketers.remove("Siraj");

		Iterator<String> itr = cricketers.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("Jadeja")) {
				itr.remove();
			}
		}

		System.out.println(cricketers);

//		System.out.println("****************");
//		for (String cricketer : cricketers) {
//			System.out.println(cricketer);
//		}

	}

}
