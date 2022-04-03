package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaxMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int solve(ArrayList<Integer> A) {		 
		 final ArrayList<Integer> retVal = new ArrayList<Integer>(Arrays.asList(Integer.MIN_VALUE));
		 Collections.sort(A,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int temp1 = o1%o2;
				int temp2 = o2%o1;
				int temp = Math.max(temp1, temp2);
				if(A.get(0)< temp)
				{								
					retVal.set(0,temp);
				}	
				return o1.compareTo(o2);
				
			}
			 
		});
		 return A.get(0);
	    }
}
