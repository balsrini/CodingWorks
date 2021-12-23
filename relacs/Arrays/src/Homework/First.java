package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(5,3))));

	}
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A)
	{
		if(A.size() == 1)
			return A;
		int prev = A.get(0),current= A.get(0);
		int next;
		for(int i = 0;(i + 1)<A.size();i++)
		{
			
			current = A.get(i);
			next = A.get(i+1);
			A.set(i, prev * next);
			prev = current;
		}
		A.set(A.size() -1, prev * A.get(A.size() -1));
		return A;
		
	}

}
