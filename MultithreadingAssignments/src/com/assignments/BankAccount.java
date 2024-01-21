package com.assignments;

public class BankAccount {
	private int balance=1000;
	
	public synchronized void withdraw(int amt) {
		this.balance-=amt;
		System.out.println("Withdrawn "+amt+" Balance "+this.balance);
	}
	public synchronized void deposit(int amt) {
		this.balance+=amt;
		System.out.println("Deposited "+amt+" Balance "+this.balance);
	}
}
