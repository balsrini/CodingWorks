package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedInsertPosition {

	public static void main(String[] args) {
		
		System.out.println(searchInsert(new ArrayList<Integer>(Arrays.asList(141, 144, 145, 154, 229, 235, 243, 266, 344, 351, 466, 499, 512, 565, 641, 675, 690, 726, 805, 879, 978, 986)), 65));
	}
	 public static int searchInsert(ArrayList<Integer> A, int B) {
		 
		 int start = 0;		 
		 int end  = A.size() -1;
		 if(B < A.get(start))
			 return start;
		 else if(B > A.get(end))
			 return end;
		 
		 int middle = (start + end)/2;
		 while(start <= end)
		 {
			 if(A.get(middle) == B)
				 return middle;
			 else if(A.get(middle) > B)
				 end = middle-1;
			 else
				 start = middle +1;
			 middle = (start + end)/2;
		 }		  
		 return middle;
		  
	    }

}
