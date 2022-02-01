package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class XorPari {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(3, 6, 8, 10, 15, 50));
		System.out.println(solve(A,5));

	}
	
	 public static int solve(ArrayList<Integer> A, int B) {
		 HashSet<Integer> set = new HashSet<Integer>();		 
		 for(int a:A)
		 {
			 set.add(a);
		 }
		 int count = 0;
		 for(int a:A)
		 {
			 if(set.contains(a^B))
			 {
				 set.remove(a^B);
				 set.remove(a);
				 count++;
			 }
		 }
		 
		 return count;
	    }

}
