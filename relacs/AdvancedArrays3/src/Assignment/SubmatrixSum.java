package Assignment;

import java.util.ArrayList;

public class SubmatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(ArrayList<ArrayList<Integer>> A) {
		int N= A.size();
		int sum = 0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
				sum += (i+1)*(j+1)*(N-i)*(N-j)*A.get(i).get(j); 
		}
		return sum;
    }
}
