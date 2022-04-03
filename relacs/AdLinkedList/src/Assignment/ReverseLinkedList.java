package Assignment;

public class ReverseLinkedList {

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
		A = reverseList(A);
		ListNode.disp(A);

	}
	
	public static ListNode reverseList(ListNode A) {
		ListNode retVal = null;		
		while(A != null)
		{
			ListNode next = A.next;
			A.next = retVal;
			retVal = A;
			A = next;
		}
		return retVal;
    }
	

}
