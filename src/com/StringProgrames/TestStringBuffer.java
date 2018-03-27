package com.StringProgrames;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println("sb1======== " + sb1);
		System.out.println("sb1.equals(sb1)====== " + sb1.equals(sb1));

		StringBuffer sb2 = sb1.append(" Test");
		System.out.println("sb2======== " + sb2);
		System.out.println("sb1======== " + sb1);
		// Reference Comparison
		System.out.println("(sb1 == sb2)========== " + (sb1 == sb2));
		// Reference Comparison
		System.out.println("sb1.equals(sb2)====== " + sb1.equals(sb2));

		StringBuffer sb3 = new StringBuffer("Java");
		System.out.println("sb3======== " + sb3);
		// Reference Comparison
		System.out.println("(sb1 == sb3)========== " + (sb1 == sb3));
		// Reference Comparison
		System.out.println("sb1.equals(sb3)====== " + sb1.equals(sb3));

		StringBuffer sb4 = sb3;
		System.out.println("sb4======== " + sb4);
		System.out.println("sb3.equals(sb4)====== " + sb3.equals(sb4));
		System.out.println("sb3.equals(sb4)====== " + (sb3 == sb4));
		
		final StringBuffer s = new StringBuffer("ttt");
		System.out.println(s);
		StringBuffer ss = s.append( "bbb");
		System.out.println(ss);
		System.out.println("s.equals(ss)====== " + s.equals(ss));
		System.out.println("s.equals(ss)====== " + (s == ss));
		 

	}
}
