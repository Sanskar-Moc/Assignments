package com.assignments.datastuctures;

import java.util.NoSuchElementException;

class Node$2<T>{
	T data;
	Node$2<T> next;
	Node$2<T> prev;
	Node$2(){}
	Node$2(T data){
		this.data=data;
	}
}

public class MyDoublyLinkedList<U> {
	private Node$2<U>head;
	private Node$2<U>tail;
	private int size;
	private boolean circular=false;
	
	public MyDoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	public int getSize() {
		return size;
	}
	
	public U getHeadData() {
		return head.data;
	}
	public U getTailData() {
		return tail.data;
	}
	public Node$2<U> getHead() {
		return head;
	}
	public Node$2<U> getTail() {
		return tail;
	}
	public void insertLast(U value) {
		Node$2<U>temp=new Node$2<>(value);
		if(head==null) {
			head=temp;
			tail=head;
		}
		else {
			tail.next=temp;
			temp.prev=tail;
			tail=tail.next;
		}
		this.size++;
	}
	public void insertFirst(U value) {
		Node$2<U>temp=new Node$2<>(value);
		if(head==null) {
			insertLast(value);
			return;
		}
		else {
			temp.next=head;
			head.prev=temp;
			head=head.prev;
		}
		this.size++;
	}
	public void insertAt(int index, U value) {
		if(index==0) {
			insertFirst(value);
			return;
		}
		else if(index==this.size) {
			insertLast(value);
			return;
		}
		else {
			int k=1;
			Node$2<U>temp=new Node$2<>(value);
			Node$2<U>before=head;
			while(k<=index-1) {
				before=before.next;
				k++;
			}
			Node$2<U>after=before.next;
			temp.next=after;
			temp.prev=before;
			before.next=temp;
			after.prev=temp;
		}
		this.size++;
	}
	public U deleteStart() {
		if(this.size<=0) throw new NoSuchElementException();
		U ret=head.data;
		head=head.next;
		head.prev=null;
		if(this.size==1)tail=head;
		this.size--;
		return ret;
	}
	public U deleteEnd() {
		U ret=tail.data;
		tail=tail.prev;
		tail.next=null;
		if(this.size==1)tail=head;
		this.size--;
		return ret;
	}
	public U deleteAt(int index) {
		if(this.size<=0) throw new NoSuchElementException();
		U ret=null;
		if(index>this.size-1) {
			throw new IndexOutOfBoundsException();
		}
		else if(index==0) {
			return deleteStart();
		}
		else if(index==this.size-1) {
			return deleteEnd();
		}
		else {
			Node$2<U>temp=head;
			int k=0;
			while(k!=index-1) {
				temp=temp.next;
				k++;
			}
			ret=temp.next.data;
			temp.next=temp.next.next;
			Node$2<U>after=temp.next;
			after.prev=temp;
		}
		this.size--;
		return ret;
	}
	public void makeCircular() {
		tail.next=head;
		head.prev=tail;
		circular=true;
	}
	public void breakCircular(U makeHead) {
		Node$2<U>temp=head;
		while(temp.next.data!=makeHead) {
			temp=temp.next;
		}
		tail=temp;
		head=temp.next;
		head.prev=null;
		tail.next=null;
		circular=false;
	}
	public String toString(boolean rev){
		Node$2<U>curr=tail;
		StringBuilder sb=new StringBuilder();
		boolean circ=false;
		while(curr!=null) {
			sb.append(curr.data+"->");
			if(circular && circ && curr==tail)break;
			curr=curr.prev; 
			circ=true;
		}
		return sb.toString();
	}
	@Override
	public String toString() {
		Node$2<U>curr=head;
		StringBuilder sb=new StringBuilder();
		boolean circ=false;
		while(curr!=null) {
			sb.append(curr.data+"->");
			if(circular && circ && curr==head)break;
			curr=curr.next; 
			circ=true;
		}
		return sb.toString();
	}
	

}
