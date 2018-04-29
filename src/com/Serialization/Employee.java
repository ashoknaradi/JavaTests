package com.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	static private String empName;
	transient private String salary;
	final transient private String password="rakul123";

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	/*public void setPassword(String password) {
		this.password = password;
	}*/
}
