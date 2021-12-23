package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fourth {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList( 34, 7, 96, 37, 12, 13, 22, 86, 17, 78, 95, 61, 42, 1, 42, 58, 98, 78, 92, 85, 10, 97)),22));

	}
	public static int solve(ArrayList<Integer> A,int B)
	{
		
		Collections.sort(A);
		int max = A.get(A.size() - B);
		int min = A.get(B - 1);
		return (max-min);
//		byte []x = new byte[A.size()];
//		byte []n = new byte[A.size()];
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for(int i=0;i<B;i++)
//		{
//			max = Integer.MIN_VALUE;
//			min = Integer.MAX_VALUE;
//			int maxIndex = 0;
//			int minIndex = 0;
//			for(int j=0;j<A.size();j++)
//			{				
//				int val = A.get(j);
//				if(val > max && x[j] != 1)
//				{
//					max = val;
//					maxIndex = j;					
//				}
//				
//				if(val < min && n[j] != 1)
//				{
//					min = val;
//					minIndex = j;					
//				}
//			}
//			x[maxIndex] = 1;
//			n[minIndex] = 1;
//		}
//		return (max - min);
	
	}
	
	 

}

