package com.practice.exercise;

import java.util.logging.LogManager;

public class SingletonDemo {

	public static void main(String[] args) {

		SingleDemo obj = SingleDemo.getInstance();
		obj.show();
		obj.show();
		obj.show();
		System.out.println("Runtime:- "+ Runtime.getRuntime());
		System.out.println("Log Manager:-"+LogManager.getLogManager() );
	}

}
