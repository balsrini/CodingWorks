package DailyCoding;

import java.util.HashSet;
import java.util.stream.Stream;

public class Daily4 {

	/**
	 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

		For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canFind(new Integer[] {10,15,3,8},17));

	}
	
	private static boolean canFind(Integer []arr,final int k)
	{		
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean retVal = !(Stream.of(arr).takeWhile(number -> {
			if(hs.contains(number))
				return false;
			int temp = k - number;
			hs.add( temp );
			return true;
			}).count() == arr.length);
		
		return retVal;
	}

}
