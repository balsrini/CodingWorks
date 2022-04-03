package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SumZero {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList( 1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3));
		System.out.println(threeSum(A));
		

	}

	  public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
		  Collections.sort(A); 
		 
		  int p1 =0 , p3= A.size()-1,p2=p1+1;		  
		  
		  ArrayList<ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>();
		  HashSet<String> temp=new HashSet<String>();
		  while(p1<A.size() -2)
		  {
			  while(p2<p3)
			  {
				  int sum = A.get(p1) + A.get(p2) + A.get(p3);
				  if(sum == 0)
				  {
					  StringBuilder sb = new StringBuilder();
					  sb.append(A.get(p1));
					  sb.append(A.get(p2));
					  sb.append(A.get(p3));
					  if(!temp.contains(sb.toString()))
					  {
						 retVal.add(new ArrayList<Integer>(Arrays.asList(A.get(p1) ,A.get(p2) ,A.get(p3) )));
						 temp.add(sb.toString());
					  }
					  p2++;

				  }else if (sum > 0)
				  {
					  p3--;
				  }else
				  {
					  p2++;
				  }
					  
			  }			 
			  p1++;
			  p2 = p1+1;
			  p3= A.size()-1;			  
		  }
		  return retVal;
		  
	    }
}

