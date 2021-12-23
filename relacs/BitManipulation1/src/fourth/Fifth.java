package fourth;

import java.util.ArrayList;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solve(final List<ArrayList<Integer>> A)
	{
		for(int i=0;i<A.size();i++)
		{
			for(int j=0;j<A.size();j++)
			{				
				int val = A.get(i).get(j);
				if(i == j)
				{
					if(val != 1)
						return 0;
				}else if(val != 0)
				{
					return 0;
				}
			
			}
		}
		return 1;
	}

}
