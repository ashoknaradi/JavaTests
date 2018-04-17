package com.Logical.Array;

import java.util.Scanner;

public class NoOfOccurenceOfCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to count NoOfOccurenceOfCharacters ::: ");
		String str = scanner.nextLine();
		// Create an array of size 256 i.e. ASCII_SIZE
		int count[] = new int[256];

		int len = str.length();
		// Initialize count array index
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)] = count[str.charAt(i)] + 1;
			//count[str.charAt(i)]++;
		}
		// Create an array of given String size
		char ch[] = new char[len];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
		}
	}
}