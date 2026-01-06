package com.stackqueue;

class StackRunner {

	public static void main(String args[]) {
		/*
		 * StackImplement q = new StackImplement(3);
		 * 
		 * q.push(10); q.push(20);
		 * 
		 * q.print();
		 */
		
		StackWith2Queue obj = new StackWith2Queue();
		obj.push(10);
		obj.push(50);
		obj.push(60);
		obj.print();
		System.out.println("-----------" + obj.pop());
		obj.push(100);
		obj.push(500);
		obj.print();
		System.out.println("-----------");
		System.out.println("-----------" + obj.pop());
		System.out.println("-----------" + obj.peek());
		System.out.println("-------------"+obj.empty());
		
		 // System.out.println(q.getSize());
		  
		//  System.out.println(q.isEmpty()); System.out.println(q.isFull());
		  
		//  System.out.println(q.peek()); q.pop(); q.print();
		  
		 // System.out.println(q.getSize()); q.print();
		  
			/*
			 * q.push(100); q.push(200); System.out.println(q.isFull()); q.print();
			 * System.out.println(q.peek());
			 */
	}
}
