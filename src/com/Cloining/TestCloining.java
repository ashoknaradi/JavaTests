package com.Cloining;

public class TestCloining {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setStudentName("Ha");
		student1.setStudentLocation("London");
		System.out.println("Before Cloning Student1 ::: ");
		System.out.println(student1);

		Student student2 = (Student) student1.clone();
		student2.setStudentId(2);
		System.out.println("After Cloning Student2 ::: ");
		System.out.println(student2);

		Employee employee1 = new Employee();
		employee1.setEmployeeId(111);
		employee1.setEmployeeName("Ashok");
		employee1.setEmployeeCompany("TCS");
		Passport passport1 = new Passport();
		passport1.setPassportId(111000);
		passport1.setPassportNumber("111Ashok");
		passport1.setPassportExpiry("20022030");
		employee1.setPassport(passport1);

		Employee employee2 = (Employee) employee1.clone();
		employee2.setEmployeeId(222);
		employee2.getPassport().setPassportId(22222);
		System.out.println("Before Cloning Employee1 ::: ");
		System.out.println(employee1);
		System.out.println("After Cloning Employee2 ::: ");
		System.out.println(employee2);
		System.out.println("Before Cloning passport1 ::: ");
		System.out.println(passport1);
		System.out.println("After Cloning passport2 ::: ");
		System.out.println(employee2.getPassport());
	}
}
