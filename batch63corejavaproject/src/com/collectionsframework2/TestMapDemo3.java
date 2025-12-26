package com.collectionsframework2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestMapDemo3 {

	public static void main(String[] args) {

		Map<Character, Integer> map = new LinkedHashMap<>();// {}
		System.out.println(map);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String !!");
		String str = sc.nextLine();

		char[] ach = str.toCharArray();
		for (char ch : ach) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Entry<Character, Integer>> entries = map.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + "-> " + entry.getValue());
		}

	}
}
