package com.MarkerInterface;

//Java program to illustrate Serializable interface
import java.io.Serializable;

//By implementing Serializable interface
//we make sure that state of instances of class A
//can be saved in a file.
class A implements Serializable {
	int i;
	String s;

	// A class constructor
	public A(int i, String s) {
		this.i = i;
		this.s = s;
	}
}
