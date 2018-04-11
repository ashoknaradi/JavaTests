package com.singleton;

public class TestSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeSingle emp = EmployeeSingle.getInstance();
		emp.setEmpName("Anil");
		emp.setId(10);
		emp.setEmpSal("50K");
		System.out.println(emp.getEmpName());

		EmployeeSingle emp1 = EmployeeSingle.getInstance();
		emp1.setEmpName("Sunil");
		System.out.println(emp1.getEmpName());
		EmployeeSingle emp2 = (EmployeeSingle) emp.clone();
		emp2.setEmpName("ttt");
		System.out.println(emp.getEmpName() + " ::::: " + emp1.getEmpName() + " ::::: " + emp2.getEmpName());
	}
}

class EmployeeSingle implements Cloneable {

	private EmployeeSingle() {

	}

	private static EmployeeSingle emp;

	/**
	 * If required a object, use the below method. This class is a singleton
	 */
	public static EmployeeSingle getInstance() {
		synchronized (EmployeeSingle.class) {
			if (emp == null) {
				emp = new EmployeeSingle();
			}
		}
		return emp;
	}

	private Integer id;
	private String empName;
	private String empSal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return this;
	}
}