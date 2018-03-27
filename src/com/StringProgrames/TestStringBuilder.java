package com.StringProgrames;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Java");
		System.out.println("sb1======== " + sb1);
		System.out.println("sb1.equals(sb1)====== " + sb1.equals(sb1));

		StringBuilder sb2 = sb1.append(" Test");
		System.out.println("sb2======== " + sb2);
		System.out.println("sb1======== " + sb1);
		// Reference Comparison
		System.out.println("(sb1 == sb2)========== " + (sb1 == sb2));
		// Reference Comparison
		System.out.println("sb1.equals(sb2)====== " + sb1.equals(sb2));

		StringBuilder sb3 = new StringBuilder("Java");
		System.out.println("sb3======== " + sb3);
		// Reference Comparison
		System.out.println("(sb1 == sb3)========== " + (sb1 == sb3));
		// Reference Comparison
		System.out.println("sb1.equals(sb3)====== " + sb1.equals(sb3));

		StringBuilder sb4 = sb3;
		System.out.println("sb4======== " + sb4);
		System.out.println("sb3.equals(sb4)====== " + sb3.equals(sb4));
		System.out.println("sb3.equals(sb4)====== " + (sb3 == sb4));

	}

}
