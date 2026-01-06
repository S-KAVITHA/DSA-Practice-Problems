package PracticePgms;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackMinValue {

	private static Stack<Integer> stack = new Stack<Integer>();
	private static Stack<Integer> minStack = new Stack<Integer>();

	private static void push(int x) {
		stack.push(x);

		if (minStack.isEmpty() || (x < minStack.peek())) {
			minStack.push(x);
		}
	}

	private static int getMin() {

		int minValue = minStack.peek();
		return minValue;
	}

	private static void pop() {
		// Pop element from st and minSt
		minStack.pop();
		stack.pop();
	}

	private static int top() {
		// Return top of st
		return stack.peek();
	}

	public static void main(String args[]) {

		push(-2);
		push(0);
		System.out.println("--------------------------After push ---------");
		System.out.println("Stack top : " + top());
		System.out.println("Stack minimum : " + getMin());

		System.out.println("------------------------After push 2 ---------");
		push(-3);
		System.out.println("Stack top : " + top());
		System.out.println("Stack minimum : " + getMin());

		System.out.println("------------------------After pop ---------");
		pop();
		System.out.println("Stack top : " + top());
		System.out.println("Stack minimum : " + getMin());

		System.out.println("------------------------For each ---------");

		push(2);
		push(10);
		stack.forEach(n -> System.out.println(n));

		System.out.println("------------------------Iterator ---------");

		Iterator iterator = stack.iterator();
		while (iterator.hasNext()) {
			int values = (int) iterator.next();
			System.out.println(values);
		}

		ListIterator<Integer> ListIterator = stack.listIterator(stack.size());
		System.out.println("------Iteration over the Stack from top to bottom:");
		while (ListIterator.hasPrevious()) {
			Integer number = ListIterator.previous();
			System.out.println(number);
		}

	}
}
