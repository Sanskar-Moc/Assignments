package com.assignments.greedyalgos;

import java.util.Scanner;

import com.assignments.sortalgorithms.SortingAlgorithmsDemo;

public class GreedyQs {
	static Scanner sc=new Scanner(System.in);
	public static int maxTasks(int a[],int t) {
		
		SortingAlgorithmsDemo.selectionSort(5, a);
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(sum<=t) {
				count++;
			}
			else {
				break;
			}
		}
//		System.out.println("Total number of task completed are: "+count);
		return count;
	}
	public void maxBottleFills() {
		System.out.println("Enter number of bottles");
		int n=sc.nextInt();
		System.out.println("Enter max water");
		int b=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter bottle sizes");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Max bottles that can be filled are: "+maxTasks(a, b));
	}
	public static void main(String args[]) {
		int a[]= {3,5,1,4,2};
		int t=6;
		GreedyQs gq=new GreedyQs();
		maxTasks(a,t);
		
		System.out.println("Enter number of test cases");
		int cases=sc.nextInt();
		if(checkConstraint(cases, 0, 100)) {
			for(int i=0;i<cases;i++) {
				gq.maxBottleFills();
			}
		}
		else {
			System.out.println("cases cant be greater than 100");
		}
	}
	public static boolean checkConstraint(int n,int limitL,int limitR) {
		return n>limitL&& n<=limitR;
	}
}
