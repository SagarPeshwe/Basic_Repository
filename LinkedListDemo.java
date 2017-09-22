package com.practice.exercise;

public class LinkedListDemo {
	private Node head;

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void insertFirst(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = head;
		head = newnode;
	}

	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}

	public void insertLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		Node newnode = new Node();
		newnode.data = data;
		current.next = newnode;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			current.displayData();
			current = current.next;
		}
	}
}
