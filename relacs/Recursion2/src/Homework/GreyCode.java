package Homework;

import java.util.ArrayList;

public class GreyCode {

	public static void main(String[] args) {
		
		System.out.println(grayCode(13));
	}
	
	
	public static ArrayList<Integer> grayCode(int a) {
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		if(a  == 1)
		{
			retVal.add(0);
			retVal.add(1);
			return retVal;
		}
		else
		{
			ArrayList<Integer> temp = grayCode(a-1);
			retVal.addAll(temp);
			int pow = 1 << (a-1);
			for(int i=temp.size()-1;i>=0;i--)
			{
				retVal.add(pow + temp.get(i));
			}
			return retVal;
		}	
	}
	
}
