package com.practice.exercise;

import java.util.Stack;

public class MyStack {

	private int max = 0;
	private long[] sarray;
	private int top;

	public MyStack(int max) {
		this.max = max;
		sarray = new long[max];
		top = -1;
	}

	public void push(long j) {
		sarray[++top] = j;
	}

	public long pop() {
		return sarray[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);

		MyStack m = new MyStack(5);
		m.push(10);
		m.push(20);
		m.push(30);
		m.pop();
		m.push(40);
		m.push(50);
		//m.push(60);
		//m.push(70);
		while (!m.isEmpty()) {
			long val = m.pop();
			System.out.print(val + " ");
		}

	}
}
