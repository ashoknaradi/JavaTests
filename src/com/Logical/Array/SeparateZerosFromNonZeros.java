package com.Logical.Array;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {
	public static void main(String[] args) {
		int inputArray[] = { 0, 2, 5, 4, 0, 6, 1, 3 };
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}
		System.out.println(inputArray.length + "  " + counter);
		while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
		System.out.println("====================================================");

		int[] my_array = { 13, 14, 15, 16, 17, 18, 19 };
		int Index_position = 2;
		int newValue = 5;
		System.out.println("Original Array : " + Arrays.toString(my_array));
		for (int i = my_array.length - 1; i > Index_position; i--) {
			my_array[i] = my_array[i - 1];
		}
		my_array[Index_position] = newValue;
		System.out.println("New Array: " + Arrays.toString(my_array));
		System.out.println("====================================================");

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println("Key 14's position: " + findIndex(arr, 14));
		int[] arr1 = { 6, 34, 78, 1, 432, 900, 6 };
		System.out.println("Key 432's position: " + findIndex(arr1, 6));
	}

	public static int findIndex(int[] my_array, int key) {
		int startPoint = 0;
		int endPoint = my_array.length - 1;
		while (startPoint <= endPoint) {
			int mid = (startPoint + endPoint) / 2;
			if (key == my_array[mid]) {
				return mid;
			}
			if (key < my_array[mid]) {
				endPoint = mid - 1;
			} else {
				startPoint = mid + 1;
			}
		}
		return -1;
	}
}