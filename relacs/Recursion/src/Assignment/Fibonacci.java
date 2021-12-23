package Assignment;

public class Fibonacci {

	public static void main(String[] args) {
				
		System.out.println(findAthFibonacci(4));
	}
	
	 public static int findAthFibonacci(int A) {
		 if(A == 0)			 
			 return 0;
		 else if(A == 1 || A== 2)
			 return 1;
		 else
			 return findAthFibonacci(A-1) + findAthFibonacci(A-2);
	    }

}
