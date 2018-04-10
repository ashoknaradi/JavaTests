package com.Cloining;

public class Employee implements Cloneable {
	private int employeeId;
	private String employeeName;
	private String employeeCompany;
	private Passport passport;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCompany() {
		return employeeCompany;
	}

	public void setEmployeeCompany(String employeeCompany) {
		this.employeeCompany = employeeCompany;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeCompany="
				+ employeeCompany + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		Passport pp = (Passport) passport.clone();
		emp.setPassport(pp);
		return emp;
	}

}