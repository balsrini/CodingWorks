package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUnique {

	public static void main(String[] args) {
		System.out.println(singleNumber(new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 1))));

	}
	
	public static int singleNumber(final List<Integer> A) {
		
		if(A.size() == 1)
			return A.get(0);
		int retVal = A.get(0);
		for(int i=1;i<A.size();i++)
		{
			retVal = retVal ^ A.get(i);
		}
		return retVal;
		
    }
}
