package com.revature.threads;

public class Account {
	int balance = 100;
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void transfer(Account b, int amount) {
		
//		Lock lock = new ReentrantLock();
		
		synchronized (this) {
			synchronized (b) {
				this.balance -= amount;
				b.balance += amount;	
			}
		}

	}

}
