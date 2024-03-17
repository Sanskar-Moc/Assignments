package com.questions;

import java.util.Arrays;

public class QuestionsDemo {

	public static void main(String[] args) {
		int a[]={0, -1, 2, -3, 1};
		int sum=-2;
		printTriplet(a, sum);
		optimizedTriplet(a, sum);
	}
	public static void printTriplet(int a[],int sum) {
		int n=a.length;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println("i "+a[i]+" j "+a[j]+" k "+a[k]);
					}
				}
			}
		}
	}
	public static void optimizedTriplet(int a[],int sum) {
		int n=a.length;
		System.out.println("optimized");
		Arrays.sort(a);
		for(int i=0;i<n-1;i++) {
			int l=i+1;
			int r=n-1;
			int t=a[l]+a[r]+a[i];
			while(l<r) {
				if(t==sum) {
					System.out.println("i "+a[l]+" j "+a[r]+" k "+a[i]);
					l++;r--;
				}
				else if(t<sum) {
					l++;
				}
				else {
					r--;
				}
			}
		}
	}
}
