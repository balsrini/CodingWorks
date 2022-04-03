package Assignment;

public class KReverseList {

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
		A = reverseList(A,2);
		ListNode.disp(A); 

	}
	
	  public static ListNode reverseList(ListNode A, int B) {
		  if(A == null || B ==0)
			  return A;		  		  
		  int k =B;
		  ListNode retVal = null;
		  ListNode h2=null;
		  ListNode h1 = A;
		  while(k>0 && A!=null)
		  {
			  h2 = A.next;
			  A.next = retVal;
			  retVal = A;
			  A = h2;
			  k--;				
		  }
		  h1.next = reverseList(h2, B);			
		  return retVal;
	    }
	  

}
