package com.java;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierPrinciple implements Runnable {

	CyclicBarrier barrier1 = null;
	CyclicBarrier barrier2 = null;
	CyclicBarrier barrier3 = null;

	public CyclicBarrierPrinciple(CyclicBarrier barrier1, CyclicBarrier barrier2, CyclicBarrier barrier3) {

		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
		this.barrier3 = barrier3;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " waiting at barrier 1");
			this.barrier1.await();

			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " waiting at barrier 2");
			this.barrier2.await();

			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " waiting at barrier 3");
			this.barrier3.await();

			System.out.println(Thread.currentThread().getName() + " done!");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}
