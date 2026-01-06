package LinkedListPgms;

public class Intersaction {
	 public Node getIntersectionNode(Node headA, Node headB) {
	        
	        
	        
	        Node d1 = headA;
	       Node d2 = headB;
	        
	        while(d1 != d2){
	            
	            if(d1 == null){
	                d1 = headB;
	            }else{
	                d1 = d1.next;
	            }
	            
	            if(d2 == null){
	                d2 = headA;
	            }else{
	                d2 = d2.next;
	            }
	            
	        }
	            
	        return d1;
	    }
	}
