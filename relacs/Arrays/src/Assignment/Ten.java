package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Ten {

	public static void main(String[] args) {
//		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(3, 7, 90, 20, 10, 50, 40)),3));
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19)),1));
//		System.out.println(solve(new ArrayList<Integer>(Arrays.asList( 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 )),9));

	}
	
	private static int solve(ArrayList<Integer> A,int B)
	{
		int tSum=Integer.MAX_VALUE;
		int lIndex = 0;
		for(int i=0;(i + B)<=A.size();i++)
		{
			int sum = 0;
			
			for(int j=i;j<i+B;j++)
				sum +=A.get(j);			
			 
			if(tSum > sum )
			{
				lIndex = i;
				tSum = sum;
			}	
			
		}
		return lIndex;
	}

}
