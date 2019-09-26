package com.java;

public class AlertBarrierService implements Runnable {

	private String serviceName;

	public AlertBarrierService(String serviceName) {
		super();
		this.serviceName = serviceName;

	}

	@Override
	public void run() {

		try {
			System.out.println(serviceName + "    BarrierAction  executed    " + Thread.currentThread().getName());
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
