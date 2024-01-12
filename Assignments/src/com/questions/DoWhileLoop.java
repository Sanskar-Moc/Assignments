package com.questions;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		System.out.print(0+" ");
		int a=0,b=1,c=0;
		do {
			System.out.print(c+" ");
			c=a+b;
			a=b;
			b=c;
			
			n--;
		}while(n>=2);
	}

}
