package com.Overriding;

// Driver class
public class Main_Overriding {
	// This method can be used to print salary of
	// any type of employee using base class refernce
	static void printSalary(Employee e) {
		System.out.println(e.salary());
	}

	public static void main(String[] args) {
		Employee obj1 = new Manager();
		// We could also get type of employee using
		// one more overridden method.loke getType()
		System.out.print("Manager's salary : ");
		printSalary(obj1);

		Employee obj2 = new Clerk();
		System.out.print("Clerk's salary : ");
		printSalary(obj2);
	}
}