package com.stackqueue;

public class QueueLinkListImp {
	private Node front, rear;

	QueueLinkListImp() {
		front = null;
		rear = null;
	}

	public class Node {
		private int data;
		private Node next;

		Node(int x) {
			this.data = x;

		}

		Node(int x, Node next) {
			this.data = x;
			this.next = next;
		}
	}

	public void enqueue(int x) {
		Node newNode = new Node(x, null);
		if (front == null)
			front = rear = newNode;

		rear.next = newNode;
		rear = newNode;
		//System.out.print("Add " + newNode.data);

	}

	public int dequeue() {

		if (front == null)
			throw new RuntimeException();

		Node temp = front;
		front = front.next;
		return temp.data;

	}

	public int peek() {

		if (front == null)
			throw new RuntimeException();

		return front.data;

	}

	public void display() {
		Node c = front;
		while (c != null) {
			System.out.print(" " + c.data);
			c = c.next;

		}

	}

	public static void main(String a[]) {

		QueueLinkListImp queue = new QueueLinkListImp();
		queue.enqueue(6);
		
		queue.enqueue(3);
		queue.enqueue(99);
		queue.enqueue(56);
		
		queue.enqueue(43);
		queue.display();
		System.out.println();
		queue.dequeue();
		
	
		queue.enqueue(89);
		queue.enqueue(77);
		queue.dequeue();
		queue.display();
		System.out.println();
		
	}
}
