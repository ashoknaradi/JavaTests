package com.ThreadOperations;

public class WaitNotifyNotifyAll {
		
	synchronized void method1() {
		System.out.println("Entered in method1 " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			wait(3*1000);	
			//wait();
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
	
	public static void main(String[] args) {
		WaitNotifyNotifyAll obj1=new WaitNotifyNotifyAll();	
		MyThreadTest1 t1=new MyThreadTest1(obj1);
		t1.setName("First");
		t1.start();
		MyThreadTest1 t2=new MyThreadTest1(obj1);
		t2.setName("Second");
		t2.start();	
		MyThreadTest1 t3=new MyThreadTest1(obj1);
		t3.setName("Third");
		t3.start();
	}
}

class MyThreadTest1 extends Thread{
	WaitNotifyNotifyAll object;
	public MyThreadTest1(WaitNotifyNotifyAll obj) {
		object=obj;
	}
	
	@Override
	public void run() {
		object.method1();
		object.method2();
	}
}