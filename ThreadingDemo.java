package com.practice.exercise;

public class ThreadingDemo extends Thread {

	public void run() {
		System.out.println("Thread is running: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadingDemo groupDemo = new ThreadingDemo();
		ThreadGroup tg = new ThreadGroup("Parent thread group");

		Thread t2 = new Thread(tg, groupDemo, "two");
		t2.start();

		Thread t3= new Thread(tg, groupDemo, "three");
		t3.start();

		t3.setPriority(MAX_PRIORITY);
		
		System.out.println("Thread group name:- "+tg.getName() );
		tg.list();
		System.out.println("thread group demo");
	}
}
