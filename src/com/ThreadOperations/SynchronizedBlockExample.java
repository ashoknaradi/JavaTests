package com.ThreadOperations;

public class SynchronizedBlockExample {
	String name = "Pranay";
	String name1 = "Pranay2";

	void method1() {
		System.out.println("Entered into method1 -- ThreadName: " + Thread.currentThread().getName());
		synchronized (String.class) {
			System.out.println(" In block - method1-- ThreadName: " + Thread.currentThread().getName());
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Exit from method1 -- ThreadName: " + Thread.currentThread().getName());
		}
	}

	void method2() {
		System.out.println("Entered into method2 -- ThreadName: " + Thread.currentThread().getName());
		synchronized (String.class) {
			System.out.println(" In block-  method2- ThreadName: " + Thread.currentThread().getName());
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Exit from method2 -- ThreadName: " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		SynchronizedBlockExample obj1 = new SynchronizedBlockExample();

		TestThread thread1 = new TestThread(obj1);
		thread1.setName("Thread1");
		thread1.start();

		TestThread thread2 = new TestThread(obj1);
		thread2.setName("Thread2");
		thread2.start();
	}
}

class TestThread extends Thread {
	SynchronizedBlockExample obj;

	public TestThread(SynchronizedBlockExample obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread1")) {
			obj.method1();
		} else {
			obj.method2();
		}
	}
}