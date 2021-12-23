package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.addAll(Arrays.asList(1,2,3,4));
		System.out.println(solve(A,7));

	}
	public static int solve(ArrayList<Integer> A,int B)
	{
		for(int i=0;i<A.size();i++)
		{
			for(int j=i+1;j<A.size();j++)
			{
				if(A.get(i) + A.get(j) == B)
					return 1;
			}
		}
		return 0;
	}

}
