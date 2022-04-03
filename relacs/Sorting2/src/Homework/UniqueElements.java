package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

	public static void main(String[] args) {
		
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,2,2,2,3))));

	}
	
	  public static int solve(ArrayList<Integer> A) {
		
		  Collections.sort(A);
		  int count =0;
		  
		  for(int i=0;i<A.size()-1;i++)
		  {
			  if(A.get(i) < A.get(i+1))
				  continue;
			  int diff = A.get(i) - A.get(i+1);
			  diff += 1;
			  count +=diff;
			  A.set(i+1, A.get(i+1) + diff );
		  }
	
		  return count;
		
		  
	    }
	  
	 
}
