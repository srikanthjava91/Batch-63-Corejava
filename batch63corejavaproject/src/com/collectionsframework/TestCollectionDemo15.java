package com.collectionsframework;

import java.util.Stack;

public class TestCollectionDemo15 {

	public static void main(String[] args) {

		Stack<String> ss = new Stack<>();

		ss.push("J2EE");
		ss.push("J2SE");
		ss.push("Frameworks");
		ss.push("DAO");
		ss.push("React");
		ss.push("Angular");

		System.out.println(ss.search("DAO"));
//		System.out.println(ss.peek());//Angular 
//		System.out.println(ss.pop());//Angular
		System.out.println(ss);

	}

}
