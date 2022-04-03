package Homework;

import Assignment.ListNode;

public class RemoveNthNode {

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next =c;
		c.next =d;
		d.next = e;
		ListNode.disp(removeNthFromEnd(a, 1));
		
	}
	
	  public static ListNode removeNthFromEnd(ListNode A, int B) {
		  if(A == null)
			  return A;
		  int k = 1;
		  ListNode head = A;
		  ListNode tail = null;		  
		  while(head != null)
		  {
			  if(k == B + 1)
			  {
				 if(tail == null)
					 tail = A;
				 else
					 tail = tail.next;
			  }else
			  {
				  k++;
			  }
			 head = head.next;
		  }
		  if(tail == null)
		  {
			  A = A.next;
			  return A;
		  }		 
		  
		  
		  tail.next = tail.next.next;
		  return A;
	    }

}
