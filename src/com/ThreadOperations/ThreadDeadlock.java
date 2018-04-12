package com.ThreadOperations;

public class ThreadDeadlock {
	String name = "Pranay";
	String name1 = "Pranay2";

	// deadlock example
	void firstMethod() {
		synchronized (name) {
			System.out.println("In firstMethod--, Acquired the name object lock,  ThreadName: "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Waiting for name1 lock");
			synchronized (name1) {
				System.out.println("Hi");
			}
		}
	}

	void secondMethod() {
		synchronized (name1) {
			System.out.println("In secondMethod block-  Acquired the name1 object lock - ThreadName: "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Waiting for name lock");
			synchronized (name) {
				System.out.println("Hello");
			}
		}
	}

	public static void main(String[] args) {
		ThreadDeadlock obj1 = new ThreadDeadlock();
		
		TestThreadDeadlock thread1 = new TestThreadDeadlock(obj1);
		thread1.setName("Thread1");
		thread1.start();

		TestThreadDeadlock thread2 = new TestThreadDeadlock(obj1);
		thread2.setName("Thread2");
		thread2.start();
	}
}

class TestThreadDeadlock extends Thread {
	ThreadDeadlock obj;

	public TestThreadDeadlock(ThreadDeadlock obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread1")) {
			obj.firstMethod();
		} else {
			obj.secondMethod();
		}
	}
}