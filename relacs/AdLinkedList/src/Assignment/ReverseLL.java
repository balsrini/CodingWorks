package Assignment;

public class ReverseLL {

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
		A = reverseBetween(A, 2, 8);
		ListNode.disp(A);

	}

	   public static ListNode reverseBetween(ListNode A, int B, int C) {
		   ListNode retVal = A;
		   int k = 1;
		   ListNode h1 = null;
		   while(A != null)
		   {	
			  if(B == k)
			  {
				  ListNode h2 = null;
				  ListNode tail2 = null;
				  ListNode tail1 = A;
				  while(A != null && k<=C)
				  {					  
					  tail2 = A.next;
					  A.next = h2;
					  h2 = A;
					  A = tail2;
					  k++;
				  }
				  if(h1 == null)
				  {
					  h1 = h2;
					  retVal = h1;
				  }
				  else
					  h1.next = h2;
				  
				  tail1.next = tail2;
				  
				  return retVal;
				  
				  
			  }
			  h1 = A;
			  A = A.next;
			  k++;
		   }
		   return retVal;
		   
	    }
	   
	   
}
