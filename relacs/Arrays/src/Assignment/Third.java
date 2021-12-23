package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Third {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2,4,1,3,2));
		System.out.println(solve1(A));		

	}
	public static int solve(ArrayList<Integer> A)
	{
		int max = Integer.MIN_VALUE;
		int retVal = 0;
		for(int a:A)
		{
			if(a > max)
				max =a ;
		}
		
		for(int a:A)
		{
			retVal += max -a;
		}
		return retVal;
	}

	public static int solve1(ArrayList<Integer> A)
	{
	
		int retVal = 0;
		for(int i=1;i<A.size();i++)
		{
			retVal += Math.abs(A.get(i) - A.get(i-1));
		}
		
		return retVal;
	}
}
