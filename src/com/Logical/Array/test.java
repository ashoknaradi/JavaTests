package com.Logical.Array;

public class test {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.print(" divided by 10 ::::: " + i);
				System.out.println();
			} else {
				System.out.print( i + " ");
			}
		}
	}
}
