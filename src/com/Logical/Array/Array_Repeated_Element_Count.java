package com.Logical.Array;

import java.util.Scanner;

public class Array_Repeated_Element_Count {
	public static void main(String[] args) {
		// Get integer array size
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = input.nextInt();

		int[] crr_array = new int[size];
		int[] times = new int[10];

		// Read integers from the console
		System.out.println("Enter array elements: ");
		for (int i = 0; i < crr_array.length; i++) {
			crr_array[i] = input.nextInt();
		}

		// Search for repeated elements
		for (int j = 0; j < crr_array.length; j++) {
			times[crr_array[j]] = times[crr_array[j]] + 1;
		}

		// Printing output
		for (int i = 0; i < times.length; i++) {
			System.out.println(i + " occures " + times[i]);
		}
	}
}