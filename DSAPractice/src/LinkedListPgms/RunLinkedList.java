package LinkedListPgms;

public class RunLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// Insert the values
		
		list.insert(21);
		list.insert(91);
		
		list.insert(45);
		list.insert(75);
		list.show();
		/*System.out.println("---------Insert Index---------");
		list.insertStart(100);
		list.insertAtIndex(2, 200);
		list.insertAtIndex(0, 400);
		list.insert(450);
		list.insert(745);
		list.insert(845);*/
		
		//list.show();

		/*System.out.println("---------Deletion---------");
		list.deleteVal(400);
		list.show();
		
		System.out.println("---------Deletion---------");
		list.deleteVal(45);
		list.show();

		System.out.println("---------Deletion---------");
		list.deleteVal(21);
		list.show();

		System.out.println("---------Deletion Index---------");
		list.deleteIndex(2);
		list.show();
	
		System.out.println("---------Deletion Index---------");
		list.deleteIndex(0);
		list.show();
		*/
		System.out.println("---------Deletion Index---------");
		list.deleteIndex(2);
		list.show();
		
		System.out.println("---------Length recursive---------");
		System.out.println("Linked List Length : " + list.recursivelengthList());
	
		
		System.out.println("---------Length Iterative---------");
		System.out.println("Linked List Length : " +list.lengthList());
		
		System.out.println("---------Middle Node--------");
		list.findMiddleNode();
				
		
		System.out.println("---------kth Node--------");
		System.out.println(list.kthNodeFromEnd(5));
		System.out.println();
		list.show();
		
		System.out.println("---------Reversal Nodes--------");
		list.reverseIteratively();
		list.show();	
		
		System.out.println("---------reverse by index--------");
		
		list.reverseByIndex(1);
		
		System.out.println("---------Palindrome check--------");
		list.show();
		//list.palindromeList();
		
	/*	
		System.out.println("---------Cyclic Nodes--------");
		System.out.println(list.isCyclic());
		
		
		list.addCylicNode(1,5);
	
		System.out.println(list.isCyclic());*/
		
		
		System.out.println("----------------------------");
		
		
		list.insert(91);
		list.insert(11);
		list.insert(45);
		list.insert(45);
		
		list.show();
		Removeduplicates rd = new Removeduplicates();
		rd.removeDuplicatesSort1(list.head);
	
		System.out.println("----------------------------");
	
		list.show();
		System.out.println("kth elem----------------------------");
		System.out.println(rd.kthNodeFromEnd(list.head,4));
		//list.show();
		
		
		System.out.println("swap elem----------------------------");
		list.show();
		rd.swapNodes(list.head, 2);
		System.out.println("   ");
		
		list.insert(81);
		list.insert(52);
		list.insert(65);
		
		list.show();
		
		System.out.println("rev pos elem----------------------------");
		rd.reverseBetween(list.head,2,4);
		list.show();
		
	}
}
