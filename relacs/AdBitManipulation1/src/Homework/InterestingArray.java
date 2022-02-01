package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class InterestingArray {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(9,17))));

	}

	 public static String solve(ArrayList<Integer> A) {
		 if(A.size() == 1)
			 return "No";
		 
		 int oddCount = 0;
		 
		 for(int i:A)
		 {
			 if(i %2 == 1)
				 oddCount++;
		 }
		 
		 if(oddCount%2 == 1)
			 return "No";
		 
		 return "Yes";
		 
	    }
}
