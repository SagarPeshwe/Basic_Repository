package com.practice.exercise;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListDemo l1= new LinkedListDemo();
		l1.insertFirst(10);
		l1.insertFirst(20);
		l1.insertLast(30);
		//l1.deleteFirst();
		
		Node node= new Node();
		node.data=20;
		
		l1.deleteAfter(node);
		l1.print();
		
	}

}
