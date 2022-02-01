package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestSequence {

	public static void main(String[] args) {
		int retVal = longestConsecutive(new ArrayList<Integer>(Arrays.asList(1,2)));
		System.out.println(retVal);

	}
	 public static int longestConsecutive(final List<Integer> A) {
		 HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		 for(int a:A)
		 {
			 freq.put(a, 0);
		 }
		 
		for(int a:A)
		{
			if(freq.get(a) == 0)
			{
				int b = a -1;
				int count = 1;				 
				while(freq.containsKey(b))
				{
					int temp = freq.get(b);
					if(temp > 0)
					{
						count = count + temp;
						break;
					}else
					{
						count++;					
						b = b-1;						
					}
				}
				freq.put(a, count);				
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i:freq.values())
		{
			if(max < i)
				max = i; 
		}
		return max; 
	    }
	 

}
