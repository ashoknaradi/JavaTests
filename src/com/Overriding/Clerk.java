package com.Overriding;

// Inherited class
public class Clerk extends Employee {
	// This method overrides show() of Parent
	int salary() {
		return base + 10000;
	}
}