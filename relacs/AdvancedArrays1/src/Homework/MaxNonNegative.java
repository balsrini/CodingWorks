package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaxNonNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxset(new ArrayList<Integer>(Arrays.asList(1, 2, 5, -7, 2, 5))));
	}
	
	 public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		 int retVal = Integer.MIN_VALUE;
		 int sum = 0;
		 ArrayList<ArrayList<Integer>> range = new ArrayList<ArrayList<Integer>>();
		 range.add(new ArrayList<Integer>(Arrays.asList(0,0)));
		 for(int i=0;i<A.size();i++)
		 {
			 if(A.get(i) < 0)
			 {
				 sum =0;
				 continue;
			 }
			 else
			 {
				 range.add(new ArrayList<Integer>(Arrays.asList(i,i)));
			 }
			 sum += A.get(i);			 
			 if(sum > 0)
			 {
				 if(retVal <= sum)
				 {
					 range.get(range.size() - 1).set(1, i);
					 retVal = sum;
				 }
			 }
			 if(sum < 0)
			 {
				 sum = 0;				 				 
			 }
		 }
		 
		 if(range.size() == 1)
		 {			 
			 return getRetVal(range.get(0),A);
		 } 
		 
		  Collections.sort(range,new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				
				int cmp =  Integer.compare( (o2.get(1) - o2.get(0)), (o1.get(1) - o1.get(0)));
				if(cmp == 0)
				{
					return Integer.compare(o1.get(0), o2.get(0));
				}else
					return cmp;
			}		 
		}
	    );
		 
		  return getRetVal(range.get(0),A);
	 }
	 
	 private static ArrayList<Integer> getRetVal(ArrayList<Integer> range,ArrayList<Integer> A)
	 {
		 ArrayList<Integer> retVal = new ArrayList<Integer>();
		 for(int i=range.get(0);i<range.get(i);i++)
		 {
			 retVal.add(A.get(i));
		 }
		 return retVal;
	 }
	 
}
