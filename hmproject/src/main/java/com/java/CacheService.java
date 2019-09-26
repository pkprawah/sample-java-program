package com.java;

import java.util.concurrent.CountDownLatch;

public class CacheService implements Runnable {

	private String serviceName;
	private CountDownLatch latch;

	public CacheService(String serviceName, CountDownLatch latch) {
		super();
		this.serviceName = serviceName;
		this.latch = latch;
	}

	@Override
	public void run() {

		try {

			System.out.println(serviceName + "  will work...");
			System.out.println(serviceName + "is up");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		latch.countDown();

	}

}
