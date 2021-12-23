package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Nine {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,2,3,2,1))));

	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A)
	{
		ArrayList<Integer> B =new ArrayList<Integer>();
		for(int i=A.size()-1;i>=0;i--)
		{
			B.add(A.get(i));
		}
		return B;
	}

}
