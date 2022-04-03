package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(solve(A,5));

	}
	 public static int solve(ArrayList<Integer> A, int B) {
		 int count = 0;
		 int p1= 0;
		 int p2 = A.size() -1;
		 while(p1<p2)
		 {
			 int sum = A.get(p1) + A.get(p2);
			 if(sum == B)
			 {
				 count++;
				 p1++;
			 }else if(sum < B)
			 {
				 p1++;
			 }else
			 {
				 p2--;
			 }
		 }
		 return count;
		 
	    }

}
