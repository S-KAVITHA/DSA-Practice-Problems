package com.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class StackWith2Queue {
	Queue<Integer> q1;
	Queue<Integer> q2;

	public StackWith2Queue() {
		q1 = new LinkedList();
		q2 = new LinkedList();
	}

	public void push(int x) {
		q1.add(x);
		System.out.println("Added" + x);
	}

	public int pop() {
		while (q1.size() > 1)
			q2.add(q1.remove());

		int value = q1.remove();
		while (!q2.isEmpty())
			q1.add(q2.remove());
		return value;
	}

	public int peek() {
		while (q1.size() > 1)
			q2.add(q1.remove());

		int value = q1.peek();
		while (!q2.isEmpty())
			q1.add(q2.remove());
		return value;
	}

	public boolean empty() {
		return (q1.isEmpty() && q2.isEmpty());
	}

	public static void main(String[] args) {
		StackWith2Queue qu = new StackWith2Queue();
		qu.push(3);
		qu.push(4);
		qu.push(13);
		qu.push(24);

		System.out.println(qu.peek());
		qu.push(33);

		System.out.println(qu.pop());
		qu.push(44);
		System.out.println(qu.pop());
		System.out.println(qu.empty());
	}

}

//------------------------------------------------------

//Leetcode solution

private Queue<Integer> q1 = new LinkedList<>();
private Queue<Integer> q2 = new LinkedList<>();

public MyStack() {
  
}

public void push(int x) {
   while(!q1.isEmpty())
      q2.add(q1.remove());
     q1.add(x);
   while(!q2.isEmpty())
   {
       q1.add(q2.remove());
   }
}

public int pop() {
 int popped=  q1.remove();
   return popped;
   
}

public int top() {
   return q1.peek();
}

public boolean empty() {
    return q1.isEmpty();
}
}