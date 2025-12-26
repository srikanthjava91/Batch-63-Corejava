package com.collectionsframework2;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo2 {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		q.offer(10);
		q.offer(20);
		q.offer(5);
		q.offer(4);
		q.offer(2);

		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);

	}

}
