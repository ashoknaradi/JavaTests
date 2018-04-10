package com.ThreadOperations;

public class TestJoinMethod extends Thread {
	public void run() {
		System.out.println("run execution started by ::: " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
		}
		System.out.println("run execution ended by ::: " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		TestJoinMethod t1 = new TestJoinMethod();
		t1.setName("First Thread");
		TestJoinMethod t2 = new TestJoinMethod();
		t2.setName("Second Thread");
		TestJoinMethod t3 = new TestJoinMethod();
		t3.setName("Third Thread");
		t1.start();
		try {
			t1.join(); // Waiting for t1 to finish
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}