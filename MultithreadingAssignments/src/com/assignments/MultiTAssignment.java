package com.assignments;

public class MultiTAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTAssignment mta=new MultiTAssignment();
		HelloWorldThread hwt=new HelloWorldThread();
		Thread t1=new Thread(hwt);
		t1.start();
		
		mta.evenOdd();
		
		mta.conBank();

	}
	public void evenOdd() {
		Thread t1=new Thread(()->{
			System.out.println("Even");
			for(int i=1;i<=20;i++) {
				if(i%2==0) {					
					System.out.println("E "+i);
				}
				
			}
		});
		Thread t2=new Thread(()->{
			System.out.println("Odd");
			for(int i=1;i<=20;i++) {
				if(i%2!=0) {					
					System.out.println("O "+i);
				}
				
			}
		});
		t1.start();
		t2.start();
	}
	public void conBank() {
		BankAccount ba=new BankAccount();
		Thread t1=new Thread(()->{
			ba.withdraw(500);
		});
		Thread t2=new Thread(()->{
			ba.withdraw(500);
		});
		Thread t3=new Thread(()->{
			ba.deposit(280);
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
