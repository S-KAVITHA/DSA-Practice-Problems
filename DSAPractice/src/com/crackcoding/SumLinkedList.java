package com.crackcoding;

public class SumLinkedList {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode curr = result;
		//int carry = 0;
		int sum = 0;
		//int x = 0, y = 0;

		while (l1 != null || l2 != null || sum != 0) {
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			//sum =  x + y;
			
			int remain = (sum % 10);
			curr.next = new ListNode(remain);
			sum = sum / 10;
			curr = curr.next;

		}
		// if (carry > 0) result.next = new ListNode(carry);

		return result.next;
	}
	
	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		
		ListNode result = new ListNode(0);
		ListNode curr = result;
		int carry = 0;
		  
		//int x = 0, y = 0; declaring all the variables used inside block alone as global caused memory time exceeded error.

		while (l1 != null || l2 != null || carry != 0) {
         // declare only inside...
			int sum = 0;
            int x = 0, y = 0;
			if (l1 != null) {
				x = l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				y = l2.val;
				l2 = l2.next;
			}

			sum =  carry + x +y ;
				
			curr.next = new ListNode(sum % 10);
            
			curr = curr.next;
            carry  = sum / 10;

		}
		

		return result.next;
}
}
