package com.singleton;

public class AccountCreation implements Cloneable {
	private static AccountCreation instance;

	private AccountCreation() {
		// Private Constructor
	}
	//synchronized means only one can access
	public synchronized static AccountCreation getInstance() {
		if (instance == null) {
			instance = new AccountCreation();
			System.out.println("AccountCreation Class Object creatred...!!!");
		} else {
			System.out.println("AccountCreation Class Object not Creatred just returned already Created one...!!!");
		}
		return instance;
	}

	public void create(int no) {
		System.out.println("Account Created Successfully, with Number:" + no);
	}
 
	protected Object clone() throws CloneNotSupportedException {
		return this;
		//return super.clone();
	}

}