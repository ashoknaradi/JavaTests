package com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = prepareEmployee();
		University u = new University();
		//u.col.std.setStdName("asas");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Ramp\\Desktop\\test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(u);
		oos.writeObject(e);
		System.out.println("Serialization completed!!");
	}

	private static Employee prepareEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Ravi");
		emp.setSalary("40000");
//		emp.setPassword("rakulpreet123");
		return emp;
	}
}