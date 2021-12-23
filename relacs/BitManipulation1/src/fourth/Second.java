package fourth;

import java.util.ArrayList;
import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.addAll(Arrays.asList(5,17,100,11));
		System.out.println(solve(A));

	}
	public static int solve(ArrayList<Integer> A)
	{
		if(A.size() == 0)
			return 0;
		
		int min = Integer.MAX_VALUE;		
		int max = Integer.MIN_VALUE;		
		for(int i:A)
		{
			if(i < min)
				min = i;
			if(i > max)
				max = i;
		}
		
		if( (max - min ) != (A.size() - 1))
			return 0; 
		
		for(int i:A)
		{
			i = Math.abs(i);
			int j = i -min;			
			A.set(j, A.get(j) * -1);			
		}
		for(int i:A)
		{
			if(i > 0)
				return 0;
		}
		return 1;
		
	}
	

}
