package com.Overloading;

public class TestOverloading {
	//increases the readability by Method Overloading(same Method name but different in parameters)
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		Adder.add(11, 11, 11, 11, 22, 55);
	}
}