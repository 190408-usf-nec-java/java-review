package com.revature.generics;

public class Box {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		String myString = "Hello World";
		Box box = new Box();
		box.setObject(myString);
		String boxString = (String) box.getObject();
	}
}
