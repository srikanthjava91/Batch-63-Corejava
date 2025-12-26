package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo7 {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();
		boys.add("Shafi");
		boys.add("Shankar");
		boys.add("Deepak");
		boys.add("Narshimha");
		boys.add("Karunakar");
		boys.add("Anudeep");

		Collection<String> girls = new ArrayList<>();
		girls.add("Pinki");
		girls.add("Sravani");
		girls.add("Hyma");
		girls.add("Manasa");
		girls.add("Anvitha");
		girls.add("Bindu");
		girls.add("Keerthana");

		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);

//		students.removeAll(boys);
		students.clear();
		System.out.println(students);

	}

}
