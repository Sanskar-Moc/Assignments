package com.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TowersQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		int n=6;
		int arr[]= {650,345,290,825,120,50};
		System.out.println("ans "+towers(n,arr));

	}
	
	public static List<Integer> towers(int n,int old[]){
		List<Integer>ans=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ans.add(old[(i+1)%n]+old[(i+2)%n]);
		}
		return ans;
	}

}
