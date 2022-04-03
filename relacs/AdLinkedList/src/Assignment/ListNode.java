package Assignment;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { 
		val = x; 
		next = null; 
		}
	
	public static void disp(ListNode head)
	{		
		System.out.println();
		while(head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	@Override
	public String toString() {	
		return Integer.toString(val);
	}
}
