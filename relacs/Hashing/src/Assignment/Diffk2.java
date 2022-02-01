package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Diffk2 {

	public static void main(String[] args) {
		int a = diffPossible(new ArrayList<Integer>(Arrays.asList( 34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33, 70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13, 93, 15, 43, 73, 68, 29 )), 97);
		System.out.println(a);

	}

	 public static int diffPossible(final List<Integer> A, int B) {
		 if(A.size() < 2)
			 return 0;
		 HashSet<Integer> se = new HashSet<Integer>();
		 
		 if(B == 0)
		 {
			 //Find duplicate
			 for(int a:A)				 
			 {
				 if(se.contains(a))
					 return 1;
				 se.add(a);
			 }
			 return 0;
		 }
			 
		 
		 for(int a:A )
		 {
			// int diff = Math.abs(B - a);
			 int sum = Math.abs(B + a);
			 if( se.contains(sum))
				 return 1;
			 se.add(a);
		 }
		 
		 for(int a:A)
		 {
//			 int diff = Math.abs(B - a);
			 int sum = Math.abs(B + a);
			 if( se.contains(sum))
				 return 1;			 
		 }
		 return 0;
		 
		 
	    }
}
