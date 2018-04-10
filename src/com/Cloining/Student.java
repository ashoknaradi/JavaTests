package com.Cloining;

public class Student implements Cloneable {
	private int studentId;
	private String studentName;
	private String studentLocation;

	protected int getStudentId() {
		return studentId;
	}

	protected void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	protected String getStudentName() {
		return studentName;
	}

	protected void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	protected String getStudentLocation() {
		return studentLocation;
	}

	protected void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentLocation="
				+ studentLocation + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}