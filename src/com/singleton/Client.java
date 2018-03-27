package com.singleton;

public class Client {
	public static void main(String[] args) {

		AccountCreation tc = AccountCreation.getInstance();
		AccountCreation tc1 = AccountCreation.getInstance();
		AccountCreation tc2 = AccountCreation.getInstance();

		tc.create(12345);
		tc1.create(67891);
		tc2.create(67855);
	}
}
