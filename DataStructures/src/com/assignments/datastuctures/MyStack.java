package com.assignments.datastuctures;

public class MyStack<U> extends MyLinkedList<U> {
	public U top;
	MyStack(){
		this.top=null;
	}
	
	public void push(U value) {
		super.insertStart(value);
		this.top=peek();
	}
	public U pop() {
		U temp=super.deleteStart();
		this.top=peek();
		return temp;
	}
	public U peek() {
		return super.getHeadData();
	}
	boolean isEmpty() {
		return super.getSize()==0;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Stack[");
		sb.append(super.toString());
		sb.append("]End");
		return sb.toString();
	}
}
