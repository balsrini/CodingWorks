package Homework;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(123));
	}

	  public static int solve(int A) {
		  int q = A/10;
		  int r = A%10;
		  
		 if(q == 0)
			 return r; 
		 else
			 return r + solve(q);
		  
	    }
}
