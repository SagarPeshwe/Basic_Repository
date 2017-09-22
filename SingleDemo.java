package com.practice.exercise;

public class SingleDemo {
	private static SingleDemo object;

	private SingleDemo() {
	}

	public static SingleDemo getInstance() {
		if (null == object)
			object = new SingleDemo();
		System.out.println("New instance");

		return object;

	}

	public void show() {
		System.out.println("Hello");
	}

}