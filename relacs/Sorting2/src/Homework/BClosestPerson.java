package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BClosestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
		 Collections.sort(A,new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				
				Long x = 1l * o1.get(0) *o1.get(0) + 1l * o1.get(1) *o1.get(1);
				Long y = 1l * o2.get(0) *o2.get(0) + 1l * o2.get(1) *o2.get(1);
				return x.compareTo(y); 
				
			}
			 
		});
		 
		 ArrayList<ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>(A.subList(0, B-1));
		 return retVal;
		 
		 
	    }

}
