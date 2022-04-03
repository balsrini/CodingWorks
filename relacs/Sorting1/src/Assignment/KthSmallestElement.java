package Assignment;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int kthsmallest(final List<Integer> aList, int B) {
		
		ArrayList<Integer> A = new ArrayList<Integer>(aList);
		for(int i=0;i<A.size() && i<B;i++)
		{
			int minVal = A.get(i);
			int mIndex = i;
			for(int j=i;j<A.size();j++)
			{
				if(minVal > A.get(j))
				{
					minVal = A.get(j);
					mIndex = j;
				}
			}
			if(mIndex != i)
			{
				int temp = A.get(i);
				A.set(i,minVal);
				A.set(mIndex, temp);
			}
		}
		return A.get(B-1);
    }

}
