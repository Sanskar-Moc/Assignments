package com.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExcAssigns {
	Scanner sc;
	public ExcAssigns() {
		sc=new Scanner(System.in);
	}
	public static void main(String args[]) {
		ExcAssigns ea=new ExcAssigns();
		//1. throw exception on odd
		try {
			ea.throwOnOdd(26);
			ea.throwOnOdd(25);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//2. throw exception on duplicates
		try {
			ea.throwOnDuplicates();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. throw exception on Strings with no vowels
		try {
			ea.throwOnNoVowels("rhythm");
			ea.throwOnNoVowels("bIscuit");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. throw on file not found
		ea.throwOnFileNotFound();
		
		//5. throw and try-catch, if number divided by zero
		try {
			ea.throwAndCatchOnZero(5);
			ea.throwAndCatchOnZero(0);
		} catch (CannotDivideByZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void throwAndCatchOnZero(int n) throws CannotDivideByZero {
		int k=5/n;
		if(n==0) throw new CannotDivideByZero("Cant divide by zero");
	}
	public void throwOnFileNotFound() {
		try {
			FileReader f1=new FileReader("C:\\C376\\abc.txt");
			FileReader f2=new FileReader("C:\\C376\\abcdef.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void throwOnNoVowels(String s) throws Exception {
		s=s.toLowerCase();
		boolean hasVowels=false;
		for(char ch:s.toCharArray()) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				System.out.println("It has vowels");
				hasVowels=true;
				break;
			}
		}
		if(!hasVowels) throw new Exception("No VOWELS!!!");
	}
	public void throwOnDuplicates() throws Exception {
		Set<Integer>hs=new HashSet<>();
		System.out.println("Enter number of inputs");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			if(!hs.add(num)) throw new Exception("You entered DUPLICATES!!!!");
		}
		System.out.println(hs);
	}
	public void throwOnOdd(int n) throws Exception {
		if(n%2==1) throw new Exception("Number entered is ODD!!!!");
		System.out.println("Good, thats an even number");
	}
}
