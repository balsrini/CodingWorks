package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PairsWithDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solve(ArrayList<Integer> A, int B) {
         Collections.sort(A);
         int retVal = 0;
		 HashSet<Integer> set = new HashSet<Integer>();
		 int p1=0,p2=1;
		 
		 while(p1<A.size() && p2<A.size())
		 {
			 int diff = A.get(p2) - A.get(p1);
			 if(diff ==B)
			 {
				 int sum = A.get(p2) + A.get(p1);
				 if(!set.contains(sum))
				 {
					 retVal++;
					 set.add(sum);
				 }				 
				 p1++;
				 if(p1 == p2)
					 p2++;
				 
			 }else if(diff> B)
			 {
				 p1++;
				 if(p1==p2)
					 p2++;
			 }else
			 {
				 p2++;
			 }
		 }
		 return retVal;
    }
}
