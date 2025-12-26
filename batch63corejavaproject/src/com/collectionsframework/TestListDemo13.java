package com.collectionsframework;

import java.util.LinkedList;
import java.util.List;

//ArrayList default capacity is 10 --> When we added 11th element the capacity will be 15 
//Internally it's following the formula is --> (old capacity) *3/2 --> 15 
public class TestListDemo13 {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();// 10

		l.add(10);
		l.add(20);
		l.add(30);

		System.out.println(l);
		System.out.println(l.size());

//		List<Integer> l1 = l.subList(0, 4);
//		System.out.println(l1);

	}

}
