package com.collectionsframework2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo3 {

	public static void main(String[] args) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

		maxHeap.add(10);
		maxHeap.add(5);
		maxHeap.add(20);
		maxHeap.add(1);

		while (!maxHeap.isEmpty()) {
			System.out.print(maxHeap.poll() + " ");
		}

//		Queue<Integer> q = new PriorityQueue<>();

//		An unbounded priority queue based on a priority heap: Min heap 

//		q.offer(20);
//		q.offer(5);
//		q.offer(15);
//		q.offer(10);
//
//		System.out.println(q);

	}

}
