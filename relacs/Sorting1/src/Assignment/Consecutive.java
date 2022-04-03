package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int solve(ArrayList<Integer> A) {
		 int min = Integer.MAX_VALUE;
		 int max= Integer.MIN_VALUE;
		 for(int i:A)
		 {
			 if(min > i)			 
				 min = i;
			 
			 if(max < i)
				 max = i;
		 }
		 
		 long sum = 0;
		 for(int i=0;i<A.size();i++)
		 {
			sum = sum + A.get(i) - min;
		 }
		 int elements = (max - min);
		 long expSum = 1l * (elements) * (elements +1)/2;
		 if(expSum == sum)
			 return 1;
		 return 0;
	 }
	 

}
