 
package com.stackqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackSort {
    int size;
    int arr[];
    int top;
 
    StackSort(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
 
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
        } else {
            System.out.println("Stack is full !");
        }
    }
 
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            return arr[returnedTop];
 
        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }
 
    public int peek() {
        return arr[top];
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (size - 1 == top);
    }
 
    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int idx = stack.pop();
                    result[idx] = i - idx;
                }
                stack.push(i);
            }

            return result;     
        }
    
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	int n = nums1.length, n2 = nums2.length;
        int[] res = new int[n];

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            } 
            stack.push(num);
        }
        
        for(int i=0; i<n; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums1 = new int[] {73,74,75,71,69,72,76,73};
    	System.out.println(dailyTemperatures(nums1));
    	
    	int[] nums11 = new int[] {4,1,2};
		int[] nums2 = new int[] {1,3,4,2};
		 System.out.println(nextGreaterElement(nums11,nums2));
    	
		 
        StackSort stackCustom = new StackSort(10);
        System.out.println("=================");
        stackCustom.push(10);
        stackCustom.push(30);
        stackCustom.push(50);
        stackCustom.push(40);
        
        int k = stackCustom.pop();
        System.out.println(";;;;"+ k);
        stackCustom.printStack(stackCustom);
        StackSort sortedStack=sortStack(stackCustom);
        System.out.println("=================");
        System.out.println("After Sorting :");
        System.out.println("=================");
        sortedStack.printStack(sortedStack);
 
    }
 
    // Sort a stack using another stack small on top
    public static StackSort sortStack(StackSort stack)
    {
        StackSort tempStack = new StackSort(10);
        while(!stack.isEmpty())
        {
            int currentData=stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() < currentData) {
                stack.push(tempStack.pop());
            }
            tempStack.push(currentData);
        }
        return tempStack;
    }
 
    public  void printStack(StackSort stack)
    {
        if(top>=0)
        {
            System.out.println("Elements of stacks are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
 
    }
}