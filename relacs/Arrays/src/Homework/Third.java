package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,2,3,2,1)),3));

	}
	public static ArrayList<Integer> solve(final List<Integer> A,int B)
	{
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		for(int i:A)
		{
			retVal.add(i + B);
		}
		return retVal;
	}

}
