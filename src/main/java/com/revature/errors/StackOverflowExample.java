package com.revature.errors;

public class StackOverflowExample {
	public static void doSomething() {
		int x = 10;
		doSomething();
	}
	
	public static void main(String[] args) {
		doSomething();
	}
}
