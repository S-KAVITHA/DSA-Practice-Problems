package LinkedListPgms;

import java.util.HashSet;

public class Removeduplicates {

	// Given the head of a sorted linked list,
	// delete all nodes that have duplicate numbers,
	// leaving only distinct numbers from the original list.
	// Input: head = [1,2,3,3,4,4,5]
	// Output: [1,2,5]
	public void removeDuplicatesSort1(Node head) {

		Node dummy = new Node(0, head);
		Node prev = dummy;
		while (head != null && head.next != null) {

			// if (head.data == head.next.data) {
			boolean found = false;
			while (head.next != null && head.data == head.next.data) {
				head = head.next;
				found = true;
			}

			if (found)
				prev.next = head.next;

			else
				prev = prev.next;
			// }

			head = head.next;
		}

		// return dummy.next;

	}

	// Given the head of a sorted linked list,
	// delete all duplicates such that each element appears only once.
	// Return the linked list sorted as well.
	// Input: head = [1,1,2]
	// Output: [1,2]
	public Node removeDuplicatesSort(Node head) {
		Node node = head;

		while (node != null && node.next != null) {
			Node q = null;
			if (node.data == node.next.data) {
				q = node.next.next;
				node.next = (q);
			} else

				node = node.next;
		}

		return head;

	}

	public Node removeDuplicatesUnSort(Node head) {

		HashSet<Integer> set = new HashSet<Integer>();
		Node current = head;
		Node prev = null;

		while (current != null) {
			if (set.contains(current.data)) {
				if (current.next != null)
					prev.next = current.next;

			} else {
				set.add(current.data);
				prev = current;
			}
			current = current.next;
		}
// now head holds starting node we modify using current , prev pointers
		return head;

	}

	public int kthNodeFromEnd(Node head, int n) {
		Node current = head;
		int length = 0;
		if (head == null) {
			return 0;
		}

		while (current != null) {
			length++;
			current = current.next;
		}

		if (n > length) {
			return 0;
		}

		if (n == length) {
			return head.data;
		}

		current = head;
		int i = 0;
		while (i < length - n) {
			current = current.next;
			i++;
		}

		return current.data;
	}

	public Node removeNthFromEnd(Node head, int n) {
		if (head != null && head.next == null)
			return null;

		Node curr = head;
		int length = 0;
		while (curr != null) {
			length++;
			curr = curr.next;
		}
		if (n > length)
			return head;
		else if (n == length)
			return head.next;
		else {
			curr = head;
			Node prev = null;
			int i = 0;

			while (i < length - n) {
				prev = curr;
				curr = curr.next;
				i++;
			}

			prev.next = curr.next;
		}

		return head;

	}

	public Node deleteMiddle(Node head) {
		if (head != null && head.next == null)
			return null;

		Node slow = head;
		Node fast = head;
		Node prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}

		prev.next = slow.next;
		return head;
	}

	public void deleteMiddleNode(Node n) {
// when middle node is passed else 2 pointer logic
		while (n != null && n.next != null) {
			n.data = n.next.data;
			n.next = n.next.next;
		}

	}

	public Node swapPairs(Node head) {

		// 24. Swap Nodes in Pairs

		if (head == null || head.next == null) {
			return head;
		}
		Node newNode = head.next;
		Node curr = head;

		while (curr != null) {
			Node temp = curr.next.next;
			curr.next.next = curr;
			if (temp == null) {
				curr.next = null;
				break;
			}
			if (temp.next == null) {
				curr.next = temp;
				break;
			}
			curr.next = temp.next;
			curr = temp;
		}
		return newNode;
	}

	public Node swapNodes(Node head, int k) {

		// 1721. Swapping Nodes in a Linked List

		Node current = head;
		Node front = null;
		Node end = head;

		for (int i = 0; i < k - 1; i++) {
			current = current.next;
		}
		front = current;
// here current is already moved k pos , end starts from 0
		while (current.next != null) {
			current = current.next;
			end = end.next;
		}

		int temp = end.data;
		end.data = front.data;
		front.data = temp;

		/* second sol */

		Node res1 = head;
		Node res2 = head;
		int length = 0;

		while (current != null) {
			if (length == k - 1)
				res1 = current;
			current = current.next;
			length++;

		}

		current = head;
		int j = 0;
		while (j < length - k) {
			current = current.next;
			res2 = current;
			j++;
		}

		int temp1 = res1.data;
		res1.data = res2.data;
		res2.data = temp1;
		return head;
	}

	public Node reverseBetween(Node head, int left, int right) {
		// leetcode 92 incomplete
		if (head == null || head.next == null)
			return head;

		Node dummy = new Node(-1);
		dummy.next = head;

		Node leftm1 = null;
		Node leftnode = dummy;

		for (int i = 0; i < left; i++) {

			leftm1 = leftnode; // (left - 1)th node
			leftnode = leftnode.next; // left node
		}
		System.out.println(leftm1.data);
		System.out.println(leftnode.data);

		Node curr = leftnode;
		Node prev = leftm1;

		for (int i = left; i <= right; i++) {

			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		leftm1.next = prev;
		leftnode.next = curr;

		return dummy.next;

	}
}
