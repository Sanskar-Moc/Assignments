package com.assignments.datastuctures;

import java.util.NoSuchElementException;
import java.util.Objects;

class Node<T>{
	public T data;
	public Node<T> next;
	public Node(T data) {
		this.data=data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}	
}

public class MyLinkedList<U> {
	private Node<U> head;
	private Node<U> tail;
	private int size;
	private boolean circular=false;
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	public U getHeadData() {
		return this.head.data;
	}
	public U getTailData() {
		return this.tail.data;
	}
	public Node<U> getHead() {
		return head;
	}

	public Node<U> getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}
	public void insertEnd(U val) {
		Node<U>temp=new Node<>(val);
		if(head==null) {
			head=temp;
			tail=head;
		}
		tail.next=temp;
		tail=tail.next;
		this.size++;
	}
	public void insertStart(U val) {
		Node<U>temp=new Node<>(val);
		temp.next=head;
		head=temp;
		if(tail==null) {
			tail=head;
		}
		this.size++;
	}
	
	public void insertAt(int index, U val) {
		if(index>this.size) {
			throw new IndexOutOfBoundsException();
		}
		else if(index==this.size) {
			insertEnd(val);
			return;
		}
		else if(index==0) {
			insertStart(val);
			return;
		}
		else {
			int k=1;
			Node<U>temp=head;
			while(k<=index-1) {
				temp=temp.next;
				k++;
			}
			Node<U>after=temp.next;
			temp.next=new Node<>(val);
			temp.next.next=after;
		}
		this.size++;
		
	}
	public U deleteStart() {
		if(this.size<=0) throw new NoSuchElementException();
		U ret=head.data;
		head=head.next;
		if(this.size==1)tail=null;
		this.size--;
		return ret;
	}
	public U deleteEnd() {
		return deleteAt(this.size-1);
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
		else {
			
			Node<U>temp=head;
			int k=0;
			while(k!=index-1) {
				temp=temp.next;
				k++;
			}
			if(index==this.size-1)tail=temp;
			ret=temp.next.data;
			temp.next=temp.next.next;
		}
		this.size--;
		return ret;
	}
	public void makeCircular() {
		tail.next=head;
		circular=true;
	}
	public void breakCircular(U makeHead) {
		Node<U>temp=head;
		while(temp.next.data!=makeHead) {
			temp=temp.next;
		}
		tail=temp;
		head=temp.next;
		tail.next=null;
		circular=false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(head,tail,size);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==this)return true;
		else {
			Node<U>temp1=this.head;
			MyLinkedList<U>temp2=(MyLinkedList<U>)obj;
			Node<U>temp3=temp2.head;
			while(temp1!=null && temp3!=null) {
				if(!temp1.data.equals(temp3.data))
					return false;
				temp1=temp1.next;
				temp3=temp3.next;
			}
			return true;
		}
	}
	@Override
	public String toString() {
		Node<U>curr=head;
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
