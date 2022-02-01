package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList( 43, 46, 33, 7 ))));
	}
	 public static int solve(ArrayList<Integer> A) {
		 int oe = 0;
		 boolean isEven = false;
		 boolean isOdd = false;
		 for(int i:A)
		 {
			 if(i%2 == 0)
			 {
				 if(!isEven)
					 oe++;
				isEven = true;
				isOdd = false;
			 }
			 else if(i%2 ==1)
			 {
				 if(!isOdd)
					 oe++;
				 isEven = false;
				 isOdd = true;
				 
			 }
		 }
		 return oe;
		 
	    }

}
