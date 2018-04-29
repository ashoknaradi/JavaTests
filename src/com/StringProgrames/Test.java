package com.StringProgrames;

public class Test {
	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("java");
		sb.append(" exam");
		sb.append(" attend");
		System.out.println(sb);
		
		final String s = new String("java");
		s.concat(" exam");
		s.concat(" attend");
		System.out.println(s);
	}
}