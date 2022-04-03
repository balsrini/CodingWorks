package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ChocolateDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int solve(ArrayList<Integer> A, int B) {
		  Collections.sort(A);
		  int retVal = Integer.MAX_VALUE;
		  
		  for(int i=0;i<A.size() - B -1;i++)
		  {
			  int temp = A.get(i+B -1) - A.get(i);
			  if(temp <retVal)
				  retVal =temp;
		  }
		  
		  return retVal;
	    }
}
