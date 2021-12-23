package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Fifth {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2));
		System.out.println(solve(A));

	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A)
	{
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> retVal = new ArrayList<Integer>(); 
		for(int i = A.size() -1;i>=0;i--)
		{
			if(A.get(i) > max)
			{			
				retVal.add(A.get(i));
				max = A.get(i);
			}
		}
		return retVal;
		
	}

}
