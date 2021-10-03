package DailyCoding;

import java.util.List;

public class Daily3 {

	/**
	 * This problem was asked by Uber.
	 * Given an array of integers, return a new array such that each element at index i of the new array is
	 *  the product of all the numbers in the original array except the one at i.
	 *  For example, if our input was [1, 2, 3, 4, 5], 
	 *  the expected output would be [120, 60, 40, 30, 24]. 
	 *  If our input was [3, 2, 1], the expected output would be [2, 3, 6].
	 * @param args
	 */
	public static void main(String[] args) {
		int []ret = getProduct(new int[] {1,2,3,4,5});
		for(int i:ret)
			System.out.println(i);

	}
	
	
	private static int[] getProduct(int[] input)
	{
		int []newIn = new int[input.length * 3];
		newIn[0] = 1;
		newIn[newIn.length -1 ] =  1;
		for(int i=0;i<input.length;i++)
		{
			newIn[i*3+1] = input[i];
			if(i > 0)
				newIn[i*3] = newIn[i*3 - 2] * newIn[i*3 - 3];
		}
		
		for(int i=input.length - 2;i>=0;i--)
		{				
			newIn[i*3 + 2] = newIn[i*3 + 4] * newIn[i*3 + 5];			
		}
		for(int i=0;i<input.length;i++)
			input[i] = newIn[i*3] * newIn[i*3 + 2];		
		return input;
	
		
	}

}
