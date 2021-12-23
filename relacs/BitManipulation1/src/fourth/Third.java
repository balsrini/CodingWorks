package fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		retVal.addAll(Arrays.asList(1, 10, 20, 1, 25, 1, 10, 30, 25, 1));
		System.out.println(solve(retVal));

	}

	public static int solve(List<Integer> A)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i:A)
		{
			Integer val = map.get(i);
			if(val == null)
				val = 1;
			else
				val++;
			map.put(i, val);
		}
		int count = 0;
		for(int i:map.values())
		{
			if(i > 1)
				count += i -1;
		}
		return count;
	}
}
