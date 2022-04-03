package Assignment;

public class RandomListNode {
int label;
RandomListNode next, random;
RandomListNode(int x) { this.label = x; }
public static void disp(RandomListNode head)
{		
	System.out.println();
	while(head != null)
	{
		System.out.print(head.label + " ");
		head = head.next;
	}
}
	
}
