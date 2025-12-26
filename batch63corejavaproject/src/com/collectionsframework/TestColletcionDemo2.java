package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestColletcionDemo2 {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();
		boys.add("Shafi");
		boys.add("Shankar");
		boys.add("Deepak");
		boys.add("Narshimha");
		boys.add("Karunakar");
		boys.add("Anudeep");

//		System.out.println(boys);

		Collection<String> girls = new ArrayList<>();
		girls.add("Pinki");
		girls.add("Sravani");
		girls.add("Hyma");
		girls.add("Manasa");
		girls.add("Anvitha");
		girls.add("Bindu");
		girls.add("Keerthana");
//		System.out.println(girls);

		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
//		System.out.println(students);
		boys.clear();
		System.out.println(boys);

		System.out.println(boys.contains("Deepak"));
		System.out.println(students.containsAll(boys));

		for (String student : students) {
			System.out.println(student);
		}
	}
}
