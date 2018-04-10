package com;

public class TernaryOperator {
	public static void main(String[] args) {
		Integer i = 42;
		String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
		System.out.println(s);
		
		if (args.length == 1 | args[1].equals("test")) {
			System.out.println("test case");
		} else {
			System.out.println("production " + args[0]);
		}
	}
}
