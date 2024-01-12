package com.questions;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long fact=1;
		for(int i=n;i>=1;i--)
			fact*=i;
		
		System.out.println(fact);

	}

}
