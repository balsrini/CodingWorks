package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class BitSum {

	public static void main(String[] args) {
		
		System.out.println(cntBits(new ArrayList<Integer>(Arrays.asList(1, 3, 5))));
	}

	  public static int cntBits(ArrayList<Integer> A) {
		  int j = 0;
		  double retVal = 0;
		  double pow= Math.pow(10, 9) + 7;
		  while(j < 32)
		  {
			  int set = 0;
			  int unSet = 0;
			  for(int i:A)
			  {
				  if(isSet(i, j))
					  set++;
				  else
					  unSet++;	  
			  }
			  if(set != A.size())
				  retVal = (((set *unSet * 2) % pow) + (retVal%pow) )%pow;
			  j++;
		  }		  
		  return (int) (retVal % pow );	  
		  
	    }
	  
	  private static boolean isSet(int n, int index)
	  {
		  return ((n & 1<<index) != 0);
	  }
	  
	  
}
