package com.crackcoding;

import LinkedListPgms.Node;

public class PartitionList {

	  public Node partition(Node head, int x) {
		  
		  Node before_head = new Node(0);
	        Node before = before_head;
	        Node after_head = new Node(0);
	        Node after = after_head;

	        while (head != null) {

	            if (head.data < x) {
	                before.next = head;
	                before = before.next;
	            } else {
	                    after.next = head;
	                after = after.next;
	            }
	     head = head.next;
	        }
	        //Bcoz both node has 0 as head node. connect to high next and return small node not small pointer next
			  
	           after.next = null;

	         before.next = after_head.next;

	        return before_head.next;
		
		  
	  }
}
