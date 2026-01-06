package LinkedListPgms;

public class LinkedListDelete {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to delete a node at a given position
    void deleteAtPosition(int position) {
        // If the list is empty
        if (head == null)
            return;

        // If the position is the head
        if (position == 0) {
            head = head.next;
            return;
        }

        // Traverse to the node before the position
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If the position is out of range
        if (temp == null || temp.next == null)
            return;

        // Unlink the node at the position
        temp.next = temp.next.next;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = llist.new Node(1);
        Node second = llist.new Node(2);
        Node third = llist.new Node(3);

        llist.head.next = second;
        second.next = third;

        System.out.println("Original Linked List:");
        llist.printList();

        llist.deleteAtPosition(1); // Delete at position 1 (starting from 0)

        System.out.println("Modified Linked List:");
        llist.printList();
    }
}
