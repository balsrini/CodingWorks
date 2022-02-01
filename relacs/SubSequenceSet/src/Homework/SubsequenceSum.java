package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceSum {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,20,13,4,5)),18));

	}
	
	 public static int solve(ArrayList<Integer> A, int B) {
		 long max = (long)Math.pow(2, A.size());
		 
		 for(int i=0;i<max;i++)
		 {
			 int sum = 0;
			 for(int j=0;j<A.size();j++)
			 {
				 if(isSet(i, j))
					 sum += A.get(j);
				 
			 }
			 if(sum == B)
				 return 1;
		 }
		 return 0;
		 
	    }

	 private static boolean isSet(int N,int index)
	  {
		  return ((N & 1<<index) != 0);
	  }
}

