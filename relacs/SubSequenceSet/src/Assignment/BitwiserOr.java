package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class BitwiserOr {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5))));

	}

	  public static int solve(ArrayList<Integer> A) {
		  int N= A.size();
		  long retVal = 0;
		  for(int i=0;i<N;i++)
		  {
			  for(int j=i;j<N;j++)
			  {
				  int temp = 0;
				  for(int k=i;k<=j;k++)
				  {
					   temp = temp | A.get(k);
				  }
				  retVal +=temp;
				  
			  }
			 
		  }
		  return (int)(retVal % (Math.pow(10,9) + 7));
		  
	    }
	  
	  
	  private static boolean isSet(int N,int index)
	  {
		  return ((N & 1<<index) != 0);
	  }
}
