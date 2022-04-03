package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSearch {

	public static void main(String[] args) {
//		System.out.println(searchRange(new ArrayList<Integer>(Arrays.asList(1)), 1));
//		System.out.println(searchRange(new ArrayList<Integer>(Arrays.asList(5, 7, 7, 8, 8, 10)), 8));
		System.out.println(searchRange(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)), 10));

	}
	
	public static ArrayList<Integer> searchRange(final List<Integer> A, int B) {
	ArrayList<Integer> retVal = new ArrayList<Integer>(Arrays.asList(-1,-1));
	int start = 0;
	int end = A.size() -1;
	
	while(start <=end)
	{
		int middle = (start + end)/2;
		if(A.get(middle) == B)
		{	
			break;
		}
		if(A.get(middle) < B)
		{			 
			 start = middle+1;
			 retVal.set(1, start);
		}else if(A.get(middle) > B)
		{		
			end = middle -1;
		}
	}
	start = 0;
	end = A.size() -1;
	while(start <=end)
	{
		int middle = (start + end)/2;
		if(A.get(middle) == B)
		{	
			return retVal;
		}
		if(A.get(middle) > B)
		{			 
			 end = middle+1;
			 retVal.set(0, start); 			 
		}else 
		{		
			end = middle -1;
			
		}
	}
	

	return new ArrayList<Integer>(Arrays.asList(-1,-1));
	
	
    }
	

}

