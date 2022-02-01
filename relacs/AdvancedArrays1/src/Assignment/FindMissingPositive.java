package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingPositive {

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new ArrayList<Integer>(Arrays.asList(1, 2, 0))));
		System.out.println(firstMissingPositive(new ArrayList<Integer>(Arrays.asList(3, 4, -1, 1))));
		System.out.println(firstMissingPositive(new ArrayList<Integer>(Arrays.asList(-8, -7, -6))));

	}

	  public static int firstMissingPositive(ArrayList<Integer> A) {
		  int N = A.size();
		  for(int i=0;i<N;i++)
		  {
			  if(A.get(i) <= 0)
				  A.set(i, N+2);
		  }
		  for(int i=0;i<N;i++)
		  {
			  int val = Math.abs(A.get(i));			  
			  if(val >0 && val<=N)
				  A.set(val-1, Math.abs(A.get(val-1)) * -1);
		  }
		  
		  for(int i=0;i<N;i++)
		  {
			  if(A.get(i) > 0)
				  return i +1;
		  }
		  return N+1;
	    }
}
