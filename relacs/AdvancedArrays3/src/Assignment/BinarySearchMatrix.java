package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchMatrix {

	public static void main(String[] args) {
 
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		A.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		A.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		System.out.println(solve(A,2));		
	}
	 
	public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
		int row = A.size();
		int col = A.get(0).size();
		
		int i = 0;
		int j = col-1;
		int minI = Integer.MAX_VALUE;
		int minJ = Integer.MAX_VALUE;
		while(i >=0 && i<row && j>=0 && j<col)
		{
			int val = A.get(i).get(j);
			if(B == val)
			{
				if(minI >= i)
				{
					minI = i;				
					minJ = j;					
					if(i>0)
						i--;
					if(j>0)
						j--;
					continue;
					
				}				
			}
			if(B > val)
				i++;
			else
				j--;			
		}
		
		if(minI != Integer.MAX_VALUE)
		{
			return ((minI+1) * 1009) + (minJ+1);
		}
		
		return -1;
		
	    }

}
