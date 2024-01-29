package com.assignments.datastuctures;

public class CircularQueue<T> {
	private Object arr[];
	private int size;
	private int rear;
	private int front;
	private boolean full=false;
	private boolean empty=false;
	private int queueSize;
	
	public CircularQueue(int size) {
		this.arr=new Object[size];
		this.size=size;
		this.front=0;
		this.rear=0;
		this.queueSize=0;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public int getRear() {
		return rear;
	}

	public int getFront() {
		return front;
	}

	public boolean isFull() {
		return full;
	}

	public boolean isEmpty() {
		return empty;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public void enqueue(T data) {
		if(full) {
			System.out.println("Queue is full");
			System.out.println("Front: "+ arr[getFront()] +" Rear: "+arr[getRear()]);
			return;
		}
		empty=false;
		arr[rear%size]=data;
		rear++;
		rear=rear%size;
		queueSize++;
		if(rear==front) {
			full=true;
		}
		
	}
	public T dequeue() {
		if(!empty) {
			full=false;
			T val=(T)arr[front];
			front++;
			front%=size;
			queueSize--;
			if(front==rear) {
				empty=true;
			}
			return val;
			
		}
		System.out.println("Queue is empty");
		return null;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=front;i<front+queueSize;i++) {
			sb.append(arr[i%size]+"-");
		}
		return sb.toString();
	}
}
