package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo4 {

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<>();

		marks.put("Maths", 90);
		marks.put("Science", 85);
		marks.put("Java", 100);

		int mathsMarks = marks.getOrDefault("Maths", 35);
		int englishMarks = marks.getOrDefault("English", 35);
		int javaMarks = marks.getOrDefault("Java", 35);
		int pythonMarks = marks.getOrDefault("Python", 35);

		System.out.println("Maths: " + mathsMarks);//90
		System.out.println("English: " + englishMarks);//35
		System.out.println("Java :" + javaMarks);// 100
		System.out.println("Python : " + pythonMarks);//35
	}
}
