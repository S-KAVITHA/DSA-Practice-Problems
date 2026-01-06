package com.stackqueue;

public class StackLinkedListImpl {
	private int size;
	private Node top;

	private class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public void push(int x) {
		Node newNode = new Node(x);
		newNode.next = top;
		newNode = top;
		size++;
	}

	public int pop() {

		if (!isEmpty()) {
			throw new RuntimeException(" Stack is empty");
		}
		int temp = top.data;

		top = top.next;
		size--;

		return temp;
	}

	public int peek() {

		if (!isEmpty()) {
			throw new RuntimeException(" Stack is empty");
		}
		int temp = top.data;

		return temp;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public int getSize() {

		return size;
	}

	public void display() {

		Node current = top;
		while (current != null) {
			System.out.print(current.data);
			current = current.next;
		}
	}

}
