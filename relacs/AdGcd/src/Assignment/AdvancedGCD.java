package Assignment;

import java.util.ArrayList;

public class AdvancedGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int solve(ArrayList<Integer> A) {
    	int retVal = A.get(0);
    	for(int i=1;i<A.size();i++)
    	{
    		retVal = getGCD(retVal, A.get(i));
    	}
    	return retVal;

    }
    public static int getGCD(int a, int b)
    {
    	if(b == 0)
    		return a;
    	return getGCD(b, a%b);
    }
}
