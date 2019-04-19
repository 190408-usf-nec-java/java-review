package com.revature.generics;


/**
 * Generics provide compile time type safety.
 * This is possible, because the compiler can check the generic arguments
 * and confirm that the objects passed and retrieved match the supplied
 * generic argument. Note: This is compile time - it's possible to break this
 * using reflection.
 * 
 * What does prevent? Prevents us from having (dangerously) cast references to Object types,
 * and prevents us from having to remember the types we're using when we want to create 
 * reusable bits of code, that interact with more specific classes in a generic way.
 *
 * @param <T>
 */
public class LabeledBox <T> {
	private T object;
	
	public void setObject(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return this.object;
	}
	
	public <R> void echo(R object) {
		System.out.println(object);
	}
	
	public static void main(String[] args) {
		LabeledBox<String> stringBox = new LabeledBox<>();
		LabeledBox<Integer> intBox = new LabeledBox<>();
		intBox.<LabeledBox<Integer>>echo(intBox);
		
	}
}
