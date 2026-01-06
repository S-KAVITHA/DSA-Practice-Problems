package LinkedListPgms;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList {

	Node head;
	Node tail;

	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = (newNode);
		}
	}

	public void insertStart(int data) {
		Node newNode = new Node(data);
		newNode.next = (head);
		head = newNode;
	}

	public void insertAtIndex(int index, int data) {
		Node newNode = new Node(data);
		if (index == 0) {
			insertStart(data);
		} else {

			Node firstNode = head;
			for (int i = 0; i < index - 1; i++) {
				firstNode = firstNode.next;
			}
			newNode.next = (firstNode.next);
			firstNode.next = (newNode);
		}
	}

	public void deleteIndex(int index) {
		Node temp = head;
	

		if (temp == null) {
			// Display the message
			System.out.println(index + " position element not found");
			return;
		}

		if (index == 0 && temp != null) {
			head = temp.next;
			System.out.println(index + " position element deleted");
			return;
		}

		for (int i = 0; i < index-1; i++) {
			System.out.println(i);
			temp = temp.next;
		}
		Node nodeTodelete = temp.next;
		temp.next = nodeTodelete.next;
		
		//temp.next = temp.next.next;
		System.out.println(index + " position element deleted");

	}

	public void deleteVal(int value) {
		Node temp = head;
		Node previous = null;

		if (temp == null) {
			System.out.println("Can't delete Linked List empty");
			return;
		}

		// if the head node itself needs to be deleted
		if (temp.data == value) {
			head = temp.next; // changing head to next in the list
			System.out.println("Deleted value from Linked List:: " + value);
			return;
		}

		// traverse until we find the value to be deleted or LL ends
		while (temp != null && temp.data != value) {
			// store previous link node as we need to change its next val
			previous = temp;
			temp = temp.next;
		}

		// if value is not present then
		// temp will have traversed to last node NULL
		if (temp == null) {
			System.out.println("Value not found");
			return;
		}

		// for node to be deleted : temp lets call it nth node
		// assign (n-1)th node's next to (n+1)th node
		previous.next = (temp.next);

		System.out.println("Deleted value from Linked List:: " + value);
	}

	public void show() {

		Node node = head;

		while (node != null) {
			System.out.println("Data :" + node.data);
			node = node.next;

		}
	}

	public int lengthList() {
		// iterative method
		Node current = head;
		int counter = 0;

		while (current != null) {
			counter++;
			current = current.next;
		}

		return counter;

	}

	public int recursivelengthList() {
		Node current = head;
		return recursiveCnt(current);

	}

	private int recursiveCnt(Node current) {
		if (current == null) {
			return 0;
		}
		return 1 + recursiveCnt(current.next);
	}

	public void findMiddleNode() {
		Node slow_ptr = head;
		Node fast_ptr = head; // increments for every 2nd iteration
		int cntr = 1;

		if (fast_ptr.next != null) {

			while (fast_ptr.next != null) {

				if (cntr % 2 == 0) {
					slow_ptr = slow_ptr.next;
				}
				cntr++;
				fast_ptr = fast_ptr.next;

			}
			// incase of odd counter make middle to next node
			if (cntr % 2 == 0) {
				slow_ptr = slow_ptr.next;
			}
		}

		System.out.println("length of LinkedList: " + (cntr + 1));
		System.out.println("middle element of LinkedList : " + slow_ptr);

		// method 2 ==> correct solution optimized soulution

		Node slow_ptr1 = head;
		Node fast_ptr1 = head; // increments for every 2nd iteration

		while ((fast_ptr1 != null) && (fast_ptr1.next != null)) {

			slow_ptr1 = slow_ptr1.next;

			fast_ptr1 = fast_ptr1.next.next;

		}
		System.out.println("----------  method 2: -----------");
		System.out.println("middle element of LinkedList  method 2: " + slow_ptr1);
	}

	public int kthNodeFromEnd(int n) {
		Node current = head;
		int length = 0;
		if (head == null) {
			return -1;
		}

		while (current != null) {
			length++;
			current = current.next;
		}

		if (n > length) {
			return -1;
		}

		current = head;
		int i = 0;
		while (i < length - n) {
			current = current.next;
			i++;
		}

		return current.data;
	}

	public void reverseIteratively() {
		Node current = head;
		Node previous = null, next = null;
		while (current != null) {
			/*
			 * next = current.get; current = current.getNext(); // reverse the link
			 * next.setNext(previous); previous = next;
			 */
			next = current.next;
			current.next = (previous);
			previous = current;
			current = next;
		}
		head = previous;
	}

	public void addCylicNode(int a, int b) {
		int cnta = 0, cntb = 0;
		Node start = head;
		Node end = head;

		if (start != null) {
			while (cnta != a || cntb != b) {

				if (cnta != a) {

					start = start.next;
					cnta++;

				}
				if (cntb != b) {
					end = end.next;
					cntb++;

				}
			}

			end.next = (start);
		}

	}

	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			// if fast and slow pointers are meeting then LinkedList is cyclic
			if (fast == slow) {

				firstElemCyclic(fast);
				lengthOfLoop( slow);
				return true;
			}
		}

		return false;
	}

	public void lengthOfLoop(Node slow) {

		int count = 1;
        Node curr = slow;
        while (curr.next != slow) {
            count++;
            curr = curr.next;
        }
        
		System.out.println("Count of loop " + count);
	}

	public void firstElemCyclic(Node fast) {

		Node slow = head;
		while (fast != slow) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println("First element of loop " + slow);
	}

	public void printlist(Node node) {

		while (node != null) {
			System.out.println("Data :" + node.data);
			node = node.next;

		}
	}

	public void reverseByIndex(int k) {
		Node node = head;

		Node getNode = reverseKgroup(node, k);
		printlist(getNode);
	}

	public static Node reverseList(Node head) {
		// RECURSIVE FUN
		while (head == null || head.next == null) {
			return head;
		}

		Node newHead = reverseList(head.next);

		head.next.next = (head);
		head.next = (null);

		return newHead;
	}

	public static Node reverseKgroup(Node node, int k) {
		Node prevNode = null;
		Node currNode = node;
		Node nextNode = null;
		int count = 0;
		while (count < k && currNode != null) {
			nextNode = currNode.next;
			currNode.next = (prevNode);
			// update
			prevNode = currNode;
			currNode = nextNode;
			count++;
		}

		if (currNode != null) {
			node.next = (reverseKgroup(currNode, k));
		}

		return prevNode;
	}

	public boolean palindromeList(Node head) {

		// optimised below shows time exceeded error for few cases.
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		while (head != null) {
			a.add(head.data);
			b.add(head.data);
			head = head.next;
		}
		Collections.reverse(b);
		if (a.equals(b))
			return true;
		else
			return false;

		/*
		 * Node currNode = head; String listdata = "", reverse = "";
		 * 
		 * while (currNode != null) {
		 * 
		 * listdata += String.valueOf(currNode.data); System.out.println(listdata);
		 * currNode = currNode.next; }
		 * 
		 * int length = listdata.length(); for (int i = length - 1; i >= 0; i--) {
		 * 
		 * reverse = reverse + listdata.charAt(i);
		 * 
		 * } if (listdata.equals(reverse))
		 * System.out.println("Entered string/number is a palindrome."); else
		 * System.out.println("Entered string/number isn't a palindrome.");
		 */
	}
	
	public boolean palindromeList1(Node head) {

		// Optimized solution two with 2 pointers
		
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		Node prev = null;
		while (slow != null) {
		
			Node temp = null;
			temp = slow.next;
			slow.next = prev;
			prev = slow ;
			slow = temp;			
		}
		
		Node start = head;
		Node end = prev;
		while (start != null) {
			if (start.val != end.val) return false;
			start = start.next;
			end = end.next;
		}
		return true;
		

		
	}
}
