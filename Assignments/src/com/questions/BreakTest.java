package com.questions;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(isPrime(i))
				System.out.println(i);
		}

	}
	public static boolean isPrime(int n) {
		if(n<=1)return false;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}

}
