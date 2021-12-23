package Assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Sixth {

	public static void main(String[] args) {
 

		
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(-163, -20))));
//		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, -10))));
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4))));
//
//		ArrayList<Integer> max = new ArrayList<Integer>();		
//		for(int i=0;i<808824  ;i++)
//			max.add(-1000);		
//		System.out.println(maxSubArray(max));

		
		
	}
	
	public static int solve(final List<Integer> A)
	{
		int maxSoFar=A.get(0), maxEndingHere =A.get(0);		
		for(int i=1;i<A.size();i++)
		{
			maxEndingHere = Math.max(A.get(i), maxEndingHere + A.get(i));
			maxSoFar = Math.max(maxEndingHere, maxSoFar);			
		}
		return maxSoFar;
	}

}

