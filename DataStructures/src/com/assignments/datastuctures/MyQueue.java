package com.assignments.datastuctures;

public class MyQueue<U> extends MyDoublyLinkedList<U> {
	public MyQueue() {
		super();
	}
	public void enqueue(U value) {
		super.insertLast(value);
	}
	public U dequeue() {
		return super.deleteStart();
	}
	public boolean isEmpty() {
		return super.getSize()==0;
	}
	public U front() {
		return super.getHeadData();
	}
	public U rear() {
		return super.getTailData();
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Queue[Front->");
		sb.append(super.toString());
		sb.append("<-Rear]End");
		return sb.toString();
	}
}
