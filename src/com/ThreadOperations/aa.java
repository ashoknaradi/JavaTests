package com.ThreadOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class aa {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 3 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			arrayList.add(a[i]);
			linkedHashSet.add(a[i]);
		}
		System.out.println(arrayList + " " + linkedHashSet);
		
		List<Object> list = new CopyOnWriteArrayList<Object>();
		list.add(10);
		list.add(20);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add(30);
		}
		System.out.println(list);
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(arrayList);
		System.out.println(hashSet);
		for (Object object : hashSet) {
			System.out.println(object);
			hashSet.add(9);
		}
		System.out.println(hashSet);
	}
}