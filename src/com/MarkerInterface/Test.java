package com.MarkerInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		A a = new A(20, "Java");

		// Serializing 'a'
		FileOutputStream fos = new FileOutputStream("C://Users/Ramp/Desktop/Test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		// De-serializing 'a'
		FileInputStream fis = new FileInputStream("C://Users/Ramp/Desktop/Test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		A b = (A) ois.readObject();// down-casting object

		System.out.println(b.i + " " + b.s);

		// closing streams
		oos.close();
		ois.close();
	}
}