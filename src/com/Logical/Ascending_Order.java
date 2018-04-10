package com.Logical;

import java.util.Scanner;

public class Ascending_Order {
	public static void main(String[] args) {
		int n, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array(Size of Array): ");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		System.out.print("Descending Order:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
        System.out.println("Largest:"+a[n-1]);
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);
        System.out.println("Second Smallest:"+a[1]);
	}
}