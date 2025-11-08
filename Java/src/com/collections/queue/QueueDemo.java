package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//queue interface.
//LinkedList
//PriorityQueue
public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
		queue.add("parth");
		queue.add("amit");
		queue.add("jay");
		queue.add("ram");
		queue.add("nenha");
		queue.add("sharma");
		queue.offer("kunal");

		System.out.println("remving..." + queue.poll());

		for (String s : queue) {
			System.out.println(s);
		}

	}
}
