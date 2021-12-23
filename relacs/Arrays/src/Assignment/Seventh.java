package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Seventh {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5,17,100,11));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(1));
		System.out.println(solve(A,B));
	}
	
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A,ArrayList<Integer> B)
	{
		ArrayList<ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>();
		for(int i:B)
		{
			retVal.add(rotateLeft(A, i));
		}
		return retVal;
	}
	
	private static ArrayList<Integer> rotateLeft(ArrayList<Integer> A,int rotation)
	{	
		int len = A.size();
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		for(int i=0;i<A.size();i++)
		{
			int j = i + rotation;
			if(j >= A.size())
				j = j%A.size();
			retVal.add(A.get(j));			
					
		}	
		return retVal;
		
	}

}

