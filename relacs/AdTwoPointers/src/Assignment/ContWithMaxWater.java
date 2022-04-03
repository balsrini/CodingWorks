package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ContWithMaxWater {

	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 5, 4, 3));
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1));
		System.out.println(maxArea(A));
	}
	 public static int maxArea(ArrayList<Integer> A) {
		 int retVal = 0;
		 int p1 =0;
		 int p2= A.size() -1;
		 while(p1<p2)
		 {
			 int water = (p2-p1) * Math.min(A.get(p1),A.get(p2));
			 retVal = Math.max(water, retVal);
			 if(A.get(p2) > A.get(p1)) {
				 p1++;
			 }else
			 {
				 p2--;
			 }			 
		 }
		 return retVal;
				 
		 
    }

}
