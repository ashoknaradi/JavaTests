package com.Logical.Array;

public class MaxDifference {
	public static void main(String[] args) {
		int arr[] = { 23, 5, 6, 3, 19, 20 };
		int min_element = arr[0];
		int diff = arr[1] - arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - min_element > diff)
				diff = arr[i] - min_element;
			if (arr[i] < min_element)
				min_element = arr[i];
		}
		System.out.println("Maximum difference is : " + diff);
	}
}