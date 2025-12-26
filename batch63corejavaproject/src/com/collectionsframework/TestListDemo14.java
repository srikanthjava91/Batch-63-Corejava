package com.collectionsframework;

import java.util.Enumeration;
import java.util.Vector;

public class TestListDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Vector<String> v = new Vector<>();
		v.addElement("Mango");
		v.addElement("Banana");
		v.addElement("Apple");
		v.addElement("Grapes");

		Enumeration<String> enr = v.elements();
		while (enr.hasMoreElements()) {
			System.out.println(enr.nextElement());
		}

		System.out.println(v);
		System.out.println("main method ended !");
	}
}
