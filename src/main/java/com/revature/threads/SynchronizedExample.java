package com.revature.threads;

import java.util.stream.IntStream;

/**
 * Threads
 * 
 * A thread is a single line of execution with its own stack.
 * 
 * The base thread is called the main thread, however more threads can be created
 * and run individually as their own process.  Daemon thread in Java - a thread used for
 * maintenance tasks, whose life will not prevent the death of the application.
 *
 * Threads can be created in two ways:
 * 	1) Extending the Thread class
 *  2) Implementing Runnable and passing that to the new Thread
 *
 */
public class SynchronizedExample {

	public static void main(String[] args) {
		Account a = new Account();
		Account b = new Account();
		
		Thread t = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				a.transfer(b, 1);
			}
			System.out.println("t done!");
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				b.transfer(a, 1);
			}
			System.out.println("t2 done!");
		});
		
		t.start();
		t2.start();
		
		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.balance);
		System.out.println(b.balance);
	}
}
