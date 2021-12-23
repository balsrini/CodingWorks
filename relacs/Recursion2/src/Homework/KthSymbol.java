package Homework;

public class KthSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(9,175));
	}

	public static int solve(int A, int B) {
		if(B == 1)
			return 0;
		else if(B == 2)
			return 1;
		boolean isEven = (B%2 == 0);
		int temp = isEven? B/2:(B+1)/2;
		int result = solve(A-1,temp);
		
		if(result == 0)
		{
			if(isEven)
				return 1;
			else 
				return 0;

		}else
		{
			if(isEven)
				return 0;
			else
				return 1;
		}
	}
}
