package Assignment;

import java.util.LinkedList;

public class BalancedString {

	public static void main(String[] args) {
		System.out.println(solve("(()"));
		

	}
	  public static int solve(String A) {
		  
		  char []ch = A.toCharArray();
		  LinkedList<Boolean> ll = new LinkedList<Boolean>();
		  for(char c:ch)
		  {
			  if(c == ')')
			  {
				  if(ll.size() == 0)
					  return 0;
				  if(ll.getFirst())
					  ll.removeFirst();				  
			  }
			  else
			  {
				  ll.addFirst(true);
			  }
		  }
		  
		  return (ll.size() == 0)?1:0;
	    }

}
