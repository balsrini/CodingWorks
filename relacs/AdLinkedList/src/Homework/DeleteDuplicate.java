package Homework;

import Assignment.ListNode;

public class DeleteDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next =c;
		c.next =d;
		d.next = e;
		ListNode.disp(deleteDuplicates(a));
	}
	
	 public static ListNode deleteDuplicates(ListNode A) {
		 ListNode retVal = A;
		 while(A != null)
		 {
			ListNode temp = A.next;
			while(temp != null && temp.val == A.val)
				temp = temp.next;
			A.next = temp;		
			A = A.next;
		 }
		 
		 return retVal;
		 
		 
	    }

}
