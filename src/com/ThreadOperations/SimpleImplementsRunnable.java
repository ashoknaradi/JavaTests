package com.ThreadOperations;

public class SimpleImplementsRunnable  {
	public static void main(String[] args) {
		//using Runnable Interface
		MyRunnThread mrt = new MyRunnThread();
		Thread t = new Thread(mrt);
		t.start();
		System.out.println("Name of thread is " + t.getName());
		//if start a thread twice IllegalThreadStateException occurs
		t.start();
	}
}

class MyRunnThread implements Runnable {
	public void run() {
		System.out.println("thread is running using implements Runnable ..." + Thread.currentThread().getName());
	}
}