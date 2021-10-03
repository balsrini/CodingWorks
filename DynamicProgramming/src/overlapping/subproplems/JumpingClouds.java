package overlapping.subproplems;

import java.util.ArrayList;
import java.util.List;

public class JumpingClouds {

	public static void main(String[] args) {
		int []arr = new int[] {0,0,0,0,0};
		List<Integer> in = new ArrayList<Integer>();
		for(int i:arr)
		{
			in.add(i);
		}

		System.out.println(jumpingCloud(in));
	}

	public static int jumpingCloud(List<Integer> c)
	{
		int count = 0;		
		List<Integer> c1 = new ArrayList<Integer>();
		for(int i:c)
		{
			if(i == 0)
			{
				count++;
			}
			else if(i == 1)
			{
				c1.add(count);
				count = 0;
			}
		}
		c1.add(count);
		count = c1.size() -1;
		for(int i:c1)
		{
			if(i == 1)
				continue;
			count += i/2;			
		}
		 
		return count;
	}
	
}
