package com.Overriding;

public class OverridingTest {
	public static void main(String args[]) {
		SBI s = new SBI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
		
		Bank bank = new Bank();
		System.out.println(bank.getRateOfInterest());
		Bank bank1 = new SBI();
		System.out.println(bank1.getRateOfInterest());
		Bank bank2 = new AXIS();
		System.out.println(bank2.getRateOfInterest());
	}
}