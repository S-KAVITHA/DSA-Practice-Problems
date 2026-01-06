package com.stackqueue;

public class StackImplement {
	private int top;
	private int capacity;
	private int[] stack;
	
	StackImplement(int s){
		top = -1;
		capacity = s;
		stack = new int[capacity];
				
	}
	
	public void push(int x) {
		if (!isFull()) {
			stack[++top] = x;
			System.out.println("stk "+top);
		} else
			System.out.println("stk is full");
	}

	public boolean isFull() {
		
		return (top == capacity - 1);
	}

	public boolean isEmpty() {
		
		return (top == - 1);
	}
	
	public int getSize() {
			return top;
	}
	
	public int pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else
			System.out.println("stk is empty");
		return -1;
	}
	
	public int peek() {
		if (!isEmpty()) {
			return stack[top];
		} else
			System.out.println("stk is empty");
		return -1;
	}
	
	
	public int print() {
		for ( int s : stack)
			if (s != 0)
			System.out.println(s);
		return -1;
	}
}
