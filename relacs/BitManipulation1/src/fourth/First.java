package fourth;

import java.util.ArrayList;
import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		retVal.addAll(Arrays.asList(6));
		System.out.println(solve(retVal));
	}
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A)
	{
		
		if(A.size() < 1)
			return new ArrayList<Integer>();
		int x ;
		for(int i=1;i<A.size();i++)
		{
			x = A.get(i-1);
			A.set(i-1, A.get(i) - x);
		}
		A.remove(A.size() -1);
		return A;
		
	}

}
