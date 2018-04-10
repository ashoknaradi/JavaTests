package com.Cloining;

import java.util.HashSet;
import java.util.Set;

public class A {

	/*void m1(){
		
	}*/
	
	public static void main(String[] args) {
		Set set=new HashSet<>();
		set.add(new StringBuffer("Hi"));
		set.add(new StringBuffer("Hi"));
		
		System.out.println(set.size());
	}
}
class B implements X,Y{
	
	public void m1() {
	//	System.out.println(x);
	}
	
	
}

interface X{
	int x=10;
}

interface Y{
	int x=20;
}