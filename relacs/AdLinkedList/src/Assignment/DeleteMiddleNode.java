package Assignment;

public class DeleteMiddleNode {
	public static void main(String []args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		for(int i=2;i<6;i++)
		{			
			ListNode next = new ListNode(i);
			temp.next = next;
			temp = next;
		}
		ListNode.disp(head);
		
		head = solve(head);
		ListNode.disp(head);
	}

	 public static ListNode solve(ListNode A) {
		 if(A == null && A.next == null)
			 return null;
		 ListNode hop1 = A;
		 ListNode hop2 = A.next;
		 while(hop2 != null && hop2.next != null && hop2.next.next != null)
		 {			 			 
			 hop2 = hop2.next.next;
			 hop1 = hop1.next;
		 }
		 hop1.next = hop1.next.next;		 
		 
		 return A;
	    }
}
