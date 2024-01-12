package com.questions;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String temp=String.valueOf(n);
		int i=0;
		int len=temp.length()-1;
		boolean isPal=true;
		while(i<len){
			if(temp.charAt(i)!=temp.charAt(len)) {
				isPal=false;
			}
			i++;
			len--;
		}
		if(isPal)System.out.println(n+" is palindrome");
		else System.out.println(n+" is not palindrome");
	}

}
