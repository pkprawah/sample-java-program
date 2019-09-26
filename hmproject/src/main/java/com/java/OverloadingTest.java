package com.java;

public class OverloadingTest {

	public static void main(String[] args) {
		Animal a = new Dog();
		Cat c = (Cat) a;
		c.noise();

	}

}
