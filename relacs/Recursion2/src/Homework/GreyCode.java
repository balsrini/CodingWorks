package Homework;

import java.util.ArrayList;

public class GreyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(2,new StringBuilder());
		System.out.println(list);
	}
	private static String []arr = new String[] {"0","1"};
	private static ArrayList<String> list = new ArrayList<String>();
//	public ArrayList<Integer> grayCode(int a) {
//		
//		
//	}
	
	public static void solve(int a,StringBuilder sb) {
		
		if(sb.length() == a)
		{
			System.out.println(sb.toString());
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
			solve(a,sb);
			sb.deleteCharAt(sb.length() - 1);
		}

	}
}
