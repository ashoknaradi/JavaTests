package com.Immutability;

public class TestImmutability {
	public static void main(String[] args) {
		User user = new User(1, "aaaa", "hyd");
		System.out.println(user);
		User user1 = user.modifyUser(2, "bbbb", "pune");
		System.out.println(user1);
		User user2 = user1.modifyUser(2, "bbbb", "pune");
		System.out.println(user2);
		System.out.println(user1.hashCode() + " ::::: " + user2.hashCode());
	}
}