package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class PairWithGivenSum {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 3, 3, 5, 7, 7, 8, 9, 9, 10, 10));
		System.out.println(solve(A,11));

	}

	  public static int solve(ArrayList<Integer> A, int B) {		  
		  long retVal = 0;
		  int p1 =0,p2 = A.size()- 1;		  
		  while(p1<p2)
		  {
			  int sum = A.get(p1) + A.get(p2);
			  if(sum == B)
			  {				  
                  retVal++;
				  retVal = retVal%1000000007;				
				  while(p1<A.size())
				  {		
					  p1++;
					  if(A.get(p1) == A.get(p1-1))
					  {
                          retVal++;
					  }else
					  {
						  break;
					  }
					  
				  }			  
						
				  
			  }else if(sum >B)
			  {
				  p2--;
			  }else
			  {
				  p1++;
			  }
		  }
		  return (int)retVal;
		  
	    }
}
