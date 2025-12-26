package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo9 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		System.out.println(l.size());// 0
		l.add(0, 45);
		l.add(1, 18);
		l.add(7);
		l.add(2, 10);
		l.add(1, 1);
		l.add(8);

		System.out.println(l);// 45 1 18 10 7 8
	}

}
