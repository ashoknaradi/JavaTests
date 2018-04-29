package com.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

	static final long serialVersionUID = 5462223600l;
	transient int stdId = 120;
	transient final String stdName = "Kohli";
	static String stdCol = "JBIT";
	static transient String stdLoc = "HYD";

	/*public static int getStdId() {
		return stdId;
	}
	public static void setStdId(int stdId) {
		Student.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}*/
}
