package Assignment;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {

		  int a = A.size();
		  int b = B.size();
				  
		  ArrayList<Integer> retVal = new ArrayList<Integer>(a+b);
		  
		  int aIndex = 0, bIndex = 0;
		  while(aIndex < a && bIndex < b)
		  {
			  if(A.get(aIndex) >= B.get(bIndex))
			  {
				  retVal.add(A.get(aIndex));
				  aIndex++;
			  }
			  else
			  {
				  retVal.add(B.get(bIndex));
				  bIndex++;
			  }
		  }
			  
		  while(aIndex < a)
		  {
			  retVal.add(A.get(aIndex));
			  aIndex++;
		  }
		  
		  while(bIndex < b)
		  {
			  retVal.add(B.get(aIndex));
			  bIndex++;
		  }

		  return retVal;
	    }

}
