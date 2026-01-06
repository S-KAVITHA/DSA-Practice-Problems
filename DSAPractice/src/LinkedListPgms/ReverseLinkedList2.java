package LinkedListPgms;

public class ReverseLinkedList2 {
	static Node reverseList(Node head, int left, int right) {

		Node curr = head, prev = null, next;
		int i = 1;

		while (curr != null) {
			if (i >= left && i <= right) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			} else {
				prev = curr;
				curr = curr.next;
			}
			i++;

		}

		return prev;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
	}

	public static Node mergeTwoLists(Node list1, Node list2) {

		Node dummy = new Node();
		Node curr = dummy;

		while (list1 != null && list2 != null) {
			if (list1.data > list2.data) {
				curr.next = list2;
				list2 = list2.next;
			} else {
				curr.next = list1;
				list1 = list1.next;
			}
			curr = curr.next;
		}

		curr.next = (list1 != null) ? list1 : list2;

		return dummy.next;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);

		Node head1 = new Node(1);	
		head1.next = new Node(3);
		head1.next.next = new Node(4);

		
		mergeTwoLists(head,head1);
		System.out.print("Given Linked list:");
		printList(head);

		head = reverseList(head, 2, 4);

		System.out.print("\nReversed Linked List:");
		printList(head);
	}
}