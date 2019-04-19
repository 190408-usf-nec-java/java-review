package com.revature.stringtiming;

public class StringTiming {
	public static void main(String[] args) {
		int iteration = 1_000_000;
		
		long time = System.currentTimeMillis();
		String s = "";
		for(int i = 0; i < iteration; i++) {
			s += "a";
		}
		System.out.println("String time: " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer("");
		for(int i = 0; i < iteration; i++) {
			stringBuffer.append("a");
		}
		System.out.println("StringBuffer time: " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder("");
		for(int i = 0; i < iteration; i++) {
			stringBuilder.append("a");
		}
		System.out.println("String builder: " + (System.currentTimeMillis() - time));
		
	}
}
