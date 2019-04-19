package com.revature.hashcode.equals;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Hashcode-Equals contract - this a contract that details how the implementation
 * of the .hashcode method and the .equals method should be implemented.
 *
 * Hashcode is intended to be a method to quickly determine if two objects are different or
 * whether they might be the same.
 * 
 * Equals is a slower method to confirm that two objects that might be the same, are actually
 * the same.
 * 
 * 1. If two objects have differing hashcodes then the equals must return false. 
 * 
 * 2. If two objects are considered to be equal, they must have the same hashcode.
 *
 */
public class HashcodeEqualsContract {
	public static void main(String[] args) {
		Set<Car> cars = new HashSet<>();
		
		Car sentra = new Car(1, "Sentra", LocalDate.of(2005, 1, 1));
		Car tesla = new Car(2, "Tesla", LocalDate.of(2018, 1, 1));
		
		cars.add(sentra);
		cars.add(tesla);
		cars.add(sentra);
		
		cars.forEach(System.out::println);
	}
}
