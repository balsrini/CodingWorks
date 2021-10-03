package DailyCoding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Daily1 {

	/**
	 * Given an array of integers, 
	 * find the first missing positive integer in linear time and constant space. 
	 * In other words, find the lowest positive integer that does not exist in the array. 
	 * The array can contain duplicates and negative numbers as well.
	 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
	 * You can modify the input array in-place.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []input = new Integer[] {3,4,-1,1};
		
		System.out.println(findMissingNum(input));
	}
	
	private static int  segregate(Integer []num)
	{
		int j=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i] < 0)
			{
				int temp = num[j];
				num[j] = num[i];
				num[i] = temp;
				j++;
			}
		}
		return j;
		
	}
	private static int findMissingNum(Integer []num)
	{
		int j = segregate(num);
		
		for(int i = j;i<num.length;i++)
		{
			int x = Math.abs(num[i]);
			x = x- 1;
			if( x < num.length && num[x] > 0)
				num[x] = -1 * num[x];
		}
		
		for(int i=j;i<num.length;i++)
		{
			if(num[i] > 0)
				return i + 1;
		}
		
		return -1;
		
	}

}
