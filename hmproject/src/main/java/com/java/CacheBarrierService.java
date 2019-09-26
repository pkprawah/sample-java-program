package com.java;

public class CacheBarrierService implements Runnable {

	private String serviceName;

	public CacheBarrierService(String serviceName) {
		super();
		this.serviceName = serviceName;

	}

	@Override
	public void run() {

		try {
			System.out.println(serviceName + "    BarrierAction  executed    " + Thread.currentThread().getName());
			// Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
