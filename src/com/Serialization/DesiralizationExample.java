package com.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesiralizationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Ramp\\Desktop\\test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for (int i = 0; i < 2; i++) {
			Object o = ois.readObject();
			if (o instanceof University) {
				University u = (University) o;
				System.out.println(u.col.std.stdId);
				System.out.println(u.col.std.stdName);
				System.out.println(u.col.std.stdCol);
				System.out.println(u.col.std.stdLoc);
				System.out.println(u.col.std.serialVersionUID);
				System.out.println("======================================");
			} else {
				Employee emp = (Employee) o;
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
				System.out.println(emp.getSalary());
				System.out.println(emp.getPassword());
			}
		}
	}
}