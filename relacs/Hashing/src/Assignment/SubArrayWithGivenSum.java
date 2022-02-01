package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i=1;i<1102;i++)
			A.add(i);
		System.out.println(solve(A,500500));


	}

	  public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		  ArrayList<Long> pSum = new ArrayList<Long>();
		  HashSet<Long> set = new HashSet<Long>();
		  long sum = 0;
		  for(int i=0;i<A.size();i++)		  
		  {
			  sum = sum +A.get(i);
			  pSum.add(sum);
			  set.add(sum);
			  if(sum == B)
				  return new ArrayList<Integer>(A.subList(0, i+1));
				  
		  }
		  
		  for(int i=0;i<pSum.size();i++)
		  {
			 long diff = Math.abs((long)B + pSum.get(i));			 
			 if(set.contains(diff))
			 {
				 for(int j=i;j<pSum.size();j++)
				 {
					 if(pSum.get(j) == diff)
					 {
						return new ArrayList<Integer>(A.subList(i+1, j+1));
					 }
				 }
			 }
		  }	  
		  
		  return new ArrayList<Integer>(Arrays.asList(-1));
	    }
}
