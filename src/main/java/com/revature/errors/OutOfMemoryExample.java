package com.revature.errors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemoryExample {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String hello = "HEllo";
		while(true) {
			hello = hello + hello;
			list.add(hello);
		}
	}
}
