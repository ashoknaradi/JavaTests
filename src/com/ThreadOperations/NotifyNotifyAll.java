package com.ThreadOperations;

public class NotifyNotifyAll {
	int balance = 0;
	synchronized void deposit() {
		System.out.println("Entered in deposit --> " + Thread.currentThread().getName());
		notify();
		balance += 12000;
		System.out.println("Successfully deposited the amount , notified");
		//notifyAll();
	}

	synchronized void withdraw() {
		System.out.println("Entered in withdraw  -->" + Thread.currentThread().getName());
		try {
			System.out.println("Waiting for the notification....!!!");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (balance >= 5000) {
			balance -= 5000;
			System.out.println("Sucessfully withdrawn the 5000, remaining amount is: " + balance);
		} else {
			System.out.println("Insufficent funds.....");
		}
	}

	synchronized void test() {
		try {
			// Thread.sleep(5* 1000);
			System.out.println("The third thread also waiting for Notification....");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		NotifyNotifyAll obj1 = new NotifyNotifyAll();

		MyThreadTest2 t1 = new MyThreadTest2(obj1);
		t1.setName("First");
		t1.start();
		MyThreadTest2 t2 = new MyThreadTest2(obj1);
		t2.setName("Second");
		t2.start();
		MyThreadTest2 t3 = new MyThreadTest2(obj1);
		t3.setName("Third");
		t3.start();
	}
}

class MyThreadTest2 extends Thread {
	NotifyNotifyAll object;
	public MyThreadTest2(NotifyNotifyAll obj) {
		object = obj;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("First")) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			object.deposit();
		} else if (Thread.currentThread().getName().equals("Second")) {
			object.withdraw();
		} else {
			object.test();
		}
	}
}