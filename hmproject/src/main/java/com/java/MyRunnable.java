package com.java;

public class MyRunnable implements Runnable {

	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

	@Override
	public void run() {
		threadLocal.set((int) (Math.random() * 100D));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		int a = threadLocal.get();
		System.out.println(Thread.currentThread().getName() + "" + a);
		System.out.println(Thread.currentThread().getName() + "" + (a + 5));
	}

}
