package com.ThreadOperations;

public class SimpleExtendsThread {
	public static void main(String[] args) {
		//using Thread Class
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("Name of thread is " + mt.getName());
		//if start a thread twice IllegalThreadStateException occurs
		mt.start();
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("thread is running using extends Thread... " + Thread.currentThread().getName());
	}
}

