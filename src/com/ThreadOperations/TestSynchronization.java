package com.ThreadOperations;

public class TestSynchronization {
	void method1() {
		System.out.println("Entered in method1 " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			System.out.println("Exit from method1 " + Thread.currentThread().getName());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void method2() {
		System.out.println("Entered in method2 " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			System.out.println("Exit from method2 " + Thread.currentThread().getName());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static synchronized void method3() {
		System.out.println("Entered in method3 " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			System.out.println("Exit from method3 " + Thread.currentThread().getName());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestSynchronization obj1 = new TestSynchronization();

		MyThreadTest t1 = new MyThreadTest(obj1);
		t1.setName("First");
		t1.start();

		MyThreadTest t2 = new MyThreadTest(obj1);
		t2.setName("Second");
		t2.start();

		TestSynchronization obj2 = new TestSynchronization();

		MyThreadTest t3 = new MyThreadTest(obj2);
		t3.setName("Third");
		t3.start();

		MyThreadTest t4 = new MyThreadTest(obj2);
		t4.setName("Fourth");
		t4.start();

	}
}

class MyThreadTest extends Thread {
	TestSynchronization object;

	public MyThreadTest(TestSynchronization obj) {
		object = obj;
	}

	@Override
	public void run() {
		object.method1();
		object.method2();
		TestSynchronization.method3();
	}
}