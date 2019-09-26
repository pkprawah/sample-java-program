package com.java;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {

		final CountDownLatch latch = new CountDownLatch(3);

		Thread cacheService = new Thread(new CacheService("CacheService", latch));
		Thread alertService = new Thread(new AlertService("AlertService", latch));
		Thread validationService = new Thread(new ValidationService("ValidationService", latch));

		cacheService.start(); // separate thread will initialize CacheService
		alertService.start(); // another thread for AlertService initialization
		validationService.start();

		try {

			latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("All application is up ..Now Application is start for processing...");

	}

}
