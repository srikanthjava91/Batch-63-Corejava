package com.collectionsframework2;

import java.util.Map;
import java.util.WeakHashMap;

class Hello {

	@Override
	public String toString() {
		return "Hello ";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called !!");
	}
}

//HashMap dominates Garbage collector where we can use Cache based requirements to store the data.
//Garbage Collector dominates WeakHashMap.
public class TestWeakHashMapDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Map<Object, String> map = new WeakHashMap<>();
		
		Hello h = new Hello();
		map.put(h, "Srikanth");
		System.out.println(map);

		h = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);

	}

}
