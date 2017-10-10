package com.practice.exercise;

public class StrategyDemo {

	public static void main(String[] args) {
		Context context = new Context(new AddStrategy());
		System.out.println("Add Context:- " + context.execute(10, 15));

		context = new Context(new SubtractStrategy());
		System.out.println("Subtract Context:- " + context.execute(10, 15));

	}

}
