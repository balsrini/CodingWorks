package Homework;

import java.util.ArrayList;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static int solve(ArrayList<Integer> A) {
		 
		 int max = Integer.MIN_VALUE;
		 int min = Integer.MAX_VALUE;
		 for(int i:A)
		 {
			 if(max < i)
				 max = i;
			if(min > i)
				min = i;
		 }
		 return (max + min);
		 
	    }
}
