package com.Logical.Array;

public class Distinct {
	public static void main(String[] args) {
		int a[] = { 4, 1, 1, 9, 4, 8, 6, 8, 3, 7, 0, 3 };
		int flag = 0, count = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (a[i] != a[j]) {
						flag = 1;
					} else {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				count++;
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Number of non repeated elements are : " + count);
	}
}