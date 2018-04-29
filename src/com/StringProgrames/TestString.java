package com.StringProgrames;

public class TestString {
	public static void main(String[] args) {
		String s1 = new String("Java");
		System.out.println("s1======== " + s1);
		s1 = s1.concat("h");
		System.out.println("s1======== " + s1);
		// s1 = "" + s1;
		// Reference Comparison
		System.out.println("(s1 == s1)========== " + (s1 == s1));
		// Content Comparison
		System.out.println("s1.equals(s1)====== " + s1.equals(s1));

		String s2 = s1.concat(" Test");
		System.out.println("s2======== " + s2);
		// Reference Comparison
		System.out.println("(s1 == s2)========== " + (s1 == s2));
		// Content Comparison
		System.out.println("s1.equals(s2)====== " + s1.equals(s2));

		String s3 = new String("Java");
		System.out.println("s3======== " + s3);
		// Reference Comparison
		System.out.println("(s1 == s3)========== " + (s1 == s3));
		// Content Comparison
		System.out.println("s1.equals(s3)====== " + s1.equals(s3));

		String s4 = s3;
		System.out.println("s4======== " + s4);
		// Reference Comparison
		System.out.println("(s4 == s3)========== " + (s4 == s3));
		// Content Comparison
		System.out.println("s4.equals(s3)====== " + s4.equals(s3));
		System.out.println(s2 = s3);
		StringBuffer s5 = new StringBuffer(s3);
		System.out.println("s5====== " + s5);
		System.out.println(s5.equals(s3));
		final String s9 = new String("aaa");
		String s10 = s9 + "";
		System.out.println(s9);
		System.out.println(s10);
		System.out.println("(s9 == s10)========== " + (s9 == s10));
		// Content Comparison
		System.out.println("s4.equals(s3)====== " + s9.equals(s10));
	}	
}