package com.assignments.datastuctures;

class Node$3<T>{
	T data;
	Node$3<T> left;
	Node$3<T> right;
	Node$3(){}
	Node$3(T data){
		this.data=data;
		left=right=null;
	}
}

public class BinaryTree<U> {
	public Node$3<U> root;
	private int nodeCount;
	
	public BinaryTree(U data) {
		this.root=new Node$3<U>(data);
		this.nodeCount++;
	}
	public Node$3<U> add(U value){
		this.nodeCount++;
		return new Node$3<U>(value);
	}
	public int getNodeCount() {
		return nodeCount;
	}
	
	public void displayInorder(Node$3<U>root) {
		if(root==null) return;
		displayInorder(root.left);
		System.out.print(root.data+" ");
		displayInorder(root.right);
		
	}
	public void displayPreorder(Node$3<U>root) {
		if(root==null) return;
		System.out.print(root.data+" ");
		displayPreorder(root.left);
		displayPreorder(root.right);
		
	}
	public void displayPostorder(Node$3<U>root) {
		if(root==null) return;
		displayPostorder(root.left);
		displayPostorder(root.right);
		System.out.print(root.data+" ");
		
	}
	
}
