package com.Logical.Array;

import java.util.Scanner;

public class FindThePairsInArray {
	public static void main(String[] args) {
		int inputArray[] = { 0, 2, 5, 4, 0, 6, 1, 3 };
		System.out.print("Enter sum value for finding the pairs in an array ::: ");
		int inputNumber = new Scanner(System.in).nextInt();
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}
			}
		}
	}
}