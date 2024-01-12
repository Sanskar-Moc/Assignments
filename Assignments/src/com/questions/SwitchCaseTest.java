package com.questions;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+ " is a vowel");
			break;
		default:
			System.out.println(ch+ " is not a vowel");
		}
	}
}
