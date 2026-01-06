package com.stackqueue;

import java.util.Stack;

public class QueueWithTwoStk {
//leetcode 2 soln....
	
	
	 private Stack<Integer> s1 = new Stack();
     private Stack<Integer> s2 = new Stack();
   
   public MyQueue() {
       
   }
   
   public void push(int x) {
       while (!s1.isEmpty())
           s2.push(s1.pop());
      s1.push(x); 
       
       while (!s2.isEmpty())
           s1.push(s2.pop());
   }
   
   public int pop() {
       return s1.pop();
   }
   
   public int peek() {
       return s1.peek();
   }
   
   public boolean empty() {
       return s1.isEmpty();
   }
   //---------------------------------------------
	Stack<Integer> s1;
	Stack<Integer> s2;

	public QueueWithTwoStk() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		s1.push(x);
		System.out.println("Added" + x);
	}

	public int pop() {
		while (!s1.isEmpty())
			s2.push(s1.pop());

		int value = s2.pop();
		while (!s2.isEmpty())
			s1.push(s2.pop());
		return value;
	}

	public int peek() {
		while (!s1.isEmpty())
			s2.push(s1.pop());

		int value = s2.peek();
		while (!s2.isEmpty())
			s1.push(s2.pop());
		return value;
	}

	public boolean empty() {
		return (s1.isEmpty() && s2.isEmpty());
	}



	public static void main(String[] args) {
		QueueWithTwoStk qu = new QueueWithTwoStk();
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
