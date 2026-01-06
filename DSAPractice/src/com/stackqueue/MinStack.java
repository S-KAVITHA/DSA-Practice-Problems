package com.stackqueue;

import java.util.Stack;

public class MinStack {

	    private Stack<Integer> s ;
	    private Stack<Integer> aux ;
	   // private int min=0;
	    
	    public MinStack() {
	       s = new Stack<>();
	        aux = new Stack<>(); 
	    }
	    
	    public void push(int val) {
	       s.push(val) ;
	       	       
	           int min;
	        	 min = Math.min(val, aux.isEmpty() ? val : aux.peek());
	        	 aux.push(min);
	             
	            
	    }
	    
	    public void pop() {
	      if (s.isEmpty())
	        {
	            System.out.println("Stack underflow!!");
	            System.exit(-1);
	        }  
	       s.pop();
	         aux.pop();
	        
	    }
	    
	    public int top() {
	        return s.peek();
	    }
	    
	    public int getMin() {
	      if (aux.isEmpty())
	        {
	            System.out.println("Stack underflow!!");
	            System.exit(-1);
	        }
	 
	        return aux.peek();  
	    }
	}


	 
	class Main
	{
	    public static void main (String[] args)
	    {
	        MinStack s = new MinStack();
	 
	        s.push(6);
	        System.out.println(s.getMin());    // prints 6
	 
	        s.push(7);
	        System.out.println(s.getMin());    // prints 6
	 
	        s.push(8);
	        System.out.println(s.getMin());    // prints 6
	 
	        s.push(5);
	        System.out.println(s.getMin());    // prints 5
	 
	        s.push(3);
	        System.out.println(s.getMin());    // prints 3
	 
	        s.pop();    // prints 3
	        System.out.println(s.getMin());    // prints 5
	 
	        s.push(10);
	        System.out.println(s.getMin());    // prints 5
	 
	       s.pop();    // prints 10
	        System.out.println(s.getMin());    // prints 5
	 
	       s.pop();    // prints 5
	        System.out.println(s.getMin());    // prints 6
	    }
	}
	
