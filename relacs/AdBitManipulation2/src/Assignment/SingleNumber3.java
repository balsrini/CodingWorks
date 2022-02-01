package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber3 {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 2, 4))));

	}
	
	  public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		  int xor= 0;
		  for(int i:A)
		  {
			  xor = xor ^ i;
		  }
		  int setBit = 0;
		  while(!isSet(xor, setBit))
			  setBit++;
		  
		  int left=0,right=0;
		  for(int i:A)
		  {
			  if(isSet(i, setBit))
				  left = left^i;
			  else
				  right = right^i;
		  }
		  if(left > right)
			  return new ArrayList<Integer>(Arrays.asList(left,right));
		  else
			  return new ArrayList<Integer>(Arrays.asList(right,left));
		  
	    }

	  private static boolean isSet(int N,int index)
	  {
		  return ((N & 1<<index) !=0); 				 
	  }
}
