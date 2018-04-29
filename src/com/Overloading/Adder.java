package com.Overloading;

public class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static void add(int... a) {
		System.out.println("Inside varargs method");
		System.out.println("Number of arguments: " + a.length);
		// using for each loop to display contents of a
		int s = 0;
		for (int i : a) {
			s = s + i;
		}
		System.out.println("varargs method sum is :: " + s);
	}

}