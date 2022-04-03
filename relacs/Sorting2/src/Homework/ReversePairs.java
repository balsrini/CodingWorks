package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversePairs {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1, 3, 2, 3, 1))));

	}
	  public static int solve(ArrayList<Integer> A) {
		  return mergeSort(A, 0, A.size()-1);
	    }
	  private static int mergeSort(ArrayList<Integer> A,int start, int end)
	  {
		  if(start == end)
			  return 0;
		  int middle = (start + end)/2;
		  int l = mergeSort(A, start, middle);
		  int r = mergeSort(A, middle +1, end);
		  int sum = merge(A,start,middle, end);
		return l + r+ sum;  
	  }
	  
	  private static int merge(ArrayList<Integer> A,int start, int middle,int end)
		 {
			 ArrayList<Integer> temp = new ArrayList<Integer>();
			 int c = 0;
			 int p1 = start, p2 = middle+1;
			 while(p1<=middle && p2<=end)
			 {
				 if(A.get(p1) < A.get(p2)) {
					 temp.add(A.get(p1));
					 p1++;
				 } else 
				 {
					 if(A.get(p1) > (2 * A.get(p2) ))
					 {
						 c = c + (middle - p1 + 1);
					 }
					 temp.add(A.get(p2));
					 p2++;				
					 
				 }			 
			 }
			 while(p1<=middle)
			 {
				 temp.add(A.get(p1));
				 p1++;
			 }
			 while(p2<=end)
			 {
				 temp.add(A.get(p2));
				 p2++;
			 }
			 
			 for(int i=0;i<temp.size();i++)
			 {
				 A.set(i+start, temp.get(i));				
			 }
			 
			 return c;
		 }

}
