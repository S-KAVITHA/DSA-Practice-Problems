package com.stackqueue;

public class QueueImplement {

	private int front;
	private int rear;
	private int[] queue;
	private int size;
	private int totCapacity;

	QueueImplement(int s) {
		totCapacity = s;
		queue = new int[totCapacity];
		front = 0;
		rear = 0;
		size = 0;
	}

	public boolean isEmpty() {
		if (rear == -1 && front == 0)
			return true;
		return false;
	}

	public boolean isFull() {
		if ((rear - front) == size - 1)
			return true;
		return false;
	}

	public int getSize() {
		return (size) ;
	}

	public void add(int x) {
		if (!isFull()) {
			// when removal pointer of front is increased. but when we try to add one more
			//element index out of bound. rear now has to point to index 0 to make it 
			//circular array do modulo by size.

			queue[rear] = x;
			rear = (rear+1) % totCapacity;
			size++;
			
			
		} else
			System.out.println("Queue is full");
	}

	public int pop() {
		if (!isEmpty()) {
			int temp = queue[front];
			queue[front] = 0;
			front = (front + 1) % totCapacity;
			
			size--;
			
			return temp;
		} else
			System.out.println("Queue is empty");

		return -1;
	}

	public int peek() {
		if (!isEmpty()) {
			return queue[front];
		} else
			System.out.println("Queue is empty");

		return -1;
	}

	public void print() {
		
		// dont do i from 0 becoz when removal we do front ++ which means 0 index is poped
		// and now front points to 1. so size is rear - front(3-1 = 2). print from front to rear.
		for (int i :queue) {
			if (i != 0)
			System.out.println(i);
		}
	}

}

=======================


public class Queue {
    private int[] arr;
    private int front, rear;
    private int maxSize;

    public Queue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        maxSize = size;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
 if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) front = 0;
        rear++;
        arr[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int dequeuedValue = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return dequeuedValue;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
    }
}
