package com.MarkerInterface;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneA a = new CloneA(20, "GeeksForGeeks");

		// cloning 'a' and holding new cloned object reference in b down-casting as clone() return type is Object
		CloneA b = (CloneA) a.clone();
		System.out.println(b.i);
		System.out.println(b.s);
	}
}
