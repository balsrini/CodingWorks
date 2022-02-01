package Assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, -10))));
		System.out.println(maxSubArray(new ArrayList<Integer>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4))));
	}

	 public static int maxSubArray(final List<Integer> A) {
		 int sum = 0;
		 int retVal = Integer.MIN_VALUE;
		 for(int i:A)
		 {
			 sum += i;
			 retVal = Math.max(sum, retVal);
			 if(sum < 0)
				 sum =0;
		 }
		 return retVal;
	    }
}
