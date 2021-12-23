package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int solve(ArrayList<Integer> A) {
		 Map<Integer,Integer> map = new HashMap<>();
		 for(int i:A)
		 {
			 int count = 1;
			 if(map.get(i) != null)
			 {
				 count = map.get(i);
				 count++;
			 }
			 map.put(i, count);
		 }
		 
		 for(int j:A)
		 {
			 if(map.get(j) > 1)
				 return j;
		 }
		 return -1;
	    }
	 

}
