package com.Logical.Array;

import java.util.Scanner;

public class ReverseNumber_withoutLoops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to ReverseNumber_withoutLoops::: ");
		int number = scanner.nextInt();
		int temp, reverseNumber = 0;

		temp = number % 10;
		reverseNumber = (reverseNumber * 10) + temp;
		number = number / 10;

		temp = number % 10;
		reverseNumber = (reverseNumber * 10) + temp;
		number = number / 10;

		System.out.println(reverseNumber);

		int c = 0, num = 1243567890;
		while (num != 0) {
			// num = num/10
			num /= 10;
			++c;
		}
		System.out.println("Number of digits: " + c);
	}
}
