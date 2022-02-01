package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUnique2 {

	public static void main(String[] args) {
		
		System.out.println(singleNumber(new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1))));
	}

	 public static int singleNumber(final List<Integer> A) {
		 
		 int retVal = 0;
		 int j = 0;
		 while(j< 32)
		 {
			 int count = 0;
			 for(int i:A)
			 {
				 if(isCheckBit(i, j))
					 count++;
			 }
			 if(count %3 == 1)
				 retVal = (retVal | 1<<j);
			 j++;
		 }
		 return retVal;

	 }
	 private static boolean isCheckBit(int n, int index)
	 {
		 return (((1<<index) &n) != 0);
	 }
}



