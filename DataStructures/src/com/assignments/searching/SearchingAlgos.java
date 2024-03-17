package com.assignments.searching;

public class SearchingAlgos {

	public static int binarySearch(int x,int a[],int low,int high) {
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		System.out.println("inside binary search "+mid);
		if(x==a[mid]) {
			return mid;
		}
		else if(x>a[mid]) {
			return binarySearch(x, a, mid+1, high);
		}
		else {
			return binarySearch(x, a, low, mid-1);
		}
	}
	public static int linearSearch(int x,int a[],int l,int r) {
		for(int i=l;i<r;i++) {
			if(a[i]==x)return i;
		}
		return -1;
	}
	public static int jumpSearch(int x,int a[]) {
		int m=(int)Math.floor(Math.sqrt(a.length));;
		for(int i=0;i<a.length;i+=m) {
			if(a[i]==x)return i;
			else if(a[i]>x) {
				return linearSearch(x,a,i-m,i);
			}
		}
		return -1;
	}
	public static int exponentialBinarySearch(int x,int a[]) {
		int i=0;
		if(a[i]==x)return i;
		
		for(i=1;i<a.length && x>=a[i];i<<=1);
		return binarySearch(x,a,i/2,i);
	}
	public static int interpolationSearch(int x,int a[],int l,int h) {
		if(l>h) return -1;
//		interpolation formula
		int y=((h-l)*(x-a[l])/(a[h]-a[l]))+l;
		System.out.println("inside interpolation search "+y);
		if(a[y]==x) {
			return y;
		}
		else if(a[y]>x) {
			return interpolationSearch(x,a,l,y-1);
		}
		else {
			return interpolationSearch(x, a, y+1, h);
		}
	}
//	public static void main(String a[]) {
//		int a1[]= {1,2,3,4,6,9,12,13,25,27};
//		int key=13;
//		int a2[]= {1,5,7,9,13,17,19,21,25,29,33};
//		int key2=21;
//		System.out.println(interpolationSearch(key2, a2, 0, a2.length-1));
//	}
}
