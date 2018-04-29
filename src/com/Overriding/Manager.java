package com.Overriding;

//Inherited class
public class Manager extends Employee {
	// This method overrides show() of Parent
	int salary() {
		return base + 20000;
	}
}
