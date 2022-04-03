package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println(largestNumber(new ArrayList<Integer>(Arrays.asList(3,30))));
	}
	
	 public static String largestNumber(final List<Integer> A) {
		 Collections.sort(A,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(o1 == o2)
					return 0;
				StringBuilder s1 = new StringBuilder(o1.toString()).append(o2.toString());
				StringBuilder s2 = new StringBuilder(o2.toString()).append(o1.toString());
				for(int i=0;i<s1.length();i++)
				{
					
					if(s1.charAt(i) ==  s2.charAt(i))						
						continue;
					else if(s1.charAt(i) <  s2.charAt(i))
						return 1;
					else
						return -1; 
				}
				return 0;
			}
			 
		});
		 
		 if(A.get(0) == 0)
			 return "0";
			 
		 StringBuilder retVal = new StringBuilder();
		 for(int i:A)
		 {
			 retVal.append(i);			 
		 }
		 return retVal.toString();
	    }

}
