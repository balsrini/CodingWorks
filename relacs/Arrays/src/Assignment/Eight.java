package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Eight {

	public static void main(String[] args) {
//		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(5,6,2))));
//		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(3,2,1,3))));
//		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(-4, -2, 0, -1, -6))));
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1, 2, 7, 0, 9, 3, 6, 0, 6))));
		

	}
	public static int solve(ArrayList<Integer> A)
	{       
	        ArrayList<Integer> temp = new ArrayList<Integer>(A.size());  
	        for(int i=0;i<=A.size();i++)
	        {
	            temp.add(Integer.MIN_VALUE);
	        }
	        
	        for(int i:A)
	        {
	        	if(i < 0)
	        		continue;
	        	
	        	if(i > A.size())
	        	{
	        		int val =1;
	                if(temp.get(A.size()) != Integer.MIN_VALUE)
	                    val = temp.get(A.size()) +1;
	                temp.set(A.size(),  val);

	        	}else
	        	{
	        		int val =1;
	                if(temp.get(i) != Integer.MIN_VALUE)
	                    val = temp.get(i) +1;
	                temp.set(i,  val);
	            }
	        }
	        int counter = 0;
	        for(int i=temp.size()-1;i>=0;i--)
	        {
	            int val = temp.get(i);
	            if(val != Integer.MIN_VALUE )
	            {
	                if(i == counter)
	                    return 1;

	                counter += val;                
	            }                
	                
	        }
	        return -1;
		
	}
	
	public static int solve2(ArrayList<Integer> A)
	{
		for(int i=0;i<A.size();i++)
		{
			if(A.get(i) < 0)
				continue;
			int counter = 0;
			for(int j = 0;j<A.size();j++)
			{
				if(A.get(j) > A.get(i))
				{		
					counter++;
					if( counter > A.get(i))
					{
						break;						
					}
				}							
			}
			if(counter == A.get(i))
				return 1;	
		}
		return -1;
	}

}


