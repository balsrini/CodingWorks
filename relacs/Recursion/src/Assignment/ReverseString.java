package Assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext())
		{
			
			StringBuilder sb = new StringBuilder(sc.next());
			reverseString(sb, 0, sb.length() -1 );
			System.out.println(sb.toString());
		}
		sc.close();
	}
	
	private static void reverseString(StringBuilder sb,int i,int j)
	{		
		if(i >= j)
			return ;		
		char temp = sb.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, temp);
		reverseString(sb, i + 1, j - 1);		
	}

}
