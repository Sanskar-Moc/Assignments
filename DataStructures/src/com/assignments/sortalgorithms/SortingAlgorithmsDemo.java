package com.assignments.sortalgorithms;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithmsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,2,10,8,1};
		int n=5;
		System.out.println(selectionSort(5,a));
		bubbleSort(5,a);

	}
	public static List<List<Integer>> selectionSort(int n,int a[]) {
		List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int mini=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[mini]) {
					mini=j;
//					k=j;
				}
			}
			int t=a[mini];
			a[mini]=a[i];
			a[i]=t;
			al.add(new ArrayList<>());
			for(int x:a)al.get(i).add(x);
//			System.out.println();
		}
		return al;
	}
	public static List<List<Integer>> bubbleSort(int n,int a[]) {
		List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
//			for(int x:a)System.out.print(x+" ");
//			System.out.println();
			al.add(new ArrayList<>());
			for(int x:a)al.get(i).add(x);
		}
		return al;
	}

}
