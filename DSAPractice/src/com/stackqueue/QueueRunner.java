package com.stackqueue;

class QueueRunner {

	public static void main(String args[]) {
		QueueImplement q = new QueueImplement(3);

		q.add(10);
		q.add(20);

		q.print();
		System.out.println(q.getSize());

		System.out.println(q.isEmpty());
		System.out.println(q.isFull());

		System.out.println(q.peek());
		q.pop();
		q.print();

		System.out.println(q.getSize());
		q.print();

		q.add(100);
		q.add(200);
		System.out.println(q.isFull());
		q.print();
		System.out.println(q.peek());
	}
}
