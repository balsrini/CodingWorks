package second;

import java.util.ArrayList;
import java.util.Arrays;

public class PSVM {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(684, 96, 1126, 1288, 330, 1360, 940, 330, 1288, 580, 476, 812, 96, 264, 1360, 684, 476, 1126, 580, 812));
		System.out.println(solve(A));
//	[940, 812, 264, 812]
		
		//System.out.println(getSetPosition(676, 0));
	
	}
	
	
	
	public static ArrayList<Integer> solve1(ArrayList<Integer> A,int startPosition)
	{
		int tXor = getXor(A);
		if(startPosition > 32)
			startPosition = 0;
		int pos = getSetPosition(tXor,startPosition);
		int leftXor= 0, rightXor=0;
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		for(int i:A)
		{
			if(isBitSet(i, pos))
			{
				leftXor = leftXor ^ i;
				left.add(i);
			}else
			{
				rightXor = rightXor ^ i;
				right.add(i);
			}
		}
		ArrayList<Integer> retVal  = null;
		if(leftXor != 0 && rightXor != 0)
			retVal =  new ArrayList<Integer>(Arrays.asList(rightXor,leftXor));		
		if(leftXor == 0)
			retVal = solve1(right,pos+1);
		if(rightXor == 0)
			retVal= solve1(left,pos +1);		
		
		return retVal;
			
	}
	
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A)
	{
		int tXor = getXor(A);
		int leftXor= 0, rightXor=0;
		for(int pos = getSetPosition(tXor,0);pos<32;pos= getSetPosition(tXor,pos))
		{
			
		for(int i:A)
		{
			if(isBitSet(i, pos))
			{
				leftXor = leftXor ^ i;
			}else
				rightXor = rightXor ^ i;
		}
		
		if(leftXor != 0  && rightXor != 0)
			break;
		
		leftXor= 0;
		rightXor = 0;
		
		}
		
		if(leftXor > rightXor)
			return new ArrayList<Integer>(Arrays.asList(rightXor,leftXor));
		else 
			return new ArrayList<Integer>(Arrays.asList(leftXor,rightXor));
		
	}
	
	private static int getXor(ArrayList<Integer> A)
	{
		if(A.size() == 0)
			return 0;
		
		int tXor = A.get(0);
		for(int i=1;i<A.size();i++)
		{			
			tXor= tXor ^ A.get(i);
		}
		return tXor;
	}
	
	private static int getSetPosition(int A,int startIndex)
	{
		int i = startIndex;
		while ( !isBitSet(A, i) )
		{
			i++;
		}
		return i;
	}
	
	private static boolean isBitSet(int A,int pos)
	{
		return (A & (1<<pos)) != 0;
	}

}
