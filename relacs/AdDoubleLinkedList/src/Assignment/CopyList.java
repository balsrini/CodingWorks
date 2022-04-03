package Assignment;

public class CopyList {

	public static void main(String []args)
	{
		RandomListNode a = new RandomListNode(1);
		RandomListNode b = new RandomListNode(2);
		RandomListNode c = new RandomListNode(3);
		a.next = b;
		b.next = c;
		
		a.random = c;
		b.random =a ;
		c.random = a;
		
		RandomListNode r = copyRandomList(a);
		r.disp(r);
		
	}
	 public static RandomListNode copyRandomList(RandomListNode head) {
		 
		 RandomListNode h = head;
		 while(head != null)
		 {
			 RandomListNode temp = new RandomListNode(head.label);
			 temp.next = head.next;
			 head.next = temp;
			 head = head.next.next;
		 }
		 head = h;
		 while(head != null)
		 {
			 RandomListNode r = head.random;
			 if(r != null)
				 head.next.random = r.next;			 
			 head = head.next.next;
		 }
		 
		 head = h;
		 RandomListNode retVal = head.next;
		 
		 while(head != null)
		 {			 
			 RandomListNode r1 = head.next;
			 RandomListNode h1 = r1.next;			
			 head.next = h1;				 
			 if(h1 != null)
				 r1.next = h1.next;
			 head = head.next;
		 }
		 return retVal;
		 
	    }
}

