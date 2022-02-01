package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Max1 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(new ArrayList<Integer>(Arrays.asList(0,1,1)));
		A.add(new ArrayList<Integer>(Arrays.asList(0,0,1)));
		A.add(new ArrayList<Integer>(Arrays.asList(0,1,1)));
		System.out.println(solve(A));
	}

	  public static int solve(ArrayList<ArrayList<Integer>> A) {
		  int N= A.size();
		  int i=0;
		  int j = N-1;
		  int rowWithMax1 = i;
		  int maxI = Integer.MIN_VALUE;
		  while(i<N && j >=0)
		  {
			  if(A.get(i).get(j) == 1)
			  {				 			  
				  if(maxI < (N- j))
				  {
					  rowWithMax1 = i;
					  maxI = (N-j);
				  }
				  j--;	
			  }else
			  {
				  i++;
			  } 
		  }
		  return rowWithMax1;
		 
	    }
}

