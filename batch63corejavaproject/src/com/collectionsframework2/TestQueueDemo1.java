package com.collectionsframework2;

import java.util.LinkedList;
import java.util.Queue;

//FIFO
public class TestQueueDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Queue<Integer> q = new LinkedList<>();
		// IllegalStateException : if the element cannot be added at this time due to
		// capacity restrictions

		q.add(30);
		q.add(40);
		q.add(50);
		q.add(10);
		q.add(20);

//		Retrieves and removes the head of this queue.

//		This method differs from poll() only in that 
//		it throws an exception if this queue is empty.
		// NoSuchElementException - if this queue is empty
		System.out.println(q.remove());// 30
		System.out.println(q.element());// 40
		System.out.println(q);// 40 50 10 20
	}
}
