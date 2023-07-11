package com.multithreading.threadsynchronized;

import java.util.Scanner;

class Account{
	
	private int balance;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public boolean isSuffucientBalance(int withDrawAmount) {
		if(balance > withDrawAmount) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void withDrawAmount(int withDrawAmount,String accountHolderName) {
		    balance = balance - withDrawAmount;
			System.out.println("Dear "+accountHolderName+" Amount "+ withDrawAmount+" withdraw successfully");
			System.out.println("Your  current balance is : "+balance);
	}
	
}

class Customer implements Runnable {
	
	private Account account;
	private String name;
	
	public Customer(Account account,String name) {
		super();
		this.account = account;
		this.name = name;
	}

	@Override
	public void run() {
	
	synchronized (account) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Hello "+name+" Please Enter amount to be withdraw : ");
	int amount = scanner.nextInt();
	if(account.isSuffucientBalance(amount)) {
		account.withDrawAmount(amount,name);
	} else {
		System.out.println("Insufficient balance.");
	}
	
	  }
	}
}

public class SynchronizedExample {

	public static void main(String[] args) {
		Account account = new Account(1000);
		Customer customer1 = new Customer(account,"Raj");
		Customer customer2 = new Customer(account,"Simran");
		Thread thread1 = new Thread(customer1);
		Thread thread2 = new Thread(customer2);
		thread1.start();
		thread2.start();
	}

}
