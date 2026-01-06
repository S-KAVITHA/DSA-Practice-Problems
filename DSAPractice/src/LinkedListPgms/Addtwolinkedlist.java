package LinkedListPgms;

public class Addtwolinkedlist {

	 static Node addTwoLists(Node first, Node second){
	        Node firstRev = reverseList(first);
	         int m = size;
	        Node secondRev = reverseList(second);
	         int n = size;
	         int carry = 0;
	         int sum = 0;
	         int fElem;
	         int sElem;
	         
	         Node temp;
	         if (m>n){
	             temp = firstRev; 
	         }else{
	             temp = secondRev;
	         }
	        while (temp != null){
	            fElem = firstRev.data;
	            sElem = secondRev.data;
	            
	            sum = fElem + sElem +carry;
	            
	            
	        }
	    }
	    
	    public static Node reverseList(Node head)
		    {
		       // RECURSIVE FUN 
		       
			 while (head == null || head.getNext() == null){
		            return head;
		        }
		       
		        Node newHead = reverseList(head.getNext());
		        
		         head.getNext().setNext(head);
		         head.setNext(null);
		         size++;
		         return newHead;
		    }
}
