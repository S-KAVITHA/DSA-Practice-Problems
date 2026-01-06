package com.crackcoding;

public class IntersectNode {

	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	     ListNode list1 = headA;
	       ListNode list2 = headB;  
	        
	        while (list1 != list2){
	            if (list1 != null) list1 = list1.next; else list1 = headB;
	            if (list2 != null) list2 = list2.next ; else list2 = headA;
	        }
	        return list1;
	    }
}
