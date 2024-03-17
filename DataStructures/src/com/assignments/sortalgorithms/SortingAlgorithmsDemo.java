package com.assignments.sortalgorithms;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithmsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,4,2,1};
		int n=5;
		System.out.println(selectionSort(5,a));
		int b[]= {9,8,1,5,2};
		System.out.println(bubbleSort(5,b));
//		bubbleSort(5,a);

	}
	public static List<List<Integer>> selectionSort(int n,int a[]) {
		List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int mini=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[mini]) {
					mini=j;
//					k=j;
				}//end of if
			}//end of inner for loop
			int t=a[mini];
			a[mini]=a[i];
			a[i]=t;
			al.add(new ArrayList<>());
			for(int x:a)al.get(i).add(x);
//			System.out.println();
			
		}// end of outer for loop
		return al;
	}
	public static List<List<Integer>> bubbleSort(int n,int a[]) {
		List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}//end of if
			}//end of inner for loop
			
//			for(int x:a)System.out.print(x+" ");
//			System.out.println();
			
			al.add(new ArrayList<>());
			for(int x:a)al.get(i).add(x);
		}// end of outer for loop
		return al;
	}
	
	public static void mergeSort(int a[],int n,int l,int r) {
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(a, n, l, mid);
			mergeSort(a, n, mid+1, r);
			merge(a,l,mid,r);
		}
	}
	public static void merge(int a[],int l,int mid,int r) {
		int n=a.length;
		int temp[]=new int[r-l+1];
		int k=0;
		int i=l,j=mid+1;
		while(i<=mid && j<=r) {
			if(a[i]<a[j]) {
				temp[k++]=a[i++];
			}
			else {
				temp[k++]=a[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=a[i++];
		}
		while(j<=r) {
			temp[k++]=a[j++];
		}
		for(int m=0;m<temp.length;m++) {
			a[l+m]=temp[m];
		}
		
		
	}

}
