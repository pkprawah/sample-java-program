package com.java;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String map) {
		System.out.println("map ::" + map);
		Thread.sleep(10);
	}

}
