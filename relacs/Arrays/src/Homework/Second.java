package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		ArrayList<Integer> A = 	new ArrayList<Integer>(Arrays.asList(97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3 ));
		System.out.println(solve(A));
		int count = 0;
		ArrayList<Integer> test = new ArrayList<Integer>();
		for(int i:A)
		{
			if(isPrime(i))
			{
				test.add(i);
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static int solve(ArrayList<Integer> A)
	{
		int N = 1000000;
		byte b[] = new byte[N];		
		for(int i=0;i<N;i++)
		{
			if(isPrime(i))
				b[i] = 1;
		}
		ArrayList<Integer> test = new ArrayList<Integer>();
		int count = 0;
		for(int i:A)
		{
			if(i>0 && b[i] == 1)
			{
				count++;
			}
		}
		return count;
		
	}
	
	private static boolean isPrime(int num)
	{
		if(num <= 0)
			return false;
		
		for(int i=2;i*i<=num;i++)
		{
			if(num%i == 0 )
				return false;
		}
		return true;
	}

}
