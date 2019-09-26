package com.java;

public class ThreadLocalExample {

	public static void main(String[] args) {
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance, "Thread-A");
		Thread thread2 = new Thread(sharedRunnableInstance, "Thread-B");

		thread1.start();
		thread2.start();
		try {
			thread1.join(); // wait for thread 1 to terminate
			thread2.join(); // wait for thread 2 to terminate
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
