package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSumDivisibility {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)),2));
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49)),37));
		  double d = Math.pow(10, 9) + 7;
		  System.out.println(d);		  
		  System.out.println((int)d);
	}
		 
	  public static int solve(ArrayList<Integer> A, int B) {
		  int d = (int) ( Math.pow(10, 9) + 7);
		  int retVal = 0;
		  ArrayList<Integer> mod = new ArrayList<Integer>(B);
		  for(int i=0;i<B;i++)
			  mod.add(0);
		  
		  for(int i:A)
		  {
			  int j = i%B;
			  mod.set(j, mod.get(j) + 1);
		  }
		  
		  if(mod.get(0) > 0)
		  {
			  retVal += findComb(mod.get(0), 2);
			  retVal = retVal%d;
		  }
		  
		  
		  if(B%2 == 0 && mod.get(B/2) > 0)
		  {
			  retVal += findComb(mod.get(B/2), 2);
			  retVal = retVal%d;
		  }
			
		  for(int i=1;i<=B/2 && i != (B-i);i++)
		  {
			  retVal +=  (mod.get(i)%d * mod.get(B-i)%d)%d;
		  }
		  return retVal;
		  
	    }
	  
	  private static int findComb(int n,int r)
	  {
		  int d = (int) ( Math.pow(10, 9) + 7);
		  if(n == r)
			  return 1;
		  if(r == 0)
			  return 1;
		  long val = 1L;
		  for(int i=n;i>(n-r);i--)
		  {
			  val = val *i;
		  }
		  for(int i=1;i<=r;i++)
		  {
			  val = val/i;
		  }
		  return (int)val%d;

	  }

}
