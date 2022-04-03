package Assignment;

public class MiddleElement {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode head = A;
		for(int i=2;i<7;i++)
		{
			ListNode temp = new ListNode(i);
			head.next = temp;
			head = temp;
		}
		ListNode.disp(A);
		System.out.println(solve(A));

	}

	 public static int solve(ListNode A) {
		 if(A == null || A.next == null)
			 return A.val;
		 ListNode hop1 = A;
		 ListNode hop2 = A.next;
		 while(hop2 != null && hop2.next != null && hop2.next.next != null)
		 {
			 hop1 = hop1.next;
			 hop2= hop2.next.next;
		 }
		 return hop1.next.val;
	    }
}
