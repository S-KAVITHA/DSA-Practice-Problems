package com.stackqueue;

public class ReversepolishNotation {
	class Solution {
	    public int evalRPN(String[] tokens) {
	        Stack<Integer> stack = new Stack<>();
	        
	        for(String i : tokens){
	            
	            System.out.println(isOperator(i));
	            if (isOperator(i)){
	                
	                
	                int b = stack.pop();
	               int a = stack.pop();
	               int c =  performOperation(a,b,i);
	                stack.push(c);
	                
	            }else{
	              stack.push(Integer.parseInt(i));
	            }
	        }
	        
	        return stack.pop();
	    }
	    
	    public boolean isOperator(String i){
	          System.out.println((i));
	        if (i.equals("+") || i.equals("-") ||i.equals("*")||i.equals("/"))
	            return true;
	        
	        return false;
	    }
	     public int performOperation(int a, int b, String i){
	         int res =0 ;
	       switch(i){
	           case "+":
	              res  =  (a+b);
	               break;
	           case "-":
	               res = (a-b);
	               break;
	           case "*":
	                res = (a*b);
	               break;
	               
	           case "/":
	               res = (a/b);
	               break;
	       }
	         
	         return res;
	     } 
	}
}
