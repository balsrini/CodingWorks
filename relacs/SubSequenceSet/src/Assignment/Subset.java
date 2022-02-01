package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Subset {

	public static void main(String[] args) {
		System.out.println(subsets(new ArrayList<Integer>(Arrays.asList(1,2,3))));
//		System.out.println(getGreyCode(1));
//		System.out.println(getGreyCode(2));
//		System.out.println(getGreyCode(3));
//		System.out.println(getGreyCode(4));
		System.out.println(isSet(4, 2));

	}

	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		Collections.sort(A);
		ArrayList<ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>(); 
		int N = A.size();
		ArrayList<Integer> seq = getGreyCode(N);
		for(int i:seq)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j=N;j>=0;j--)
			{
				if(isSet(i, j))
					temp.add(A.get(N-j-1));
			}
			retVal.add(temp);			
		}
		return retVal;
    }
	
	private static boolean isSet(int N,int index)
	{
		return ((N & 1<<index) != 0);
	}
	
	private static ArrayList<Integer> getGreyCode(int n)
	{
		if(n == 0)
		{
			return new ArrayList<Integer>(Arrays.asList(0));
		}
		if(n == 1)
		{
			return new ArrayList<Integer>(Arrays.asList(0,1));
		}
		if(n ==2)
		{
			return new ArrayList<Integer>(Arrays.asList(0,2,3,1));
		}else
		{
			ArrayList<Integer> retVal = new ArrayList<Integer>();
			retVal.add(0);
			ArrayList<Integer> temp = getGreyCode(n-1);
			for(int j=0;j<temp.size();j++)
			{
				int val = temp.get(j);
				val = val | 1<<n-1;
				retVal.add(val);
			}
			for(int j=1;j<temp.size();j++)
			{
				int val = temp.get(j);
				retVal.add(val);
			}
			return retVal;

		}
	}
}
