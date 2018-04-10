package com.Cloining;

public class Passport implements Cloneable {
	private int passportId;
	private String passportNumber;
	private String passportExpiry;

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassportExpiry() {
		return passportExpiry;
	}

	public void setPassportExpiry(String passportExpiry) {
		this.passportExpiry = passportExpiry;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", passportExpiry="
				+ passportExpiry + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}