package com.singleton;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {

		AccountCreation tc = AccountCreation.getInstance();
		AccountCreation tc1 = AccountCreation.getInstance();
		AccountCreation tc2 = (AccountCreation) tc.clone();

		tc.create(12345);
		tc1.create(67891);
		tc2.create(99999);
	}
}
