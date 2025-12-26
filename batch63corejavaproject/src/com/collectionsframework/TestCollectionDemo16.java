package com.collectionsframework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCollectionDemo16 {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> l = new CopyOnWriteArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		// While Iterating the list, if we are trying to modify something from the list
		// then will get RE saying that is
		// ConcurrentModificationException
//		for (Integer i : l) {
//			System.out.print(i + " ");
//			l.add(60);
//		}

//		Iterator<Integer> itr = l.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			l.add(100);
//		}

//		int temp = l.size();
//		for (int i = 0; i < temp; i++) {
//			System.out.println(l.get(i));
//			l.add(60);
//			Thread.sleep(100);
//		}

		System.out.println(l);

	}

}
