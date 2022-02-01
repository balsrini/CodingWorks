package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinXor {

	public static void main(String[] args) {
		System.out.println(findMinXor(new ArrayList<Integer>(Arrays.asList(0, 2, 5, 7))));

	}
	
    public static int findMinXor(ArrayList<Integer> A) {
    	Collections.sort(A);
    	int min = Integer.MAX_VALUE;
    	for(int i=0;i<A.size() -1;i++)
    	{
    		int val = A.get(i) ^ A.get(i+1);
    		if(min > val)
    			min =val;
    	}
    	return min;
    	
    	
    		
    	
    	
    }
    
    

}
