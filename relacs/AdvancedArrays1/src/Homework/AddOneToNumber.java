package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {

	public static void main(String[] args) {
//		System.out.println(plusOne(new ArrayList<Integer>(Arrays.asList(1,2,3))));
//		System.out.println(plusOne(new ArrayList<Integer>(Arrays.asList(9,9,9,9,9))));
		System.out.println(plusOne(new ArrayList<Integer>(Arrays.asList( 0,0, 3, 7, 6, 4, 0, 5, 5, 5 ))));
//		System.out.println(plusOne(new ArrayList<Integer>(Arrays.asList( 0 ))));

	}
	  public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		  
		  int val = A.get(A.size() - 1);
		  int carry = 0;
		  val = carry + val +1;
		  carry = val/10;
		  val = val%10;
		  A.set(A.size() - 1, val);		  
		  
		  for(int i= A.size() - 2;i>=0;i--)
		  {
			  val = A.get(i);
			  val = carry + val;
			  carry = val/10;
			  val = val%10;
			  A.set(i, val);
		  }
		  if(carry > 0)
			  A.add(0, carry);
		  
		  int leftShift = 0;
		  while(A.get(leftShift) == 0)
			  leftShift++;
		  while(leftShift > 0)
		  {
			  A.remove(0);
			  leftShift--;
		  }
		  		  
		  return A;
	    }

}

