package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbers {

	public static void main(String[] args) {
		System.out.println(dNums(new ArrayList<Integer>(Arrays.asList(1,1,2,2)), 1));

	}
	
	  public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		  HashMap<Integer, Integer> fCounter = new HashMap<Integer, Integer>(2*B);
		  ArrayList<Integer> retVal = new ArrayList<Integer>(A.size() -B + 3);
		  
		  for(int i=0,j=0;i<A.size() && j < B;i++,j++)
		  {
			  int val = A.get(i);
			  Integer count = fCounter.get(val);
			  if(count == null)
				  count = 0;
			  count++;
			  fCounter.put(val, count);
		  }
		  
		  retVal.add(fCounter.keySet().size());
		  
		  for(int i=1;(i + B-1) < A.size();i++)
		  {
			 int val = A.get(i-1);
			 Integer count = fCounter.get(val);
			 if(count == 1)
				 fCounter.remove(val);
			 else
				 fCounter.put(val, count -1);
			 
			 val = A.get(i+B-1);
			 count = fCounter.get(val);
			if(count == null)
				count = 0;
			count++;
			fCounter.put(val, count);
			retVal.add(fCounter.keySet().size());
		  }
		  return retVal;
		  
	    }
	  
	   

}
