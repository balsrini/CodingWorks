package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		ArrayList<Integer> A= new ArrayList<Integer>(Arrays.asList(3,2,4,1,0));
		arrange(A);
		System.out.println(A);

	}
	public static void arrange(ArrayList<Integer> a) {
		
		int N= a.size();
		for(int i=0;i<N;i++)
		{
			a.set(i, a.get(i)*N);			
		}
		
		for(int i=0;i<N;i++)
		{
			int val = a.get(i)/N;			
			int ind = a.get(val)/N;
			a.set(i, a.get(i)+ind);
			
		}
		for(int i=0;i<N;i++)
		{
			a.set(i, a.get(i)%N);
		}
	}

}
