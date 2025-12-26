package com.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestArrDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Collection<Integer> al = new ArrayList<>(5);
		al.add(10);
		al.remove(10);
		System.out.println(al.size());

		System.out.println("Enter an array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(arr.length);
		System.out.println("Read the elements : " + n + " times");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();// 5 6 7 8 9 10
		}

		for (int i = 0; i < n; i++) {
			boolean status = true;

			if (arr[i] <= 0 || arr[i] == 1) {
				status = false;
			}

			for (int j = 2; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					status = false;
					break;
				}
			}

			if (status) {
				System.out.println(arr[i]);// 5 7
			}

		}

	}

}
