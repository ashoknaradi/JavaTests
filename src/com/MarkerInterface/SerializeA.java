package com.MarkerInterface;

//Java program to illustrate Serializable interface
import java.io.Serializable;

//By implementing Serializable interface
//we make sure that state of instances of class A
//can be saved in a file.
public class SerializeA implements Serializable {
	int i;
	String s;

	// A class constructor
	public SerializeA(int i, String s) {
		this.i = i;
		this.s = s;
	}
}
