package com.java;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierStartPoint {

	public static void main(String[] args) {

		CyclicBarrier cacheBarrierService = new CyclicBarrier(3, new CacheBarrierService("CacheBarrierService"));

		CyclicBarrier validationBarrierService = new CyclicBarrier(3,
				new ValidationBarrierService("ValidationBarrierService"));

		CyclicBarrier alertBarrierService = new CyclicBarrier(3, new AlertBarrierService("AlertBarrierService"));

		CyclicBarrierPrinciple barrierRunnable1 = new CyclicBarrierPrinciple(cacheBarrierService,
				validationBarrierService, alertBarrierService);

		CyclicBarrierPrinciple barrierRunnable2 = new CyclicBarrierPrinciple(cacheBarrierService,
				validationBarrierService, alertBarrierService);

		CyclicBarrierPrinciple barrierRunnable3 = new CyclicBarrierPrinciple(cacheBarrierService,
				validationBarrierService, alertBarrierService);

		new Thread(barrierRunnable1).start();
		new Thread(barrierRunnable2).start();
		new Thread(barrierRunnable3).start();

	}

}
