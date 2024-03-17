package com.assignments.datastuctures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.assignments.searching.SearchingAlgos;
import com.assignments.sortalgorithms.SortingAlgorithmsDemo;

public class TestDataStructures {
	static int dp[];
	public static void testDoublyLLs() {
		MyDoublyLinkedList<Integer>mdll=new MyDoublyLinkedList<>();
		//Doubly Linked List
		mdll.insertLast(5);
		mdll.insertLast(6);
		mdll.insertLast(7);
		mdll.insertLast(8);
		mdll.insertFirst(25);
		mdll.insertFirst(9);
		mdll.insertLast(96);
		mdll.insertAt(3,17);
		mdll.insertAt(0,44);
		mdll.insertAt(9,43);
		mdll.deleteAt(0);
		mdll.deleteAt(8);
		mdll.deleteAt(3);
		mdll.deleteAt(5);
		mdll.insertFirst(14);
		mdll.insertLast(15);
		mdll.makeCircular();
		mdll.breakCircular(5);
		
		
		
		System.out.println(mdll.getSize());
		System.out.println(mdll);
		System.out.println(mdll.toString(true));
		
		
	}
	public static void testStack() {
		MyStack<Integer>mst=new MyStack<>();
		//Stack
		mst.push(56);
		mst.push(86);
		System.out.println(mst.peek());
		mst.push(36);
		mst.push(24);
		mst.push(17);
		System.out.println(mst.pop());
		mst.pop();
		mst.pop();
		mst.pop();
		mst.pop();
		mst.pop();

		System.out.println(mst);
	}
	public static void testLLs() {
		MyLinkedList<Integer> mll=new MyLinkedList<>();
		


		
		
		//Linked List
		mll.insertEnd(25);
		mll.insertEnd(35);
		mll.insertEnd(45);
		mll.insertStart(55);
		mll.makeCircular();
		mll.breakCircular(35);
//		
		System.out.println(mll);
		
		

		

		
//		TowersQuestion();
		

		
		

		
		
	}
	public static void testQueue() {
		//Queue
		MyQueue<Integer>mq=new MyQueue<>();
		mq.enqueue(45);
		mq.enqueue(55);
		mq.enqueue(97);
		mq.enqueue(38);
		System.out.println(mq.dequeue());
		System.out.println("Front "+mq.front());
		System.out.println("Rear "+mq.rear());
		
		System.out.println(mq);
	}
	public static void testCircularQueue() {
		//Circular Queue
		CircularQueue<Integer> cq=new CircularQueue<>(5);
		cq.enqueue(45);
		cq.enqueue(25);
		cq.enqueue(37);
		cq.dequeue();
//		cq.enqueue(55.27);
//		cq.enqueue('a');
//		cq.enqueue("hey i am a string");
		cq.enqueue(48);
		cq.dequeue();
//		cq.dequeue();
//		cq.dequeue();
//		cq.dequeue();
//		cq.dequeue();
//		cq.dequeue();
//		System.out.println("Front "+cq.getFront()+ " Rear "+cq.getRear());
		System.out.println(cq);
	}
	public static void testTrie() {
		Trie t=new Trie();
		t.insert("jesus");
		t.insert("jessy");
		t.insert("jessy");
		t.insert("joseph");
		t.insert("sanskar");
		t.remove("jessy");

//		t.delete("jesus");
		System.out.println(t.search("jesus"));
//		Unit check=(Unit)t.searchStub("jes")[1];
		System.out.println(t.isPrefix("jes"));
		System.out.println(t);
		System.out.println(t.getWordCount());
	}
	public static void testBinTree() {
		BinaryTree<Integer>bt=new BinaryTree<>(25);
		bt.root.left=bt.add(26);
		bt.root.right=bt.add(27);
		bt.root.left.left=bt.add(36);
		bt.root.right.left=bt.add(49);
		bt.root.right.right=bt.add(64);
		
		bt.displayPreorder(bt.root);
		System.out.println();
		bt.displayInorder(bt.root);
		System.out.println();
		bt.displayPostorder(bt.root);
		System.out.println("\n"+bt.getNodeCount());
	}
	
	public static boolean anagramQuestion(String s,String t) {
		if(s.length()!=t.length())return false;
		Map<Character,Integer>hm=new HashMap<>();
		for(char ch:s.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		for(char ch:t.toCharArray()) {
			if(!hm.containsKey(ch) || hm.get(ch)==0) return false;
			else {
				hm.put(ch, hm.get(ch)-1);
			}
		}
		return true;
	}
	
	public static void selSortQuestion() {
		int arr[]= {66,44,99,11,33};
		List<List<Integer>> selsort=SortingAlgorithmsDemo.selectionSort(5, arr);
//		List<List<Integer>> selsort=SortingAlgorithmsDemo.bubbleSort(5, arr);
		List<Integer>third=selsort.get(2);
		CircularQueue<Integer>S=new CircularQueue<>(4);
		for(int x:third) {
			S.enqueue(x);
		}
		System.out.println(S);
	}
	
	public static void TowersQuestion() {
		MyDoublyLinkedList<Integer>mdll=new MyDoublyLinkedList<>();
		List<Integer>ans=new ArrayList<Integer>();
//		{650,345,290,825,120,50};
		mdll.insertLast(650);
		mdll.insertLast(345);
		mdll.insertLast(290);
		mdll.insertLast(825);
		mdll.insertLast(120);
		mdll.insertLast(50);
		mdll.makeCircular();
		Node$2<Integer> temp=mdll.getHead();
		boolean once=false;
		while(true) {
			ans.add(temp.next.data+ temp.next.next.data);
			temp=temp.next;
			if(once && temp==mdll.getHead())break;
			once=true;
		}
		System.out.println(ans);
	}
	
	public static void testBinarySearch() {
		int a[]= {25,35,67,88,93};
		int low=0;
		int high=a.length-1;
		System.out.println(SearchingAlgos.binarySearch(88, a, low, high));
		System.out.println(SearchingAlgos.binarySearch(23, a, low, high));
	}
	public static void display(int a[]) {
		for(int x:a)System.out.print(x+" ");
		System.out.println();
	}
	public static void testMergeSort() {
		int a[]= {5,8,4,3,9,7};
		display(a);
		SortingAlgorithmsDemo.mergeSort(a, 6, 0, 5);
		display(a);
	}
	
	public static int factorialRec(int n) {
		if(n==1) return 1;
		else {
			return n*factorialRec(n-1);
		}
	}
	public static int factorialMem(int n) {
		if(n==1)return 1;
		if(dp[n]!=0)return dp[n];
		
		return dp[n]=n*factorialMem(n-1);
	}
	public static int factorialTab(int n) {
		int prod=1;
		for(int i=2;i<=n;i++) {
			prod*=i;
		}
		return prod;
	}
	public static void main(String[] args) {

//		System.out.println(factorialRec(5));
//		dp=new int[6];
//		System.out.println(factorialMem(5));
//		System.out.println(factorialTab(5));
		testMergeSort();
//		testBinarySearch();
		
//		testBinTree();
//		testTrie();
		
//		testLLs();
//		
//		selSortQuestion();
//		System.out.println(anagramQuestion("hello","lleoh"));
//		System.out.println(anagramQuestion("hello","lleohs"));
//		System.out.println(anagramQuestion("false","fasle"));
//		System.out.println(anagramQuestion("false","fault"));
	
	}

}
