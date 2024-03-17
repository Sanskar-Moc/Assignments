package com.assignments.datastuctures.demos;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>pq=new PriorityQueue<>(new MyComparator());
		pq.add("Hello");
		pq.add("Hackerrank");
		System.out.println(pq.poll());
		pq.remove();
		//The remove() and poll() methods differ only in their behavior when the queue is empty: 
		//the remove() method throws an exception, while the poll() method returns null.
		//The element() and peek() methods return, but do not remove, the head of the queue.
		//add() will throw an IllegalStateException if no space is currently available 
		//in the Queue, otherwise add method will return true. offer() method will 
		//		return false if the element cannot be inserted due to capacity restrictions
	}

}
